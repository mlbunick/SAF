package com.project.saf_backend.service;

import com.project.saf_backend.dto.FuncionarioDTO;

import java.util.List;

public interface FuncionarioService {
    FuncionarioDTO criarFuncionario(FuncionarioDTO funcionarioDTO);

    FuncionarioDTO getFuncionarioByID(Long funcionarioID);

    List<FuncionarioDTO> getAllFuncionarios();

    FuncionarioDTO updateFuncionario(Long funcionarioID, FuncionarioDTO updatedFuncionario);
}
