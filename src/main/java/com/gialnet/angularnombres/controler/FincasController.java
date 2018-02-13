package com.gialnet.angularnombres.controler;

import com.gialnet.angularnombres.domain.Fincas;
import com.gialnet.angularnombres.domain.FincasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FincasController {

    @Autowired
    FincasRepository fincasRepository;


    @RequestMapping("/listfincas")
    public List<Fincas> ListFincas() {

        //fincasRepository.save(new Fincas(4L,"El Alemán"));
        return fincasRepository.findAll();
    }
}
