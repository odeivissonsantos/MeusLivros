package io.odeivissonsantos.mybooksapp.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@RequiredArgsConstructor
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull(message = "Campo NOME é obrigatório!")
    private String nome;

    @Column
    @NotNull(message = "Campo SOBRENOME é obrigatório!")
    private String sobrenome;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

    @Column
    @NotNull(message = "Campo EMAIL é obrigatório!!")
    @Email(message = "Campo EMAIL está inválido!")
    private String email;

}
