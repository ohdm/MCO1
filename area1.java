public class area1 extends map {
    
    public int [][] floor1 = new int[7][3]; // Y, X
    public int [][] floor2 = new int[7][7]; //
    public int [][] floor3 = new int[7][5]; // 
    //String[] tile = {"SPACE","PLAYER", "SPAWN" ,"DOOR", "FAST TRAVEL", "BOSS"};
    //int  tileID = 0;

    /*  
    *area1 child class of abstract class map
    *contains constructer for area1
    *contains methods for intialization of map 
    */
    
    public area1(int POS_X, int POS_Y){
        super(POS_X, POS_Y);
    }
    
    /*  
    *initializefloor1()
    *contains initialization for tiles of floor1
    */
   public void initializefloor1(int [][] floor1){
        floor1[0][1] = 3; //door    YX
        floor1[1][0] = 2; //spawner
        floor1[1][2] = 2;
        floor1[6][1] = 4; //fast travel
   }
    /*  
    *initializefloor2()
    *contains initialization for tiles of floor2
    */
   public void initializefloor2(int [][] floor2){
        floor2[1][3]=2;
        floor2[3][0]=2;
        floor2[3][2]=2;
        floor2[3][3]=2;
        floor2[3][4]=2;
        floor2[3][6]=2;
        floor2[5][2]=2;
        floor2[5][4]=2;
        
        floor2[0][3]=3;//doors
        floor2[6][3]=3;//doors
   }

   /*  
    *initializefloor3()
    *contains initialization for tiles of floor3
    */
   public void initializefloor3(int [][] floor3){

     floor3[6][2] = 3; //door

     floor3[3][2] = 5; //boss

     floor3[0][2] = 4;//fast travel

   }
    
    

}
