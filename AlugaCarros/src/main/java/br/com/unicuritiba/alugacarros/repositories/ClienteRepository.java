package br.com.unicuritiba.alugacarros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unicuritiba.alugacarros.models.Cliente;

public interface ClienteRepository
        extends JpaRepository<Cliente, Long>{

}