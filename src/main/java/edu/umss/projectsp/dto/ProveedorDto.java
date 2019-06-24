/**
 * @author: Saul Mamani M.
 * 24-06-19
 */

package edu.umss.projectsp.dto;


import edu.umss.projectsp.model.Proveedor;

public class ProveedorDto extends DtoBase<Proveedor> {
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