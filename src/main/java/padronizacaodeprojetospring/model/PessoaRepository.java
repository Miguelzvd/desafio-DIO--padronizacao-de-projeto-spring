package padronizacaodeprojetospring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Representa uma strategy com todas a opercações de CRUD.
@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

}
