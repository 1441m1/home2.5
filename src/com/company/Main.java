package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> listA = createList();
        printlist(listA);
        ArrayList<String> listB = createList();
        printlist(listB);
        System.out.println("----------------------------------");
        ArrayList<String> listC = new ArrayList<>();
        int g = 4;
        for (int i = 0; i <5 ; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(g));
            --g;

        }
        printlist(listC);

        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println("сортированный лист С");
        printlist(listC);
    }

    public static ArrayList <String> createList(){
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int a=0;
        while (a<5) {
            String name = scanner.nextLine();
            list.add(name);
            ++a;
        }
        return list;

    }

    public static void printlist(ArrayList<String> list){
        int a=0;
        while (a<list.size()){
            System.out.println(list.get(a));
            ++a;
        }
    }
}
