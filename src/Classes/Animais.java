package Classes;

public abstract class Animais {

    //atributos
    private String nome;
    private int idade;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //construtor
    public Animais(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //metodos abstratos
    public abstract String emitirSom();

    public abstract void dadosAnimais();

}
