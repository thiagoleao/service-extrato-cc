package br.com.banco.serviceextratocc.rest.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import br.com.banco.serviceextratocc.rest.model.Extrato;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ServiceExtratoContaCorrenteControllerTest {

	private String url = "http://localhost:8080/extrato";

	private RestTemplate restTemplate;

	@Before
	public void setUp() throws MalformedURLException {
		restTemplate = new RestTemplate();
	}
	
	@Test
	public void listaDeTransacoesDeveVirPreenchidaTest() {
		restTemplate.getInterceptors().add(
				  new BasicAuthorizationInterceptor("user", "password"));
		ResponseEntity<Extrato> responseEntity = restTemplate.exchange(
				url + "?contaId=100", 
				  HttpMethod.GET, null, Extrato.class);
		assertEquals(200, responseEntity.getStatusCodeValue());
		assertNotNull(responseEntity.getBody());
	}

}
