package by.jonline.grow.basicsofoop.exercise2;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
 * нескольких товаров.
 */

public class BasicsOfOOP {
    public static void main(String[] args) {
        Payment.Product product = new Payment.Product("колбаса", 10);
        Payment payment = new Payment();

        payment.addProduct(product);
        payment.deleteProduct(product);

    }
}
