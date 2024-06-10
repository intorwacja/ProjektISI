package org.example.projektisi.controllers;

import org.example.projektisi.entity.Liczba;
import org.example.projektisi.services.LiczbaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/liczba")
public class LiczbaController {
    private final LiczbaService liczbaService;
    public LiczbaController(LiczbaService liczbaService) {
        this.liczbaService = liczbaService;
    }

    @GetMapping
    public String liczba(Model model) {
        model.addAttribute("liczby", liczbaService.findAll());
        model.addAttribute("liczba", new Liczba());
        return "liczba";
    }

    @PostMapping("/add")
    public String addLiczba(@ModelAttribute Liczba liczba) {
        liczbaService.save(liczba);
        return "redirect:/liczba";
    }

    @GetMapping("/imie")
    public String imie() {
        return "Dominik Waśniewski";
    }

}
