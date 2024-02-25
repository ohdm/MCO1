import java.util.Scanner;

public class util {
    static Scanner scanner = new Scanner(System.in);
    static Player player;
   public static boolean isrunning = true;


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

    public static void printCharacterdetails(String name, String job, int job_index){
        
        System.out.println("\tCHARACTER CREATION\n\n");
        System.out.println("Character Name:"+name);
        System.out.println("Job Class:"+job);
        System.out.println("Level: 1");
        int[] arr = assignclassval(job_index);
        System.out.println("\nStatistics:");
        System.out.println("HP:" +arr[0]+ "\tEND:" +arr[3]);
        System.out.println("DEX:" +arr[1]+ "\tSTR:" +arr[4]);
        System.out.println("INT:" +arr[2]+ "\tFTH:" +arr[5]);
        System.out.println("--------------------");
        System.out.println("\n\n1.ENTER NAME");
        System.out.println("2.CHOOSE JOB");
        System.out.println("3.START GAME");
        System.out.println("4.BACK");
    
    }

    public static void printlobbymenu(){ //lobby

        System.out.println("\t\tLOBBY\n\n");
        System.out.println("1.FAST TRAVEL");
        System.out.println("2.LEVEL UP");
        System.out.println("3.INVENTORY");
        System.out.println("4.SHOP");
        System.out.println("5.QUIT GAME");
    }

    //startgame, method for character creation, values here will be passed to player class
    public static void startGame(){
    
        int cinput=-1;
        int state = 1;
        String name = " ";
        int job_index = 1; //base vagabond
        String[] job_class  = {"Debug","Vagabond", "Samurai", "Warrior", "Hero", "Astrologer", "Prophet"};

        while(state==1){
        clearConsole();
        printCharacterdetails(name, job_class[job_index], job_index);
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
            gameloop();
        }

    
    }



     public static void gameloop(){
        while(isrunning){
        printlobbymenu();
        presstoContinue();
        isrunning = false;
        }

    }
    


    public static void printSeperator(){
        for(int i = 0; i < 50; i++)
        System.out.println("-");
    }

    public static int[] assignclassval(int index){
        int arr[] ={0, 0, 0, 0, 0, 0};

        if(index == 1){ //vagabond base
            arr[0] = 15;//hp
            arr[1] = 13;//dex
            arr[2] = 9;//int
            arr[3] = 11;//end
            arr[4] = 14;//str
            arr[5] = 9;//fth
            

            return arr;
        }
        else if(index == 2){//samurai base
            arr[0] = 12;
            arr[1] = 15;
            arr[2] = 9;
            arr[3] = 13;
            arr[4] = 12;
            arr[5] = 8;
            

            return arr;
        }
        else if(index == 3){//warrior base
            arr[0] = 11;
            arr[1] = 16;
            arr[2] = 10;
            arr[3] = 11;
            arr[4] = 10;
            arr[5] = 8;
            

            return arr;
        }
        else if(index == 4){//hero base
            arr[0] = 14;
            arr[1] = 9;
            arr[2] = 7;
            arr[3] = 12;
            arr[4] = 16;
            arr[5] = 8;
            

            return arr;
        }
        else if(index == 5){//astroleger base
            arr[0] = 9;
            arr[1] = 12;
            arr[2] = 16;
            arr[3] = 9;
            arr[4] = 8;
            arr[5] = 7;
            

            return arr;
        }
        else if(index == 6){//prophet base
            arr[0] = 10;
            arr[1] = 10;
            arr[2] = 7;
            arr[3] = 8;
            arr[4] = 11;
            arr[5] = 16;
            

            return arr;
        }
        
        else return arr;
    
    }

}