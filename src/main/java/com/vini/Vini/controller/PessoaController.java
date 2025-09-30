package com.vini.Vini.controller;

import com.vini.Vini.Model.PessoaModel;
import com.vini.Vini.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/pessoa")
@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaModel> findAll(){
        return this.pessoaService.findAll();
    }

    @GetMapping("/{id}")
    public PessoaModel findById(@PathVariable Long id){
        return this.pessoaService.findById(id);
    }

    @PostMapping
    public PessoaModel savePessoa(@RequestBody PessoaModel pessoaModel){
        return this.pessoaService.salvarPessoa(pessoaModel);
    }

    @DeleteMapping("/{id}/delete")
    public void deletePessoa(@PathVariable Long id) {
        this.pessoaService.deletarPessoa(id);
    }
}