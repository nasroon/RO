package base;

public class Picky extends Monster {
    public Picky(){
        this.name= "Picky";
        this.hp = 64;
        this.damage = 15;
        this.exp = 25;
        this.reward = 200;
        this.level = 3;
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

    public void takeDamage(int damage) {
        hp = hp - damage;
    }
}
