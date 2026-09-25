package objetos;

public class Pessoa {
    private String nome;
    private int idade;


    @Override
    public String toString() {
        return "Pessoa: " + nome + " (Idade: " + idade + ")";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
