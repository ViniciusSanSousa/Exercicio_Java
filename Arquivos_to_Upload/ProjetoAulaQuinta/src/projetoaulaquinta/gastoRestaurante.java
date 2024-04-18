package projetoaulaquinta;
import java.util.Scanner;

public class gastoRestaurante {
    public static void main (String args[]){
        Scanner objScan = new Scanner(System.in);
        double gasto=0, conta=0;
        
        System.out.println("Inf. o valor da conta: ");
        conta = objScan.nextDouble();
        
        gasto = conta * 0.1 + conta;
        
        System.out.println("O valor total gasot é: " + gasto);
    }
}
