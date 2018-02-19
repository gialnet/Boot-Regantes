package com.gialnet.bootregantes.estanques;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saldoestanque")
public class SaldoestanqueController {

    private static final Logger logger = LoggerFactory.getLogger(SaldoestanqueController.class);
    private final SaldoestanqueRepository saldoestanqueRepository;


    @Autowired
    public SaldoestanqueController(SaldoestanqueRepository saldoestanqueRepository) {
        this.saldoestanqueRepository = saldoestanqueRepository;
    }


}

