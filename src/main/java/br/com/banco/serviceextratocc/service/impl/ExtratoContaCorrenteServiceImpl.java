package br.com.banco.serviceextratocc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.banco.serviceextratocc.db.model.ExtratoContaCorrente;
import br.com.banco.serviceextratocc.db.repository.ExtratoContaCorrenteRepository;
import br.com.banco.serviceextratocc.exception.ExtratoNotFoundException;
import br.com.banco.serviceextratocc.rest.model.Extrato;
import br.com.banco.serviceextratocc.rest.model.Transacao;
import br.com.banco.serviceextratocc.service.ExtratoContaCorrenteService;

@Component
public class ExtratoContaCorrenteServiceImpl implements ExtratoContaCorrenteService {
	
	@Autowired
	private ExtratoContaCorrenteRepository repository;

	@Override
	public Extrato getExtratoByContaId(Long contaId) throws ExtratoNotFoundException {
		
		List<ExtratoContaCorrente> extratoContaCorrente = repository.findByContaID(contaId);
		
		return parseToExtrato(extratoContaCorrente);
	}

	private Extrato parseToExtrato(List<ExtratoContaCorrente> list) {
		Extrato extrato = new Extrato();
		
		Transacao transacao = null;
		
		for(ExtratoContaCorrente extratoContaCorrente : list) {
			transacao = new Transacao(extratoContaCorrente.getData(), extratoContaCorrente.getValor(), extratoContaCorrente.getTipoTransacao());
			extrato.addTransacao(transacao);
		}
		
		return extrato;
	}

}
