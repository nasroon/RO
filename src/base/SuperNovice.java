package base;

public class SuperNovice extends Novice {
    public SuperNovice(String name, String gender) {
        super(name, gender);
        setJob("Super Novice",this.damagePoint+10);
    }

    public String getJob() {
        return job;
    }
    public int getDamage(){return damagePoint;}
}
