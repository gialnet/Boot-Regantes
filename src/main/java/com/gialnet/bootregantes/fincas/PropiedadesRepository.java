package com.gialnet.bootregantes.fincas;

import com.gialnet.bootregantes.domain.Fincas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@RepositoryRestResource para data rest
@Repository
public interface PropiedadesRepository extends CrudRepository<Propiedades, String> {

    List<Propiedades> findAll();
}
