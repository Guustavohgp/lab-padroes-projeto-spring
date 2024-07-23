package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório para a entidade Cliente.
 * Fornece operações CRUD no banco de dados.
 * 
 * @autor falvojr
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
