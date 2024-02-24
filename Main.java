

    public class Main {
        
        public static void main (String[] args) {
            int GAMESTATE = 1;

            while (GAMESTATE == 1){
                
                System.out.println("\n ELDEN ROGUE");

                int input = util.readInt("1.Start Game \n2. End Game", 3);
                
                if(input == 1){
                    int creation_state = 1;

                    while(creation_state == 1){
                        util.startGame();
                        util.presstoContinue();
                        creation_state = -1; //ends character creation 
                    }


                    input = -1; //returns to menu by changing input
                }
                else if(input == 2 ){
                
                    System.out.println("byebye");
                    GAMESTATE = 0;
                }


            }
        }   
    }
