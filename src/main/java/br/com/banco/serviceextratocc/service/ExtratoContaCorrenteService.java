package br.com.banco.serviceextratocc.service;

import br.com.banco.serviceextratocc.exception.ExtratoNotFoundException;
import br.com.banco.serviceextratocc.rest.model.Extrato;

public interface ExtratoContaCorrenteService {
	
	Extrato getExtratoByContaId(Long contaId) throws ExtratoNotFoundException;

}
