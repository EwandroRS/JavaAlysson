import java.util.ArrayList;
import java.util.Collections;

public class RotacionarArray {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        Collections.addAll(listaDeNumeros, 1, 2, 3, 4, 5);
        
        rotacionarArray(listaDeNumeros, 2);
    }   

    public static void rotacionarArray(ArrayList<Integer> listaDeNumeros, int k) {
        if (listaDeNumeros.isEmpty()) {
            System.out.println("Ação não possível, lista vazia.");
            return;
        }

        System.out.println("Array Normal: " + listaDeNumeros);

        int tamanho = listaDeNumeros.size();
        k = k % tamanho;

        if (k > 0) {
            ArrayList<Integer> parte1 = new ArrayList<>(listaDeNumeros.subList(tamanho - k, tamanho));
            ArrayList<Integer> parte2 = new ArrayList<>(listaDeNumeros.subList(0, tamanho - k));
            
            listaDeNumeros.clear();
            listaDeNumeros.addAll(parte1);
            listaDeNumeros.addAll(parte2);
        }

        System.out.println("Array Rotacionado: " + listaDeNumeros);
    }
}   
