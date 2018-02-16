package com.gialnet.bootregantes;

import com.gialnet.bootregantes.tickets.TickectsRepository;
import com.gialnet.bootregantes.tickets.Tickets;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootRegantesApplicationTests {

	@Autowired
    TickectsRepository tickectsRepository;

    @Autowired
    private EntityManager entityManager;

    @Test
    public void TickectComprarTicketMinutosByHibernateTest() {

        Integer minutos= 12;
        StoredProcedureQuery addTicket = entityManager.createNamedStoredProcedureQuery("ToBuyTicketsMinutes");
        addTicket.setParameter("estanque",6601);
        addTicket.setParameter("minutos", minutos);

        // Stored procedure call
        Integer createdTicketId = (Integer) addTicket.getSingleResult();
        Assert.assertNotNull(createdTicketId);

        Tickets tk = tickectsRepository.findById(createdTicketId);
        Assert.assertEquals(minutos, tk.getMinutos_comprados());
    }

    @Test
    public void TickectComprarTicketMinutosByHibernateDynamicTest() {

        Integer minutos= 45;

        StoredProcedureQuery addTicket = entityManager.createStoredProcedureQuery("ComprarTicketMinutos");
        addTicket.registerStoredProcedureParameter(1, Integer.class, ParameterMode.IN);
        addTicket.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        addTicket.setParameter(1,6601);
        addTicket.setParameter(2, minutos);

        // Stored procedure call
        Integer createdTicketId = (Integer) addTicket.getSingleResult();
        Assert.assertNotNull(createdTicketId);

        Tickets tk = tickectsRepository.findById(createdTicketId);
        Assert.assertEquals(minutos, tk.getMinutos_comprados());
    }

	@Test
    public void TickectsRepositoryComprarTicketMinutosTest() {
        Integer addTicketId = tickectsRepository.ComprarTicketMinutos(6600, 15);
        Assert.assertNotNull(addTicketId);
    }

	@Test
	public void contextLoads() {
	}

}
