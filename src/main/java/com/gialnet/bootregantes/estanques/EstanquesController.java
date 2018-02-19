package com.gialnet.bootregantes.estanques;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/estanques")
public class EstanquesController {


    @Autowired
    private final EstanquesRepository estanquesRepository;

    private static final Logger logger = LoggerFactory.getLogger(EstanquesController.class);

    public EstanquesController(EstanquesRepository estanquesRepository) {
        this.estanquesRepository = estanquesRepository;
    }

    @RequestMapping(value = "/estanques", method = RequestMethod.GET)
    public List<Estanques> estanques(){
        return estanquesRepository.findAll();
    }

    //@Transactional
    @RequestMapping(value = "/estanques_mod", method = RequestMethod.GET)
    public ResponseEntity estanque_mod() {

        Estanques ue= estanquesRepository.findOne("06700");

        ue.setOrdenriego("44");

        System.out.println(ue.toString());
        estanquesRepository.save(ue);

        return  new ResponseEntity(HttpStatus.OK);
    }

}
