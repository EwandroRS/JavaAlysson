import java.util.ArrayList;

public class InverterArrays {
    public static void main(String[] args) {
        ArrayList<Integer> valoresParaInverter = new ArrayList<>();
        valoresParaInverter.add(34);
        valoresParaInverter.add(35);
        valoresParaInverter.add(36);
        valoresParaInverter.add(37);

        inverterArray(valoresParaInverter);
    }

    public static void inverterArray(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {    
            System.out.println("Ação não possível, lista vazia.");
            return;
        }

        System.out.println("Array Normal: " + lista);

        
        int inicio = 0;
        int fim = lista.size() - 1;

        while (inicio < fim) {
            int temp = lista.get(inicio);
            lista.set(inicio, lista.get(fim));
            lista.set(fim, temp);
            inicio++;
            fim--;
        }

        System.out.println("Array Invertido: " + lista);
    }
}
