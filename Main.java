

    /* MAIN  
    *MCO1 PROTOTYPE SUBMITTED BY:
    *CUBARRUBIAS, DION MEL FUCANAN
    *DEONIO, VINCE ALLEN NATHANIEL
    *MAIN CLASS OF THE PROGRAM
    *THIS IS WHERE THE THE TITLE MENU IS GENERATED AND THE MAIN GAMELOOP IS CALLED
    */
    public class Main {
        
        public static void main (String[] args) {
            boolean GAMESTATE = true;

            while (GAMESTATE == true){
                util.clearConsole();
                System.out.println("\n ELDEN ROGUE");

                int input = util.readInt("1.Start Game \n2.End Game", 2);
                
                if(input == 1){
                    boolean creation_state = true;
                    while(creation_state == true){
                        util.startGame();
                        creation_state = false; //ends character creation 
                    }


                    input = -1; //returns to menu by changing input
                }
                else if(input == 2 ){
                
                    System.out.println("byebye");
                    GAMESTATE = false;
                }


            }
        }   
    }
