public class area3 extends map{
    public int [][] floor1 = new int[9][5]; // Y, X
    public int [][] floor2 = new int[9][9]; //
    public int [][] floor3 = new int[9][7]; // 

    /*  
    *area1 child class of abstract class map contains constructer for area1 andd contains methods for intialization of map
    * POS_X AND POS_Y are initialized and constructed in the parent class to initialze the values and set it to 0
    */
    public area3(int POS_X, int POS_Y){
        super(POS_X, POS_Y);
    }
}
