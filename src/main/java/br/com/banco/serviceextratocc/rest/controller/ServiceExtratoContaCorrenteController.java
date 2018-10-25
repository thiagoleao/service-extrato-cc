package br.com.banco.serviceextratocc.rest.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.serviceextratocc.exception.ExtratoNotFoundException;
import br.com.banco.serviceextratocc.rest.model.Extrato;
import br.com.banco.serviceextratocc.service.ExtratoContaCorrenteService;

/**
 * Classe tipo controller endpoint das
 * chamadas rest para consulta do extrato da 
 * conta corrente  
 *
 * @author Thiago Leão
 * @jdk 1.8
 */

@RestController
public class ServiceExtratoContaCorrenteController {
	
	private static final Logger logger = LoggerFactory.getLogger(ServiceExtratoContaCorrenteController.class);
	
	@Autowired
	private ExtratoContaCorrenteService service;
	
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("extrato")
	public Extrato getExtrato(@RequestParam Long contaId) throws ExtratoNotFoundException {
		logger.info("Iniciando a consulta de extrato para a conta de ID:" + contaId);
	
		if(request.isUserInRole("USER")) {
			logger.info("O Usuário: " + request.getRemoteUser() + "tem permissão de acesso");
		}
	
		Extrato extrato = service.getExtratoByContaId(contaId);
		
		logger.info("Finalizando a consulta de extrato para a conta de ID:" + contaId);
		
		return extrato;
	}

}
