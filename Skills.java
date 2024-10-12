import java.util.Random;

public class Skills{
    //String [] items = {"Sword", "Shield", "Bow"};
    boolean dualweild = false;
    boolean doublestrike = false;
    boolean triplestrike = false;
    boolean heavystrike = false;
    boolean jumpstrike = false;
    //boolean dragonblood = false;

    public void battleoptions (){
        //return(dualweild, doublestrike, triplestrike, heavystrike, jumpstrike, dragonblood);
        if(dualweild == true){
            System.out.println("\"dual\"weild");
        }
        if( doublestrike == true){
            System.out.println("\"double\"strike");
        }
        if(triplestrike == true){
            System.out.println("\"triple\"strike");
        }
        if(heavystrike == true){
            System.out.println("\"heavy\"strike");
        }
        if(jumpstrike == true){
            System.out.println("\"jump\"strike");
        }
        // if(dragonblood == true){
        //     System.out.println("\"dragon\"'s blood");
        // }
    }

    public void finddualweild(){
        dualweild = true;
        System.out.println("You found the dual wield skill!\n");
    }
    public void finddoublestrike(){
        doublestrike = true;
        System.out.println("You found the double strikes skill!\n");
    }
    public void findtriplestrike(){
        triplestrike = true;
        System.out.println("You found the triple strike skill!\n");
    }
    public void findheavystrike(){
        heavystrike = true;
        System.out.println("You found the heavy strike skill!\n");
    }
    public void findjumpstrike(){
        jumpstrike = true;
        System.out.println("You found the jumpstrike skill!\n");
    }
    // public void finddragonblood(){
    //     dragonblood = true;
    //     System.out.println("You found the dragon's blood skill!");
    // }

    public void pickskill(){
        Random random = new Random();
        int randomInt = random.nextInt(5);
        switch (randomInt){
            case 0 -> {
                finddualweild();
            }
            case 1 -> {
                finddoublestrike();
            }
            case 2 -> {
                findtriplestrike();
            }
            case 3 -> {
                findheavystrike();
            }
            case 4 -> {
                findjumpstrike();
            }
        }
    }
    
}