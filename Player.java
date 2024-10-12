public class Player{
    int health = 10;
    int armor = 1;
    int damage = 3;
    int evasion = 1;

    public void printcharstats() {
        System.out.println("Health: " + health);
        System.out.println("Armor: " + armor);
        System.out.println("Damage: " + damage);
        System.out.println("Evasion: " + evasion);
    }
    public void charaddhealth(int howmuch){
        health += howmuch;
    }
    public void chartakehealth(int howmuch){
        health -= howmuch;
    }
    public void charaddarmor(int howmuch){
        armor += howmuch;
    }
    public void charadddamage(int howmuch){
        damage += howmuch;
    }
    public void charaddevasion(int howmuch){
        evasion += howmuch;
    }
    public int[] battlestat (){
        int[] battlechar = {health, armor, damage, evasion};
        return(battlechar);
    }
    public int gethealth(){
        return health;
    }
    public int getdamage(){
        return damage;
    }
}