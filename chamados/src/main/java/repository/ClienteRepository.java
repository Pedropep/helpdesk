package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chamados.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
