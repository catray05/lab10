/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author it
 */
public class GetBoard {
    private  final String Pth = "soduku.csv";
    public void ReadData(){
    try(CSVReader r = new CSVReader(new FileReader(Pth))){
    List<String[]> all = r.readAll();
    for(String[] row : all){
    for(String cell : row){
        if(cell == null || cell.isEmpty()){
            
             System.out.print("empty"+"\t");
    }
        else{
            System.out.print(cell+"\t");
       
        }
    
    }
        System.out.println("");
    }
    
    }catch(IOException | CsvException e){
    e.printStackTrace();
    }
    
    }
    public  static void main(String[] args) {
        GetBoard gb = new GetBoard();
        gb.ReadData();
    }
   
    
}

