package base;

public abstract class Charactor {
    protected String name;
    protected String job;
    protected String gender;

    protected int healthPoint;
    protected int manaPoint;

    protected int damagePoint;

    protected int maxHealthPoint;
    protected int maxManaPoint;

    protected int level;
    protected int experiece;
    protected int money;
    protected int killcount;

    public abstract int getKillcount();
    public abstract String getName();
    public abstract String getJob();
    public abstract String getGender();

    public abstract int getHealthPoint();
    public abstract int getManaPoint();

    public abstract int getMaxHealthPoint();
    public abstract int getMaxManaPoint();

    public abstract int getDamagePoint();
    public abstract int getLevel();
    public abstract int getExperiece();
    public abstract int getMoney();

}
