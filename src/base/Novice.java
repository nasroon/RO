package base;

public class Novice extends Charactor{
    public Novice(String name,String gender){
        this.name = name;
        this.gender=gender;
        this.job = "Novice";
        this.healthPoint = 100;
        this.manaPoint = 100;

        this.maxHealthPoint = 100;
        this.maxManaPoint = 100;

        this.damagePoint = 10;
        this.level = 1;
        this.experiece = 0;
        this.money = 0;
        this.killcount = 0;
    }

    @Override
    public int getKillcount() {
        return killcount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getJob() {
        return job;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public int getHealthPoint() {
        return healthPoint;
    }

    @Override
    public int getManaPoint() {
        return manaPoint;
    }

    @Override
    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    @Override
    public int getMaxManaPoint() {
        return maxManaPoint;
    }

    @Override
    public int getDamagePoint() {
        return damagePoint;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getExperiece() {
        return experiece;
    }

    @Override
    public int getMoney() {
        return money;
    }



    public void takeDamage(int damage) {
        healthPoint = healthPoint - damage;
    }
    public void die(){healthPoint = 0;}
    public void expGain(int expGain){experiece =experiece+expGain;}
    public void moneyGain(int moneyGain){money = money+moneyGain;}
    public void levelUp(int exp, int level) {
        if (exp >= level*50){
            this.level++;
            //damagePoint++;
            this.experiece = 0;
            maxHealthPoint +=10;
            healthPoint = maxHealthPoint;
        }
    }
    public void killUp(){
        killcount++;
    }
    public void setJob(String newJob,int newDamage){
        job = newJob;
        damagePoint = newDamage;
    }
    public void fullHp(){
        healthPoint = maxHealthPoint;
    }
}
