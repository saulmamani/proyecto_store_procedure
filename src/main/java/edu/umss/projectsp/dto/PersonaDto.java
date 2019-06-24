/**
 * @author: Saul Mamani M.
 * 24-06-19
 */

package edu.umss.projectsp.dto;

import edu.umss.projectsp.model.Persona;

import java.util.Date;

public class PersonaDto extends DtoBase<Persona> {
    private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private Date fechaNacimiento;
    private String direccion;

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}