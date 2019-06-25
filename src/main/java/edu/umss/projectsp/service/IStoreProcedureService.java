package edu.umss.projectsp.service;

import java.util.Map;

public interface IStoreProcedureService {
    public abstract Map<String, Object> fillClientes();
    public abstract Map<String, Object> fillComprasPorProducto(Long id);
    public abstract void deleteCompraById(Long id);
}
