package com.gialnet.angularnombres.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ProfilesRepository extends CrudRepository<Profiles, Long> {

    List<Profiles> findByContent(@Param("q") String content);
}
