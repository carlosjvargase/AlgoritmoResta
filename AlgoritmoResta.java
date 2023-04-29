import java.util.*;
public class AlgoritmoResta {
    public static void main(String[] args) {
        //Resta 2 numero sin hacer resta entre ellos y no guardar variable el resultado.

        int num1;
        int num2;
        int aux=0;

        System.out.println("Indique el numero 1: ");
        Scanner sc= new Scanner (System.in);
        num1=sc.nextInt();

        System.out.println("Indique el numero 2: ");
        num2=sc.nextInt();

        for (;num2<num1;num2++)aux++;

        System.out.println("La resta es: " + aux);

    }
}
