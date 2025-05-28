public class Aluno {
    private String matricula;
    private String nome;
    private String email;
    private String curso;

    public Aluno() {
        this.matricula = "";
        this.nome = "";
        this.email = "";
        this.curso = "";
    }

    public Aluno(String matricula, String nome, String email, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
