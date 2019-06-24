/**
 * @author: Saul Mamani M.
 * 24-06-19
 */

package edu.umss.projectsp.dto;

import edu.umss.projectsp.model.Persona;
import edu.umss.projectsp.model.Producto;

import java.math.BigDecimal;

public class ProductoDto extends DtoBase<Producto> {
    private String codigoProducto;
    private String nombre;
    private String marca;
    private String descripcion;
    private BigDecimal precio;
    private Integer porcentajeOferta;
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