package com.appoinments.appointments.controller;

import com.appoinments.appointments.beans.Paciente;
import com.appoinments.appointments.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/crud")
public class GetController {

    @Autowired
    private ClienteRepository clienteRepository;


    @GetMapping("/getClientes")
    public List<Paciente> listar () {
        System.out.println("Ingresamos a findAll");
        return clienteRepository.findAll();

    }

    @GetMapping("/getClientesNombre/{name}")
    public List <Paciente> listarNombres (@PathVariable(value = "name")String name) {
        System.out.println("Ingresa a clientes nombre");
        return clienteRepository.findAllNames(name);
    }


}