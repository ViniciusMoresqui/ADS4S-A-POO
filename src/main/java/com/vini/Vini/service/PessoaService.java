package com.vini.Vini.service;

import com.vini.Vini.Model.PessoaModel;
import com.vini.Vini.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaModel> findAll() {
        return this.pessoaRepository.findAll();
    }

    public PessoaModel findById(Long id) {
        return this.pessoaRepository.findById(id).orElse(null);
    }

    public PessoaModel salvarPessoa(PessoaModel pessoaModel) {
        return this.pessoaRepository.save(pessoaModel);
    }

    public void deletarPessoa(Long id) {
        this.pessoaRepository.deleteById(id);
    }

}


