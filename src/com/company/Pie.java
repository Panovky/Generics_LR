package com.company;

public class Pie extends Product{
    static int number = 1; // переменная-счетчик
    private int numberPie; // номер пирога
    private int cost; // себестоимость пирога

    Pie(int price, int cost, int orders) { // конструктор класса
        super(price, orders); // вызов конструктора суперкласса
        this.cost = cost;
        this.numberPie = number++;
    }

    public int getPrice() { // метод для получения стоимости продукта
        return this.price;
    }

    public void getInfo() { // метод для вывода информации о продукте
        System.out.printf("Пирог %d: стоимость - %d, себестоимость - %d.\n",
                this.numberPie, this.price, this.cost);
    }
}
