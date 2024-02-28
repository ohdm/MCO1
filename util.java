import java.util.Scanner;

public class util {
    static Scanner scanner = new Scanner(System.in);
    static Player player;
    public static boolean isrunning = true;
    static area1 area1;


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
        System.out.println("STATS:");
        System.out.println("NAME:" +player.name+ "  CLASS:" +player.class_name);
        System.out.println("LEVEL " +player.cLVL+ "\nHP:" +player.cHP+ "\tEND:" +player.cEND);
        System.out.println("DEX:" +player.cDEX+ "\tSTR:" +player.cSTR);
        System.out.println("INT:" +player.cINT+ "\tFTH:" +player.cFTH);
        System.out.println("--------------------");

        System.out.println("\n\n1.FAST TRAVEL");
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
        String[] job_class  = {"DEBUG","Vagabond", "Samurai", "Warrior", "Hero", "Astrologer", "Prophet"};

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
            player = new Player(name, job_index); //calling the player object
            gameloop();
        }

    
    }



     public static void gameloop(){ //main game loop
        while(isrunning){ //boolean, is running default set to true
        int input=0;
        clearConsole();
        printlobbymenu();
        
        input = readInt("->",  6);

        if(input == 1){

            clearConsole();

            area1 = new area1(0,0);
            startarea1();
            presstoContinue();

            /* 
            clearConsole();

            System.out.println("1.Stormvel Castle \n2.WIP \n3.WIP");
            finput = readInt("Where to fast travel to?", 4);

            if(finput == 1){
            area1 = new area1();
            }
            else
            System.out.println("WIP");
            presstoContinue();
            */
        }
        else if(input == 2){
        
        }
        else if(input == 3){
        System.out.println("INVENTORY UNIMPLEMENTED");
        }
        else if(input == 4){
            System.out.println("SHOP UNIMPLEMENTED");
        }
        else if (input == 5){
            isrunning = false;
        }
        //player.move();
        
        }

    }
    

    public static int[] assignclassval(int index){
        int arr[] = new int[6];

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







    public static void startarea1(){ //main loop for area1 experimental

        boolean game = true;
        area1.initizalizemap(area1.floor1, 7, 3);
        area1.POS_Y = 6;
        area1.POS_X = 1; //PLAYER POS
        int POS_inp = 0;
        area1.floor1[area1.POS_Y][area1.POS_X] = 1; //setting player POS

        while(game){
            clearConsole();
            area1.initizalizemap(area1.floor1, 7, 3);
            area1.floor1[area1.POS_Y][area1.POS_X] = 1;
            area1.printmap(area1.floor1, 7, 3);
            System.out.println("POSITION " +area1.POS_X+ ""+area1.POS_Y);
            POS_inp = readInt("\nINPUT", 6);

                    //temporarily here for readability
                if(POS_inp == 1){ // forward
                    area1.POS_Y--;
                }
                else if(POS_inp == 2){ //backward
                    area1.POS_Y++;
                }
                else if(POS_inp == 3){ //left
                    area1.POS_X--;
                }
                else if(POS_inp ==4){ //right
                    area1.POS_X++;
                 }   

            if(POS_inp == 5){
                game = false;
            }
            
            //movePOS(POS_inp, area1.POS_Y, area1.POS_X);
            System.out.println(area1.POS_Y);
            presstoContinue();
        }
   }
  


    
}