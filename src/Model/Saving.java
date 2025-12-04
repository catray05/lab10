/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Saving {
    
     private final static Random random = new Random();
    
    
    public void SavingToFolder(Game game) throws IOException
    {
        String path=null;
        if(game == null )
            return;
        
        switch(game.getDifficulty())
        {
            case "easy":
                path="Levels/easy";
                break;
            case "medium":
                path="Levels/medium";
                break;
            case "hard":
                path="Levels/hard";
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERROR! COULDNT SAVE TO FOLDER!!");
        }
        
        
        
        String fileName = path + "/" + "Sudoku_" + generateRandomName() + ".csv";
        
        File file = new File(fileName);
        
        try{
            FileWriter writer = new FileWriter(file);
            int[][] board = game.getBoard();
            
            for(int i = 0 ; i < board.length; i++)
            {
                for (int j = 0; j < board[i].length; j++) {
                      writer.write(board[i][j] + ","); //bn5zno gowa kda
                 }
                writer.write("\n"); //khlsna line!
            }
            writer.close(); //doneeee :D
            
            JOptionPane.showMessageDialog(null, "Game saved to: " + file.getAbsolutePath()); //TO CHECK! 
            
        }
        catch (IOException e) {
                  JOptionPane.showMessageDialog(null, "Error saving game: " + e.getMessage());
                  }
    }
    
    
    public static String generateRandomName() {
       
        int n1 = random.nextInt(10);
        int n2 = random.nextInt(10);
        int n3 = random.nextInt(10);
        int n4 = random.nextInt(10);
        
        return "" + n1+n2+n3+n4;
    }
}
