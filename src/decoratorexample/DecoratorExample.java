/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorexample;
import java.util.Scanner;
/**
 *
 * @author tefa
 */
public class DecoratorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1. Test decorador con lunas.\n" +
                           "2. Test decorador con bordes.\n" +
                           "3. Test ambos decoradores.\n" +
                           "0. Salir.");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        switch(op){

            case 1:
            Saludo saludo1 = new Saludo();
            AplicarLunas lunas = new AplicarLunas(saludo1);
            System.out.println(lunas.mostrar());
            break;

            case 2:
            Saludo saludo2 = new Saludo();
            AplicarBordes bordes = new AplicarBordes(saludo2);
            System.out.println(bordes.mostrar());
            break;

            case 3:
            Saludo saludo3 = new Saludo();
            AplicarLunas lunas2 = new AplicarLunas(saludo3);
            AplicarBordes bordes2 = new AplicarBordes(lunas2);
            System.out.println(bordes2.mostrar()); 
            break;
            
            case 0:
            break;
        }
    }    
}
