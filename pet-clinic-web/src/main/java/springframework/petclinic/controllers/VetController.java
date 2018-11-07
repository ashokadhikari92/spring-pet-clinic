package springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    @RequestMapping(value = {"/", "/index", "index.html",""})
    public String index() {

        return "vets/index";
    }
}
