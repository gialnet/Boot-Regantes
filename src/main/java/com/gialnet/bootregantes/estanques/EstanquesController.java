package com.gialnet.bootregantes.estanques;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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

}
