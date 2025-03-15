import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class RetornarIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        insertarValoresRandomizados(320, listaDeNumeros, random);
        retornarIndex(22, listaDeNumeros);
        
        input.close();

    }

    public static void retornarIndex (Integer numeroEscolhido, ArrayList<Integer> listaDeNumeros) {
        int index = listaDeNumeros.indexOf(numeroEscolhido);

        if (index != -1) {
            System.out.println("Sucesso! Número Encontrado.");
            System.out.println("Número: " + numeroEscolhido);
            System.out.println("Array: " + listaDeNumeros);
            System.out.println("Posição: " + index);
        } else {
            System.out.println("Falha! Número não encontrado.");
        }
        
    }

    public static void insertarValoresRandomizados (Integer tamanhoDesejado , ArrayList<Integer> listaParaInsertar,  Random random) {
        for (int i = 0; i < tamanhoDesejado; i++) {
            int numerosParaListaRandomizada = random.nextInt(1000);
            listaParaInsertar.add(numerosParaListaRandomizada);
        }
    }

}
