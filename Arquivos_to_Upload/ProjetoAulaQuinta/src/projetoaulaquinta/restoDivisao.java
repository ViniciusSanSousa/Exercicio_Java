package projetoaulaquinta;
import java.util.Scanner;

public class restoDivisao {
    public static void main(String args[]){
        Scanner objScan = new Scanner(System.in);
        double num1=0, num2=0, resto=0;
        
        System.out.println("Inf. dividendo: ");
        num1 = objScan.nextDouble();
        
        System.out.println("Inf. divisor: ");
        num2 = objScan.nextDouble();
        
        resto = num1 % num2;
        
        System.out.println("O resto é: " + resto);
        
        
    }
}
