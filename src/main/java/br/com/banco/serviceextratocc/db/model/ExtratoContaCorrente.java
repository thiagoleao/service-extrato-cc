package br.com.banco.serviceextratocc.db.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EXTRATO_CONTA_CORRENTE")
public class ExtratoContaCorrente implements Serializable {
	
	private static final long serialVersionUID = 4198913783446555078L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "DATA")
	private String data;
	
	@Column(name = "VALOR")
	private BigDecimal valor;
	
	@Column(name = "TIPO_TRANSACAO")
	private String tipoTransacao;	

	@Column(name = "CONTA_ID")
	private Long contaID;

}
