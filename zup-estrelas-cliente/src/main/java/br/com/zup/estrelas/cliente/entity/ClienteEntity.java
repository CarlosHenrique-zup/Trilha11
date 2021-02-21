package br.com.zup.estrelas.cliente.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class ClienteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Integer idade;
	
	@Column(nullable = false)
	private String cpf;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String telefone;
	
	@Column(nullable = false)
	private String endereco;

	public ClienteEntity() {
		
	}
	
	public ClienteEntity(String cpf, String nome, int idade, String email, String telefone, String endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	
	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
