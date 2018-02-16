package com.gialnet.bootregantes.estanques;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstanquesRepository extends CrudRepository<Estanques, String> {

    List<Estanques> findAll();
    Estanques findOne(String codigo);

}
