package com.api.software.product.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    public UUID Id;

    @Column(name = "Nome")
    public String Nome;

    @Column(name = "Funcao")
    private String Funcao;

    @Column(name = "Salario")
    public String Salario;
}