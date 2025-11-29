/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author it
 */
public class Mainone {
    public static void main(String[] args) {
        
        GetBoard gb = new GetBoard();
        gb.ReadData();
        int [][]brd = SingletonBoard.getInstance().getBoard();
        RowChecker row = new RowChecker(brd);
        CheckerColoumn col = new CheckerColoumn(brd);
        CheckerBox box = new CheckerBox(brd);
         int[][] b = SingletonBoard.getInstance().getBoard();
    for(int i = 0; i < 9; i++){
        for(int j = 0; j < 9; j++){
            System.out.print(b[i][j] + "\t");
        }
        System.out.println("");
    }
        System.out.println("ROW ERRORS:");
        for(String err : row.getErrors()) {
        System.out.println(err);
        }

        System.out.println("\nCOLUMN ERRORS:");
        for(String err : col.getErrors()) {
        System.out.println(err);
        }

        System.out.println("\nBOX ERRORS:");
        for(String err : box.getErrors()) {
        System.out.println(err);
        }
        
    }
    
}
