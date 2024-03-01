import java.util.Scanner;
import java.util.Random;

    /*  
    *UTIL CLASS OF THE PROGRAM
    *CONTAINS THE MAIN GAME LOOP, AND IS WHERE PLAYER AND MAP OBJECTS WILL BE CALLED 
    *CONTAINS VARIOUS HELPER METHODS
    */

public class util {
    static Scanner scanner = new Scanner(System.in);
    static Player player;
    public static boolean isrunning = true;
    static area1 area1;
    static Random random = new Random();

    /*  
    *readInt()
    *reads integers, also prevents other inputs aside from integers using the try catch function
    */
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
    /*  
    *LEVELUP()
    *This method calculates LEVELUP cost, and modifies player values for stat level ups
    */
    public static void LEVELUP (){
        boolean state= true;
        while(state){
            clearConsole();
            int cinput;
            int cost = (player.cLVL*100)/2;
            System.out.println("LEVEL UP\n");
            System.out.println("RUNES:"+player.cRUNE+"\n1. HP\n2. DEX\n3. INT \n4. END\n5. STR\n6. FTH\n\n7. EXIT");
            System.out.println("LEVEL UP COST =" +cost);
            cinput = readInt("->", 8);
            
            if(cinput == 1 && player.cRUNE >= cost){
                player.cHP+=1;
                player.cRUNE= player.cRUNE - cost;
                player.cLVL+=1;
            }
            else if(cinput == 2 && player.cRUNE >= cost){
                player.cDEX+=1;
                player.cRUNE= player.cRUNE - cost;
                player.cLVL+=1;
            }
            else if(cinput == 3 && player.cRUNE >= cost){
                player.cINT+=1;
                player.cRUNE= player.cRUNE - cost;
                player.cLVL+=1;
            }
            else if(cinput == 4 && player.cRUNE >= cost){
                player.cEND+=1;
                player.cRUNE= player.cRUNE - cost;
                player.cLVL+=1;
            }
            else if(cinput == 5 && player.cRUNE >= cost){
                player.cSTR+=1;
                player.cRUNE= player.cRUNE - cost;
                player.cLVL+=1;
            }
            else if(cinput == 6 && player.cRUNE >= cost){
                player.cFTH=1;
                player.cRUNE= player.cRUNE - cost;
                player.cLVL+=1;
            }
            else if(cinput == 7){
                state = false;
            }
            else{
            System.out.println("Not Enough Runes");
            presstoContinue();
            }
        }
    }
    /*  
    *clearConsole()
    *This method clears console by printing many spaces
    */
    public static void clearConsole(){
       for(int i=0; i < 100; i++)
       System.out.println();//prints blank spaces 

    }

    /*  
    *presstoContinue()
    *allows for gaps, and to allow reading
    */

    public static void presstoContinue(){
        System.out.println("Press to continue...");
        scanner.next();
    }

    /*  
    *printCharacterdetails()
    *This method prints character details for character creation
    */
    public static void printCharacterdetails(String name, String job, int job_index){
        
        System.out.println("\tCHARACTER CREATION\n\n");
        System.out.println("Character Name:"+name);
        System.out.println("\nJob Class:"+job);
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
    /*  
    *printlobbymenu()
    *Prints the lobby menu choices, andd character stats
    */
    public static void printlobbymenu(){ //lobby

        System.out.println("\t\tLOBBY\n\n");
        System.out.println("STATS:");
        System.out.println("NAME:" +player.name+ "\nCLASS:" +player.class_name);
        System.out.println("LEVEL " +player.cLVL+ "\nHP:" +player.cHP+ "\tEND:" +player.cEND);
        System.out.println("DEX:" +player.cDEX+ "\tSTR:" +player.cSTR);
        System.out.println("INT:" +player.cINT+ "\tFTH:" +player.cFTH);
        System.out.println("RUNE: " +player.cRUNE);
        System.out.println("--------------------");

        System.out.println("\n\n1.FAST TRAVEL");
        System.out.println("2.LEVEL UP");
        System.out.println("3.INVENTORY");
        System.out.println("4.SHOP");
        System.out.println("5.QUIT GAME");
    }

    /*  
    *startGame()
    *Starts the game loop, calls player object, contains character creation
    */

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
            job_index = readInt("->", 6);
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
            isrunning = true;
        }

    
    }


    /*  
    *gameloop()
    *this method is the gameloop itself
    *this method contains fast travel, level up, etc.
    */
     public static void gameloop(){ //main game loop
        while(isrunning){ //boolean, is running default set to true
        int input=0;
        clearConsole();
        printlobbymenu();
        
        input = readInt("->",  6);

        if(input == 1){

            clearConsole();
            System.out.println("1.Stormveil Castle \n2.WIP \n3.WIP");
            int finput = readInt("Where to fast travel to?", 4);

            if(finput == 1){
            area1 = new area1(0,0);
            startarea1(6,1); 
            clearConsole();
            }
            else
            System.out.println("WIP");
            presstoContinue();
        }
        else if(input == 2){
            LEVELUP();
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
        
        }

    }
    
    /*  
    *assignclassval()
    *stores base stats for jobs
    *assigns stats to player object
    */
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


    /*  
    *startarea1()
    *contains the loop for area1, and the object for area1
    *contains many methods of the area class and player class, such as map initialization and tile initialization etc.
    */

    public static void startarea1(int Y, int X){ //main loop for area1 experimental

        boolean game = true;
        area1.initizalizemap(area1.floor1, 7, 3);
        area1.initializefloor1(area1.floor1);
        area1.POS_Y = Y;
        area1.POS_X = X; //PLAYER POS Y X
        int POS_inp = 0;
        area1.floor1[area1.POS_Y][area1.POS_X] = 1; //setting player POS

        while(game){
            try{
            clearConsole();
            area1.initizalizemap(area1.floor1, 7, 3); //initialize space
            area1.initializefloor1(area1.floor1); //initialize tiles

            player.playerTILE = area1.floor1[area1.POS_Y][area1.POS_X]; //get player tile from player POS
            area1.floor1[area1.POS_Y][area1.POS_X] = area1.tileID[1]; //set to PLAYER tileid

            area1.printmap(area1.floor1, 7, 3);
            
            System.out.println("POSITION   X: " +area1.POS_X+ " Y: "+area1.POS_Y);
            System.out.println("Current tile:" +area1.tile[player.playerTILE]);

            POS_inp = readInt("1 FORWARD\t3 LEFT\n2 BACKWARD\t4 RIGHT\nINPUT:\t5 INTERACT", 7);

                    //temporary fix hehe
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


                if(player.playerTILE == 2){
                    //  area1.removeTILE(area1.floor1, area1.POS_Y, area1.POS_X);
                int encounter = 0;
                int add = 0;
                encounter = random.nextInt(4)+1;
                if(encounter == 1){
                    add = random.nextInt(100)+50;
                    player.cRUNE = player.cRUNE + add;
                    System.out.println("YOU GAINED" +add+ "RUNES!");
                    presstoContinue();
                }
                else if (encounter > 1){
                    System.out.println(" YOU ENCOUNTERED AN ENEMY!");
                    presstoContinue();
                }
      
                }
            
 
            if(POS_inp == 5 && player.playerTILE == 3){ //interact
                game = false;
            }
            else if(POS_inp == 5 && player.playerTILE == 4){
                game = false;
                gameloop();
            }
              
        }catch (Exception e){
            area1.POS_Y = Y;
            area1.POS_X = X;
        }
                
           // player.movePOS(POS_inp, area1.POS_Y, area1.POS_X); will fix in MCO2

            

        }
        if(player.playerTILE == 3)
        startarea2(6,3); //starting pos Y, X

   }
  
   /*  
    *startarea2()
    *contains the loop for area1 floor2
    */
    public static void startarea2(int Y, int X){
        boolean game = true;
        area1.initizalizemap(area1.floor2, 7, 7);
        area1.POS_Y = Y;
        area1.POS_X = X; //PLAYER POS
        int POS_inp = 0;
        area1.floor2[area1.POS_Y][area1.POS_X] = 1; //setting player 
        
        while(game){
            try{
            clearConsole();
            area1.initizalizemap(area1.floor2, 7, 7); //initialize space
            area1.initializefloor2(area1.floor2); //initialize tiles

            

            player.playerTILE = area1.floor2[area1.POS_Y][area1.POS_X]; //get player tile from player POS
            area1.floor2[area1.POS_Y][area1.POS_X] = area1.tileID[1]; //set to PLAYER tileid

            area1.printmap(area1.floor2, 7, 7);

            System.out.println("POSITION   X: " +area1.POS_X+ " Y: "+area1.POS_Y);
            System.out.println("Current tile:" +area1.tile[player.playerTILE]);

            POS_inp = readInt("1 FORWARD\t3 LEFT\n2 BACKWARD\t4 RIGHT\nINPUT:\t5 INTERACT", 7);

                    //temporary fix hehe
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

                if(player.playerTILE == 2){
                    //  area1.removeTILE(area1.floor1, area1.POS_Y, area1.POS_X);
                int encounter = 0;
                int add = 0;
                encounter = random.nextInt(4)+1;
                if(encounter == 1){
                    add = random.nextInt(100)+50;
                    player.cRUNE = player.cRUNE + add;
                    System.out.println("YOU GAINED" +add+ "RUNES!");
                    presstoContinue();
                }
                else if (encounter > 1){
                    System.out.println(" YOU ENCOUNTERED AN ENEMY!");
                    presstoContinue();
                    }
      
                  }    


            if(POS_inp == 5 && player.playerTILE == 3){ //interact
                game = false;
            }
            else if(POS_inp == 5 && player.playerTILE == 4){
                game = false;
                gameloop();
            }
            
        }catch (Exception e){
            area1.POS_Y = Y;
            area1.POS_X = X;
        }    
           // player.movePOS(POS_inp, area1.POS_Y, area1.POS_X); will fix in MCO2

        
        }
        if(player.playerTILE == 3 && area1.floor2[0][3] == 1)
        startarea3();
        else if(player.playerTILE == 3 && area1.floor2[6][3] == 1)
        startarea1(0,1);
   }

   /*  
    *startarea3()
    *contains the loop for area1 floor3
    */
   public static void startarea3(){
    boolean game = true;
    area1.initizalizemap(area1.floor3, 7, 5);
    area1.POS_Y = 6;
    area1.POS_X = 2; //PLAYER POS
    int POS_inp = 0;
    area1.floor3[area1.POS_Y][area1.POS_X] = 1; //setting player 
        while(game){
            try{
            clearConsole();
            area1.initizalizemap(area1.floor3, 7, 5); //initialize space
            area1.initializefloor3(area1.floor3); //initialize tiles

            player.playerTILE = area1.floor3[area1.POS_Y][area1.POS_X]; //get player tile from player POS
            area1.floor3[area1.POS_Y][area1.POS_X] = area1.tileID[1]; //set to PLAYER tileid

            
            area1.printmap(area1.floor3, 7, 5);
            System.out.println("POSITION   X: " +area1.POS_X+ " Y: "+area1.POS_Y);
            System.out.println("Current tile:" +area1.tile[player.playerTILE]);

            POS_inp = readInt("1 FORWARD\t3 LEFT\n2 BACKWARD\t4 RIGHT\nINPUT:\t5 INTERACT", 7);

                    //temporary fix hehe
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

            if(player.playerTILE == 2){
                //  area1.removeTILE(area1.floor1, area1.POS_Y, area1.POS_X);
                int encounter = 0;
                int add = 0;
                encounter = random.nextInt(4)+1;
                if(encounter == 1){
                    add = random.nextInt(100)+50;
                    player.cRUNE = player.cRUNE + add;
                    System.out.println("YOU GAINED" +add+ "RUNES!");
                    presstoContinue();
                }
                else if (encounter > 1){
                    System.out.println(" YOU ENCOUNTERED AN ENEMY!");
                    presstoContinue();
                }
      
                }
            
            if(player.playerTILE == 5){
                clearConsole();
                System.out.println("BOSS ENCOUNTERED!");
                presstoContinue();
            }

            if(POS_inp == 5 && player.playerTILE == 3 ){ //interact
                game = false;
            }
            else if(POS_inp == 5 && player.playerTILE == 4){
                game = false;
                gameloop();
            }
        }catch (Exception e){
            area1.POS_Y = 6;
            area1.POS_X = 2;
        }
        }
        if(player.playerTILE == 3 && area1.floor3[6][2] == 1)
        startarea2(0,3);
   }

    
}