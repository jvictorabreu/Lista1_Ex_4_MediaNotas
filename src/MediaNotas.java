import java.util.Scanner;

// 4- Faça um Programa que peça as 4 notas bimestrais e mostre a média.

public class MediaNotas {
    public static void main(String[] args){
        Double nota1, nota2, nota3, nota4;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Nota 1ºBimestre: ");
        nota1 = userInput.nextDouble();
        System.out.println("");

        System.out.println("Nota 2ºBimestre: ");
        nota2 = userInput.nextDouble();
        System.out.println("");

        System.out.println("Nota 3ºBimestre: ");
        nota3 = userInput.nextDouble();
        System.out.println("");

        System.out.println("Nota 4ºBimestre: ");
        nota4 = userInput.nextDouble();
        System.out.println("");

        Double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média: " + media);
    }
}