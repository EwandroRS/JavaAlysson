import java.util.ArrayList;
import java.util.Collections;

public class OrganizarSubArrays {
    public static void main(String[] args) {
        ArrayList<Integer> subListaX = new ArrayList<>();
        ArrayList<Integer> subListaY = new ArrayList<>();
        
        Collections.addAll(subListaX, 11, 22, 3, 54, 25);
        Collections.addAll(subListaY, 5, 72, 822, 933, 122);

        ArrayList<Integer> listaFinal = juntarArrays(subListaX, subListaY);
        organizarArray(listaFinal);
    }
    
    public static ArrayList<Integer> juntarArrays(ArrayList<Integer> subListaX, ArrayList<Integer> subListaY) {
        ArrayList<Integer> listaFinal = new ArrayList<>();
        listaFinal.addAll(subListaX);
        listaFinal.addAll(subListaY);

        System.out.println("Array X: " + subListaX);
        System.out.println("Array Y: " + subListaY);
        System.out.println("Array Final (antes da organização): " + listaFinal);
        
        return listaFinal; 
    }

    public static void organizarArray(ArrayList<Integer> listaFinal) {
        if (listaFinal.isEmpty()) {
            System.out.println("Ação não possível, lista vazia.");
            return;
        }

        System.out.println("Array Normal: " + listaFinal);

        Collections.sort(listaFinal); 

        System.out.println("Array Organizado: " + listaFinal);
    }
}
