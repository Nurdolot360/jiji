import java.util.Arrays;

public class Semi extends Family implements PaymentAble{
    private String Semiy[];

    public Semi(String[] parents, String[] children, String adress, String[] semiy) {
        super(parents, children, adress);
        Semiy = semiy;
    }

    public String[] getSemiy() {
        return Semiy;
    }

    public void setSemiy(String[] semiy) {
        Semiy = semiy;
    }

    @Override
    public String toString() {
        return "Semi: " + "\n"+
                "Semiy: " + Arrays.toString(Semiy) +super.toString();
    }

    @Override
    public void summa() {

    }
}
