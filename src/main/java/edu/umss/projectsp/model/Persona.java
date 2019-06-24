/**
 * @author: Saul Mamani M.
 * 2019
 */

package edu.umss.projectsp.model;

import edu.umss.projectsp.dto.PersonaDto;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Persona extends ModelBase<PersonaDto> {
    private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private Date fechaNacimiento;


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
}