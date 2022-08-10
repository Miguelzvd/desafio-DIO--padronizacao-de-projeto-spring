package padronizacaodeprojetospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import padronizacaodeprojetospring.model.Pessoa;
import padronizacaodeprojetospring.service.ServicoPessoa;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    @Autowired
    ServicoPessoa servicoPessoa;
    List<Pessoa> pessoas_ = new ArrayList<>();



    @GetMapping()
    public List<Pessoa> buscarTodos() {
        pessoas_.add(new Pessoa(11L, "Miguel", 22));
        pessoas_.add(new Pessoa(23L, "Joao", 17));
        pessoas_.add(new Pessoa(41L, "Miguel", 32));
        pessoas_.add(new Pessoa(51L, "Carlinhos", 42));
        pessoas_.add(new Pessoa(84L, "Jorel", 51));
        return pessoas_;
    }


    @GetMapping("pessoas/pessoa/{id}")
    public Pessoa buscarPorId(@PathVariable Long id) {
        return servicoPessoa.buscarPorId(id);
    }


    @DeleteMapping("pessoas/pessoa/{id}")
    public void deletar(@PathVariable Long id) {
        servicoPessoa.deletar(id);
        System.out.println("Deletado com sucesso!");
    }

    @PostMapping("/add")
    public void PessoaAdd(@RequestBody Pessoa pessoa) {
        pessoas_.add(pessoa);
        System.out.println("Pessoa adicionada!");;
    }
}
