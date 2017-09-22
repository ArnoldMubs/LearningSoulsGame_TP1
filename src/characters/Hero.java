package characters;

/**
 * La Classe characters.Hero est destinée à fournir les mécanismes a un hero
 */
public class Hero {
    private String name;
    private int life;
    private int maxLife;
    private int stamina;
    private int maxStamina;

    public Hero (String name) {
        this.name = name;
        this.life = 100;
        this.stamina = 50;
    }

    public Hero () {
        this.name = "Gregooninator";
        this.life = 100;
        this.stamina = 50;
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
            return "[ characters.Hero ]\t"+this.name+"\tLIFE: "+this.life+"\tSTAMINA: "+this.stamina+"\t(ALIVE)";
        }
        return "[ characters.Hero ]\t"+this.name+"\tLIFE: "+this.life+"\tSTAMINA: "+this.stamina;
    }

    public boolean isAlive() {
        return this.life > 0;
    }

}
