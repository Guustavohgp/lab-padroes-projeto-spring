package one.digitalinnovation.gof.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Entidade Cliente representando um cliente no sistema.
 * Contém informações pessoais e endereço.
 * 
 * @author falvojr
 */
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @ManyToOne
    @NotNull(message = "Endereço é obrigatório")
    private Endereco endereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

    // Getters and Setters
}
