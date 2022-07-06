package ropandi.oauth.service.impl;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

import ropandi.oauth.ClientModel;
import ropandi.oauth.service.IClientService;

@Service
public class ClientDetailsServiceImpl implements ClientDetailsService {

	@Autowired
	private IClientService clientService;
	
	@Override
	public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
		// TODO Auto-generated method stub
		ClientModel client = clientService.findByClientId(clientId);
		String resourceIds = client.getResourceIds().stream().collect(Collectors.joining(","));
        String scopes = client.getScopes().stream().collect(Collectors.joining(","));
        String grantTypes = client.getAuthorizedGrantTypes().stream().collect(Collectors.joining(","));
        String authorities = client.getAuthorities().stream().collect(Collectors.joining(","));
		BaseClientDetails base =  new BaseClientDetails(client.getClientId(), resourceIds, scopes, grantTypes, authorities);
        base.setClientSecret(client.getClientSecret());
        base.setAccessTokenValiditySeconds(client.getAccessTokenValiditySeconds().intValue());
        base.setRefreshTokenValiditySeconds(client.getRefreshTokenValiditySeconds().intValue());
        base.setAdditionalInformation(client.getAdditionalInformations());
        base.setAutoApproveScopes(client.getScopes());
        return base;
	}

}
