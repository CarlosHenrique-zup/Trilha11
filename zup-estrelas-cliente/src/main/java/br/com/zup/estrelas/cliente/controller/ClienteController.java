package br.com.zup.estrelas.cliente.controller;

import java.util.List;
import org.springframework.http.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.estrelas.cliente.dto.ClienteDTO;
import br.com.zup.estrelas.cliente.dto.MensagemDTO;
import br.com.zup.estrelas.cliente.entity.ClienteEntity;
import br.com.zup.estrelas.cliente.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	private final Logger log = LoggerFactory.getLogger(ClienteController.class);
	
	private static final String CLIENTE_CADASTRADO_COM_SUCESSO = "Cliente cadastrado com sucesso!";
	private static final String CLIENTE_ALTERADO_COM_SUCESSO = "Cliente alterado com sucesso!";
	private static final String CLIENTE_REMOVIDO_COM_SUCESSO = "Cliente removido com sucesso!";
	
	@Autowired
	ClienteService clienteService;

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public MensagemDTO adicionarCliente(@RequestBody ClienteDTO clienteDTO) {
		log.info("Entrando no metodo adicionar cliente no Controller: " + clienteDTO);
		clienteService.adicionarCliente(clienteDTO);
		
		return new MensagemDTO(CLIENTE_CADASTRADO_COM_SUCESSO);
	}

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<ClienteEntity> listarCliente() {
		log.info("Entrando no metodo listar cliente no Controller: ");
		return clienteService.listarCliente();
	}

	@PutMapping(path = "/{idCliente}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public MensagemDTO alterarCliente(@PathVariable Long idCliente, @RequestBody ClienteDTO clienteDTO) {
		log.info("Entrando no metodo listar cliente no Controller: ");
		clienteService.atualizarCliente(idCliente, clienteDTO);
	
		return new MensagemDTO(CLIENTE_ALTERADO_COM_SUCESSO);
	}

	@DeleteMapping(path = "/{idCliente}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public MensagemDTO removerCliente(@PathVariable Long idCliente) {
		log.info("Entrando no metodo listar cliente no Controller: " + idCliente);
		clienteService.removerCliente(idCliente);
	
		return new MensagemDTO(CLIENTE_REMOVIDO_COM_SUCESSO);
	}
}
