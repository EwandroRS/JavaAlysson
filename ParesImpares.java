import java.util.Scanner;
import java.util.ArrayList;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pegarNumeros(input);
        input.close();
    }

    public static void pegarNumeros(Scanner input) {
        ArrayList<Integer> numerosEscolhidos = new ArrayList<>();
        ArrayList<Integer> numerosParesArray = new ArrayList<>();
        ArrayList<Integer> numerosImparesArray = new ArrayList<>();

        while (true) {
            System.out.println("Digite um número:");
            int numeroEscolhido = input.nextInt();
            input.nextLine();  

            numerosEscolhidos.add(numeroEscolhido);

            System.out.println("Deseja determinar pares ou ímpares? [S/N]");
            String escolhaLoop = input.nextLine().toUpperCase();

            if (escolhaLoop.equals("S")) {
                
                // Limpar as listas para evitar dados duplicados em múltiplas execuções
                numerosParesArray.clear();
                numerosImparesArray.clear();

                
                for (int numero : numerosEscolhidos) {
                    if (numero % 2 == 0) {
                        numerosParesArray.add(numero);
                    } else {
                        numerosImparesArray.add(numero);
                    }
                }

                System.out.println("Conjunto: " + numerosEscolhidos);
                System.out.println("Números Pares: " + numerosParesArray);
                System.out.println("Números Ímpares: " + numerosImparesArray);
                break;
            }
        }
    }
}
