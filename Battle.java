import java.util.Scanner;

public class Battle {
    public void startBattle(Player theplayer, Enemy theEnemy, Skills playerskills){
        Enemy enemy = theEnemy;
        Player player = theplayer;
        Skills pskills = playerskills;
        String turn = "player";

        while (player.gethealth() > 0 && enemy.gethealth() > 0){
            if ("player".equals(turn)){
                playerattack(player, enemy, pskills);
                turn = "enemy";
            } else {
                enemyattack(player, enemy);
                turn = "player";
            }
        }

        int phealth = player.gethealth();
        int ehealth = enemy.gethealth();

        if(phealth <= 0){
            System.out.println("You died.");

        } else {
            System.out.println("You have slain the " + enemy.getname() + "!\n");

        }

    }
    //determines what attacks you can use in battle and how much damage you'll do based on that attack
    private void playerattack(Player theplayer, Enemy theenemy, Skills pSkills){
        Scanner uin = new Scanner(System.in);
        Player player = theplayer;
        Enemy enemy = theenemy;
        Skills skills = pSkills;
        System.out.println("What attack will you perform?");
        System.out.println("\"basic\" Attack");
        skills.battleoptions();
        String choice = uin.nextLine();

        int pattack = player.getdamage();
        int edamage = pdamagemodifier(choice, pattack);
        System.out.println("You did " + edamage + " damage to the enemy!");
        enemy.takeenemyhealth(edamage);

        System.out.println("The " + enemy.getname() + " has: " + enemy.gethealth() + " health left.\n");
    }

    //determines how much damage the enemy will do to you
    public void enemyattack(Player theplayer, Enemy theenemy){
        Player player = theplayer;
        Enemy enemy = theenemy;
        String ename = enemy.getname();
        int edamage = enemy.getdamage();
        System.out.println("The " + ename + " attacks!");
        System.out.println("you take " + edamage + " damage!");

        player.chartakehealth(edamage);
        int phealth = player.gethealth();
        System.out.println("You have " + phealth + " health left.\n");
    }

    //determines how much damage your attack will do based on which attack you selected
    public int pdamagemodifier(String pchoice, int pattack){
        int totaldamage = pattack;
        int ad = pattack;
        if("dual".equals(pchoice)){
            System.out.println("\nYou swing both swords at the same time!");
            totaldamage += 2;

        }
        else if( "double".equals(pchoice) ){
            System.out.println("\nYou swing! Following through with another strike!");
            totaldamage = ad * 2;

        }
        else if("triple".equals(pchoice)){
            System.out.println("\nYou strike! Follow through with another strike! Spinning around you strike again!");
            totaldamage = ad * 3;

        }
        else if("heavy".equals(pchoice)){
            System.out.println("\nYou place both hands on the hilt of the sword, raise it above your head, and strike downward with all your might!");
            totaldamage = ad + 3;

        }
        else if("jump".equals(pchoice) ){
            System.out.println("\nYou jump in the air and swing your sword down with both hands as hard as you can!");
            totaldamage = ad + 5;
        }
        // else if("dragon".equals(pchoice)){
        //     System.out.println("What is dragon's blood?");
        // }
        else if("basic".equals(pchoice)){
            System.out.println("\nYou swing your sword.");
        }
        else {
            System.out.println("\nthis battle is a joke to you. You swing your sword with a basic attack.");
        }

        return totaldamage;
    }
}