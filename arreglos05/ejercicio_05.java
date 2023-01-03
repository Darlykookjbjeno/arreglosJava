
package arreglos05;

import java.util.Scanner;


public class ejercicio_05 {
    
    public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
            
            int[] numerosUno =new int[10];
            int[] numerosDos =new int[10];
            int[] numerosTres=new int[20];
            
            System.out.println("Tabla #1");
            
            for(int i=0;i<numerosUno.length;i++){
                System.out.println("Digite el valor #"+(i+1));
                numerosUno[i]=Lector.nextInt();
            }
            System.out.println("Tabla #2");
            for(int i=0;i<numerosDos.length;i++){
                System.out.println("Digite el valor #"+(i+1));
                numerosDos[i]=Lector.nextInt();
            }
            
            int j=0;
            
            for(int i=0;i<10;i++){
                numerosTres[j]=numerosUno[i];
                j++;
                numerosTres[j]=numerosDos[i];
                j++;
            }
            
            for(int i=0;i<numerosTres.length;i++){
                System.out.println(numerosTres[i]);
            }
    }
    
}
