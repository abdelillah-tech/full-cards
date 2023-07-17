package com.alghom.cardme.Paquet;

import java.io.PrintStream;

public class PaquetConsoleControllerImpl implements PaquetConsoleContoller {
    private PrintStream printer;
    private PaquetOperations paquetOperations;
    public PaquetConsoleControllerImpl(PrintStream printer, PaquetOperations paquetOperations) {
        this.printer = printer;
        this.paquetOperations = paquetOperations;
    }

    @Override
    public void avoirPaquet() {
        this.printer.println("paquet " + this.paquetOperations.getPaquet());
    }

    @Override
    public void melanger() {
        this.paquetOperations.melanger();
        this.printer.println("paquet mélangé " + this.paquetOperations.getPaquet());
    }

    @Override
    public void reinitPaquet() {
        this.paquetOperations.reinitPaquet();
        this.printer.println("paquet réinitialisé " + this.paquetOperations.getPaquet());
    }
}
