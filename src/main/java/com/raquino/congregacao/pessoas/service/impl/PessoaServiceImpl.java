package com.raquino.congregacao.pessoas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raquino.congregacao.pessoas.entity.Pessoa;
import com.raquino.congregacao.pessoas.repository.PessoaRepository;
import com.raquino.congregacao.pessoas.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }

    @Override
    public Pessoa getPessoaById(Long id) {
        Pessoa pessoa = pessoaRepository.findById(id).get();
        return pessoa;
    }

    @Override
    public Pessoa cadastrarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public Pessoa atualizarPessoa(Pessoa pessoa) {
        Optional<Pessoa> pessoaOptional = pessoaRepository.findById(pessoa.getId());
        if (pessoaOptional.isPresent()) {
            return pessoaRepository.save(pessoa);
        } else {
            return null;
        }
    }

    @Override
    public boolean excluirPessoa(Long id) {
        Optional<Pessoa> pessoaOptional = pessoaRepository.findById(id);
        if (pessoaOptional.isPresent()) {
            pessoaRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
