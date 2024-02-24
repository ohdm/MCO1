import java.util.Scanner;

public class util {
    static Scanner scanner = new Scanner(System.in);
    

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

    public static void printCharacterdetails(String name){
        System.out.println("\tCHARACTER CREATION\n\n");
        System.out.println("Character Name:"+name);
        System.out.println("Job Class:");
        System.out.println("Level:");
        System.out.println("Statistics:");
        System.out.println("--------------------");
        System.out.println("\n\n1.ENTER NAME");
        System.out.println("2.CHOOSE JOB");
        System.out.println("3.BACK");
    
    }

    //startgame, method for character creation, values here will be passed to player class
    public static void startGame(){
    
        int cinput=-1;
        int state = 1;
        String name = " ";

        while(state==1){
        clearConsole();
        printCharacterdetails(name);
        cinput = readInt("->", 3);

        if(cinput == 1){
            name = scanner.next();
            cinput = -1;
        }
        else if (cinput == 2){
            System.out.println("Pick a job");
        }
        else if (cinput == 3){
            state = 0;
        }

        }

      //  System.out.println("Please enter a name");
      //  name= scanner.next();
    }



    public static void gameloop(){


    };


    public static void printSeperator(){
        for(int i = 0; i < 50; i++)
        System.out.println("-");
    }

}