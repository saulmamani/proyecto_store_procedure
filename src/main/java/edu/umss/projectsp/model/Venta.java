/**
 * @author: Saul Mamani M.
 * 2019
 */

package edu.umss.projectsp.model;

import edu.umss.projectsp.dto.VentaDto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Entity
public class Venta extends ModelBase<VentaDto> {

    private Integer nroTransaccion;
    private Timestamp fecha;
    private String concepto;
    @ManyToOne(optional = false)
    private Persona persona;

    public Integer getNroTransaccion() {
        return nroTransaccion;
    }

    public void setNroTransaccion(Integer nroTransaccion) {
        this.nroTransaccion = nroTransaccion;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}