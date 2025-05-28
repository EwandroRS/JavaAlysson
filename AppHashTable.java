import java.util.Hashtable;
import java.util.Scanner;

public class AppHashTable {
    private static Scanner input = new Scanner(System.in);
    private static Hashtable<String, Aluno> alunos = new Hashtable<>();

    public static int menu(){
        System.out.println("\n--- Menu ---");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar todos");
        System.out.println("3 - Buscar pela matrícula");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
        int op = input.nextInt();
        input.nextLine(); // consumir o '\n'
        return op;
    }

    public static void cadastrar(){
        System.out.println("\n---- Cadastro ----");
        System.out.print("Matrícula: ");
        String matricula = input.nextLine();

        if (alunos.containsKey(matricula)){
            System.out.println("Matrícula já cadastrada.");
            return;
        }

        System.out.print("Nome: ");
        String nome = input.nextLine();
        if (nome.isEmpty()) {
            System.out.println("Nome não pode ser vazio.");
            return;
        }

        System.out.print("Email: ");
        String email = input.nextLine();
        if (email.isEmpty()) {
            System.out.println("Email não pode ser vazio.");
            return;
        }

        System.out.print("Curso: ");
        String curso = input.nextLine();
        if (curso.isEmpty()) {
            System.out.println("Curso não pode ser vazio.");
            return;
        }

        alunos.put(matricula, new Aluno(matricula, nome, email, curso));
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public static void listarTodos(){
        System.out.println("\n--- Lista de Alunos ---");
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (Aluno aluno : alunos.values()) {
            System.out.println(aluno);
        }
    }

    public static void buscar(){
        System.out.println("\n--- Buscar Aluno ---");
        System.out.print("Matrícula: ");
        String matricula = input.nextLine();

        if (alunos.containsKey(matricula)){
            Aluno aluno = alunos.get(matricula);
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Email: " + aluno.getEmail());
            System.out.println("Curso: " + aluno.getCurso());
        } else {
            System.out.println("Matrícula não encontrada.");
        }
    }

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = menu();
            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listarTodos();
                    break;
                case 3:
                    buscar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
