/**
 * @author: Saul Mamani M.
 * 2019
 */

package edu.umss.projectsp.model;

import edu.umss.projectsp.dto.ProveedorDto;

import javax.persistence.Entity;

@Entity
public class Proveedor extends ModelBase<ProveedorDto> {
    private String nit;
    private String razonSocial;
    private String celular;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}