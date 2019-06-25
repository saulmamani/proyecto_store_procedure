package edu.umss.projectsp.service;

import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Map;

@Service
public class StoreProcedureServiceFillImp implements IStoreProcedureService {

    private static final String PERSISTENCE_UNIT_NAME = "transactions-optional";
    private static EntityManagerFactory factory;

    @Override
    public Map<String, Object> fillClientes() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("spr_clientes");
        // execute SP
        storedProcedure.execute();
        // get result
        em.getTransaction().commit();
        em.close();

        return storedProcedure.getHints();

    }

    @Override
    public Map<String, Object> fillComprasPorProducto(Long id) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("spr_compras_producto");
        // set parameters
        storedProcedure.registerStoredProcedureParameter("id", Long.class, ParameterMode.IN);
        storedProcedure.setParameter("id", id);
        // execute SP
        storedProcedure.execute();
        // get result
        em.getTransaction().commit();
        em.close();

        return storedProcedure.getHints();
    }

    @Override
    public void deleteCompraById(Long id) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("spr_eliminar_compra");
        // set parameters
        storedProcedure.registerStoredProcedureParameter("id", Long.class, ParameterMode.IN);
        storedProcedure.setParameter("id", id);
        // execute SP
        storedProcedure.execute();
        // get result
        em.getTransaction().commit();
        em.close();
    }
}
