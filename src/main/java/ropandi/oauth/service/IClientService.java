package ropandi.oauth.service;

import ropandi.oauth.ClientModel;

public interface IClientService {

	
	public ClientModel findByClientId(String clientId);
}
