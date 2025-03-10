package com.api.software.product.demo.Repositorios;

import com.api.software.product.demo.Entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface FuncionarioRepositorio extends JpaRepository<Funcionario, UUID> {
}