package by.academy.homework3.deal;

import by.academy.homework3.products.Product;
import by.academy.homework3.tools.DateConvertor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

/**
 * 1. Необходимо реализовать программу, которая будет позволять вводить сделки купли-продажи товаров
 * между двумя участниками. В каждой сделке может быть несколько товаров,
 * сумма сделки рассчитывается из суммы всех товаров. Сумма каждого товара рассчитывается из его стоимости и количества.
 * Программа должна позволить ввести информацию о сделках, сохранить ее в памяти и вывести на экран.
 * Ввод информацию осуществляется с экрана (консоли). Количество дополнительной информацию о сделке, участнике, товаре
 * придумать самому (больше одного поля для класса). Сделка должна содержать массив продуктов.
 */

public class Deal {
    static protected User seller;
    static protected User buyer;
    protected LocalDate dealDate;
    private  LocalDate deadLine;
    protected Product[] product;


    public Deal(User seller, User buyer, LocalDate dealDate, Product[] product) {
        this.seller = seller;
        this.buyer = buyer;
        this.dealDate = dealDate;
        this.product = product;
    }


    void transferMoney(User seller, User buyer) {
        seller.money += calculateFullPrice();
        buyer.money -= calculateFullPrice();
        System.out.println("Транзакция прошла успешно!");
    }
    void printBill() {
        System.out.println("Чек продажи №" + Math.random());
        System.out.println("Оплата до " );
        DateConvertor.dateToString(deadLine);
        System.out.println("**********");
        System.out.println("Продавец: " + seller.getName());
        System.out.println("Покупатель: " + buyer.getName());
        System.out.println("**********");
        for (int i = 0; i < DealApp.productCount; i++) {
            System.out.println(product[i].toString());
        }
        System.out.println("**********");
        System.out.println("Итого к оплате с учётом скидок: " + calculateFullPrice() + "$\nБлагодарим за покупку! \nДата покупки: " + LocalDate.now()
                +"\n"+ LocalTime.now());
        System.out.println("------------");
    }

    public double calculateFullPrice() {
        if (product == null) {
            return 0;
        }
        double result = 0;
        for (Product p : product) {
            result += p.calculatePrice();
        }
        return result;
    }

    public void submit() {

        double price = calculateFullPrice();

        if (buyer.hasEnoughMoney(price)) {
            printBill();
            transferMoney(seller, buyer);
            setDealDate(LocalDate.now());
            System.out.println("Сделка совершена.");
        } else {
            System.out.println("У покупателя недостаточно средств. " + price);
        }
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public LocalDate getDealDate() {
        return dealDate;
    }

    public void setDealDate(LocalDate dealDate) {
        this.dealDate = dealDate;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }


    public User getBuyer() {
        return buyer;
    }

    public void setDeadLine() {
        this.deadLine = dealDate.plusDays(1);
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deal deal = (Deal) o;

        if (product != null ? !product.equals(deal.product) : deal.product != null) return false;
        if (dealDate != null ? !dealDate.equals(deal.dealDate) : deal.dealDate != null) return false;
        if (seller != null ? !seller.equals(deal.seller) : deal.seller != null) return false;
        return buyer != null ? buyer.equals(deal.buyer) : deal.buyer == null;
    }

    @Override
    public int hashCode() {
        int result = product != null ? product.hashCode() : 0;
        result = 31 * result + (dealDate != null ? dealDate.hashCode() : 0);
        result = 31 * result + (seller != null ? seller.hashCode() : 0);
        result = 31 * result + (buyer != null ? buyer.hashCode() : 0);
        return result;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;


    }

    @Override
    public String toString() {
        return "Deal{" +
                "product=" + Arrays.toString(product) +
                ", dealDate=" + dealDate +
                ", seller=" + seller +
                ", buyer=" + buyer +
                '}';
    }
}
