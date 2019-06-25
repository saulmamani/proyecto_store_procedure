package edu.umss.projectsp.repository;

import edu.umss.projectsp.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStoreProcedureRepository extends JpaRepository<Producto, Long> {
}
