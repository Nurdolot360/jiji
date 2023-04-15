
    public class Hotel extends Family implements PaymentAble{
        public Hotel() {
        }


        @Override
        public void summa() {
            System.out.println("Аренда на гостницу: 5,000 сом");
        }

    }
