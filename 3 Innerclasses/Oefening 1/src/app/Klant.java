package app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import app.Productclass.Product;
import app.Productclass.Product.Prijs;

/**
 * Klant
 */
public class Klant {
    public String naam;

    public Klant(String pNaam) {
        this.naam = pNaam;
    }

    @Override
    public String toString() {
        return naam;
    }

    public class Adress {
        public String adresslijn1;
        public String adresslijn2;

        public Adress(String eerste, String tweede) {
            adresslijn1 = eerste;
            adresslijn2 = tweede;
        }

        @Override
        public String toString() {
            return String.format("%s\n%s\n%s", Klant.this, this.adresslijn1, this.adresslijn2);
        }

        public class Factuur {
            private int number = 0;
            HashMap<Product, Integer> productAmounts;

            public Factuur(HashMap<Product, Integer> productAmounts) {
                this.number++;
                this.productAmounts = productAmounts;
            }

            @Override
            public String toString() {
                String productsString = "";
                double totalPrice = 0;

                Iterator<Entry<Product, Integer>> productsIterator = this.productAmounts.entrySet().iterator();

                while (productsIterator.hasNext()) {
                    Entry<Product, Integer> productAmount = productsIterator.next();
                    Prijs price = productAmount.getKey().getPrice();
                    double priceValue = price.getValue();
                    int amount = productAmount.getValue();

                    totalPrice += priceValue * amount;
                    productsString += String.format("%s\t%d\t%7.2f€\n", productAmount.getKey(), amount,
                            amount * priceValue);
                }

                return String.format("Invoice No %d\n%s\n\n%s\t\t--------\n\t\t%7.2f€", this.number, Adress.this,
                        productsString, totalPrice);
            }

        }
    }

}