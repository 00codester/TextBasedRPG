public class Map{

    public int pmapx = 0;
    public int pmapy = 0;
    

    public int bmapx = 1;
    public int bmapy = 4;

    public String room = "[ ]";
    public String wall = "   ";
    public String player = "[X]";
    public String boss = "[B]";

    String [][] maplevel = {{room, room, room}, {wall, room, wall}, {room, room, room}, {wall, room, wall}, {wall, room, wall}};

    public static void main(String[] args) {

    }

    public void genMap (){

        maplevel[pmapy][pmapx] = player;
        maplevel[bmapy][bmapx] = boss;

        for(int i = 0; i < maplevel.length; ++i){
            for(int j = 0; j < maplevel[i].length; j++){
                System.out.print(maplevel[i][j]);
            }
            System.out.println();
        }
    }

    public String moveLeft (){
        maplevel[pmapy][pmapx] = room;
        try{
            if (maplevel[pmapy][pmapx - 1].equals(wall)){
                throw new Exception("wall");
            }
            String player = maplevel[pmapy][pmapx - 1];
            pmapx -=1;
            return "\nYou moved Left a room.";
        }
        catch (Exception e){
            return "Why must you bash your head into a wall adventurer?";
        }
    }

    public String moveRight () {
        maplevel[pmapy][pmapx] = room;
        try{
            if (maplevel[pmapy][pmapx + 1].equals(wall)){
                throw new Exception("wall");
            }
            String player = maplevel[pmapy][pmapx + 1];
            pmapx +=1;
            return "\nYou moved Right a room.";
        }
        catch (Exception e){
            return "\nWhy must you bash your head into a wall adventurer?";
        }
    }

    public String moveDown () {
        maplevel[pmapy][pmapx] = room;
        try{
            if (maplevel[pmapy + 1][pmapx].equals(wall)){
                throw new Exception("wall");
            }
            String player = maplevel[pmapy + 1][pmapx];
            pmapy +=1;
            return "\nYou moved Down a room.";
        }
        catch (Exception e){
            return "\nWhy must you bash your head into a wall adventurer?";
        }
    }

    public String moveUp () {
        maplevel[pmapy][pmapx] = room;
        try{
            if (maplevel[pmapy - 1][pmapx].equals(wall)){
                throw new Exception("wall");
            }
            String player = maplevel[pmapy - 1][pmapx];
            pmapy -=1;
            return "\nYou moved Up a room.";
        }
        catch (Exception e){
            return "Why must you bash your head into a wall adventurer?";
        }
    }

    public String pcoords(){
        String x = Integer.toString(pmapx);
        String y = Integer.toString(pmapy);
        return (x + ", " + y);
    }
}

