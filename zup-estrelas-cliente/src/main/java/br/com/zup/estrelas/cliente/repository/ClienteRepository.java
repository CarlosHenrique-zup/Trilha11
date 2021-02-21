package br.com.zup.estrelas.cliente.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.zup.estrelas.cliente.entity.ClienteEntity;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteEntity, Long> {
		
	boolean existsByCpf(String cpf);
	
	boolean deleteByCpf(Long cpf);
}
