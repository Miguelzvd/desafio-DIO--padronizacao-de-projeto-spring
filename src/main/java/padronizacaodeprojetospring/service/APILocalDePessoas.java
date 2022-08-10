package padronizacaodeprojetospring.service;

import org.springframework.stereotype.Service;
import padronizacaodeprojetospring.model.Pessoa;

import java.util.List;

@Service
public class APILocalDePessoas implements ServicoPessoa{

    // DONE - Strategy: implementar todos os metodos definidos na interface.

    // Esta classe foi criada apenas para testes "locais"
    List<Pessoa> pessoas_ = List.of(
            new Pessoa(11L, "Miguel", 22),
            new Pessoa(23L, "Joao", 17),
            new Pessoa(51L, "Carlinhos", 42),
            new Pessoa(84L, "Jorel", 51)
            );

    private APILocalDePessoas(){
        super();
    }

    @Override
    public List<Pessoa> getPessoas() {
        return pessoas_;
    }
}
