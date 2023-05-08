package com.raquino.congregacao.pessoas.service;

import java.util.List;

import com.raquino.congregacao.pessoas.entity.Pessoa;

public interface PessoaService {

    List<Pessoa> listarPessoas();
    
    Pessoa getPessoaById(Long id);

    Pessoa cadastrarPessoa(Pessoa pessoa);

    Pessoa atualizarPessoa(Pessoa pessoa);

    boolean excluirPessoa(Long id);

}
