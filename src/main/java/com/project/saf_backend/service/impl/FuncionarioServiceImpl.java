package com.project.saf_backend.service.impl;

import com.project.saf_backend.dto.FuncionarioDTO;
import com.project.saf_backend.entity.Funcionario;
import com.project.saf_backend.exception.ResourceNotFoundException;
import com.project.saf_backend.mapper.FuncionarioMapper;
import com.project.saf_backend.repository.FuncionarioRepository;
import com.project.saf_backend.service.FuncionarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class FuncionarioServiceImpl implements FuncionarioService {

    private FuncionarioRepository funcionarioRepository;
    @Override
    public FuncionarioDTO criarFuncionario(FuncionarioDTO funcionarioDTO) {
        Funcionario funcionario = FuncionarioMapper.mapFuncionario(funcionarioDTO);
        Funcionario saveFuncionario = funcionarioRepository.save(funcionario);

        return FuncionarioMapper.mapFuncionarioDto(saveFuncionario);
    }

    @Override
    public FuncionarioDTO getFuncionarioByID(Long funcionarioID) {
        Funcionario funcionario = funcionarioRepository.findById(funcionarioID)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Não existe nenhum Funcionário com o ID Fornecido: " + funcionarioID));

        return FuncionarioMapper.mapFuncionarioDto(funcionario);
    }
}
