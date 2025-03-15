import java.util.Scanner;
import java.util.ArrayList;

public class MenorMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pegarNumeros(input);
        input.close();
    }

    public static void pegarNumeros(Scanner input) {
        ArrayList<Integer> numerosEscolhidos = new ArrayList<>();

        while (true) {
            System.out.println("Digite um número:");
            int numeroEscolhido = input.nextInt();
            input.nextLine();  

            numerosEscolhidos.add(numeroEscolhido);

            System.out.println("Deseja determinar o maior e menor número? [S/N]");
            String escolhaLoop = input.nextLine().toUpperCase();

            if (escolhaLoop.equals("S")) {
                int maior = numerosEscolhidos.get(0);
                int menor = numerosEscolhidos.get(0);

                for (int numero : numerosEscolhidos) {
                    if (numero > maior) {
                        maior = numero;
                    }
                    if (numero < menor) {
                        menor = numero;
                    }
                }

                System.out.println("Conjunto: " + numerosEscolhidos);
                System.out.println("Maior Número: " + maior);
                System.out.println("Menor Número: " + menor);
                break;
            }
        }
    }
}
