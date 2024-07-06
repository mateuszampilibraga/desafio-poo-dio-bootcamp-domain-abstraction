public class Conteudos extends Item{
    protected final double XP = 20;
    protected int duration;
    protected Skill skills;
    double totalXP = calculateXP(XP, duration);

    public double calculateXP(double xp,int duration ){
        double totalXP = xp * duration;
        return totalXP;
    }

}
