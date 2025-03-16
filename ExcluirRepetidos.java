import java.util.ArrayList;

public class ExcluirRepetidos {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(1);
        listaDeNumeros.add(2);
        listaDeNumeros.add(3);
        listaDeNumeros.add(4);
        listaDeNumeros.add(5);
        listaDeNumeros.add(6);
        listaDeNumeros.add(7);
        listaDeNumeros.add(8);
        listaDeNumeros.add(9);
        listaDeNumeros.add(9);
        ExcluirRepetido(listaDeNumeros);

    }

    public static void ExcluirRepetido ( ArrayList<Integer> listaDeNumeros ) {
        ArrayList<Integer> listaSemRepetidos = new ArrayList<>();
        for (int i = 0; i < listaDeNumeros.size(); i++) {            
            if (!listaSemRepetidos.contains(listaDeNumeros.get(i))) {
                listaSemRepetidos.add(listaDeNumeros.get(i));
        }
    }
        System.out.println("Array com repetidos: " + listaDeNumeros);
        System.out.println("Array sem repetidos: " + listaSemRepetidos);
 }
}
