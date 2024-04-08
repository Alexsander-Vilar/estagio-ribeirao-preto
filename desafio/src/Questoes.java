import java.util.Scanner;

public class Questoes {
    static Scanner scanner = new Scanner(System.in);

    public static void questao1() {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println(SOMA);
    }

    public static void questao2() {
        System.out.println("########################################################################################");
        System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci até " + numero + ": ");

        while (a <= numero) {
            System.out.print(a + " ");
            if (a == numero) {
                System.out.println("\nO número " + numero + " pertence à sequência de Fibonacci.");
                return;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println("\nO número " + numero + " não pertence à sequência de Fibonacci.");
    }

    public static void questao3() {
        System.out.println("\n########################################################################################");
        System.out.println("\n A logica para completar o proximo elemento de:");
        System.out.println("\na) 1, 3, 5, 7, ___");
        int limite1 = 20;

        System.out.printf("Sequência a): ");
        for (int i = 1; i <= limite1; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n----------------");

        System.out.println("\nb) 2, 4, 8, 16, 32, 64, ____");
        int limite2 = 20;
        System.out.printf("Sequência b): ");
        for (int i = 2; i <= limite2; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n----------------");

        System.out.println("\nc) 0, 1, 4, 9, 16, 25, 36, ____");
        int limite3 = 50;
        System.out.printf("Sequência c): ");
        for (int i = 0; i <= limite3; i++) {
            System.out.print((int) Math.pow(i, 2) + " ");
        }
        System.out.println("\n----------------");

        System.out.println("\nd) 4, 16, 36, 64, ____");
        int limite4 = 100;
        System.out.printf("Sequência d): ");
        for (int i = 0; i <= limite4; i++) {
            int numero = i * i;
            System.out.print(numero + " ");
        }
        System.out.println("\n----------------");

        System.out.println("\ne) 1, 1, 2, 3, 5, 8, ____");
        int limite5 = 20;
        int a = 0, b = 1;
        System.out.printf("Sequência e): ");
        for (int i = 3; i <= limite5; i++) {
            int proximo = a + b;
            System.out.print(proximo + " ");
            a = b;
            b = proximo;
        }
        System.out.println("\n----------------");

        System.out.println("\nf) 2,10, 12, 16, 17, 18, 19, ____");
        int numerosd[] = {2, 10, 12, 16, 17, 18, 19, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210};
        System.out.printf("Sequência f): ");
        for (int i = 0; i < numerosd.length; i++) {
            int numero = numerosd[i];
            System.out.print(numero + " ");
        }
    }

    public static void questao5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n########################################################################################");
        System.out.println("\nDigite uma string:");
        String entrada = scanner.nextLine();

        char[] caracteres = entrada.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            inicio++;
            fim--;
        }

        String invertida = String.valueOf(caracteres);
        System.out.println("String invertida: " + invertida);
    }

}





