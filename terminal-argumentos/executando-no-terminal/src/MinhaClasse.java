import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: " );
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: " );
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: " );
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: " );
        double altura = scanner.nextDouble();

        scanner.close();

        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
}