package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
    /* Ввести с консоли сумму покупки в магазине и возраст покупателя,
    в зависимости от суммы вывести на экран ФИНАЛЬНУЮ ЦЕНУ с учетом скидки.

        Скидки:
        1) Сумма до 100 рублей -> 5%
        2) Сумма от 100 рублей включая до 200 рублей не включая -> 7%
        3) Сумма от 200 рублей включая до 300 рублей не включая -> 12%
        4) Сумма от 300 рублей включая до 400 рублей не включая -> 15%
        5) Сумма покупки больше 400 рублей включая -> 20%

    В случае, если сумма покупки находится в 3 интервале (сумма от 200 рублей включая до 300 рублей не включая)
    и возраст покупателя больше, чем 18 лет -> добавить 4% к скидке (12 + 4), иначе -> отнять 3%.
     */
    public static void main(String[] args) {
        double purchaseAmount;
        int ageOfTheBuyer;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму покупки");
        purchaseAmount = scanner.nextInt();
        if (purchaseAmount < 0) {
            System.out.println("Введите корректные значения");
            scanner.close();
            System.exit(0);
        }
        System.out.println("Введите возраст покупателя");
        ageOfTheBuyer = scanner.nextInt();
        if (ageOfTheBuyer < 0 || ageOfTheBuyer > 200) {
            System.out.println("Введите корректные значения");
            scanner.close();
            System.exit(0);
        }
        double discount;

        /* double finalAmount = purchaseAmount - (purchaseAmount*(discount/100));
            как приколхозить эту формулу? */

        if (purchaseAmount < 100) {
            discount = 5;
            System.out.println("К оплате: " + (purchaseAmount - (purchaseAmount * (discount / 100))));
        } else if (purchaseAmount < 200) {
            discount = 7;
            System.out.println("К оплате: " + (purchaseAmount - (purchaseAmount * (discount / 100))));
        } else if (purchaseAmount < 300) {
            discount = 12;
            if (ageOfTheBuyer >= 18) {
                discount += 4;
            } else {
                discount -= 3;
            }
            System.out.println("К оплате: " + (purchaseAmount - (purchaseAmount * (discount / 100))));
        } else if (purchaseAmount < 400) {
            discount = 15;
            System.out.println("К оплате: " + (purchaseAmount - (purchaseAmount * (discount / 100))));
        } else {
            discount = 20;
            System.out.println("К оплате: " + (purchaseAmount - (purchaseAmount * (discount / 100))));
        }

        scanner.close();
    }


}



