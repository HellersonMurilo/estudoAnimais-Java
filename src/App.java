import java.util.Scanner;

import Classes.Cachorro;
import Classes.Cavalo;
import Classes.Preguica;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Cachorro cachorro = new Cachorro(null, 0);
        Cavalo cavalo = new Cavalo(null, 0);
        Preguica preguica = new Preguica(null, 0);
        boolean loop = false;

        while (loop == false) {
            System.out.println("Escolha o que deseja fazer: \n1 - Registrar Animal \n2 - Ouvir Animais\n3 - Encerrar");
            String escolha = sc.next();
            switch (escolha) {
                case "1":
                    System.out.println("\n\nEscolha o Animal que deseja registrar\n1 - Cachorro \n2 - Cavalo \n3 - Preguiça");
                    String escolhaAnimal = sc.next();
                    switch (escolhaAnimal) {
                        case "1":
                            System.out.println("Informe o nome do Cachorro:");
                            cachorro.setNome(sc.next());
                            System.out.println("Informe a idade do Cachorro:");
                            cachorro.setIdade(sc.nextInt());

                            cachorro.dadosAnimais();
                            break;
                        case "2":
                            System.out.println("Informe o nome do Cavalo:");
                            cavalo.setNome(sc.next());
                            System.out.println("Informe a idade do Cavalo:");
                            cavalo.setIdade(sc.nextInt());

                            cavalo.dadosAnimais();
                            break;
                        case "3":
                            System.out.println("Informe o nome da Preguiça:");
                            preguica.setNome(sc.next());
                            System.out.println("Informe a idade da Preguiça:");
                            preguica.setIdade(sc.nextInt());

                            preguica.dadosAnimais();
                            break;

                        default:
                            break;
                    }
                    break;
                case "2":
                    System.out.println("Qual animal deseja ouvir?\n1 - Cachorro \n2 - Cavalo \n3 - Preguiça");
                    String escolhaAcao = sc.next();
                    switch (escolhaAcao) {
                        case "1":
                            System.out.println(cachorro.emitirSom());
                            break;
                        case "2":
                            System.out.println(cavalo.emitirSom());
                            break;
                        case "3":
                            System.out.println(preguica.subirArvore());
                            break;
                        default:
                            break;
                    }
                    break;
                case "3":
                    System.out.println("Sistema Encerrado...");
                    loop = true;
                    System.exit(0);
                    break;

                default:
                    System.err.println("Numero informado não encontrado, tente novamente");
                    break;
            }
        }
    }

}
