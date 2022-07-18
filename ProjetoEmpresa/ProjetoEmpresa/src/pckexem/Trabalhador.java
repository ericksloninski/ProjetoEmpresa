package pckexem;

public class Trabalhador {
    private String nome;
    private float salario;
    private char sexo;

    public Trabalhador() {
    }

    public Trabalhador(String nome, float salario, char sexo) {
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Trabalhador{" + "nome=" + nome 
                + ", salario=" + salario 
                + ", sexo=" + sexo + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
