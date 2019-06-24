/**
 * @author: Saul Mamani M.
 * 24-06-19
 */

package edu.umss.projectsp.dto;

import edu.umss.projectsp.model.Persona;
import edu.umss.projectsp.model.Venta;

import java.sql.Timestamp;

public class VentaDto extends DtoBase<Venta> {
    private Integer nroTransaccion;
    private Timestamp fecha;
    private String concepto;
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