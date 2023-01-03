
package arregloS00;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
            
            int tamaño;
            
            System.out.println("Ingrese el tamaño del arreglo");
            tamaño=Lector.nextInt();
            
            char[] letras=new char[tamaño];
            
            for(int i=0;i<tamaño;i++){
                System.out.println("Ingre el caracter #"+(i+1));
                letras[i] =Lector.next().charAt(0);
            }
        System.out.println("los caracteres son: ");
            for(int i=0;i<tamaño;i++){
                System.out.println(letras[i]);
            }
        }
    }
