package Classes;

public class Preguica extends Animais {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return null;
    }

    public String subirArvore(){
        return ("Subi na Arvore!\n");
    }

    @Override
    public void dadosAnimais() {
        System.out.println("============= DADOS PREGUIÇA =============\n Nome: " + getNome() + "\n Idade: " + getIdade());
    }
}
