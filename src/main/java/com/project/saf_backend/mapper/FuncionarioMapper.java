package com.project.saf_backend.mapper;

import com.project.saf_backend.dto.FuncionarioDTO;
import com.project.saf_backend.entity.Funcionario;

public class FuncionarioMapper {

    public static FuncionarioDTO mapFuncionarioDto(Funcionario funcionario){
        return new FuncionarioDTO(
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getSobrenome(),
                funcionario.getEmail()
        );
    }

    public static Funcionario mapFuncionario(FuncionarioDTO funcionarioDto){
        return new Funcionario(
                funcionarioDto.getId(),
                funcionarioDto.getNome(),
                funcionarioDto.getSobrenome(),
                funcionarioDto.getEmail()
        );
    }
}
