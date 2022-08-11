package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping(value = "/buscar")
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @GetMapping(value = "/buscar/{id}")
    public Aluno getAlunoById(@PathVariable Long id){
        return service.get(id);
    }

    @PostMapping(value = "/cadastrar")
    public Aluno create(@RequestBody AlunoForm form){
        return service.create(form);
    }

    @GetMapping(value = "/deletar/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @PutMapping(value = "/update/{id}")
    public Aluno update(@RequestBody AlunoUpdateForm form, @PathVariable Long id){
        return service.update(id, form);
    }

    @GetMapping(value = "/todasAvaliacoes")
    public List<AvaliacaoFisica> buscarTodasAvaliacoes(@PathVariable Long id){
        return service.buscarTodasAvaiacoes(id);
    }
}
