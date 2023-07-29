import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String nome;
        int idade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        nome = teclado.nextLine();
        System.out.println("E quantos anos voce tem?");
        idade = teclado.nextInt();


        System.out.println("Ola " + nome + " vc tem " + idade + " anos?");


//        System.out.println("A aula começou a ficar bacana !");
//        System.out.println("Mentira, esta legal !!");
    }
}