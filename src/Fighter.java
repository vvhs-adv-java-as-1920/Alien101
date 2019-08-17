public class Fighter implements Actor
{
    //Instance Variables
    private int level = 0, xp = 0;
    private int lives = 0, health = 0;
    private String rank = "";
    private String name = "", weapon = "";
    private static final int NUMLIVES = 3;

    //Constructors
    public  Fighter()
    {
        level = 0;
        xp = 0;
        lives = 0;
        health = 0;
        rank = "none";
        name = "John Doe";
        weapon = "noodle";
    }// default constructor

    //This is an overloaded constructor with more details
    public Fighter (String rank, String name, String weapon, int level, int xp)
    {
        this.rank = rank;
        this.name = name;
        this.weapon = weapon;
        this.level = level;
        this.xp = xp;
        lives = NUMLIVES;
    }// end 5 arg constructor

    //Getters

    //Setters

    //Brain Methods

    @Override
    public void Attack(int damage)
    {
    }

    @Override
    public String toString()
    {
        return "Fighter{" +
                "level=" + level +
                ", xp=" + xp +
                ", lives=" + lives +
                ", health=" + health +
                ", rank='" + rank + '\'' +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }//end toString

}// end object class Fighter
