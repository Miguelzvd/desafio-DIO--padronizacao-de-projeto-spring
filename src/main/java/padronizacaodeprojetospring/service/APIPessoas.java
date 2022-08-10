package padronizacaodeprojetospring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import padronizacaodeprojetospring.model.Pessoa;

//Esta classe não possui utilidade no momento.
//Utilizado para consumir api local gerada pelo node.
@FeignClient(name = "pessoa", url = "http://localhost:3000/Pessoas")
public interface APIPessoas {
    // DONE Faced: Abstrair integrações com subsistemas, provendo uma interface simples
    @RequestMapping(method = RequestMethod.GET, value = "")
    Pessoa getPessoa();
}
