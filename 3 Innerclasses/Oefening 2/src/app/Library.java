package app;

/**
 * Library
 */
public class Library {
    private String naam;

    public Library(String pNaam) {
        this.naam = pNaam;
    }

    public class Cabinet {
        private int id;

        public Cabinet(int pId) {
            this.id = pId;
        }

        public class Shelf {
            private int id;

            public Shelf(int pId) {
                this.id = pId;
            }

            public class Book {
                private int id;

                public Book(int pId) {
                    this.id = pId;
                }

                public String getFullId() {
                    return Library.this.naam + "." + Cabinet.this.id + "." + Shelf.this.id + "." + this.id;
                }

            }
        }
    }

}