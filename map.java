
    /*  
    *PARENT abstract class map
    *contains methods related to map etc.
    *will contain more codes soon
    */
    import java.util.Random;

public abstract class map {
  public int[] POS = {0, 0};
  public String[] tile = {"SPACE","PLAYER", "SPAWN" ,"DOOR", "FAST TRAVEL", "BOSS"};
  public int[]  tileID = {0,1,2,3,4,5};
  public int area1boss_state = 1;
  public int area2boss_state = 1;

    public map(int X, int Y){   
        X = 0;
        Y = 0;
    }
    

    
    /** 
     * @param MAP[][] 2d arrays that stores MAP info
     * @param Y contains Y VALUE
     * @param X contains X value
     */
    void initizalizemap(int MAP[][], int Y, int X){

        for(int i = 0; i < Y; i++){
            for(int j = 0; j < X; j++){
                MAP[i][j] = 0; //change to tileID[0] basically setting it to all to SPACE
                
            }
        }
    }
    
    
    public void printmap(int MAP[][], int Y, int X){

        for(int i = 0; i < Y; i++){
            for(int j = 0; j < X; j++){
                
                System.out.print(MAP[i][j]);
            }
            System.out.println();
        }
    
          
    }


    void fastTravel(){

    }

    int[] checkborder(int[] POS, int Y, int  X){
        if(POS[0] == Y){
            POS[0]--;
        }
        else if(POS[1] == X){
            POS[1]--;
        }
        else if(POS[1] == 0){
            POS[1]++;
        }
        else if(POS[0] == 0){
            POS[0]++;
        }
        return POS;
    }

    void doorTile(){

    }

    public void assignPLAYERTILE(int playerpos[] ,int Y , int  X){
        playerpos[0] = Y;
        playerpos[1] = X;
    }

    public void removeTILE(int MAP[][],int Y,int X){
        MAP[Y][X] = 0;
    }

    public int encounter(){
        int this1 = 0;
        return this1;
    }


}
