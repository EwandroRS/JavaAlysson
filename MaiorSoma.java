import java.util.ArrayList;
import java.util.Collections;

public class MaiorSoma {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        Collections.addAll(listaDeNumeros, 1, -2, -3, 4, 5, 6, -7, 8, 9, 10);
        
        encontrarMaiorSomaSubArray(listaDeNumeros);
    }

    public static void encontrarMaiorSomaSubArray(ArrayList<Integer> listaDeNumeros) {
        
        int maiorSoma = listaDeNumeros.get(0);  
        int somaAtual = listaDeNumeros.get(0);
        int inicio = 0, fim = 0, tempInicio = 0;

        for (int i = 1; i < listaDeNumeros.size(); i++) {
            if (somaAtual + listaDeNumeros.get(i) > listaDeNumeros.get(i)) {
                somaAtual += listaDeNumeros.get(i);
            } else {
                somaAtual = listaDeNumeros.get(i);
                tempInicio = i; 
            }

            if (somaAtual > maiorSoma) {
                maiorSoma = somaAtual;
                inicio = tempInicio;
                fim = i;
            }
        }

        System.out.println("Maior Soma: " + maiorSoma);
        System.out.println("SubArray com Maior Soma: " + listaDeNumeros.subList(inicio, fim + 1));
    }
}
