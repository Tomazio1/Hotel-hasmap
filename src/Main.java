//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;

import java.util.*;

import java.util.LinkedList;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        HashMap < Integer, LinkedList < Hospede >> HOTEL = new HashMap < > ();

        List < Hospede > Hot = new ArrayList < > ();
        Scanner read = new Scanner(System.in);

        System.out.println("Diigite o direório, incluindo o nome e a extensão do arquivo .txt: ");
        String file = read.nextLine();

        try (BufferedReader ler = new BufferedReader(new FileReader(file))) {
            String linha = ler.readLine();
            while (linha != null) {
                String[] SepararCampo = linha.split("[:,]");

                int NUMERO_RESERVA = Integer.parseInt(SepararCampo[0]);
                String NOME_HOTEL = SepararCampo[1];
                int NUMERO_QUARTO = Integer.parseInt(SepararCampo[2]);
                String DATA_CHECKIN = SepararCampo[3];
                String DATA_CHECKOUT = SepararCampo[4];
                Hospede hospede = new Hospede(NUMERO_RESERVA, NOME_HOTEL, NUMERO_QUARTO, DATA_CHECKIN, DATA_CHECKOUT);

                if (HOTEL.containsKey(hasmap.key(NUMERO_RESERVA))) {
                    LinkedList<Hospede> Valor = HOTEL.get(hasmap.key(NUMERO_RESERVA));
                    Valor.add(hospede);
                } else {
                    LinkedList<Hospede> Valor = new LinkedList<>();
                    Valor.add(hospede);
                    HOTEL.put(hasmap.key(NUMERO_RESERVA), Valor);
                }

                linha = ler.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("HOTEL" + HOTEL);
        //----------------MENU-------------------------------------
        System.out.print("########### _HOTEL_ ###########\n");
        System.out.print("########_FONTE BOIOLA_#########\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("|---------HOTEL? TRIVAGO------|\n");
        System.out.print("| 1 - Inserir novas reservas  |\n");
        System.out.print("| 2 - Consulatar reserva      |\n");
        System.out.print("| 3 - Fazer checkout/cancelar |\n");
        System.out.print("| 4 - Sair                    |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");

        int opcao = read.nextInt();

        switch (opcao) {
            case 1:
                int querer = 0;
                while (querer != 1) {

                    System.out.println("Digite os seis digitos do número da reserva: ");
                    int NUMERO_RESERVA = read.nextInt();
                    read.nextLine();

                    System.out.println("Digite o nome do hotel: ");
                    String NOME_HOTEL = read.nextLine();

                    System.out.println("Digite o número do quarto: ");
                    int NUMERO_QUARTO = read.nextInt();
                    read.nextLine();

                    System.out.println("Digite a data de checkin: ");
                    String DATA_CHECKIN = read.nextLine();

                    System.out.println("Digite a data de checkout");
                    String DATA_CHECKOUT = read.nextLine();

                    Hospede hospede = new Hospede(NUMERO_RESERVA, NOME_HOTEL, NUMERO_QUARTO, DATA_CHECKIN, DATA_CHECKOUT);

                    if (HOTEL.containsKey(hasmap.key(NUMERO_RESERVA))) {
                        LinkedList<Hospede> Valor = HOTEL.get(hasmap.key(NUMERO_RESERVA));
                        Valor.add(hospede);
                    } else {
                        LinkedList<Hospede> Valor = new LinkedList<>();
                        Valor.add(hospede);
                        HOTEL.put(hasmap.key(NUMERO_RESERVA), Valor);
                    }
                    System.out.println("Deseja inserir um novo hospede? 0=Sim 1=Não : ");
                    querer = read.nextInt();
                }
                break;

            case 2:
                System.out.println("============= Buscar ============");
                System.out.println("=====Digite o código da reserva: ");
                int codigin = read.nextInt();
                System.out.println("=================================");
                System.out.println("========= Nome do Hotel ========= ");

                try {
                    System.out.println("-------> " + HOTEL.get(hasmap.key(codigin)).getFirst().getNOME_HOTEL());
                    System.out.println("======= Número do quarto ========");
                    System.out.println("-------> " + HOTEL.get(hasmap.key(codigin)).getFirst().getNUMERO_QUARTO());
                    System.out.println("======= Data de checkin =========");
                    System.out.println("-------> " + HOTEL.get(hasmap.key(codigin)).getFirst().getDATA_CHECKIN());
                    System.out.println("======= Data de checkout =========");
                    System.out.println("-------> " + HOTEL.get(hasmap.key(codigin)).getFirst().getDATA_CHECKOUT());
                    System.out.println("=================================");
                } catch (NullPointerException e) {
                    System.out.println("A reserva não existe.");
                }
                break;

            case 3:
                System.out.println("============= Checkout ============");
                System.out.println("=====Digite o código da reserva: ");
                codigin = read.nextInt();

                try {
                    System.out.println("Removendo...");
                    System.out.println("-------> " + HOTEL.get(hasmap.key(codigin)).getFirst().getNOME_HOTEL());

                    LinkedList < Hospede > Valor = HOTEL.get(hasmap.key(codigin));

                    Valor.removeFirst();
                    if (Valor.isEmpty()) {
                        // Remover chave do mapa
                        HOTEL.remove(hasmap.key(codigin));
                    } else {
                        HOTEL.put(hasmap.key(codigin), Valor);
                    }

                } catch (NullPointerException e) {
                    System.out.println("A reserva não existe.");
                }
                System.out.print("\nOpção Produtos Selecionado\n");
                break;
            case 4:
                System.out.println("\nSaindo...");
                break;
            default:
                System.out.print("\nOpção Inválida!");
                break;
        }
        System.out.println("A Hasmap do hotel ficou da seguinte forma: ");
        System.out.println(HOTEL);

    }
}