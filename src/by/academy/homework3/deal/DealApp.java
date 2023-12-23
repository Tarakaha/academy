package by.academy.homework3.deal;

import by.academy.homework3.products.Bread;
import by.academy.homework3.products.Cat;
import by.academy.homework3.products.Laptop;
import by.academy.homework3.tools.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Данная программа - маркетплейс продавца ООО "Уася", потому регистрация идёт только покупателя.
 */

public class DealApp {
    final static Scanner scanner = new Scanner(System.in);

    private static final Container container = new Container();
    static int productCount = 0;
   protected static User seller;
   protected static User buyer;


    public void initializationUser() {

        DateValidatorWithDash dateValidatorWithDash = new DateValidatorWithDash();
        DateValidatorWithSlash dateValidatorWithSlash = new DateValidatorWithSlash();
        DateConvertor convert = new DateConvertor();
        BelarussianPhoneValidator belarussianPhoneValidator = new BelarussianPhoneValidator();
        AmericanPhoneValidator americanPhoneValidator = new AmericanPhoneValidator();
        EmailValidator emailValidator = new EmailValidator();


        buyer = new User();
        System.out.println("Добро пожаловать, покупатель! Представьтесь,пожалуйста!:");
        buyer.setName(scanner.nextLine());


        do {
            System.out.println(buyer.getName() + ", введите дату рождения в формате dd-MM-yyyy или dd/MM/yyyy!:");
            String inputDateOfBirth = scanner.next();

            if (dateValidatorWithDash.validate(inputDateOfBirth)) {
                buyer.setDateOfBirth(convert.convertDateWithDash(inputDateOfBirth));
                break;
            } else if (dateValidatorWithSlash.validate(inputDateOfBirth)) {
                buyer.setDateOfBirth(convert.convertDateWithSlash(inputDateOfBirth));
                break;
            } else {
                System.out.println("Некорректная дата!");
            }
        } while (true);

        do {
            System.out.println(buyer.getName() + ", введите Ваш номер телефона с кодом! (+375...(РБ) или +1...(USA))");
            String inputPhone = scanner.next();
            if (belarussianPhoneValidator.validate(inputPhone)) {
                buyer.numberOfPhone = inputPhone;
                break;
            } else if (americanPhoneValidator.validate(inputPhone)) {
                buyer.numberOfPhone = inputPhone;
                break;
            } else {
                System.out.println("Неверный формат телефона!");
            }
        } while (true);

        do {
            System.out.println(buyer.getName() + ", введите Ваш email адрес!(допустимые спецсимволы:\"._%+-/\"):");
            String inputEmail = scanner.next();
            if (emailValidator.validate(inputEmail)) {
                buyer.email = inputEmail;
                break;
            } else {
                System.out.println("Неверный формат email!");
            }
        } while (true);

        System.out.println(buyer.getName() + ", Вы миллионный пользователь! Поздравляем! На Ваш счёт зачесленно 1.000.000$");
        buyer.setMoney(1_000_000);
    }

    protected void initializationOfSeller() {
        seller = new User();
        seller.setName("ООО \"Уася\"");
        seller.setMoney(20);
    }

    protected static void shopping() {
        boolean isShopping = true;
        Deal deal = new Deal(seller,buyer, LocalDate.now(), container.getProducts());
        deal.setDeadLine();


        while (isShopping) {
            System.out.println("Меню:");
            System.out.println("Внимание! Действуют скидки! На кошек стоимостью выше 1500$ - скидка 20%!");
            System.out.println("При покупке хлеба от 10-ти штук - скидка 50%!");
            System.out.println("При покупке ноутбука Lenovo - скидка 25%!");
            System.out.println("----------------------");
            System.out.println("1. Посмотреть список товаров");
            System.out.println("2. Посмотреть свою корзину");
            System.out.println("3. Завершить покупку");
            System.out.print("Выберите пункт меню: ");
            int choiceInMenu = scanner.nextInt();

            switch (choiceInMenu) {
                case 1:
                    System.out.println("\nСписок разделов: 1. Кошки; 2. Хлеб; 3. Ноутбуки");
                    System.out.println("\nСделайте выбор (1 - 3): ");
                    choiceChapter();
                    break;

                case 2:
                    if (container.getProducts() != null) {
                        double toPay = 0;
                        for (int i = 0; i < productCount; i++) {
                            System.out.println(i + ". " + container.getProducts()[i]);
                            toPay += container.getProducts()[i].calculatePrice();
                        }
                        System.out.println("К оплате c учётом скидок: " + toPay + "$");
                    } else {
                        System.out.println("Корзина пуста");
                        break;
                    }
                    System.out.println("Желаете что-то убрать? 1 - да; 0 - вернуться в меню");
                    int choiceForDelete = scanner.nextInt();
                    if (choiceForDelete == 1) {
                        deleteProduct();
                    }
                    break;
                case 3:
                    deal.setProduct(Arrays.copyOf(container.getProducts(),productCount));
                    deal.submit();

                    isShopping = false;

                    break;
                default:
                    System.out.println("Некорректный выбор. Пожалуйста, выберите пункт из меню.");
                    break;
            }
        }

        System.out.println();


        scanner.close();
    }

    private static void deleteProduct() {
        if (container.getProducts()[0] != null) {
            System.out.println("Какую позицию необходимо удалить?");
            for (int i = 0; i < productCount; i++) {
                System.out.println(i + ". " + container.getProducts()[i]);
            }
        } else {
            System.out.println("Корзина пуста!");
            return;
        }

        int index = scanner.nextInt();
        container.delete(index);
        productCount--;


        System.out.println("Хотите удалить ещё что-то? 1 - да; Для возврата в меню нажмите любую другую цифру;");
        int choiceForDelete = scanner.nextInt();
        if (choiceForDelete == 1) {
            deleteProduct();
        }
    }


    private static void choiceChapter() {
        int choiceChapter = scanner.nextInt();
        switch (choiceChapter) {
            case 1:
                System.out.println("Выберите породу: 1. Бенгальская; 2. Шотландская вислоухая; 3. Персидская; 0 - Вернуться назад;");
                choiceOfTheCat();
                break;
            case 2:
                System.out.println("Выберите хлеб: 1. \"Нарочанский\"; 2. \"Майский\"; 3. \"Водар\"; 0 - Вернуться назад; ");
                choiceOfTheBread();
                break;
            case 3:
                System.out.println("Выберите ноутбук: 1. \"MSI\"; 2. \"ASUS\"; 3. \"Lenovo\"; 0 - Вернуться назад;");
                choiceOfTheLaptop();
                break;
        }
    }


    private static void choiceOfTheLaptop() {
        int choiceOfTheLaptop = scanner.nextInt();
        int inputQuantity;
        switch (choiceOfTheLaptop) {
            case 1:
                System.out.println("Введите количество: ");
                inputQuantity = scanner.nextInt();
                container.add(new Laptop("MSI", 1500, inputQuantity));
                productCount++;
                System.out.println("Товар добавлен в корзину!");
                break;
            case 2:
                System.out.println("Введите количество: ");
                inputQuantity = scanner.nextInt();
                container.add(new Laptop("ASUS", 1699.99, inputQuantity));
                productCount++;
                System.out.println("Товар добавлен в корзину!");
                break;
            case 3:
                System.out.println("Введите количество: ");
                inputQuantity = scanner.nextInt();
                container.add(new Laptop("Lenovo", 1410, inputQuantity));
                productCount++;
                System.out.println("Товар добавлен в корзину!");
                break;

            case 0:
                shopping();
                break;
            default:
                System.out.println("Некорректный выбор!");
        }
    }

    private static void choiceOfTheBread() {
        int choiceOfTheBread = scanner.nextInt();
        int inputQuantity;
        switch (choiceOfTheBread) {
            case 1:
                System.out.println("Введите количество: ");
                inputQuantity = scanner.nextInt();
                container.add(new Bread("Нарочанский", 0.73, inputQuantity));
                productCount++;
                System.out.println("Товар добавлен в корзину!");
                break;
            case 2:
                System.out.println("Введите количество: ");
                inputQuantity = scanner.nextInt();
                container.add(new Bread("Майский", 0.67, inputQuantity));
                productCount++;
                System.out.println("Товар добавлен в корзину!");
                break;
            case 3:
                System.out.println("Введите количество: ");
                inputQuantity = scanner.nextInt();
                container.add(new Bread("Водар", 0.62, inputQuantity));
                productCount++;
                System.out.println("Товар добавлен в корзину!");
                break;

            case 0:
                shopping();
                break;
            default:
                System.out.println("Некорректный выбор!");
        }
    }

    private static void choiceOfTheCat() {
        int choiceOfTheCat = scanner.nextInt();
        int inputQuantity;
        switch (choiceOfTheCat) {
            case 1:
                System.out.println("Введите количество: ");
                inputQuantity = scanner.nextInt();
                container.add(new Cat("Бенгальская", 2000, inputQuantity, "Рыжий"));
                productCount++;
                System.out.println("Товар добавлен в корзину!");
                break;
            case 2:
                System.out.println("Введите количество: ");
                inputQuantity = scanner.nextInt();
                container.add(new Cat("Шотландская вислоухая", 1000, inputQuantity, "Вискас"));
                productCount++;
                System.out.println("Товар добавлен в корзину!");
                break;
            case 3:
                System.out.println("Введите количество: ");
                inputQuantity = scanner.nextInt();
                container.add(new Cat("Персидская", 2000, inputQuantity, "Белый"));
                productCount++;
                System.out.println("Товар добавлен в корзину!");
                break;
            case 0:
                shopping();
                break;
            default:
                System.out.println("Некорректный выбор!");
        }
    }
}

