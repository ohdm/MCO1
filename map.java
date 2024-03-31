
    /*  
    *PARENT abstract class map
    *contains methods related to map etc.
    *will contain more codes soon
    */
    
public abstract class map {
    int[] POS = {0, 0};
    String[] tile = {"SPACE","PLAYER", "SPAWN" ,"DOOR", "FAST TRAVEL", "BOSS"};
    int[]  tileID = {0,1,2,3,4,5};

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


    /* 
    public void movePOS(int input, int Y, int X){
    
        if(input == 1){ // forward
            Y--;
        }
        else if(input == 2){ //backward
             Y++;
        }
        else if(input == 3){ //left
             Y--;
        }
        else if(input ==4){ //right
            Y++;
        }
       
    }
*/
}
