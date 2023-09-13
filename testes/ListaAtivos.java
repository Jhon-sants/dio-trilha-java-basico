package testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> ativos = new ArrayList<>();

    // Entrada dos tipos de
    System.out.println("Digite a quantidade de ativos que você possui: ");
    int quantidadeAtivos = scanner.nextInt();

    // Entrada dos códigos dos ativos
    for (int i = 0; i < quantidadeAtivos; i++) {
      System.out.println("Digite o tipo de ativo: ");
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);
    }

    scanner.close();
    // TODO: Ordenar os ativos em ordem alfabética
    Collections.sort(ativos);

    // TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
    System.out.println(ativos);
  }
}