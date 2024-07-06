import java.time.LocalDate;

public class Lab extends Conteudos{
    public Lab(String name, String description, LocalDate date, int duration, Skill skill) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.duration = duration;
        this.skills = skill;
        this.totalXP = calculateXP(XP, duration);
    }

    @Override
    public String toString() {
        return "Lab{" +
                ", name='" + name + '\'' +
                '}';
    }
}
