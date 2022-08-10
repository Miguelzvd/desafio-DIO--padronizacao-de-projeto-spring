package padronizacaodeprojetospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import padronizacaodeprojetospring.model.Pessoa;
import padronizacaodeprojetospring.service.APILocalDePessoas;
import padronizacaodeprojetospring.service.APIPessoas;
import padronizacaodeprojetospring.service.ServicoPessoa;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("pessoas")
public class PessoaController {


    /*@Autowired
    APIPessoas apiPessoas;*/

    // DONE Singleton: Injetar os componentes do spring utilizando @Autowired.
    @Autowired
    ServicoPessoa servicoPessoa;

    // DONE Faced: Abstrair integrações com subsistemas, provendo uma interface simples (Encontra-se na classe APIPessoas).
    // DONE - Strategy: implementar todos os metodos definidos na interface. (Encontra-se na classe APILocalDePessoas).


    // Para listar todas as pessoas.
    @GetMapping
    public List<Pessoa> buscarTodos() {
        return servicoPessoa.getPessoas();
    }

    // Para inserir uma nova pessoa.
    // Este metodo ainda não funciona.
    @PostMapping("/add")
    public void PessoaAdd(@RequestBody Pessoa pessoa) {
        servicoPessoa.getPessoas().add(pessoa);
        System.out.println("Pessoa adicionada!");;
    }

    // Metodos para servicoPessoa, para api externa.

    /*@GetMapping("pessoa/{id}")
    public void buscarPorId(@PathVariable Long id) {
//        return servicoPessoa.buscarPorId(id);
    }


    @DeleteMapping("pessoa/{id}")
    public void deletar(@PathVariable Long id) {
//        servicoPessoa.deletar(id);
        System.out.println("Deletado com sucesso!");
    }*/


}
