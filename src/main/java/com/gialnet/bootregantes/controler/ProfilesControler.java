package com.gialnet.bootregantes.controler;

import com.gialnet.bootregantes.domain.Profiles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProfilesControler {

    private static final Logger logger = LoggerFactory.getLogger(ProfilesControler.class);

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public Profiles profile(){
        System.out.println("Paso por el get");
        return new Profiles(1,"Antonio",56);
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public void NewProfile(@RequestBody Profiles profile){


        System.out.println("Paso por el post");
        System.out.println(profile.toString());


    }
}
