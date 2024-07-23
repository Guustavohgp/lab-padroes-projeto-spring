package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;
import java.util.List;

/**
 * Interface que define o padrão Strategy no domínio de cliente.
 * Podemos ter múltiplas implementações dessa interface, se necessário.
 * 
 * @autor falvojr
 */
public interface ClienteService {

    List<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    Cliente inserir(Cliente cliente);

    Cliente atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
