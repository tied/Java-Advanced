package app;

import java.util.HashMap;

import app.Klant.Adress;
import app.Productclass.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Klant customer = new Klant("Jan Peeters");
        Klant.Adress address = customer.new Adress("Berkenlaan 23", "9262 Zwavelgem");

        Productclass groenten = new Productclass("Groenten");
        Productclass.Product tomaat = groenten.new Product("tomaat", 1.12);
        Productclass.Product prei = groenten.new Product("prei", .76);

        Productclass zuivel = new Productclass("zuivel");
        Productclass.Product melk = zuivel.new Product("melk", .34);
        Productclass.Product yoghurt = zuivel.new Product("yoghurt", 2.91);

        HashMap<Product, Integer> productAmounts = new HashMap<>();

        productAmounts.put(tomaat, 12);
        productAmounts.put(prei, 2);
        productAmounts.put(melk, 6);
        productAmounts.put(yoghurt, 10);

        Adress.Factuur invoice = address.new Factuur(productAmounts);
        System.out.println(invoice);
    }
}