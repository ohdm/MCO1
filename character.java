public abstract class Character {

    public String name;
    public int job_class;

    public int cHP;
    public int cEND;
    public int cDEX;
    public int cSTR;
    public int cINT;
    public int cFTH;
    public int cXP;
    public int cRUNE;
  


//constructer
public Character(String name,int index){
    int arr[] = {0,0,0,0,0,0};
    this.name = name;
    this.job_class = index;
    this.cXP = 0;
    arr=util.assignclassval(index);
    this.cHP = arr[0];
    this.cDEX = arr[1];
    this.cINT = arr[2];
    this.cEND = arr[3];
    this.cSTR = arr[4];
    this.cFTH = arr[5];
    this.cRUNE = 0;
    
    
    //int index, int health, int dexterity, int endurance, int strength, int intelligence, int faith, int RUNE
}


}