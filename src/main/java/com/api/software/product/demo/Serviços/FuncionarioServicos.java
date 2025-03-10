package com.api.software.product.demo.Serviços;

import com.api.software.product.demo.Entidades.Funcionario;
import com.api.software.product.demo.Repositorios.FuncionarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FuncionarioServicos {

    @Autowired
    private FuncionarioRepositorio funcionarioRepository;

    public List<Funcionario> listarTodos() {
        List<Funcionario> funcionarios = funcionarioRepository.findAll();
        System.out.println(funcionarios);
        return funcionarios;
    }
}