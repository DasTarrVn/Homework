public class Character {
    private String name;
    private int level;
    private int health;
    private int attackPower;
    private int defense;
    private transient double score;
    static final long serialVersionUID = 2025L;

    public Character(String name, int level, int health, int attackPower, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", attackPower=" + attackPower +
                ", defense=" + defense +
                ", score=" + score +
                '}';
    }

    // extra method
    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
