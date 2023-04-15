import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) {
        Apartment[] apartments = {
                new Apartment(new String[]{"2"}, "4", "Turgeniva"),
        };
        for (Apartment apartment : apartments) {
            System.out.println(apartment);
            apartment.summa();
            Hotel[] hotels = {
                    new Hotel(new String[]{"2"}, new String[]{"1"}, "keremet")
            };
            for (Hotel hotel : hotels) {
                System.out.println(hotel);
                hotel.summa();
                Dormitories[] dormitories = {
                        new Dormitories(new String[]{"1"}, new String[]{"3"}, "ул.Ленина")
                };
                for (Dormitories dormitories1 : dormitories) {
                    System.out.println(dormitories1);
                }
            }
        }
        System.out.println();
    }
}