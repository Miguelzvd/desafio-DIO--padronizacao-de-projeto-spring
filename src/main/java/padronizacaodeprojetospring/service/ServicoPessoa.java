package padronizacaodeprojetospring.service;

import org.springframework.stereotype.Service;
import padronizacaodeprojetospring.model.Pessoa;

// Representa uma strategy com todas a opercações de CRUD.
// Pode-se ter multiplas implementações com essa mesma interface.
@Service
public interface ServicoPessoa {

    Iterable<Pessoa> buscarTodos();

    Pessoa buscarPorId(Long id);

    void deletar(Long pessoa);
}
