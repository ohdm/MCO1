public abstract class map {
    int POS_X;
    int POS_Y;
    String[] Tiles = {"Player","Spawn", "Boss", "Door", "Fast Travel"};

    public map(int X, int Y){   
        X = 0;
        Y = 0;
    }


    void initizalizemap(int MAP[][], int Y, int X){

        for(int i = 0; i < Y; i++){
            for(int j = 0; j < X; j++){
                MAP[i][j] = 0;
                
            }
        }
    }
    
    public void printmap(int MAP[][], int Y, int X){

        for(int i = 0; i < Y; i++){
            for(int j = 0; j < X; j++){
                
                System.out.print(MAP[i][j]);
            }
            System.out.println();
        }
    
          
    }

    void checkTile(){

    }

    void fastTravel(){

    }

    void bossTile(){

    }

    void doorTile(){

    }


    /*public void movePOS(int input, int Y, int X){
    
        if(input == 1){ // forward
             Y--;
        }
        else if(input == 2){ //backward
             Y++;
        }
        else if(input == 3){ //left
             Y--;
        }
        else if(input ==4){ //right
            Y++;
        }
       
    }*/

}
