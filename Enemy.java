import java.util.Random;

public class Enemy {
    String name = "enemy";
    int health = 0;
    int armor = 0;
    int damage = 0;
    int evasion = 0;
    String enemydesc = "generic enemy";
    public void pickenemy(){
       Random random = new Random();
        //lesserlizard();
        int randomInt = random.nextInt(3);

        switch (randomInt) {
            case 0 -> lesserlizard();
            case 1 -> wraith();
            default -> corpse();
        }

    }

    //Lesser Lizard enemy stats
    public void lesserlizard(){
        name = "Lesser Lizard";
        health = 4;
        armor = 0;
        damage = 1;
        evasion = 1;
        enemydesc = "The are the vile offspring of your mythical foe. These creatures have not yet developed their extremely hardened scales, leading to weaker defense than their parent counterpart, yet they are still quite formidable opponents.\n";

    }

    //Corpse Enemy stats
    public void corpse(){
        //int numofcorpses = amount;
        name = "Vile Corpse";
        health = 1;
        armor = 0;
        damage = 2;
        evasion = 1;
        enemydesc = "The evil magic eminating from the mythical dragon has infested the fallen cproses in the castle. Though fairly weak, if they gather in numbers they can overwhelm you before you realize it.\n";

    }

    //Wraith enemy stats
    public void wraith(){
        name = "Soul Wraith";
        health = 3;
        armor = 0;
        damage = 3;
        evasion = 1;
        enemydesc = "These creatures are the souls of the fallen, trapped by the dragons magic. The can hit hard so watch out.\n";
    }

    //Dragon boss enemy stats
    public void boss(){
        name = "Dragon";
        health = 20;
        armor = 5;
        damage = 4;
        evasion = 4;
        enemydesc = "This is the vile creature that has taken the princess and slain many adventurers. Take care in this battle.\n";
    }

    public void enemydesc(){
        System.out.println(enemydesc);
    }

    public void takeenemyhealth(int takeaway){
        health -= takeaway;
    }

    public int gethealth(){
        return health;
    }

    public String getname(){
        return name;
    }

    public int getdamage(){
        return damage;
    }
}