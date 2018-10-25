package br.com.banco.serviceextratocc.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banco.serviceextratocc.db.model.ExtratoContaCorrente;

public interface ExtratoContaCorrenteRepository extends JpaRepository<ExtratoContaCorrente, Long> {
	
	List<ExtratoContaCorrente> findByContaID(Long contaID);

}
