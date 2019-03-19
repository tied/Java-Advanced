package app;

/**
 * Productclass
 */
public class Productclass {

    public String name;

    public class Product {

        public String naam;
        public Prijs prijs;

        public class Prijs {
            public double value;

            public Prijs(double pPrijs) {
                value = pPrijs;
            }

            public double getValue() {
                return value;
            }
        }

        public Product(String pNaam, double pPrijs) {
            this.naam = pNaam;
            this.prijs = new Prijs(pPrijs);
        }

        public Prijs getPrice() {
            return this.prijs;
        }

        @Override
        public String toString() {
            return naam;
        }
    }

    public Productclass(String pNaam) {
        this.name = pNaam;
    }
}