/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Game;
import Model.Load;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Model.SolutionInvalidException;
import View.StartUp;
/**
 *
 * @author DELL
 */
public class SolutionFinder implements StartStrategy{   //third option, if both are false
    
    Handler handler;

    public SolutionFinder(Handler handler) {
        this.handler = handler;
    }
    
    
    @Override
    public void start(){
         

        try {
            int[][] nullboard = new int[9][9];
            Game game = new Game(nullboard);
            handler.driveGames(game);  //MESH 3ARFA ANADY MN HANDLER L2NAHA 3YZA GAME TYPE OF OBJECT WANA M3ISH DIFFICULTY ANA LESA 73ML
           
        } catch (SolutionInvalidException e) {
            JOptionPane.showMessageDialog(null, "Invalid solved file!");
            System.exit(0);
        }
         }
    }

