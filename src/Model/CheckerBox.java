/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;

/**
 *
 * @author DELL
 */
public class CheckerBox extends Checker {
    
    GetterOfRCB getterfor = new GetterOfRCB();

    public CheckerBox() {
        super();
    }
    
    @Override
    public boolean[][] check(int[][] sudoku )
    {
          int[][][] boxes=getterfor.getBoxes(sudoku);
       boolean [][]cells = new boolean[9][9];
       for(int i = 0 ; i < 9 ; i ++ ){
       for(int j = 0 ; j < 9 ; j ++ ){
       cells[i][j]= true;
       }
       }
        HashMap <Integer ,Boolean> covered = new HashMap<>();
        int counter = 0 ;
        for(int [][]box:boxes){
            
        
        for(int i = 1 ; i <= 9 ; i ++){
        covered.put(i, Boolean.FALSE);
        }
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                int now=box[row][col];
                if(now==0)
                    continue; //for now
                
                //ana asfa
                if(covered.get(now)){
                 cells[((counter / 3) * 3 + row)][(counter % 3) * 3 + col] = false;
                }
                else{
                covered.put(now, Boolean.TRUE);
                }
            }
      
        }
        
         counter ++;
        }
         return cells;           
    }
    
    
    /*private String formatError(int boxIndex, int dupNum, int[][] box) {
        StringBuilder errorMsg = new StringBuilder();
        errorMsg.append("BOX ").append(boxIndex + 1).append(",#").append(dupNum).append(",[");
        for (int r = 0; r < 3; r++) {
        for (int c = 0; c < 3; c++) {
            errorMsg.append(box[r][c]);
            if (!(r == 2 && c == 2)) { // comma except after last
                errorMsg.append(",");
            }
        }
    }
        errorMsg.append("]");
        return errorMsg.toString();
    }*/
         
}