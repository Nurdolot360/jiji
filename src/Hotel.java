
    public class Hotel extends Family implements PaymentAble{
        public Hotel(String[] parents, String[] children, String adress) {
            super(parents, children, adress);
        }


        @Override
        public void summa() {
            System.out.println("Аренда на гостницу: 5,000 сом");
        }

        @Override
        public String toString() {
            return "Hotel{}";
        }
    }

