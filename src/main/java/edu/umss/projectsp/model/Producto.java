/**
 * @author: Saul Mamani M.
 * 2019
 */

package edu.umss.projectsp.model;

import edu.umss.projectsp.dto.ProductoDto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class Producto extends ModelBase<ProductoDto> {
    private String codigoProducto;
    private String nombre;
    private String marca;
    private String descripcion;
    private BigDecimal precio;
    private Integer porcentajeOferta;
    @ManyToOne(optional = false)
    private Persona persona;


    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getPorcentajeOferta() {
        return porcentajeOferta;
    }

    public void setPorcentajeOferta(Integer porcentajeOferta) {
        this.porcentajeOferta = porcentajeOferta;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}