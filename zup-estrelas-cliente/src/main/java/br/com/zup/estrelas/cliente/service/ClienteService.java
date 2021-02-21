package br.com.zup.estrelas.cliente.service;

import java.util.List;

import br.com.zup.estrelas.cliente.dto.ClienteDTO;
import br.com.zup.estrelas.cliente.dto.MensagemDTO;
import br.com.zup.estrelas.cliente.entity.ClienteEntity;

public interface ClienteService {

	public MensagemDTO adicionarCliente(ClienteDTO clienteDTO);

	public List<ClienteEntity> listarCliente();

	public MensagemDTO atualizarCliente(Long idCliente, ClienteDTO clienteDTO);

	public MensagemDTO removerCliente(Long idCliente);
}
