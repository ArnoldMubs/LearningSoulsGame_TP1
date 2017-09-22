package characters;

/**
 * La classe characters.Monster est destinée à fournir les mécanismes de base communs à tous les (types de) monstres
 */
public class Monster {
    private String name;
    private int life;
    private int maxLife;
    private int stamina;
    private int maxStamina;
    private static int INSTANCES_COUNT = 0;

    public Monster(String name) {
        this.INSTANCES_COUNT++;
        this.name = name;
        this.life = 10;
        this.stamina = 10;
    }

    public Monster() {
        this.INSTANCES_COUNT++;
        this.name = "Monster_"+this.INSTANCES_COUNT;
        this.life = 10;
        this.stamina = 10;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    protected void setLife(int life) {
        this.life = life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    protected void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getStamina() {
        return stamina;
    }

    protected void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    protected void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public void printStats () {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        if (isAlive()) {
            return "[ characters.Monster ]\t"+this.name+"\tLIFE: "+this.life+"\tSTAMINA: "+this.stamina+"\t(ALIVE)";
        }
        return "[ characters.Monster ]\t"+this.name+"\tLIFE: "+this.life+"\tSTAMINA: "+this.stamina;
    }

    public boolean isAlive() {
        return (this.life > 0) ? true:false;
    }
}
