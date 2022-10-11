import phone.Android;
import phone.OS;
import phone.SystemFactory;

public class FactoryMain {

    public static void main(String[] args) {
        SystemFactory sf = new SystemFactory();
        OS obj = sf.getInstance("closed");
        obj.spec();
    }
}
