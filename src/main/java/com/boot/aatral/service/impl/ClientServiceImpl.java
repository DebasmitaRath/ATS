package com.boot.aatral.service.impl;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.boot.aatral.dto.ClientDto;
import com.boot.aatral.entity.Client;
import com.boot.aatral.exception.ResourceNotFoundException;
import com.boot.aatral.repository.ClientRepository;
import com.boot.aatral.service.ClientService;

public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ClientDto createClient(ClientDto clientDto) {
		Client client = this.modelMapper.map(clientDto, Client.class);
		String id = client.getClientName().substring(0, 3) + UUID.randomUUID().toString().substring(0, 7);
		client.setClientId(id);
		Client createdClient = this.clientRepository.save(client);
		return this.modelMapper.map(createdClient, ClientDto.class);
	}

	@Override
	public ClientDto updateClient(ClientDto clientDto, String clientId) {
		Client client = this.clientRepository.findById(clientId)
				.orElseThrow(() -> new ResourceNotFoundException("Client", "Client Id", clientId));
		client.setClientName(clientDto.getClientName());
		client.setClientLocation(clientDto.getClientLocation());
		Client updatedClient = clientRepository.save(client);
		return this.modelMapper.map(updatedClient, ClientDto.class);
	}

	@Override
	public ClientDto getClientById(String clientId) {
		Client client = this.clientRepository.findById(clientId)
				.orElseThrow(() -> new ResourceNotFoundException("Client", "Client Id", clientId));

		return this.modelMapper.map(client, ClientDto.class);
	}

	@Override
	public List<ClientDto> getAllClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClient(String clientId) {
		// TODO Auto-generated method stub

	}

}
