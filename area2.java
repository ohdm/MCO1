public class area2 extends map {
    public int [][] floor1 = new int[7][7]; // Y, X
    public int [][] floor2 = new int[9][5]; //
    public int [][] floor3 = new int[9][7]; // 
    public int [][] floor4 = new int[5][8];
    public int [][] floor5 = new int[10][9];
    
    
    public area2(int POS_X, int POS_Y){
        super(POS_X, POS_Y);
    }

    public void initializefloor1(int [][] floor1){
        floor1[1][3] = 4; //fast travel
        floor1[4][2] = 2; //spawner
        floor1[4][4] = 2;
        floor1[5][3] = 3; //door
   }

    public void initializefloor2(int[][] floor2){
        floor2[1][2] = 3;
        floor2[2][1] = 2;
        floor2[4][1] = 2;
        floor2[6][1] = 2;
        floor2[4][3] = 3;
    }

    public void initializefloor3(int[][] floor3){
        floor3[4][1] = 3;
        floor3[1][3] = 3;
        floor3[4][5] = 3;
        floor3[2][3] = 2;
        floor3[6][3] = 2;
    }

    public void initializefloor4(int[][] floor4){
        floor4[2][1] = 3;
        floor4[1][3] = 2;
        floor4[1][5] = 2;
        floor4[3][3] = 2;
        floor4[3][5] = 2;
    }

    public void initializefloor5(int[][] floor5){
        floor5[5][4] = 5;
        floor5[3][2] = 2;
        floor5[3][4] = 2;
        floor5[3][6] = 2;
        floor5[5][2] = 2;
        floor5[5][6] = 2;
        floor5[7][2] = 2;
        floor5[7][6] = 2;
        floor5[8][4] = 3;
        floor5[1][4] = 4;
    }



    /* 
    public static void startmap3area3(int Y, int X){
    boolean game = true;
    area3.initizalizemap(area3.floor3, 11, 5);
    area3.POS[0] = Y;
    area3.POS[1] = X; //PLAYER POS
    int POS_inp = 0;
    area3.floor3[area3.POS[0]][area3.POS[1]] = 1; //setting player 
        while(game){
            
            clearConsole();
            area3.initizalizemap(area3.floor3, 11, 5); //initialize space
            area3.initializefloor3(area3.floor3); //initialize tiles

            player.playerTILE = area3.floor3[area3.POS[0]][area3.POS[1]]; //get player tile from player POS
            area3.floor3[area3.POS[0]][area3.POS[1]] = area3.tileID[1]; //set to PLAYER tileid

            
            area3.printmap(area3.floor3, 11, 5);
            System.out.println("POSITION   X: " +area3.POS[1]+ " Y: "+area3.POS[0]);
            System.out.println("Current tile:" +area3.tile[player.playerTILE]);

            POS_inp = readInt("1 FORWARD\t3 LEFT\n2 BACKWARD\t4 RIGHT\nINPUT:\t5 INTERACT", 7);

            player.moveYPOS(area3.POS, POS_inp);  

            if(player.playerTILE == 2){
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
            
                area3.checkborder(area3.POS, 10, 4);


            if(POS_inp == 5 && player.playerTILE == 3 ){ //interact
                game = false;
            }
            else if(POS_inp == 5 && player.playerTILE == 4){
                game = false;
                gameloop();
            }
        
        }
   }
    */
}
