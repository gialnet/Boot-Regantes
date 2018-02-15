package com.gialnet.bootregantes.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@RepositoryRestResource para data rest
@Repository
public interface FincasRepository extends CrudRepository<Fincas, Long> {

    List<Fincas> findAll();
}
