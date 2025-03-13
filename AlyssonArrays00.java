import java.util.ArrayList;

public class AlyssonArrays00 {

    public static void main(String[] args) {
        
        ClienteAlysson clienteTest = new ClienteAlysson("Jeferson Uriel dos Santos", "182.392.122-29");
        ClienteAlysson clienteTest01 = new ClienteAlysson("Jeferson Uriel Santos", "122.392.122-29");
        ClienteAlysson clienteTest02 = new ClienteAlysson("Jeferson dos Santos", "123.392.122-29");

        // Criando ArrayList
        ArrayList<Object> clientesList = new ArrayList<>();

        // Usando "insert" (add)
        addCliente(clientesList, clienteTest);
        addCliente(clientesList, clienteTest01);
        addCliente(clientesList, clienteTest02);

        imprimirVetor(clientesList.toArray());
    }
    
    public static void addCliente(ArrayList<Object> lista, Object cliente) {
        lista.add(cliente);
    }

    public static void imprimirVetor(Object[] aux) {
        for (int i = 0; i < aux.length; i++) {
            System.out.println(i + " >> " + aux[i]);
        }
    }

    public static class ClienteAlysson {
        public String name;
        public String cpf;

        public ClienteAlysson(String name, String cpf) {
            this.name = name;
            this.cpf = cpf;
        }

        @Override
        public String toString() {
            return "Nome: " + name + ", CPF: " + cpf;
        }
    }
}
