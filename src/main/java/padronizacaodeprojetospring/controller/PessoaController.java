package padronizacaodeprojetospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import padronizacaodeprojetospring.model.Pessoa;
import padronizacaodeprojetospring.service.ServicoPessoa;

import java.util.List;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    @Autowired
    ServicoPessoa servicoPessoa;

    /*private List<Pessoa> pessoas_ = List.of(
            new Pessoa(11L, "Miguel", 22),
            new Pessoa(13L, "João", 33),
            new Pessoa(18L, "Carlos", 40),
            new Pessoa(20L, "Andre", 27));*/

    @GetMapping
    public Iterable<Pessoa> buscarTodos() {
        return servicoPessoa.buscarTodos();
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
}
