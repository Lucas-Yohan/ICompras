package com.lyalencar.icompras.clientes.model;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Entity
@Data
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "nome", nullable = false, length = 150)
    private String nome;

    @Column(name = "cpf", nullable = false, length = 11, unique = true)
    private String cpf;

    @Column(name = "logradouro", length = 100, nullable = false)
    private String logradouro;

    @Column(name = "numero", length = 100, nullable = false)
    private String numero;

    @Column(name = "bairro", length = 100, nullable = false)
    private String bairro;

    @Column(name = "email", length = 150, nullable = false)
    private String email;

    @Column(name = "telefone", length = 20, nullable = false)
    private String telefone;
}
