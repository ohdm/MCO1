public class area3 extends map{
    public int [][] floor1 = new int[11][5]; // Y, X
    public int [][] floor2 = new int[9][9]; //
    public int [][] floor3 = new int[11][5]; // 

    /*  
    *area1 child class of abstract class map contains constructer for area1 andd contains methods for intialization of map
    * POS_X AND POS_Y are initialized and constructed in the parent class to initialze the values and set it to 0
    */
    public area3(int POS_X, int POS_Y){
        super(POS_X, POS_Y);
    }
    public void initializefloor1(int [][] floor1){
        floor1[1][2] = 3; //fast travel
        floor1[5][2] = 2; //spawner
        floor1[9][2] = 3; //door
   }

    public void initializefloor2(int[][] floor2){
        floor2[1][4] = 3;
        floor2[4][4] = 5;
        floor2[7][4] = 4;
       
    }

    public void initializefloor3(int[][] floor3){
        floor3[1][2] = 6;

        floor3[2][1] = 2;
        floor3[4][1] = 2;
        floor3[6][1] = 2;
        floor3[8][1] = 2;

        floor3[2][3] = 2;
        floor3[4][3] = 2;
        floor3[6][3] = 2;
        floor3[8][3] = 2;
        
        floor3[9][2] = 3;
    }

}
