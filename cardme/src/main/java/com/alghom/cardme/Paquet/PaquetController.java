package com.alghom.cardme.Paquet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paquet")
public class PaquetController {
    private PaquetOperations paquetOperations;

    public PaquetController(PaquetOperations paquetOperations) {
        this.paquetOperations = paquetOperations;
    }

    @GetMapping("")
    public Paquet avoirPaquet() {
        return this.paquetOperations.getPaquet();
    }

    @GetMapping("/melanger")
    public Paquet melanger() {
        this.paquetOperations.melanger();
        return this.paquetOperations.getPaquet();
    }

    @GetMapping("/reinitPaquet")
    public Paquet reinitPaquet() {
        this.paquetOperations.reinitPaquet();
        return this.paquetOperations.getPaquet();
    }
}
