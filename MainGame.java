import java.util.Scanner;

public class MainGame {
    public static void main(String[] args){
        Map gameMap = new Map();
        Player player = new Player();
        Skills skillset = new Skills();
        Scanner uin = new Scanner(System.in);
        String fname;
        int explorecounter = 0;
        //int dead = 1;

        System.out.println("What is your name?");
        fname = uin.nextLine();
        //System.out.println("Welcome " + fname + ", the adventurer. You are about to embark on a quest to slay the mithic dragon within the castle. Bravery and courage are required to perform your task. Are you up to the challenge? We will soon find out. You are the \"X\" on the map, the boss is the \"B\".");
        System.out.println("Welcome " + fname + ". You have deicided to embark on a perilous quest to save the princess from the dragon.");
        System.out.println("After months of journeying through the baren sand sea, over the jagged frost mountains, and through the valley");
        System.out.println("of forgotten souls, you have arrived at the dragons castle. You are near the end of your journey, yet the most");
        System.out.println("difficult task still remains, slaying the mythical dragon. Due to such a laborious quest you have merely your");
        System.out.println("sword and tattered clothes. You abandoned your shield and armor long ago. With the danger that still lies ahead,");
        System.out.println("you must explore the castle and claim sufficient skill to face the dragon. Go forth adventurer, the princess awaits!");
        System.out.println();
        gameMap.genMap();
        System.out.println();

        while((gameMap.pmapx != gameMap.bmapx || gameMap.pmapy != gameMap.bmapy) && player.gethealth() > 0){
            
            System.out.println("What would you like to do adventurer?");
            System.out.println("-\"explore\" the room");
            System.out.println("-\"move\" to a different room");
            System.out.println("-Check \"inventory\"");
            System.out.println("-view the \"map\"");
            String choice = uin.nextLine();

            switch (choice) {
                case "explore" -> {
                    if (explorecounter < 2){
                        exploreCall(player, skillset);
                        explorecounter += 1;
                    } else {
                        System.out.println("\nThere is nothing left to explore in this room.\n");
                    }
                    
                    
                    //System.out.println(dead);
                    // if (dead == 0){
                    //     break;
                    // }
                }
                case "move" -> {
                    mapCall(uin, gameMap);
                    explorecounter = 0;
                }
                case "inventory" -> {
                    inventoryCall();
                }
                case "map" -> {
                    System.out.println();
                    gameMap.genMap();
                    System.out.println();
                }
            }

        }

        //Final Boss Battle
        if((gameMap.pmapx == gameMap.bmapx && gameMap.pmapy == gameMap.bmapy)){
            Enemy enemy = new Enemy();
            enemy.boss();
            System.out.println("You have found the " + enemy.getname() + "!");
            enemy.enemydesc();
            Battle newbattle = new Battle();
            newbattle.startBattle(player, enemy, skillset);
            if(player.gethealth() > 0){
                System.out.println("You did it! You have defeated the dragon and saved the princess! Congratulations adventurer, you are the Hero of this world.");
                System.out.println("The End.");
            } else {
                System.out.println("The adventure is over. You were unable to slay the mythical beast. Your body has become a corpse that roams this castle, and your spirit has become a soul wraith.");
                System.out.println("You are now a pawn in the dragons army, a tool to be used against the next adventurer.");
                System.out.println("The End.");
            }
        } else {
            System.out.println("The adventure is over.");
        }


            
    }

    static void mapCall(Scanner uin, Map gameMap){
            String direction;
            String message;
            System.out.println();
            System.out.println("Where would you like to go?");
            System.out.println("-left");
            System.out.println("-right");
            System.out.println("-up");
            System.out.println("-down");
            System.out.println("-\"main\" menu");
            //System.out.println("-view the \"map\"");
            direction = uin.nextLine();

            switch (direction) {
                case "left" -> {
                    message = gameMap.moveLeft();
                    System.out.println(message );
                }
                case "right" -> {
                    message = gameMap.moveRight();
                    System.out.println(message );
                }
                case "up" -> {
                    message = gameMap.moveUp();
                    System.out.println(message );
                }
                case "down" -> {
                    message = gameMap.moveDown();
                    System.out.println(message );
                }
                //case "map" -> gameMap.genMap();
                case "coords" -> {
                    String answer = gameMap.pcoords();
                    System.out.println(answer);
                }
                case "main" -> {

                }
                default -> System.out.println("You must make a choice, adventurer.");
            }
            System.out.println();
    }

    static void exploreCall(Player theplayer, Skills playerskills){
        Explore exploreRoom = new Explore();
        Skills pskills = playerskills;
        int eresult = exploreRoom.genoption();
        Player player = theplayer;
        switch (eresult){
            case 0 -> {
                //return 1;
            }
            case 1 -> {
                pskills.pickskill();
            }
            case 2 -> {
                Enemy enemy = new Enemy();
                enemy.pickenemy();
                System.out.println("This enemy is a " + enemy.getname());
                enemy.enemydesc();
                Battle newbattle = new Battle();
                newbattle.startBattle(player, enemy, pskills);
            } 
        }
    }

    static void inventoryCall(){
        System.out.println("inventory");
    }

}

