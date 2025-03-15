import java.util.ArrayList;

public class MediaElementos {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();
        valores.add(10);
        valores.add(20);
        valores.add(30);
        MediaElementos.calcularMedia(valores);
    }

    public static void calcularMedia(ArrayList<Integer> valoresParaMedia) {
        
        if (valoresParaMedia.isEmpty()) {
            System.out.println("A lista está vazia. Não é possível calcular a média.");
            return;
        }

        int somaValores = 0;
        for (int valor : valoresParaMedia) {
            somaValores += valor;
        }

        double media = (double) somaValores / valoresParaMedia.size();
        System.out.println("A média é: " + media);
    }
}
