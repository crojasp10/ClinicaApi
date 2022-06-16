package com.appoinments.appointments.controller;

import com.appoinments.appointments.beans.Paciente;
import com.appoinments.appointments.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/pacientes")
public class PostController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/newPaciente")
    @ResponseStatus(HttpStatus.CREATED)
    public StringBuilder insertarPaciente(@RequestBody Paciente paciente) {

        paciente.getNombre();
        paciente.getApellido();
        paciente.getDNI();
        paciente.getFechaDeAlta();
        clienteRepository.save(paciente);

        StringBuilder result = new StringBuilder();
        result.append("Los datos ingresados son: ").append("Id ").append(paciente.getId()).append(" nombre: ")
                .append(paciente.getNombre()).append(" apellido: ").append(paciente.getApellido())
                .append(" DNI: ").append(paciente.getDNI()).append(" fecha: ").append(paciente.getFechaDeAlta());
        return result;
    }
}