package com.example.demo.service;

import com.example.demo.model.PessoaModel;
import com.example.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaModel> listar(){
        return pessoaRepository.findAll();
    }

    public PessoaModel adicionar(PessoaModel pessoaModel){
        return pessoaRepository.save(pessoaModel);
    }
}
