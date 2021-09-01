package br.org.projetointegrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.projetointegrador.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {

	public List <Tema> findAllByDescricaoContainingIgnoreCase (String descricao);
}
