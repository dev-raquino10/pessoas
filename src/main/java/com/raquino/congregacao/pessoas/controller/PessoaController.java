package com.raquino.congregacao.pessoas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.raquino.congregacao.pessoas.entity.Pessoa;
import com.raquino.congregacao.pessoas.service.PessoaService;

@RestController
@RequestMapping("api/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/cadastrar")
    public ResponseEntity<?> createNewUser(@RequestBody Pessoa pessoa) {
        Pessoa pessoaCadastrada = pessoaService.cadastrarPessoa(pessoa);
        return new ResponseEntity<Object>(pessoaCadastrada, HttpStatus.CREATED);
    }

    @GetMapping("/listarPessoas")
    public List<Pessoa> listarPessoas() {
        return pessoaService.listarPessoas();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Pessoa> getPessoaById(@PathVariable Long id) {
        Pessoa pessoa = pessoaService.getPessoaById(id);
        return ResponseEntity.ok(pessoa);
    }

    @PutMapping("/updatePessoa/{id}")
    public ResponseEntity<Pessoa> atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        pessoa.setId(id);
        Pessoa pessoaAtualizada = pessoaService.atualizarPessoa(pessoa);
        return ResponseEntity.ok(pessoaAtualizada);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> excluirPessoa(@PathVariable Long id) {
        boolean pessoaExcluida = pessoaService.excluirPessoa(id);
        if (pessoaExcluida) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
