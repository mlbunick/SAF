package com.project.saf_backend.controller;

import com.project.saf_backend.dto.FuncionarioDTO;
import com.project.saf_backend.service.FuncionarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    private FuncionarioService funcionarioService;

    // Adicionar Funcionario REST API
    @PostMapping
    public ResponseEntity<FuncionarioDTO> criarFuncionario(@RequestBody FuncionarioDTO funcionarioDTO){
        FuncionarioDTO saveFuncionario = funcionarioService.criarFuncionario(funcionarioDTO);
        return new ResponseEntity<>(saveFuncionario, HttpStatus.CREATED);
    }
}
