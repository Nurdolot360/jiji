
    public class Dormitories extends Family implements  PaymentAble {
        public Dormitories(String[] parents, String[] children, String adress) {
            super(parents, children, adress);
        }


        @Override
        public void summa() {
            System.out.println("За аренду 1000 сом ");

        }

        @Override
        public String toString() {
            return "Dormitories{}";
        }
    }
