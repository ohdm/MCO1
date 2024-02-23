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

    public static void printCharacterdetails(){
        System.out.println("\tCHARACTER CREATION\n\n");
        System.out.println("Character Name:");
        System.out.println("Job Class:");
        System.out.println("Level:");
        System.out.println("Statistics:");
    }

    public static void printSeperator(){
        for(int i = 0; i < 50; i++)
        System.out.println("-");
    }

}