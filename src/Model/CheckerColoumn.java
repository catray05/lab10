/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class CheckerColoumn extends Checker {  
    
    
    GetterOfRCB getterfor = new GetterOfRCB();

    public CheckerColoumn() {
        super();
    }
     
    
    @Override
     public boolean[][] check(int[][] sudoku)
     {
          boolean[][] cells = new boolean[9][9];
   
         int[][] coloumns = getterfor.getterfor(sudoku, 'c'); 
         
         for(int c = 0 ; c < 9 ; c++ )
         {
             int coloumn1[] = coloumns[c]; //ngeb el coloumn
             
             for(int r = 0 ; r < coloumn1.length ; r++ )
             {
                 boolean  valid = true;
                 int now = coloumn1[r];
                 
                 if(now!=0){
                 for (int k = 0; k <  coloumn1.length; k++) {
                        if (k != r && coloumn1[k] == now) { //DUPLICATE!!
                            valid = false;
                            break;
                        }
                        
             }}
                  cells[r][c] = valid;
         }
             
     }
//          for (int i = 0 ; i < 9 ; i ++)
//        {
//            for (int j=0;j<9;j++)
//            {
//                System.out.println("COLUMN!!");
//                System.out.println("Row: " + i + "Coloumn: " + j + "state : " + cells[i][j]);
//            }
//        }
     return cells;}
  
    
    
/* private String formatError(int coloumnindex, int dupNum, int[] coloumn) {
        StringBuilder errorMsg = new StringBuilder();
        errorMsg.append("COLOUMN ").append(coloumnindex + 1).append(",#").append(dupNum).append(",[");
        for (int i = 0; i < coloumn.length; i++) {
            errorMsg.append(coloumn[i]);
            if (i < coloumn.length-1) {
                errorMsg.append(",");
            }
        }
        errorMsg.append("]");
        return errorMsg.toString();
    }*/
    
}
