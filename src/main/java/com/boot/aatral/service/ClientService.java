package com.boot.aatral.service;

import java.util.List;

import com.boot.aatral.dto.ClientDto;

public interface ClientService {

	ClientDto createClient(ClientDto clientDto);

	ClientDto updateClient(ClientDto clientDto, String clientId);

	ClientDto getClientById(String clientId);

	List<ClientDto> getAllClients();

	void deleteClient(String clientId);
}
