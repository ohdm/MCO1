public class player extends character{

    public String[] job_class = {"Vagabond, Samurai, Warrior, Hero, Astrologer, Prophet"};
    int job_index =-1;

    //player constructor
    public Player(String name){
        super(name);
        //constructor
        this.job_index = 0;
        chooseClass();
    }

    public void chooseClass(){
        util.clearConsole();
        System.out.println("Choose class:");
        System.out.println("\n1.Vagabond\n2.Samurai\n3.Warrior\n4.Hero\n5.Astrologer\n6.Prophet\n");
        int input = util.readInt("->", 2);  
        util.clearConsole();

        System.out.println("You chose"+job_class[input]);
        job_index = input;

        util.presstoContinue();
    }

    

    //player specific methods
   
    public int move(){

        return 0;
    } //move method

   
    public int char_inp(){

        return 0;
    } //inputs of character

}