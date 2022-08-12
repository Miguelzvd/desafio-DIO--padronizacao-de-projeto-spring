package padronizacaodeprojetospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import padronizacaodeprojetospring.model.Pessoa;
import padronizacaodeprojetospring.service.APIPessoas;
import padronizacaodeprojetospring.service.ServicoPessoa;

@RestController
public class PessoaController {

    // DONE Singleton: Injetar os componentes do spring utilizando @Autowired.
    @Autowired
    ServicoPessoa servicoPessoa;

    @Autowired
    APIPessoas apiPessoas;
    // DONE Faced: Abstrair integrações com subsistemas, provendo uma interface simples (Encontra-se na classe APIPessoas).
    // DONE - Strategy: implementar todos os metodos definidos na interface. (Encontra-se na classe APILocalDePessoas).


    //PARA CONSUMIR API LOCAL
    @GetMapping("/APILocal")
    public Iterable<Pessoa> buscarTodosAPILOCAL() {
        return apiPessoas.getPessoas();
    }

    // Para listar todas as pessoas.
    @GetMapping("/pessoas")
    public Iterable<Pessoa> buscarTodos() {
        return servicoPessoa.buscarTodos();
    }

    // Para inserir uma nova pessoa.
    @PostMapping("/pessoa")
    public void pessoaAdd(@RequestBody Pessoa pessoa) {
        servicoPessoa.salvarPessoa(pessoa);
        System.out.println("Pessoa adicionada!");
    }

    // Busca pessoa pelo id atraves do path variable
    @GetMapping("/pessoa/{id}")
    public Pessoa buscarPorId(@PathVariable Long id) {
        return servicoPessoa.buscarPorId(id);
    }


    // Deleta pessoa pelo id
    @DeleteMapping("/pessoa/{id}")
    public void deletar(@PathVariable Long id) {
        servicoPessoa.deletar(id);
        System.out.println("Pessoa deletada com sucesso!");
    }

}
