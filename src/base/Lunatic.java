package base;

public class Lunatic extends Monster{
    public Lunatic(){
        this.name= "Lunatic";
        this.hp = 48;
        this.damage = 6;
        this.exp = 20;
        this.reward = 161;
        this.level = 2;
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
        hp = hp - damagePoint;
    }
}
