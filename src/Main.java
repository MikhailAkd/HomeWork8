import java.time.LocalDate;

public class Main {

    public static void checkingYear(int year){

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " - високосный год");
        } else if (year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else
            System.out.println(year + " - не високосный год");
    }

    public static void checkingDevice(int typeOS, int yearAssemblyDevice, int currentYear) {

        if (typeOS == 1 && yearAssemblyDevice == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (typeOS == 1 && yearAssemblyDevice < currentYear)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        if (typeOS == 0 && yearAssemblyDevice == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (typeOS == 0 && yearAssemblyDevice < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static void calculateDeliveryTime(int deliveryDistance){

        int daysForDelivery = 1;
        if (deliveryDistance > 20) {
            daysForDelivery++;
        }
        if (deliveryDistance > 60) {
            daysForDelivery++;
        }
        if (deliveryDistance >= 100) {
            System.out.println("На расстояния более 100 км доставка не осуществляется");
        } else
            System.out.println("Для доставки потребуется дней: " + daysForDelivery);
    }

    public static void main(String[] args) {

        //Задача 1

        int currentYear = LocalDate.now().getYear();
        checkingYear(currentYear);
        System.out.println();

        //Задача 2

        int typeOS = 1;
        int yearAssemblyDevice = 2018;
        checkingDevice(typeOS, yearAssemblyDevice, currentYear);
        System.out.println();

        //Задача 3

        int deliveryDistance = 49;
        calculateDeliveryTime(deliveryDistance);
    }
}