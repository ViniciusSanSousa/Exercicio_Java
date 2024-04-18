package projetoaulaquinta;
import java.util.Scanner;
public class somaNum {
    public static void main (String args[]){
        Scanner objScan = new Scanner(System.in);
        int n1=0, n2=0, result=0;
        
        System.out.println("Inf. valor 1 ");
        n1 = objScan.nextInt();
        
        System.out.println("Inf. valor 2 ");
        n2 = objScan.nextInt();
        
        result = n1 + n2;
        
        System.out.println("A valor da somatória é: " + result);
    } 
}
