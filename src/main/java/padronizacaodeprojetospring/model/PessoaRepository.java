package padronizacaodeprojetospring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
    Pessoa pessoa = new Pessoa(111L, "Miguel", 22);
}
