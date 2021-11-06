package kpc.springframework.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"/","","/index.html","/index"})
    public String ownerList(){

        return "owners/index";
    }
}
