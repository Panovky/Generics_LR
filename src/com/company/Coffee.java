package com.company;

public class Coffee extends Product {
    static int number = 1; // переменная-счетчик
    private int numberCoffee; // номер кофе
    private int waterCost; // себестоимость воды
    private int grainCost; // себестоимость зёрен

    Coffee(int price, int waterCost, int grainCost, int orders) { // конструктор класса
        super(price, orders); // вызов конструктора суперкласса
        this.waterCost = waterCost;
        this.grainCost = grainCost;
        this.numberCoffee = number++;
    }

    public int getPrice() { // метод для получения стоимости продукта
        return this.price;
    }

    public void getInfo() { // метод для вывода информации о продукте
        System.out.printf("Кофе %d: стоимость - %d, себестоимость воды - %d.\n",
                this.numberCoffee, this.price, this.waterCost);
    }
}
