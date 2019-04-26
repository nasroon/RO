package base;

public abstract class Monster {
    protected String name;
    protected int hp;
    protected int exp; //+ exp character
    protected int reward; //+ money character
    protected int damage;
    protected int level;


    public abstract int getHp() ;
    public abstract int getExp() ;
    public abstract int getReward() ;
    public abstract int getDamage() ;
    public abstract int getLevel() ;
    public abstract String getName() ;


    public abstract void takeDamage(int damagePoint);
}