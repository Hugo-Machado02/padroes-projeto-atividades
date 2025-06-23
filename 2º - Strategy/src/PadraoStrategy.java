import java.util.Scanner;

public class PadraoStrategy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PS5 ps5 = new PS5();

        int op = 0;

        do{

            System.out.println("============================= SELECAO DE MIDIA =============================");
            System.out.println("1- Jogo Midia Física");
            System.out.println("2- Jogo Midia Digital");
            System.out.println("3- Streaming");
            System.out.println("0- Desligar PS5!");
            System.out.printf("Selecione a opção desejada: ");
            op = scan.nextInt();
            System.out.println("============================================================================\n\n");

            switch (op) {
                case 1:
                    midiaSelecionada(ps5, new MidiaFisica());
                    break;

                case 2:
                    midiaSelecionada(ps5, new MidiaDigital());
                    break;

                case 3:
                    midiaSelecionada(ps5, new MidiaStreaming());
                    break;

                case 0:
                    System.out.println("--> Desligando o PS5...");
                    break;

                default:
                    System.out.println("--> Midia não reconhecida, por favor, escolha novamente!\n\n");
                    break;
            }

        }while(op != 0);

        System.out.println("--> PS5 desligado!\n\n");
        scan.close();
    }

    public static void midiaSelecionada(PS5 ps5, MidiaStrategy midia){
        ps5.setMidia(midia);
        ps5.startMidia();
    }
}