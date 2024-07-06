import java.time.LocalDate;

public class Curso extends Conteudos{
    protected LocalDate finalDate;

    public LocalDate calculateFinalDate(LocalDate date){
        LocalDate finalDate = date.plusDays(45);
        return finalDate;
    }

    public Curso(String name, String description, LocalDate date, int duration, Skill skills) {
        this.finalDate = calculateFinalDate(date);
        this.date = date;
        this.description = description;
        this.name = name;
        this.duration = duration;
        this.skills = skills;
        this.totalXP = calculateXP(XP, duration);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "finalDate=" + finalDate +
                ", duration=" + duration +
                ", skills=" + skills +
                ", totalXP=" + totalXP +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
