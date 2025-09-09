package com.java.sgc.app.controller;

import com.java.sgc.model.*;
import com.java.sgc.util.Validacoes;
import com.java.sgc.util.Exceptions.AnoValidoException;
import com.java.sgc.util.Exceptions.IdadeValidaException;
import com.java.sgc.util.Exceptions.NomeInvalidoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Funções "CRUD" dos participantes (classe de convidados, churrasqueiros e estoque)
public class ControllerParticipante {

    private final List<Participante> participantes = new ArrayList<>();

    public void adicionarConvidado(Scanner sc) {
        try {
            System.out.print("Nome: ");
            String nome = Validacoes.textoEValido(sc.nextLine());

            System.out.print("Idade: ");
            int idade = Validacoes.idadeEValida(Integer.parseInt(sc.nextLine()));

            System.out.print("Curso: ");
            String curso = Validacoes.textoEValido(sc.nextLine());

            System.out.print("Convidado por quem: ");
            String convidadoPor = Validacoes.textoEValido(sc.nextLine());

            System.out.print("Ano: ");
            String ano = Validacoes.anoValido(sc.nextLine());

            Convidado convidado = new Convidado(nome, idade, curso, convidadoPor, ano);
            participantes.add(convidado);
            System.out.println("Convidado adicionado com sucesso!");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch (AnoValidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch (IdadeValidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch (NomeInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void adicionarChurrasqueiro(Scanner sc) {
        try {
            System.out.print("Nome: ");
            String nome = Validacoes.textoEValido(sc.nextLine());

            System.out.print("Idade: ");
            int idade = Validacoes.idadeEValida(Integer.parseInt(sc.nextLine()));

            System.out.print("Curso: ");
            String curso = Validacoes.textoEValido(sc.nextLine());

            System.out.print("Utensílios: ");
            String utensilios = Validacoes.textoEValido(sc.nextLine());

            System.out.print("Ano: ");
            String ano = Validacoes.anoValido(sc.nextLine());

            Churrasqueiro churrasqueiro = new Churrasqueiro(nome, idade, curso, utensilios, ano);
            participantes.add(churrasqueiro);
            System.out.println("Churrasqueiro adicionado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch (AnoValidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch (IdadeValidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch (NomeInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void adicionarEstoque(Scanner sc) {
        try {
            System.out.print("Nome do responsável pelo estoque: ");
            String nome = Validacoes.textoEValido(sc.nextLine());

            // TODO: Seria legal adicionar uma classe que pega os itens do estoque, separa pelas vírgulas e adiciona em uma lista.
            System.out.print("Itens do estoque: ");
            String itens = sc.nextLine();

            Estoque estoque = new Estoque(nome, itens);
            participantes.add(estoque);
            System.out.println("Item do estoque adicionado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch (AnoValidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch (IdadeValidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch (NomeInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }

    public void listarParticipantes() {
        if (participantes.isEmpty()) {
            System.out.println("Nenhum participante cadastrado.");
            return;
        }

        System.out.println("\n=== Lista de Participantes ===");
        for (Participante p : participantes) {
            System.out.println("- " + p.getClass().getSimpleName() + ": " + p.getNome());
        }
    }
}
