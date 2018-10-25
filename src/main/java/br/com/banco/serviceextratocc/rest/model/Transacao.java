package br.com.banco.serviceextratocc.rest.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transacao implements Serializable {
	
	private static final long serialVersionUID = -8955392979477844705L;
	
	private String data;
	private BigDecimal valor;
	private String tipoTransacao;

}
