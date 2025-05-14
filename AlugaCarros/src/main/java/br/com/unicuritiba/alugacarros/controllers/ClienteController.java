package br.com.unicuritiba.alugacarros.controllers;

import br.com.unicuritiba.alugacarros.models.Cliente;
import br.com.unicuritiba.alugacarros.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @Autowired
    ClienteRepository repository;

    @PostMapping("/clientes")
    public ResponseEntity<Cliente> saveCliente(@RequestBody Cliente cliente) {
        Cliente savedCliente = repository.save(cliente);
        return ResponseEntity.ok(savedCliente);
    }

 }
