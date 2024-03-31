public class area1 extends map {
    
    public int [][] floor1 = new int[9][5]; // Y, X
    public int [][] floor2 = new int[9][9]; //
    public int [][] floor3 = new int[9][7]; // 

    /*  
    *area1 child class of abstract class map contains constructer for area1 andd contains methods for intialization of map
    * POS_X AND POS_Y are initialized and constructed in the parent class to initialze the values and set it to 0
    */
    public area1(int POS_X, int POS_Y){
        super(POS_X, POS_Y);
    }
    
    
    /** 
     * @param floor1
     *  
    *initializefloor1()
    *contains initialization for tiles of floor1
    */
   public void initializefloor1(int [][] floor1){
        floor1[1][2] = 3; //door    YX
        floor1[2][1] = 2; //spawner
        floor1[2][3] = 2;
        floor1[7][2] = 4; //fast travel
   }
    
    /** 
     * @param floor2
     * 
    *initializefloor2()
    *contains initialization for tiles of floor2
    */
   public void initializefloor2(int [][] floor2){
        floor2[2][4]=2;
        floor2[4][1]=2;
        floor2[4][3]=2;
        floor2[4][4]=2;
        floor2[4][5]=2;
        floor2[4][7]=2;
        floor2[6][3]=2;
        floor2[6][5]=2;
        
        floor2[1][4]=3;//doors
        floor2[7][4]=3;//doors
   }

   
   /** 
    * @param floor3
    *  
   *
    *initializefloor3()
    *contains initialization for tiles of floor3
    */
   public void initializefloor3(int [][] floor3){

     floor3[7][3] = 3; //door

     floor3[4][3] = 5; //boss

     floor3[1][3] = 4;//fast travel

   }
    
    

}
