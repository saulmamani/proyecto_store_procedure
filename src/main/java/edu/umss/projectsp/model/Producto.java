package edu.umss.projectsp.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Producto {
    private Long id;
    private String codigoProducto;
    private String nombre;
    private String marca;
    private String descripcion;
    private BigDecimal precio;
    private Integer porcentajeOferta;
    private Persona personaByIdPersona;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "codigoProducto", nullable = false, length = 20)
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 255)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "marca", nullable = false, length = 255)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Basic
    @Column(name = "descripcion", nullable = false, length = -1)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "precio", nullable = false, precision = 2)
    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Basic
    @Column(name = "porcentajeOferta", nullable = true)
    public Integer getPorcentajeOferta() {
        return porcentajeOferta;
    }

    public void setPorcentajeOferta(Integer porcentajeOferta) {
        this.porcentajeOferta = porcentajeOferta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producto producto = (Producto) o;

        if (id != null ? !id.equals(producto.id) : producto.id != null) return false;
        if (codigoProducto != null ? !codigoProducto.equals(producto.codigoProducto) : producto.codigoProducto != null)
            return false;
        if (nombre != null ? !nombre.equals(producto.nombre) : producto.nombre != null) return false;
        if (marca != null ? !marca.equals(producto.marca) : producto.marca != null) return false;
        if (descripcion != null ? !descripcion.equals(producto.descripcion) : producto.descripcion != null)
            return false;
        if (precio != null ? !precio.equals(producto.precio) : producto.precio != null) return false;
        if (porcentajeOferta != null ? !porcentajeOferta.equals(producto.porcentajeOferta) : producto.porcentajeOferta != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (codigoProducto != null ? codigoProducto.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        result = 31 * result + (porcentajeOferta != null ? porcentajeOferta.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idPersona", referencedColumnName = "id", nullable = false)
    public Persona getPersonaByIdPersona() {
        return personaByIdPersona;
    }

    public void setPersonaByIdPersona(Persona personaByIdPersona) {
        this.personaByIdPersona = personaByIdPersona;
    }
}
