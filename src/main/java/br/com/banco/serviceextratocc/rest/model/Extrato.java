package br.com.banco.serviceextratocc.rest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Extrato implements Serializable {
	
	private static final long serialVersionUID = 1302051280021998746L;
	
	public Extrato() {
		this.transacaoList = new ArrayList<>();
	}
	
	private List<Transacao> transacaoList;

	public void addTransacao(Transacao transacao) {
		this.transacaoList.add(transacao);		
	}

}
