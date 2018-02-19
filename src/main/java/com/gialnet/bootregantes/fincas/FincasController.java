package com.gialnet.bootregantes.fincas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fincas")
public class FincasController {

    @Autowired
    private final PropiedadesRepository propiedadesRepository;

    public FincasController(PropiedadesRepository propiedadesRepository) {
        this.propiedadesRepository = propiedadesRepository;
    }


    @RequestMapping("/listfincas")
    public List<Propiedades> ListFincas() {

        //fincasRepository.save(new Fincas(4L,"El Alemán"));
        return propiedadesRepository.findAll();
    }

    @GetMapping(value = "/fincas/{codigo}")
    public Propiedades getData(@PathVariable String codigo) {

        return propiedadesRepository.findOne(codigo);
    }

    @RequestMapping(value = "/addfinca", method = RequestMethod.POST)
    public ResponseEntity AddFinca(@RequestBody Propiedades propiedades) {

        propiedadesRepository.save(propiedades);

        return  new ResponseEntity(HttpStatus.OK);
    }
}
