package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chamados.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
