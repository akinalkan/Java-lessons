package lambda_functional_programming.lambda_practice;

import jdk.jshell.execution.Util;
import lambda_functional_programming.day2.Utils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda01 {

    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Tulay", "zekeriya", "hasan", "ismail", "osman", "fatih", "ersin", "mevlit"));

    //  Input olarak verilen listteki isimlerden
    //  icinde 'a' harfi bulunanlari silen bir code create ediniz.**********************

    //1.Yol
    public static void aOlaniSil(ArrayList<String> list) {
        System.out.println(list.stream().
                map(m -> m.toLowerCase()).
                filter(m -> !m.contains("a")).
                collect(Collectors.toList()));

    }
    // 2.yol
//        System.out.println(isimler.stream()//akiisa alindi
//                .filter(m -> !m.contains("a") && !m.contains("A"))//a harfi olmayanlar filtrelendi
//                .collect(Collectors.toList()));//lisste atildi

    // 3.Yol
    public static void aOlaniSil02(ArrayList<String> list) {
        list.removeIf(t -> t.contains("a") || t.contains("A"));
        System.out.println(list);

    }

    static List<Integer> numbers = new ArrayList<>(Arrays.asList(25, 65, -56, 55, 98, -89, 65, 55, 21, 54, 9, 35, 35, 34));

    //en buyyk elemani bulun***********************************************************
    //1.Yol
    public static int enBuyukOlaniBul(List<Integer> list) {
        int max = list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
        return max;
    }

    //2.Yol
    public static void enBuyukOlaniBul2(List<Integer> list) {
        int maxSayi = list.stream().reduce(Math::max).get();
        System.out.println("maxSayi = " + maxSayi);
    }

    //3.Yol
    public static void enBuyukOlaniBul3(List<Integer> list) {
        System.out.println(list.stream().sorted().skip(list.size() - 1).collect(Collectors.toList()));

    }/*
    reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
    kullanımı yaygındır pratiktir.
    Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
    bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
    reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
    reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
    İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.
    */

    // Task : List'teki tum elemanlarin toplamini yazdiriniz.***********************************
    //Lambda Expression...
    //1.Yol
    public static void elemanlarToplami(List<Integer> list) {
        System.out.println(list.stream().reduce(0, Math::addExact));
    }

    //2.Yol
    public static void elemanlarToplami02(List<Integer> list) {
        int max = list.stream().reduce(0, (t, u) -> t + u);
        System.out.println("max = " + max);
    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.***********************************
    public static void ciftleriCarp(List<Integer> list) {
        int carpim = list.stream().filter(t -> t % 2 == 0).reduce(Math::multiplyExact).get();
        System.out.println("carpim = " + carpim);
    }

    public static void ciftleriCarp02(List<Integer> list) {
        int carpim = list.stream().filter(Methodlarim::ciftElemanBul).reduce(Math::multiplyExact).get();
        System.out.println("carpim-2.Yol = " + carpim);
    }



}
