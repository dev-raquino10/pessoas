package com.raquino.congregacao.pessoas.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PessoaDTO {

    private Integer id;
    private String nome;
    private String nomeCompleto;
    private String nomeFamilia;
    private String grupo;
    private String privilegio;
    private String tipoPublicador;
    private String dtNascimento;
    private String dtBatismo;
    private String sexo;
    private String telefone;
    private String endereco;

    public PessoaDTO() {
    }

}
