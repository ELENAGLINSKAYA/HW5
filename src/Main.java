public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var clientOS = 0;
        var clientAndroid = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientAndroid == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            var clientDeviceYear = 2015;
            var ClientOSDeviceYear = 2014;
            var ClientAndroidDeviceYear = 2016;
            if (ClientOSDeviceYear > clientDeviceYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (ClientOSDeviceYear < clientDeviceYear) {
                System.out.println("Установите облегченную версию  приложения для iOS по ссылке");
                if (ClientAndroidDeviceYear > clientDeviceYear) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else if (ClientAndroidDeviceYear < clientDeviceYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                int year = 2021;
                boolean leapyaer = (year > 1584 &&
                        ((year / 400 == 0) ||
                                (year / 4 == 0 && year / 100 != 0)));
                if (leapyaer)
                    System.out.println("Год" + year + "високосный");

                else
                    System.out.println("Год" + year + " не високосный");
            }
            int day = 1;
            int newDay = ++day;
            int newDay1 = ++newDay;
            int deliveryDistance = 95;
            if (deliveryDistance <= 20) {
                System.out.println("Срок доставки" + day + "день");
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Срок доставки" + newDay + "дня");
            } else if (deliveryDistance > 60 && deliveryDistance < 100) {
                System.out.println("Потребуется на доставку" + newDay1 + "дня");
            }
            int monthNumber = 12;
            switch (monthNumber){

                case 1:
                case 2:
                case 12:
                    System.out.println("зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("осень");
                    break;
                default:
                    System.out.println("Такого месяца не существует");

            }
        }
    }
}