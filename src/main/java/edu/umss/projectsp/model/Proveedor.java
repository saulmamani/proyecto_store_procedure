package edu.umss.projectsp.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proveedor {
    private Long id;
    private String nit;
    private String razonSocial;
    private String celular;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nit", nullable = false, length = 20)
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Basic
    @Column(name = "razonSocial", nullable = false, length = 255)
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Basic
    @Column(name = "celular", nullable = false, length = 20)
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Proveedor proveedor = (Proveedor) o;

        if (id != null ? !id.equals(proveedor.id) : proveedor.id != null) return false;
        if (nit != null ? !nit.equals(proveedor.nit) : proveedor.nit != null) return false;
        if (razonSocial != null ? !razonSocial.equals(proveedor.razonSocial) : proveedor.razonSocial != null)
            return false;
        if (celular != null ? !celular.equals(proveedor.celular) : proveedor.celular != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nit != null ? nit.hashCode() : 0);
        result = 31 * result + (razonSocial != null ? razonSocial.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        return result;
    }
}
