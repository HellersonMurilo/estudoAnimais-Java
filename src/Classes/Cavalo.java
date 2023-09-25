package Classes;

public class Cavalo extends Animais {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return ("O Cavalo faz Pocotó \n");
    }

    @Override
    public void dadosAnimais() {
        System.out.println("============= DADOS CAVALO =============\n Nome: " + getNome() + "\n Idade: " + getIdade());
    }
}