package com.gialnet.bootregantes.estanques;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SaldoestanqueRepository extends CrudRepository<Saldoestanque, Integer> {

}