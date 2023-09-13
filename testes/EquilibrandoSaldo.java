package testes;

import java.util.Scanner;
import java.text.DecimalFormat;

public class EquilibrandoSaldo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat formatoNumero = new DecimalFormat("#.0");

    System.out.println("Digite o seu saldo atual: ");
    double saldoAtual = scanner.nextDouble();

    System.out.println("Digite o valor a ser depositado: ");
    double valorDeposito = scanner.nextDouble();

    System.out.println("Digite o valor que deseja retirar: ");
    double valorRetirada = scanner.nextDouble();

    scanner.close();

    // TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
    saldoAtual += valorDeposito;
    saldoAtual -= valorRetirada;

    String formatado = formatoNumero.format(saldoAtual);

    // TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
    System.out.println("Saldo atual: " + formatado + " reais.");
  }
}