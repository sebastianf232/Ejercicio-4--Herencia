/**
 * Programación Orientada a Objetos
 * Hoja de Trabajo 4: Herencia
 * File: Main Java
 * @author Sebastián Franco 21484 Universidad del Valle de Guatemala.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * 
         */
        Scanner sc = new Scanner(System.in);
        Combatiente combatiente = new Combatiente();

        while (){
            ///Se pide que ingrese el tipo de memoria: SDR o DDR
            System.out.println("Sistema de memoria RAM.");
            int a= sc.nextInt();

                    ///Memoria RAM SDR
            if(a==1){
                String tipo = "SDR";
                    
                ///El usuario selecciona el tamanio que quiere
                System.out.println("");
                int b= sc.nextInt();
                /// 
                if (b==1){
                   

                } else if (b==2){
                    
                } 

            ///Si el usuario selecciona memoria DDR:
            } else if(a==2){

            } else{
                System.out.println("S");
                
            }

        }

    }
}
