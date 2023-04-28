package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chamados.domain.Pessoa;

public interface ClienteRepository extends JpaRepository<Pessoa, Integer>{

}
