package Classes;

public class Cachorro extends Animais{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return (" O Cachorro faz AUAU \n");
    }

    @Override
    public void dadosAnimais() {
        System.out.println("============= DADOS CACHORRO =============\n Nome: " + getNome() + "\n Idade: " + getIdade());
    }
    
}
