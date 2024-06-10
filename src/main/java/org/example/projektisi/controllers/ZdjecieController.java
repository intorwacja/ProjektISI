package org.example.projektisi.controllers;

import org.example.projektisi.services.ZdjecieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/zdjecia")
public class ZdjecieController {

    private final ZdjecieService zdjecieService;
    public ZdjecieController(ZdjecieService zdjecieService) {
        this.zdjecieService = zdjecieService;
    }

    @GetMapping
    public String pokazZdjecia(Model model) {
        model.addAttribute("zdjecia", zdjecieService.pobierzZdjecia());
        return "zdjecia";
    }
}
