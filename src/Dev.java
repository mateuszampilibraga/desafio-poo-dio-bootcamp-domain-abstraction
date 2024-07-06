import java.time.LocalDate;
import java.util.*;


public class Dev  extends Item{
    public Dev(String name, LocalDate birthData) {
        this.name = name;
        this.date = birthData;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "name='" + name + '\'' +
                '}';
    }
}
