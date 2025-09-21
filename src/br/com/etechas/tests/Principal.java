package br.com.etechas.tests;

import br.com.etechas.models.Cd;
import br.com.etechas.models.Dvd;
import br.com.etechas.models.Livro;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Livro livro = new Livro();
        Cd cd = new Cd();
        Dvd dvd = new Dvd();

        System.out.println(livro);
        System.out.println(cd);
        System.out.println(dvd);



        System.out.println("\n\nFeito pelos alunos: Felipe e Gustavo");
    }
}