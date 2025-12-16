/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Catalog;
import Model.DifficultyEnum;
import Model.Game;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Handler implements Viewable{

    private Catalog catalog;
    private Controllable control; 

    public Handler() {
    
        control = new Control(); 
        catalog = new Catalog(false,false);
    }

    @Override
    public Catalog getCatalog() {
        return catalog;
    }

    @Override
    public Game getGame(DifficultyEnum level) throws NotFoundException {
       
        char lev = 0;
      /*  switch (level) {
            case EASY:
                return load.loadGame("easy"); 
            case MEDIUM:
                return load.loadGame("medium");
            case HARD:
                return load.loadGame("hard");
            default:
                JOptionPane.showMessageDialog(null, "ERRORRR!! CANNOT FIND THE DIFFICULTY");
                return null;
        }*/
     
            if (level == DifficultyEnum.EASY) {
                            lev='e';
                  } else if (level == DifficultyEnum.MEDIUM) {
                           lev = 'm';
                  } else if (level == DifficultyEnum.HARD) {
                           lev = 'h';
                }
                  else if (level == DifficultyEnum.INCOMPLETE)
                  {
                      lev = 'i';
                  }

       int[][] board = control.getGame(lev);
       List<int []> edit = new ArrayList();
       for(int  i = 0 ; i < 9 ; i ++ ){
       for(int j = 0 ; j < 9 ; j ++ ){
           if(board[i][j]<=0){
           edit.add(new int[]{i,j});
           board[i][j] =  -Math.abs(board[i][j]);
           }
       
       }
       }
       Game game = new Game(board, level.toString(),edit);
       return game;
      
    }

    @Override
    public void driveGames(Game source) throws SolutionInvalidException {
        if (source == null) return;
        control.driveGames(source.getBoard());
    }

    @Override
    public String verifyGame(Game game) {
        return null; 
    }

    @Override
    public int[] solveGame(Game game) throws InvalidGame {
        return null; 
    }

    @Override
    public void logUserAction(String userAction) throws IOException {
       
    }
}

