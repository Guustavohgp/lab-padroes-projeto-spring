package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório para a entidade Endereco.
 * Fornece operações CRUD no banco de dados.
 * 
 * @autor falvojr
 */
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}