package com.curso.service;

import com.curso.model.Cliente;
import com.curso.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;







    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }




    public Optional<Cliente> findById(Integer id) {
        return clienteRepository.findById(id);
    }



}
