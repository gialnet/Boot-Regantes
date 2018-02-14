package com.gialnet.bootregantes.estanques;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EstanquesRepository extends CrudRepository<Estanques, String> {

    List<Estanques> findAll();
}
