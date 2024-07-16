//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание 2");

        int clientOs1 = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOs1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOs1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание 3");

        int year = 2024;
        boolean yearLeap = (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)));
        if (yearLeap) {
            System.out.println(year + " год является високостным");
        } else {
            System.out.println(year + " год не является високостным"); }

        System.out.println("Задание 4");

        int deliveryDistanse = 80;
        int days = 1;
        if (deliveryDistanse < 20) {
            System.out.println("Доставка займет "+ days +" день");
        } else if (deliveryDistanse >= 20 && deliveryDistanse < 60) {
            System.out.println("Доставка займет "+ (days + 1) +" дня");
        } else if (deliveryDistanse >= 60 && deliveryDistanse <= 100) {
            System.out.println("Доставка займет "+ (days + 2) +" дня");
        } else if (deliveryDistanse > 100) {
            System.out.println("Доставки нет"); }

        System.out.println("Задание 5");

        int monthNumber = 4;
        switch (monthNumber) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("Зима");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Весна");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Лето");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет!");
        }
    }
}