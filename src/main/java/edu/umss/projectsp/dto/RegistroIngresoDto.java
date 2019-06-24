/**
 * @author: Saul Mamani M.
 * 24-06-19
 */

package edu.umss.projectsp.dto;

import edu.umss.projectsp.model.Producto;
import edu.umss.projectsp.model.Proveedor;
import edu.umss.projectsp.model.RegistroIngreso;

import java.sql.Timestamp;

public class RegistroIngresoDto extends DtoBase<RegistroIngreso> {
    private Timestamp fecha;
    private Integer cantidad;
    private Producto producto;
    private Proveedor proveedor;

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}