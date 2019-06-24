/**
 * @author: Saul Mamani M.
 * 24-06-19
 */

package edu.umss.projectsp.dto;

import edu.umss.projectsp.model.Detalle;
import edu.umss.projectsp.model.Producto;
import edu.umss.projectsp.model.Venta;

import java.math.BigDecimal;

public class DetalleDto extends DtoBase<Detalle> {
    private Integer cantidad;
    private BigDecimal precio;
    private BigDecimal subTotal;
    private Venta venta;
    private Producto producto;

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}