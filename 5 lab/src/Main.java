import com.example.task2.AfricanCountry;
import com.example.task2.*;


public class Main {
    public static void main(String[] args) {
        EuropeanCountry germany = new EuropeanCountry("Германия", 83000000, "ЕС");
        AsianCountry japan = new AsianCountry("Япония", 125000000, "Японский");
        AfricanCountry egypt = new AfricanCountry("Египет", 104000000, "Жаркий");

        germany.displayInfo();
        japan.displayInfo();
        egypt.displayInfo();
    }
}
