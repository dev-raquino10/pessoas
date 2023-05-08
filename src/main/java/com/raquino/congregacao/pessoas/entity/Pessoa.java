package com.raquino.congregacao.pessoas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PESSOAS")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CD_PESSOA")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "NOME_COMPLETO")
    private String nomeCompleto;

    @Column(name = "NOME_FAMILIA")
    private String nomeFamilia;

    @Column(name = "GRUPO")
    private String grupo;
    
    @Column(name = "PRIVILEGIO")
    private String privilegio;
    
    @Column(name = "TP_PUBLICADOR")
    private String tipoPublicador;

    @Column(name = "DT_NASCIMENTO")
    private String dtNascimento;

    @Column(name = "DT_BATISMO")
    private String dtBatismo;

    @Column(name = "SEXO")
    private String sexo;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "ENDERECO")
    private String endereco;

}
