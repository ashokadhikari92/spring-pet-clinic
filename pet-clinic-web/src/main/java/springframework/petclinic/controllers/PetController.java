package springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pets")
public class PetController {

    @RequestMapping(value = {"","/","/index","/index.html"})
    public String index(){

        return "pets/index";
    }
}
