package com.alghom.cardme.Main;

import java.io.PrintStream;

public class MainConsoleControllerImpl implements MainConsoleController {
    private PrintStream printer;
    private MainOperations mainOperations;
    public MainConsoleControllerImpl(PrintStream printer, MainOperations mainOperations) {
        this.printer = printer;
        this.mainOperations = mainOperations;
    }

    @Override
    public void avoirMain() {
        this.printer.println("ma main: " + this.mainOperations.getMain());
    }

    @Override
    public void trieCouleur() {
        this.mainOperations.trierParCouleur();
        this.printer.println("ma main trié par couleur: " + this.mainOperations.getMain());
    }

    @Override
    public void trieValeur() {
        this.mainOperations.trierParValeur();
        this.printer.println("ma main trié par valeur: " + this.mainOperations.getMain());
    }

    @Override
    public void nouvellesCartes() {
        this.mainOperations.avoirNouvellesCartes();
        this.printer.println("ma nouvelle main: " + this.mainOperations.getMain());
    }
}
