package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Coffee> coffee = new ArrayList<>();
        coffee.add(new Coffee(22, 5, 11, 7));
        coffee.add(new Coffee(20, 2, 10, 5));
        coffee.add(new Coffee(25, 4, 10, 2));
        coffee.add(new Coffee(15, 7, 5, 10));
        coffee.add(new Coffee(10, 5, 0, 5));

        ArrayList<Pie> pie = new ArrayList<>();
        pie.add(new Pie(30, 15, 6));
        pie.add(new Pie(25, 15, 4));
        pie.add(new Pie(25, 20, 11));
        pie.add(new Pie(45, 40, 10));
        pie.add(new Pie(40, 30, 6));

        DataProcessor<Coffee> processor1 = new DataProcessor<>(coffee);
        DataProcessor<Pie> processor2 = new DataProcessor<>(pie);

        System.out.println("\n��������� ���������� ���� �� ���������:");
        try {
            List<Coffee> f1 = processor1.filter(20, -10);
            if (!f1.isEmpty()) {
                f1.forEach(Coffee::getInfo);
            } else {
                System.out.println("��� ���� � ��������� ����������.");
            }
        } catch (filterException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n��������� ���������� ������� �� ���������:");
        try {
            List<Pie> f2 = processor2.filter(30, 40);
            if (!f2.isEmpty()) {
                f2.forEach(Pie::getInfo);
            } else {
                System.out.println("��� ������� � ��������� ����������.");
            }
        } catch (filterException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n��������� ������ ���� �� ���������:");
        try {
            List<Coffee> s1 = processor1.search(-6);
            if (!s1.isEmpty()) {
                s1.get(0).getInfo();
            } else {
                System.out.println("��� ���� � ��������� ����������.");
            }
        } catch (searchException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n��������� ������ ������ �� ���������:");
        try {
            List<Pie> s2 = processor2.search(-25);
            if (!s2.isEmpty()) {
                s2.get(0).getInfo();
            } else {
                System.out.println("��� ������ � ��������� ����������.");
            }
        } catch (searchException e) {
            System.out.println(e.getMessage());
        }
    }
}
