package com.api.software.product.demo.Endpoints;

import com.api.software.product.demo.Entidades.Funcionario;
import com.api.software.product.demo.Serviços.FuncionarioServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioServicos funcionarioServicos;

    @GetMapping
    public ResponseEntity<List<Funcionario>> getFuncionarios() {
        List<Funcionario> funcionarios = funcionarioServicos.listarTodos();
        return ResponseEntity.ok(funcionarios);
    }
}