package com.gialnet.bootregantes.tickets;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TickectsRepository extends CrudRepository<Tickets, Long> {

}
