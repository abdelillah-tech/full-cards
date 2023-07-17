package com.alghom.cardme;

import com.alghom.cardme.Main.*;
import com.alghom.cardme.Paquet.*;

import java.io.PrintStream;

public class ConsoleApplication {
    public static void run() {

        PrintStream printer = System.out;

        PaquetOperations paquetOperations = new PaquetOperationsImpl(new Paquet());
        PaquetConsoleContoller paquetConsoleContoller = new PaquetConsoleControllerImpl(printer, paquetOperations);
        paquetConsoleContoller.avoirPaquet();
        paquetConsoleContoller.melanger();

        printer.println("Main 0");
        MainOperations mainOperations = new MainOperationsImpl(paquetOperations, new Main());
        MainConsoleController mainConsoleController = new MainConsoleControllerImpl(printer, mainOperations);
        mainConsoleController.avoirMain();
        mainConsoleController.nouvellesCartes();
        mainConsoleController.trieCouleur();
        mainConsoleController.trieValeur();

        printer.println("Main 1");
        MainOperations mainOperations1 = new MainOperationsImpl(paquetOperations, new Main());
        mainConsoleController = new MainConsoleControllerImpl(printer, mainOperations1);
        mainConsoleController.nouvellesCartes();

        printer.println("Main 2");
        MainOperations mainOperations2 = new MainOperationsImpl(paquetOperations, new Main());
        mainConsoleController = new MainConsoleControllerImpl(printer, mainOperations2);
        mainConsoleController.nouvellesCartes();

        printer.println("Main 3");
        MainOperations mainOperations3 = new MainOperationsImpl(paquetOperations, new Main());
        mainConsoleController = new MainConsoleControllerImpl(printer, mainOperations3);
        mainConsoleController.nouvellesCartes();

        printer.println("Main 4");
        MainOperations mainOperations4 = new MainOperationsImpl(paquetOperations, new Main());
        mainConsoleController = new MainConsoleControllerImpl(printer, mainOperations4);
        mainConsoleController.nouvellesCartes();

        printer.println("Main 5");
        MainOperations mainOperations5 = new MainOperationsImpl(paquetOperations, new Main());
        mainConsoleController = new MainConsoleControllerImpl(printer, mainOperations5);
        mainConsoleController.nouvellesCartes();

        printer.println("Main 6");
        MainOperations mainOperations6 = new MainOperationsImpl(paquetOperations, new Main());
        mainConsoleController = new MainConsoleControllerImpl(printer, mainOperations6);
        mainConsoleController.nouvellesCartes();

        paquetConsoleContoller.avoirPaquet();
        paquetConsoleContoller.reinitPaquet();
    }
}
