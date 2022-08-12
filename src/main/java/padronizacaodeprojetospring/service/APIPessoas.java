package padronizacaodeprojetospring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import padronizacaodeprojetospring.model.Pessoa;


//Interface utilizada para consumir api local criada para testes.
@FeignClient(name = "pessoas", url = "http://localhost:3000")
public interface APIPessoas {
    @GetMapping(value = "/pessoas")
    Iterable<Pessoa> getPessoas();
}
