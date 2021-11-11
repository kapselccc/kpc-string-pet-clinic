package kpc.springframework.springpetclinic.controllers;

import kpc.springframework.springpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetVontroller {
    private final VetService vetService;

    public VetVontroller(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/index","/vets/index.htms"})
    public String vetList(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
