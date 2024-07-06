import java.time.LocalDate;
import java.util.*;


public class Bootcamp  extends Item{
    protected ArrayList<Conteudos> conteudos;
    protected ArrayList<Dev> devs_inscritos;

    public Bootcamp(String name, String description, ArrayList<Conteudos> conteudos, ArrayList<Dev> devs_inscritos, LocalDate date) {
        this.name = name;
        this.description = description;
        this.conteudos = conteudos;
        this.devs_inscritos = devs_inscritos;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "conteudos=" + conteudos +
                ", devs_inscritos=" + devs_inscritos +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}

