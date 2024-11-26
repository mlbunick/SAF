package com.project.saf_backend.controller;

import com.project.saf_backend.dto.FuncionarioDTO;
import com.project.saf_backend.service.FuncionarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    private FuncionarioService funcionarioService;

    // POST Funcionario REST API
    @PostMapping
    public ResponseEntity<FuncionarioDTO> criarFuncionario(@RequestBody FuncionarioDTO funcionarioDTO){
        FuncionarioDTO saveFuncionario = funcionarioService.criarFuncionario(funcionarioDTO);
        return new ResponseEntity<>(saveFuncionario, HttpStatus.CREATED);
    }

    // GET Funcionario REST API
    @GetMapping("{id}")
    public ResponseEntity<FuncionarioDTO> getFuncionarioByID(@PathVariable("id") Long funcionarioID){
        FuncionarioDTO funcionarioDTO = funcionarioService.getFuncionarioByID(funcionarioID);
        return ResponseEntity.ok(funcionarioDTO);
    }
}
