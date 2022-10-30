package com.company;

public class Coffee extends Product {
    static int number = 1; // ����������-�������
    private int numberCoffee; // ����� ����
    private int waterCost; // ������������� ����
    private int grainCost; // ������������� ����

    Coffee(int price, int waterCost, int grainCost, int orders) { // ����������� ������
        super(price, orders); // ����� ������������ �����������
        this.waterCost = waterCost;
        this.grainCost = grainCost;
        this.numberCoffee = number++;
    }

    public int getPrice() { // ����� ��� ��������� ��������� ��������
        return this.price;
    }

    public void getInfo() { // ����� ��� ������ ���������� � ��������
        System.out.printf("���� %d: ��������� - %d, ������������� ���� - %d.\n",
                this.numberCoffee, this.price, this.waterCost);
    }
}
