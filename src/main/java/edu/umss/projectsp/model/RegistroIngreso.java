/**
 * @author: Saul Mamani M.
 * 2019
 */

package edu.umss.projectsp.model;

import edu.umss.projectsp.dto.RegistroIngresoDto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Entity
public class RegistroIngreso extends ModelBase<RegistroIngresoDto> {
    private Timestamp fecha;
    private Integer cantidad;
    @ManyToOne(optional = false)
    private Producto producto;
    @ManyToOne(optional = false)
    private Proveedor proveedor;
}