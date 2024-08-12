import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicializando o scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo a sua pilha");
        System.out.println("Digite o valor do tamanho da sua pilha: ");
        int size = scanner.nextInt();

        Stack s = new Stack(size);

        System.out.println("Digite os valores que serão empilhados ( digite -1 para sair ) :");

        while (true) {
            int value = scanner.nextInt();
            // Sai do loop se o usuário digitar -1
            if (value == -1) {
                break;
            }
            try {
                s.push(value);
                System.out.println("Empilhei " + value);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        while (!s.isEmpty()){
            int element = s.pop();
            System.out.println("Desempilhei " + element);
        }
    }
}
