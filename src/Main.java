import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Digite o primeiro nome: ");
        String primeiroNome= scanner.nextLine();
        System.out.println("Digite o segundo nome: ");
        String segundoNome= scanner.nextLine();

        String[] nomes = {primeiroNome,segundoNome};

        Arrays.sort(nomes);

        String nomeString = Arrays.toString(nomes);

        System.out.print(nomeString);

    }
}



