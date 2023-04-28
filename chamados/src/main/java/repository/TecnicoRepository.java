package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chamados.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
