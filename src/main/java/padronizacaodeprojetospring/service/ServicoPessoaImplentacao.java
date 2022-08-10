package padronizacaodeprojetospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import padronizacaodeprojetospring.model.Pessoa;
import padronizacaodeprojetospring.model.PessoaRepository;

import java.util.Optional;

@Component
public class ServicoPessoaImplentacao{
/*
    // DONE Singleton: Injetar os componentes do spring utilizando @Autowired.
    @Autowired
    PessoaRepository pessoaRepository;

    // DONE - Strategy: implementar todos os metodos definidos na interface.
    // DONE Faced: Abstrair integrações com subsistemas, provendo uma interface simples


    @Override
    public Iterable<Pessoa> buscarTodos() {
        // Busca todas as pessoas
        return pessoaRepository.findAll();
    }

    @Override
    public Pessoa buscarPorId(Long id) {
        // Busca por ID
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        return pessoa.get();
    }

    @Override
    public void deletar(Long id) {
        // Deletar Cliente por ID.
        pessoaRepository.deleteById(id);
    }*/

}
