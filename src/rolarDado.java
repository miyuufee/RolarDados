import java.util.Random;
import java.util.Scanner;

public class rolarDado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] dados = {2, 3, 4, 6, 10, 20, 100};

        System.out.println("! ROLAGEM DE DADOS !");
        System.out.println("Você pode escolher entre:");
        System.out.println("d2, d3, d4, d6, d10, d20, d100");
        System.out.println("Digite 'sair' para encerrar o programa.\n");

        while (true) {
            System.out.print("Escolha o tipo de dado para ser rolado: ");
            String entrada = scanner.next().toLowerCase();

            if (entrada.equals("sair")) {
                System.out.println("Encerrando...");
                break;
            }

            boolean valida = false;
            int escolha = 0;
            int quantidade = 1;

            try {
                if (entrada.contains("d")) {
                    String[] partes = entrada.split("d");

                    if (partes[0].isEmpty()) {
                        quantidade = 1;
                    } else {
                        quantidade = Integer.parseInt(partes[0]);
                    }

                    escolha = Integer.parseInt(partes[1]);
                } else {
                    escolha = Integer.parseInt(entrada);
                }

                for (int opcao : dados) {
                    if (escolha == opcao) {
                        valida = true;
                        break;
                    }
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                valida = false;
            }

            if (!valida || quantidade <= 0) {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }

            System.out.print("Digite um valor bônus (pode ser 0): ");
            int soma = scanner.nextInt();

            System.out.print("Aplicar bônus em cada dado individualmente? (s/n): ");
            String aplicaCada = scanner.next().toLowerCase();

            int total = 0;
            System.out.print("Rolagens: ");
            for (int i = 0; i < quantidade; i++) {
                int bruto = random.nextInt(escolha) + 1;
                int resultado = bruto;

                if (aplicaCada.equals("s")) {
                    resultado += soma;
                    System.out.print(bruto + "(+" + soma + ")");
                } else {
                    System.out.print(bruto);
                }

                total += resultado;
                if (i < quantidade - 1) System.out.print(", ");
            }

            if (!aplicaCada.equals("s")) {
                total += soma;
            }

            System.out.println("\nResultado final de " + quantidade + "d" + escolha +
                               (soma != 0 ? " + " + soma : "") + " = " + total + "\n");
        }

        scanner.close();
    }
}