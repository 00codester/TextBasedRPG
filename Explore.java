import java.util.Random;

public class Explore {
    public int genoption() {
        Random random = new Random();
        int exploreresult;
        int randomInt = random.nextInt(10);
        System.out.println();
        if(randomInt <= 3){
            exploreresult = findNothing();
        } else if (randomInt >3 && randomInt <= 6){
            exploreresult = findItem();
        } else {
            exploreresult = findEnemy();
        }

        return exploreresult;
    }

    static int findNothing(){
        System.out.println("You find nothing in your search\n");
        return 0;
    }

    int findItem(){
        //System.out.println("You found a new skill!\n");
        //int randint = random.nextInt(5)
        // Skills skillset = pskill;
        // skillset.pickskill();
        
        return 1;
    }

    static int findEnemy(){
        System.out.println("You found an Enemy! Fight!\n");
        return 2;
    }
}