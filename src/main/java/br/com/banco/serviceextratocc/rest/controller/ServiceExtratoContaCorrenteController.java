package br.com.banco.serviceextratocc.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.serviceextratocc.rest.model.Extrato;

@RestController
public class ServiceExtratoContaCorrenteController {
	
	private static final Logger logger = LoggerFactory.getLogger(ServiceExtratoContaCorrenteController.class);
	
	@RequestMapping("extrato")
	public Extrato getExtrato(@RequestParam Long contaId) {
		logger.info("Iniciando a consulta de extrato para a conta de ID:" + contaId);
	
		return new Extrato();
	}

}
