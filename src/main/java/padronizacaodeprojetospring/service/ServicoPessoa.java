package padronizacaodeprojetospring.service;

import org.springframework.stereotype.Service;
import padronizacaodeprojetospring.model.Pessoa;

import java.util.List;


// Pode-se ter multiplas implementações com essa mesma interface.
@Service
public interface ServicoPessoa {

    List<Pessoa> getPessoas();
    /*Iterable<Pessoa> buscarTodos();

    Pessoa buscarPorId(Long id);

    void deletar(Long pessoa);*/
}
