package com.gialnet.angularnombres.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface FincasRepository extends CrudRepository<Fincas, Long> {

    List<Fincas> findAll();
}
