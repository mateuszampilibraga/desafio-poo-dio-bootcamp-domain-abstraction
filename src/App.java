import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Monitoria monitoria = new Monitoria("Lançamento Santander Bootcamp 2024", "A nova edição do Santander Bootcamp conta com 4 trilhas e 75 mil bolsas de estudo para serem distribuídas a pessoas de todo o Brasil.", LocalDate.of(2024,2,19), 2, Skill.SoftSkill);
        Curso curso = new Curso("Aprendendo a Sintaxe Java", "Com isso, você terá acesso a todos os slides e links explorados durante as aulas.", LocalDate.of(2024, 05, 07),80, Skill.Java);

        System.out.println(monitoria);
        System.out.println(curso);
    }
}
