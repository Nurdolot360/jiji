import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) {
        Apartment[] apartments = {
                new Apartment(new String[]{"2"},"4","Turgeniva"),

        };
        for (Apartment apartment:apartments) {
            System.out.println(apartment);
            apartment.summa();
        }
        System.out.println();
    }
}