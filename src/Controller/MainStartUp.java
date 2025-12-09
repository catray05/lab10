/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;


/**
 *
 * @author DELL
 */
public  class MainStartUp {
    private Catalog catalog;
    private Control control;

    public MainStartUp(Catalog catalog, Control control) {
        this.catalog = catalog;
        this.control = control;
    }

    public void start() {
        boolean hasUnfinished = catalog.hasUnfinishedGame();
        boolean allModesExist = catalog.hasAllDifficulties();
        
        StartStrategy start;
        if (hasUnfinished) {
            start = new ContinueGame(this);
        }
        else if (allModesExist) {
            start = new StartNewGame(this);
        }
        else {
            start = new SolutionFinder(control);
        }

        start.start();

    }
    

   
}
