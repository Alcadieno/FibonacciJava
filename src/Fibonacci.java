import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); //instanciar objeto num
        System.out.println("Digite a quantidade de numeros da sequencia:");
        int number = num.nextInt();

        System.out.println("Fibonacci sequencia para " + number + " numeros eh");

        // Mostrar a sequencia de Fibonacci number vezes
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int number){

        // caso inicial , comum a qualquer valor para num desde que num diferente de 1
        if(number == 1 || number == 2){
            return 1;
        } else {
            return fibonacci(number-1) + fibonacci(number -2); // tail reclusion
        }


    }



}