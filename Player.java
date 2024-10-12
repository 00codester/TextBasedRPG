public class Player{
    int health = 10;
    int armor = 1;
    int damage = 3;
    int evasion = 1;

    //lets you print out the character stats on the screen
    public void printcharstats() {
        System.out.println("Health: " + health);
        System.out.println("Armor: " + armor);
        System.out.println("Damage: " + damage);
        System.out.println("Evasion: " + evasion);
    }

    //add character health
    public void charaddhealth(int howmuch){
        health += howmuch;
    }

    //takes character health
    public void chartakehealth(int howmuch){
        health -= howmuch;
    }

    //gives character armor
    public void charaddarmor(int howmuch){
        armor += howmuch;
    }

    //adds character damage
    public void charadddamage(int howmuch){
        damage += howmuch;
    }

    //adds evasion
    public void charaddevasion(int howmuch){
        evasion += howmuch;
    }

    //gives an array output of the character stats
    public int[] battlestat (){
        int[] battlechar = {health, armor, damage, evasion};
        return(battlechar);
    }

    //lets you see the health of character
    public int gethealth(){
        return health;
    }

    //lets you see character base damage
    public int getdamage(){
        return damage;
    }
}