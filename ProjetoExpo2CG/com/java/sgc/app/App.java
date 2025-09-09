package com.java.sgc.app;
import com.java.sgc.app.controller.ControllerParticipante;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            ControllerParticipante controller = new ControllerParticipante();

            int opcao;

            do {
                System.out.println("\n=== MENU ===");
                System.out.println("1. Adicionar Convidado");
                System.out.println("2. Adicionar Churrasqueiro");
                System.out.println("3. Adicionar Item ao Estoque");
                System.out.println("4. Listar Participantes");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");

                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 1:
                        controller.adicionarConvidado(sc);
                        break;
                    case 2:
                        controller.adicionarChurrasqueiro(sc);
                        break;
                    case 3:
                        controller.adicionarEstoque(sc);
                        break;
                    case 4:
                        controller.listarParticipantes();
                        break;
                    case 0:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                } 
            } while (opcao != 0);
            sc.close();
            }
        catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
        }
    }
}

