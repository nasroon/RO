package base;

public class Mastering extends Monster {
    public Mastering(){
        this.name= "Mastering";
        this.hp = 2000;
        this.damage = 200;
        this.exp = 200;
        this.reward = 300;
        this.level = 6;
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
        hp = hp - damage;
    }
}
