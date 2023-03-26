import java.util.Scanner;

public class Ex07Cha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = leitor.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = leitor.nextInt();
        }

        boolean saoIguais = true;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] != vetorB[i]) {
                saoIguais = false;
                break;
            }
        }

        if (saoIguais) {
            System.out.println("Os vetores são iguais!");
        } else {
            System.out.println("Os vetores são diferentes!");
        }

        leitor.close();
    }
}