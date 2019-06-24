package edu.umss.projectsp.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Detalle {
    private Long id;
    private Integer cantidad;
    private BigDecimal precio;
    private BigDecimal subTotal;
    private Venta ventaByIdVenta;
    private Producto productoByIdProducto;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cantidad", nullable = false)
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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
    @Column(name = "subTotal", nullable = false, precision = 2)
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Detalle detalle = (Detalle) o;

        if (id != null ? !id.equals(detalle.id) : detalle.id != null) return false;
        if (cantidad != null ? !cantidad.equals(detalle.cantidad) : detalle.cantidad != null) return false;
        if (precio != null ? !precio.equals(detalle.precio) : detalle.precio != null) return false;
        if (subTotal != null ? !subTotal.equals(detalle.subTotal) : detalle.subTotal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cantidad != null ? cantidad.hashCode() : 0);
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        result = 31 * result + (subTotal != null ? subTotal.hashCode() : 0);

        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idVenta", referencedColumnName = "id", nullable = false)
    public Venta getVentaByIdVenta() {
        return ventaByIdVenta;
    }

    public void setVentaByIdVenta(Venta ventaByIdVenta) {
        this.ventaByIdVenta = ventaByIdVenta;
    }

    @ManyToOne
    @JoinColumn(name = "idProducto", referencedColumnName = "id", nullable = false)
    public Producto getProductoByIdProducto() {
        return productoByIdProducto;
    }

    public void setProductoByIdProducto(Producto productoByIdProducto) {
        this.productoByIdProducto = productoByIdProducto;
    }
}
