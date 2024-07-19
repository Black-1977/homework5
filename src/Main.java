public class Main {
    public static void main(String[] args) {

        // Part 1
        System.out.println("Задание 1");
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println();

        // Part 2
        System.out.println("Задание 2");
        int yearOfIssue = 2015;
        clientOS = 0;
        if ((yearOfIssue >= 2015) && (clientOS == 0)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if ((yearOfIssue >= 2015) && (clientOS == 1)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if ((yearOfIssue < 2015) && (clientOS == 0)) {
            System.out.println("Установите упрощённую версию приложения для iOS по ссылке");
        }
        if ((yearOfIssue < 2015) && (clientOS == 1)) {
            System.out.println("Установите упрощённую версию приложения для Android по ссылке");
        }
        System.out.println();

        // Part 3
        System.out.println("Задание 3");
        int year = 2100;
        if (year > 1584) {
            if ((year % 4) == 0) {
                if ((year % 100) == 0) {
                    if ((year % 400) == 0) {
                        System.out.println("Год високосный");
                    } else {
                        System.out.println("Год не високосный");
                    }
                } else {
                    System.out.println("Год високосный");
                }
            } else {
                System.out.println("Год не високосный");
            }
        } else {
            System.out.println("Год не високосный");
        }
        System.out.println();

        // Part 4
        System.out.println("Задание 4");
        int deliveryDistance = 95, deliveryTime = 0;
        if (deliveryDistance <= 100) {
            deliveryTime++;
            if (deliveryDistance > 20) {
                deliveryTime++;
                if (deliveryDistance > 60) {
                    deliveryTime++;
                }
            }
        }
        if (deliveryTime == 0) {
            System.out.println("Доставкв не осуществляется");
        } else {
            System.out.println("Для доставки потребуется дней: " + deliveryTime);
        }
        System.out.println();

        // Part 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        String season;
        switch (monthNumber) {
            case 1, 2, 12:
                season = "Зима";
                break;
            case 3, 4, 5:
                season = "Весна";
                break;
            case 6, 7, 8:
                season = "Лето";
                break;
            case 9, 10, 11:
                season = "Осень";
                break;
            default:
                season = "Вне сезона";
        }
        System.out.println(season);
        System.out.println();
    }
}