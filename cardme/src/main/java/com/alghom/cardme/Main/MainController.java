package com.alghom.cardme.Main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {
    private MainOperations mainOperations;

    public MainController(MainOperations mainOperations) {
        this.mainOperations = mainOperations;
    }

    @GetMapping("")
    public Main avoirMain() {
        return this.mainOperations.getMain();
    }

    @GetMapping("/trieCouleur")
    public Main trieCouleur() {
        this.mainOperations.trierParCouleur();
        return this.mainOperations.getMain();
    }

    @GetMapping("/trieValeur")
    public Main trieValeur() {
        this.mainOperations.trierParValeur();
        return this.mainOperations.getMain();
    }

    @GetMapping("/nouvellesCartes")
    public Main nouvellesCartes() {
        this.mainOperations.avoirNouvellesCartes();
        return this.mainOperations.getMain();
    }
}
