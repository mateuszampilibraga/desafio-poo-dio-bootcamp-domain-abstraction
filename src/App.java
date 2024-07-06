import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Cadastrando itens
        Monitoria monitoria = new Monitoria("Lançamento Santander Bootcamp 2024", "A nova edição do Santander Bootcamp conta com 4 trilhas e 75 mil bolsas de estudo para serem distribuídas a pessoas de todo o Brasil.", LocalDate.of(2024,2,19), 2, Skill.SoftSkill);
        Curso curso = new Curso("Aprendendo a Sintaxe Java", "Com isso, você terá acesso a todos os slides e links explorados durante as aulas.", LocalDate.of(2024, 05, 07),80, Skill.Java);
        Lab lab = new Lab("Abstraindo um Bootcamp Usando Orientação a Objetos em Java", "Desmistifique a Programação Orientada a Objetos (POO) com Java e pratique esse conceito fundamental nesse desafio.", LocalDate.of(2024, 7, 6), 4, Skill.Java);


    }
}
