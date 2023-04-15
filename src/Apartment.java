
    public class Apartment extends Family implements PaymentAble {
        public Apartment(String[] parents, String children, String adress) {
            super(parents, new String[]{children}, adress);
        }

        @Override
        public void summa() {
            System.out.println("коммунальные услуги за месяц: 2500 с");
        }

        @Override
        public String toString() {
            return "Apartment: "+super.toString();
        }
    }
