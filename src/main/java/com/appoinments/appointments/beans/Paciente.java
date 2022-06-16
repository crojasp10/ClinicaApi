package com.appoinments.appointments.beans;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Paciente {

    @Id
    //@GeneratedValue
    private int id;

    private String nombre;
    private String apellido;
    private String DNI;
    private String fechaDeAlta;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getDNI() {return DNI;}
    public void setDNI(String DNI) {this.DNI = DNI;}

    public String getFechaDeAlta() {return fechaDeAlta;}
    public void setFechaDeAlta(String fechaDeAlta) {this.fechaDeAlta = fechaDeAlta;}

    @Override
    public String toString() {
        return super.toString();
    }
}