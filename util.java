import java.util.Scanner;

public class util {
    static Scanner scanner = new Scanner(System.in);
    static Player player;
   // public static boolean running;


    //method for basic int inputs w/ prompts
    public static int readInt(String prompt, int userChoices){  
        int input;

        do{
            System.out.println(prompt);
            try {
            input = Integer.parseInt(scanner.next());

            }catch  (Exception e){
                input = -1;
                System.out.println("Please enter an integer!");
            }

        }while(input < 1 || input > userChoices);
        return input;
    }



    public static int readINPBASE(int userChoices){  
        int input;

        do{
            try {
            input = Integer.parseInt(scanner.next());

            }catch  (Exception e){
                input = -1;
                System.out.println("Please enter an integer!");
            }

        }while(input < 1 || input > userChoices);
        return input;
    }



    public static void clearConsole(){
       for(int i=0; i < 100; i++)
       System.out.println();//prints blank spaces 

    }

    public static void presstoContinue(){
        System.out.println("Press to continue...");
        scanner.next();
    }

    public static String getString(String input, String stringname){
        stringname = input;
        return stringname;
    }

    public static void printCharacterdetails(String name, String job){
        System.out.println("\tCHARACTER CREATION\n\n");
        System.out.println("Character Name:"+name);
        System.out.println("Job Class:"+job);
        System.out.println("Level: 1");
        System.out.println("Statistics:");
        System.out.println("--------------------");
        System.out.println("\n\n1.ENTER NAME");
        System.out.println("2.CHOOSE JOB");
        System.out.println("3.START GAME");
        System.out.println("4.BACK");
    
    }

    //startgame, method for character creation, values here will be passed to player class
    public static void startGame(){
    
        int cinput=-1;
        int state = 1;
        String name = " ";
        int job_index = 0; //base vagabond
        String[] job_class  = {"Debug","Vagabond", "Samurai", "Warrior", "Hero", "Astrologer", "Prophet"};

        while(state==1){
        clearConsole();
        printCharacterdetails(name, job_class[job_index]);
        cinput = readInt("->", 4);

        if(cinput == 1){
            System.out.println("INPUT NAME:");
            name = scanner.next();
            cinput = -1;
        }
        else if (cinput == 2){ //pick a job, basejob is Vagabond 
            System.out.println("Pick a job");
            System.out.println("\n1.Vagabond\n2.Samurai\n3.Warrior\n4.Hero\n5.Astrologer\n6.Prophet\n");
            job_index = readInt("->", 7);
            cinput =-1;
        }
        else if (cinput == 3){

            if(name == " "){ //if name is empty
                System.out.println("PLEASE INPUT A NAME BEFORE STARTING THE GAME");
                presstoContinue();
                cinput = -1;
            }

            else{ //if name is not empty
            state = 0;
            }

         }
        else if (cinput == 4){
            state = 0;
        }

        } //end of while loop 

        //start of gameloop

        if(cinput == 3){
            clearConsole();
            player = new Player(name, job_index);
            System.out.println(player.cHP);
            presstoContinue();
            //gameloop();
        }

    
    }



   /*  public static void gameloop(){
        while(running){

        }

    };
    */

    public static void printSeperator(){
        for(int i = 0; i < 50; i++)
        System.out.println("-");
    }

    public static int[] assignclassval(int index){
        int arr[] ={0, 0, 0, 0, 0, 0};

        if(index == 1){
            arr[0] = 12;
            arr[1] = 10;
            arr[2] = 10;
            arr[3] = 10;
            arr[4] = 10;
            arr[5] = 10;
            

            return arr;
        }
        else return arr;
    
    }

}