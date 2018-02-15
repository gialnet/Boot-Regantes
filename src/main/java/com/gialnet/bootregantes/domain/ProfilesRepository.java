package com.gialnet.bootregantes.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@RepositoryRestResource
@Repository
public interface ProfilesRepository extends CrudRepository<Profiles, Long> {

    List<Profiles> findByContent(@Param("q") String content);
}
