# Desafio de Programação
### Tenha acesso ao [Código Fonte](desafio/src/Questoes.java) com a resolução das questoes 1, 2, 3,5.
## Soma de Números Consecutivos

**Questão:** Observe o trecho de código abaixo:

```java
int INDICE = 13, SOMA = 0, K = 0;

while (K < INDICE) {
    K = K + 1;
    SOMA = SOMA + K;
}

System.out.println(SOMA);
```
Use o código com cuidado. Ao final do processamento, qual será o valor da variável SOMA?

Resposta:
Ao final do processamento, a variável SOMA terá o valor 91.

**Sequência de Fibonacci**
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
Resposta:

```java
 public static void questao2() {
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
```
**Sequências Lógicas**
Questão:
Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, ___


b) 2, 4, 8, 16, 32, 64, ____


c) 0, 1, 4, 9, 16, 25, 36, ____


d) 4, 16, 36, 64, ____


e) 1, 1, 2, 3, 5, 8, ____


f) 2, 10, 12, 16, 17, 18, 19, ____


Resposta:

a) 9 (soma dos 2 números anteriores)

b) 128 (multiplicação do número anterior por 2)

c) 49 (quadrado do número anterior)

d) 100 (soma dos 4 números anteriores)

e) 13 (soma dos 2 números anteriores)

f) 20 (soma dos 2 números anteriores)

**Interruptores e Lâmpadas**

Questão:

Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.

Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

Resposta:
***Primeira Ideia:***

Ligue o interruptor 1 e deixe-o ligado por 10 minutos.
Desligue o interruptor 1 e ligue o interruptor 2 por 5 minutos.
Vá para a sala das lâmpadas.
Na sala das lâmpadas:

Lâmpada 1: Se estiver acesa, o interruptor 1 a controla. Se estiver apagada e quente ao toque, o interruptor 2 a controla. Se estiver apagada e fria ao toque, o interruptor 3 a controla.
Lâmpada 2: Se estiver acesa, o interruptor 2 a controla. Se estiver apagada e quente ao toque, o interruptor 3 a controla. Se estiver apagada e fria ao toque, o interruptor 1 a controla.
Lâmpada 3: Se estiver acesa, o interruptor 3 a controla. Se estiver apagada e quente ao toque, o interruptor 1 a controla. Se estiver apagada e fria ao toque, o interruptor 2 a controla.

***Segunda Ideia:***

Com base nas suas observações na primeira ida, ligue o interruptor que você ainda não sabe qual lâmpada controla.
Vá para a sala das lâmpadas novamente.
A lâmpada que estiver acesa agora é controlada pelo interruptor que você ligou na segunda ida.

**Inverter caracteres de uma string**

Questão:
Escreva um programa que inverta os caracteres de uma string.

Resposta:

```Java
public static void questao5() {
        Scanner scanner = new Scanner(System.in);
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

````
