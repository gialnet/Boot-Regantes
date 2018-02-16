package com.gialnet.bootregantes.tickets;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface TickectsRepository extends CrudRepository<Tickets, Long> {

    // This is the Spring Data JPA way
    @Procedure
    public Integer ComprarTicketMinutos(Integer estanque, Integer minutos);

    Tickets findById(Integer id);
}
