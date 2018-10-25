package br.com.banco.serviceextratocc.rest.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Extrato implements Serializable {
	
	private static final long serialVersionUID = 1302051280021998746L;
	
	private List<Transacao> transacaoList;

}
