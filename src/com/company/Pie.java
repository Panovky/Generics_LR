package com.company;

public class Pie extends Product{
    static int number = 1; // ����������-�������
    private int numberPie; // ����� ������
    private int cost; // ������������� ������

    Pie(int price, int cost, int orders) { // ����������� ������
        super(price, orders); // ����� ������������ �����������
        this.cost = cost;
        this.numberPie = number++;
    }

    public int getPrice() { // ����� ��� ��������� ��������� ��������
        return this.price;
    }

    public void getInfo() { // ����� ��� ������ ���������� � ��������
        System.out.printf("����� %d: ��������� - %d, ������������� - %d.\n",
                this.numberPie, this.price, this.cost);
    }
}
