package springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springframework.petclinic.services.PetService;

@Controller
@RequestMapping("/pets")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @RequestMapping(value = {"","/","/index","/index.html"})
    public String index(Model model){

        model.addAttribute("pets", petService.findAll());

        return "pets/index";
    }
}
