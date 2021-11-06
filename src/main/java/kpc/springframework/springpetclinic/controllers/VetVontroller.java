package kpc.springframework.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetVontroller {
    @RequestMapping({"/vets","/vets/index","/vets/index.htms"})
    public String vetList(){

        return "vets/index";
    }
}
