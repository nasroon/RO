package base;

public class Poring extends Monster {
    public Poring(){
        this.name= "Poring";
        this.hp = 11;
        this.damage = 4;
        this.exp = 10;
        this.reward = 158;
        this.level = 1;
    }
    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getExp() {
        return exp;
    }

    @Override
    public int getReward() {
        return reward;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void takeDamage(int damagePoint) {
        hp = hp -damagePoint;
    }
}
