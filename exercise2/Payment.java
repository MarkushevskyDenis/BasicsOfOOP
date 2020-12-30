package by.jonline.grow.basicsofoop.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Payment {

    private List<Product> cart = new ArrayList<Product>();

    public Payment(){

    }

    public void addProduct(Product product){
        cart.add(product);
    }

    public void deleteProduct(Product product){
        cart.remove(product);
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }


    public static class Product {

        private String name;
        private double cost;

        public Product() {

        }

        public Product(String name, double cost) {
            this.name = name;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return Double.compare(product.cost, cost) == 0 &&
                    Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, cost);
        }


        @Override
        public String toString() {
            return "name='" + name + '\'' +
                    ", cost=" + cost;
        }
    }

}
