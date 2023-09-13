package testes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##");

    double valorInicial = scanner.nextDouble();

    double taxaJuros = scanner.nextDouble();

    int periodo = scanner.nextInt();

    double valorFinal = calcularJurosCompostos(valorInicial, taxaJuros, periodo);

    // TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os
    // juros.

    System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

    scanner.close();
  }

  public static double calcularJurosCompostos(double valorInicial, double taxaJuros, int periodo) {
    double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);
    return valorFinal;
  }

}
