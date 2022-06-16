package com.appoinments.appointments.repository;

import com.appoinments.appointments.beans.Paciente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Paciente, Integer> {

    Paciente findById(int id);

    List<Paciente> findAll();

    void deleteById(int id);

    Paciente save(Paciente persona);

    @Query(value = "SELECT * FROM Cliente WHERE Cliente.nombre = :name",
            nativeQuery = true)
    List <Paciente> findAllNames(@Param("name") String name);



}
