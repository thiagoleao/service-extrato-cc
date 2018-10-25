package br.com.banco.serviceextratocc.rest.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Transacao implements Serializable {
	
	private static final long serialVersionUID = -8955392979477844705L;
	
	private Date data;
	private BigDecimal valor;
	private TipoTransacao tipoTransacao;

}
