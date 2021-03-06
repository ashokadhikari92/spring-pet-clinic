package springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springframework.petclinic.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping(value = {"","/","/index","/index.html"})
    public String index(Model model){

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}
