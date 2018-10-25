package br.com.banco.serviceextratocc.rest.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class Transacao implements Serializable {
	
	private static final long serialVersionUID = -8955392979477844705L;
	
	public Transacao(String data, BigDecimal valor, String tipoTransacao) {
		this.data = data;
		this.valor = valor;
		this.tipoTransacao = tipoTransacao;
	}
	
	private String data;
	private BigDecimal valor;
	private String tipoTransacao;

}
