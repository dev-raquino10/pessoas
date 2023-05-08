package com.raquino.congregacao.pessoas.model.dto;

import com.raquino.congregacao.pessoas.entity.Pessoa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PessoaDTO {

    private Long id;
    private String nome;
    private String grupo;
    private String privilegio;
    private String tipoPublicador;

    public PessoaDTO() {
    }

    public PessoaDTO(Pessoa pessoa) {
        this.id = pessoa.getId();
        this.nome = pessoa.getNome();
        this.grupo = pessoa.getGrupo();
        this.privilegio = pessoa.getPrivilegio();
        this.tipoPublicador = pessoa.getTipoPublicador();
    }

}
