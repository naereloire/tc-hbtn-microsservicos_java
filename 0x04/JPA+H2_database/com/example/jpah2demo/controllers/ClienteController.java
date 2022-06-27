package com.example.jpah2demo.controllers;

import com.example.jpah2demo.models.Cliente;
import com.example.jpah2demo.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

  @Autowired private ClienteRepository clienteRepository;

  @PostMapping("/addClient")
  public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente) {
    cliente.setId(null);
    Cliente clientCreated = clienteRepository.save(cliente);
    return ResponseEntity.status(HttpStatus.CREATED).body(clientCreated);
  }

  @GetMapping("/findAllClients")
  public ResponseEntity<List<Cliente>> findAllClients() {
    List<Cliente> clientes = clienteRepository.findAll();
    return ResponseEntity.ok(clientes);
  }

  @GetMapping("/findClientById/{id}")
  public ResponseEntity<Cliente> findClientById(@PathVariable("id") Long idClient) {
    return clienteRepository
        .findById(idClient)
        .map(r -> ResponseEntity.ok().body(r))
        .orElse(ResponseEntity.notFound().build());
  }

  @DeleteMapping("/removeClientById/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void removerCliente(@PathVariable("id") Long idClient) {
    if (idClient != null) {
      clienteRepository.deleteAllById(Collections.singleton(idClient));
    }
  }

  @PutMapping("/updateClientById/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
    Optional<Cliente> clientFounded = clienteRepository.findById(id);
    if (clientFounded.isPresent()) {
      Cliente updateClient = clientFounded.get();
      updateClient.setNome(cliente.getNome());
      updateClient.setIdade(cliente.getIdade());
      updateClient.setEmail(cliente.getEmail());
      updateClient.setTelefoneList(cliente.getTelefoneList());
      updateClient.setEnderecoList(cliente.getEnderecoList());
    }
  }
}
