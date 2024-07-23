package one.digitalinnovation.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;
import javax.validation.Valid;
import java.util.List;

/**
 * Controller para gerenciamento de Clientes.
 * Fornece endpoints REST para operações de CRUD.
 * 
 * @author falvojr
 */
@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    /**
     * Retorna todos os clientes cadastrados.
     * 
     * @return lista de clientes
     */
    @GetMapping
    public ResponseEntity<List<Cliente>> buscarTodos() {
        List<Cliente> clientes = clienteService.buscarTodos();
        return ResponseEntity.ok(clientes);
    }

    /**
     * Retorna o cliente correspondente ao ID fornecido.
     * 
     * @param id ID do cliente
     * @return cliente encontrado
     */
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        Cliente cliente = clienteService.buscarPorId(id);
        return ResponseEntity.ok(cliente);
    }

    /**
     * Insere um novo cliente.
     * 
     * @param cliente dados do cliente a ser inserido
     * @return cliente inserido
     */
    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody @Valid Cliente cliente) {
        Cliente novoCliente = clienteService.inserir(cliente);
        return ResponseEntity.ok(novoCliente);
    }

    /**
     * Atualiza os dados de um cliente existente.
     * 
     * @param id ID do cliente a ser atualizado
     * @param cliente novos dados do cliente
     * @return cliente atualizado
     */
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody @Valid Cliente cliente) {
        Cliente clienteAtualizado = clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(clienteAtualizado);
    }

    /**
     * Remove um cliente pelo ID fornecido.
     * 
     * @param id ID do cliente a ser removido
     * @return resposta sem conteúdo
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
