package com.curso.controller;

import com.curso.model.Cliente;
import com.curso.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    private ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {

        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> todos() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @GetMapping("/{id}")
    public Cliente um(@PathVariable Integer id) { return clienteRepository.findById(id).get(); }


    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable Integer id) {
        clienteRepository.deleteById(id);
        return new Cliente();
    }

}
