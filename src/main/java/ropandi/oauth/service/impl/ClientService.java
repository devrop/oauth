package ropandi.oauth.service.impl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import ropandi.oauth.ClientModel;
import ropandi.oauth.model.CredentialData;
import ropandi.oauth.model.CredentialResponse;
import ropandi.oauth.service.IClientService;

public class ClientService implements IClientService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${custom.url.user}")
	private String baseUrlUser;
	
	@Override
	public ClientModel findByClientId(String clientId) {
		// TODO Auto-generated method stub
		try{
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity <CredentialResponse> entity = new HttpEntity<>(headers);
		    StringBuffer sb = new StringBuffer(baseUrlUser);
		    sb.append("/");
		    sb.append("loadByClientId");
		    sb.append("?clientId=");
		    sb.append(clientId);
		    ClientModel dd = restTemplate.exchange(sb.toString(), HttpMethod.GET, entity, ClientModel.class).getBody();
			
		    return dd;
			} catch (Exception e) {
				// TODO: handle exception
				return null;
			}
	}

}
