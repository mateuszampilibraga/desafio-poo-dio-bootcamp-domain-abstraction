import java.time.LocalDate;



public class Monitoria extends Conteudos{
    public Monitoria(String name, String description, LocalDate date, int duration, Skill skills) {
        this.name = name;
        this.duration = duration;
        this.description = description;
        this.date = date;
        this.skills = skills;
        this.totalXP = calculateXP(XP, duration);

    }

    @Override
    public String toString() {
        return "Monitoria{" +
                "duration=" + duration +
                ", skills=" + skills +
                ", totalXP=" + totalXP +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
