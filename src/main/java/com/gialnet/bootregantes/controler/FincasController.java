package com.gialnet.bootregantes.controler;

import com.gialnet.bootregantes.domain.Fincas;
import com.gialnet.bootregantes.domain.FincasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FincasController {

    @Autowired
    private final FincasRepository fincasRepository;

    public FincasController(FincasRepository fincasRepository) {
        this.fincasRepository = fincasRepository;
    }


    @RequestMapping("/listfincas")
    public List<Fincas> ListFincas() {

        //fincasRepository.save(new Fincas(4L,"El Alemán"));
        return fincasRepository.findAll();
    }

    @RequestMapping(value = "/addfinca", method = RequestMethod.POST)
    public ResponseEntity AddFinca(@RequestBody Fincas fincas) {

        try {
            fincasRepository.save(fincas);
        } catch (Exception e)
        {
            return  new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return  new ResponseEntity(HttpStatus.OK);
    }
}
