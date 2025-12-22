/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Catalog;

/**
 *
 * @author DELL
 */
public class StartProxy implements StartStrategy {
    private StartStrategy realStart;
 
    private Control control;
    private MainStartUp startup;
    private Handler handler;

    public StartProxy(Handler handler, MainStartUp startup) {

        this.handler = handler;
        this.startup = startup;
     
    }

    @Override
    public void start() {
        Catalog catalog = handler.getCatalog();
        if (catalog.isCurrent()) {
            realStart = new ContinueGame(startup);
        } else if (catalog.isAllModesExist()) {
            realStart = new StartNewGame(startup);
        } else {
            realStart = new SolutionFinder(handler);   //bnb3t control 3shan haga kda, MHTAGEN N CHECK!!!!
        }

        realStart.start();
    }
}

