package projetoaulaquinta;
 import java.util.Scanner;


public class somaAreas {
    public static void main (String args[]){
        Scanner objScan = new Scanner(System.in);
        double a=0, b=0, d=0, areaum=0, areadois=0, areatotal=0;
        
        System.out.println("Inf. valor 1");
        a = objScan.nextDouble();
        
        System.out.println("Inf. valor b");
        b = objScan.nextDouble();
        
        System.out.println("Inf. valor d");
        d = objScan.nextDouble();
        
        areaum = a * b;
        
        areadois =  d * b;
        
        areatotal = areaum + areadois;
        
        System.out.println("A area 1 é :" + areaum);
        System.out.println("A area 2 é :" + areadois);
        System.out.println("A area total é :" + areatotal);
        
    }
}
