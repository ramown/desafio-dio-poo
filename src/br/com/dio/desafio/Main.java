package br.com.dio.desafio;

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrção curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrção curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().addAll(Arrays.asList(curso1, curso2, mentoria));

        Dev dev1 = new Dev();
        dev1.setNome("Maria");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + dev1.getConteudosIncritos());
        dev1.progredir();
        System.out.println("Conteudos Concluídos" + dev1.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos" + dev1.getConteudosIncritos());
        System.out.println("XP = " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("José");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + dev2.getConteudosIncritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos Concluídos" + dev2.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos" + dev2.getConteudosIncritos());
        System.out.println("XP = " + dev2.calcularTotalXp());

        dev1.progredir();
        System.out.println("Conteudos Inscritos" + dev1.getConteudosIncritos());
        System.out.println("Conteudos Concluídos" + dev1.getConteudosConcluidos());
        System.out.println("XP = " + dev1.calcularTotalXp());

        System.out.println("Conteudos Inscritos" + dev2.getConteudosIncritos());
        System.out.println("Conteudos Concluídos" + dev2.getConteudosConcluidos());
        System.out.println("XP = " + dev2.calcularTotalXp());

    }
}

