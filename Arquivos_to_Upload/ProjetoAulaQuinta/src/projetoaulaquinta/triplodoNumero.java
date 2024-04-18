package projetoaulaquinta;
import java.util.Scanner;

public class triplodoNumero {
    public static void main(String args[]){
        Scanner objScan = new Scanner(System.in);
        double num=0, triplo=0;
        
        System.out.println("Informe um número real: ");
        num = objScan.nextDouble();
        
        triplo = num * 3;
        
        System.out.println("O triplo do número é: " + triplo);
    }
}
