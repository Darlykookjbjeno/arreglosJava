
package arreglos16;

import java.util.Scanner;


public class ejercicio_16 {
      public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
      
            
            float[] uno= new float[5];
            float[] dos=new float[5];
            float[] tres=new float[5];
            
            float sumaU=0, sumaD=0,sumaT=0, promedio_U=0,promedio_d=0,promedio_t=0;
            float sumaAlumno=0,promedioAlumno=0;
            
            int posicion;
            
            System.out.println("Primer trimestre");
            for(int i=0; i<uno.length;i++){
                System.out.println("Nota del alumno #"+(i+1));
                uno[i]=Lector.nextFloat();
                
                sumaU = (sumaU +uno[i]);
            }
            
            System.out.println("segundo trimestre");
            for(int i=0; i<dos.length;i++){
                System.out.println("Nota del alumno #"+(i+1));
                dos[i]=Lector.nextFloat();
                sumaD = (sumaD +dos[i]);
            }
            
            System.out.println("tercer trimestre");
            for(int i=0; i<tres.length;i++){
                System.out.println("Nota del alumno #"+(i+1));
                tres[i]=Lector.nextFloat();
                sumaT = (sumaT +tres[i]);
            }
            
            promedio_U = sumaU /5;
            promedio_d = sumaD /5;
            promedio_t = sumaT /5;
            
            
            do{
                System.out.println("Escriba la posicion del alumno del 0 al 4");
                posicion = Lector.nextInt();
            
            }while(posicion<0||posicion>4);
            
            
            sumaAlumno = uno[posicion]+dos[posicion]+tres[posicion];
            
            promedioAlumno = sumaAlumno/3;
            
            System.out.println("Los datos requeridos:");
            System.out.println("Primer trimestre: "+promedio_U);
            System.out.println("segundo trimestre: "+promedio_d);
            System.out.println("tercer trimestre: "+promedio_t);
            
            System.out.println("promedio alumno: "+promedioAlumno);
      }
}
