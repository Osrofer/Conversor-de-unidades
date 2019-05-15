/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorunidades;

import java.util.Scanner;

/**
 *
 * @author daw121
 */
public class ConversorUnidades extends Lonxitude{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        op=MostrarMenu();
        switch(op){
            case 1:kmsAMillas();
            break;
        }
        
    }
    
    public static int MostrarMenu(){
    Scanner e = new Scanner(System.in);
    int op;
    System.out.println("Elija una opción");
    System.out.println("1.Convertir km a millas");
    op=Integer.valueOf(e.nextLine());
            
    return op;
    }
}
