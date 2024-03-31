public class Player extends Character{

    String[] item_name = {"Debug",
    "Short Sword", "Rogier's Rapier", "Coded Sword", "Sword of Night and Flame", //swords ID 1-4
    "Uchigatana","Moonveil", "Rivers of Blood", "Hand of Malenia", //katanas ID 5-8
    "Whip", "Urumi", "Throned Whip", "Hoslow's Petal Whip", //whips ID 9-12
    "Claymore", "Starscourge Greatsword", "Inseperable Sword", "Maliketh's Black Blade", //greatswords ID 13-16
    "Astrologer's Staff", "Albinauric Staff", "Staff of the Guilty", "Carian Regal Scepter", //Staves ID 17-20
    "Finger Seal", "Godslayer's Seal", "Golden Order Seal", "Dragon Communion Seal"}; //seals ID 21-24
    
    String[][] wpn_name = {{"DEBUG", "DEBUG", "DEBUG", "DEBUG", "DEBUG"}, 
    {"DEBUG", "Short Sword", "Rogier's Rapier", "Coded Sword", "Sword of Night and Flame"},
    {"DEBUG", "Uchigatana","Moonveil", "Rivers of Blood", "Hand of Malenia"},
    {"DEBUG", "Whip", "Urumi", "Throned Whip", "Hoslow's Petal Whip"},
    {"DEBUG", "Claymore", "Starscourge Greatsword ", "Inseperable Sword", "Maliketh's Black Blade"},
    {"DEBUG", "Astrologer's Staff", "Albinauric Staff", "Staff of the Guilty", "Carian Regal Scepter"},
    {"DEBUG", "Finger Seal", "Godslayer's Seal", "Golden Order Seal", "Dragon Communion Seal"}};

    int[] eqpstate = new int[25]; //will store item ID state 1, 0;
    int[][] boughtstate = new int[8][8];

    int[] weaponstat = new int[7];

    

    //player constructor
    public Player(String name, int index){
        super(name,index);   
    
    }

    
    /*  
    *PLAYER, CHILD CLASS OF CHARACTER
    *contains constructer for player
    *WILL CONTAIN MORE CODES FOR MCO2 
    */

    //player specific methods

   // public int checkequipped();

    public int[] moveYPOS(int[] POS, int input){
    
        if(input == 1){ // forward
            POS[0]--;
        }
        else if(input == 2){ //backward
            POS[0]++;
        }
        else if(input == 3){ //left
             POS[1]--;
        }
        else if(input == 4){ //right
            POS[1]++;
        }
    
        return POS;
    }
    public void resetweaponstat(int[] weapon){
        weapon[0] = 0;
        weapon[1] = 0;
        weapon[2] = 0;
        weapon[3] = 0;
        weapon[4] = 0;
        weapon[5] = 0;
    }

    public void initializestate(int[][] state){
        for(int i = 0; i<7; i++){
            for(int j = 0; j<7; j++){
                state[i][j] = 0;
            }
        }
    }

    public void weaponstat( int cinput, int input, int[] weapon){
        if(cinput == 1){//swords
            if(input == 1){//short sword
                weapon[0] = 0;
                weapon[1] = 0;
                weapon[2] = 15;
                weapon[3] = 15;
                weapon[4] = 15;
                weapon[5] = 15;
                weapon[6] = 1000;
            }
            else if(input == 2){ //rogiers rapier
                weapon[0] = 10;
                weapon[1] = 0;
                weapon[2] = 35;
                weapon[3] = 25;
                weapon[4] = 35;
                weapon[5] = 35;
                weapon[6] = 2000;
            }
            else if(input == 3){
                weapon[0] = 20;
                weapon[1] = 0;
                weapon[2] = 40;
                weapon[3] = 35;
                weapon[4] = 40;
                weapon[5] = 40;
                weapon[6] = 4000;
            }
            else if(input == 4){
                weapon[0] = 30;
                weapon[1] = 0;
                weapon[2] = 55;
                weapon[3] = 45;
                weapon[4] = 55;
                weapon[5] = 55;
                weapon[6] = 8000;
            }
        }
        else if(cinput == 2){//katanas
            if(input == 1){
                weapon[0] = 20;
                weapon[1] = 0;
                weapon[2] = 0;
                weapon[3] = 35;
                weapon[4] = 30;
                weapon[5] = 0;
                weapon[6] = 1875;
            }
            else if(input == 2){
                weapon[0] = 30;
                weapon[1] = 0;
                weapon[2] = 0;
                weapon[3] = 40;
                weapon[4] = 45;
                weapon[5] = 0;
                weapon[6] = 3750;
            }
            else if(input == 3){
                weapon[0] = 40;
                weapon[1] = 0;
                weapon[2] = 0;
                weapon[3] = 45;
                weapon[4] = 60;
                weapon[5] = 0;
                weapon[6] = 7500;
            }
            else if(input == 4){
                weapon[0] = 50;
                weapon[1] = 0;
                weapon[2] = 0;
                weapon[3] = 50;
                weapon[4] = 75;
                weapon[5] = 0;
                weapon[6] = 15000;
            }
        }
        else if(cinput == 3){//whips
            if(input == 1){
                weapon[0] = 15;
                weapon[1] = 0;
                weapon[2] = 0;
                weapon[3] = 60;
                weapon[4] = 20;
                weapon[5] = 0;
                weapon[6] = 1500;
            }
            else if(input == 2){
                weapon[0] = 20;
                weapon[1] = 0;
                weapon[2] = 10;
                weapon[3] = 70;
                weapon[4] = 40;
                weapon[5] = 0;
                weapon[6] = 3000;
            }
            else if(input == 3){
                weapon[0] = 30;
                weapon[1] = 0;
                weapon[2] = 0;
                weapon[3] = 80;
                weapon[4] = 50;
                weapon[5] = 40;
                weapon[6] = 5000;
            }
            else if(input == 4){
                weapon[0] = 35;
                weapon[1] = 0;
                weapon[2] = 20;
                weapon[3] = 90;
                weapon[4] = 55;
                weapon[5] = 20;
                weapon[6] = 10000;
            }
        }
        else if(cinput == 4){//greatsword
            if(input == 1){
                weapon[0] = 15;
                weapon[1] = 0;
                weapon[2] = 0;
                weapon[3] = 10;
                weapon[4] = 20;
                weapon[5] = 0;
                weapon[6] = 3000;
            }
            else if(input == 2){
                weapon[0] = 20;
                weapon[1] = 0;
                weapon[2] = 0;
                weapon[3] = 15;
                weapon[4] = 40;
                weapon[5] = 20;
                weapon[6] = 6000;
            }
            else if(input == 3){
                weapon[0] = 25;
                weapon[1] = 0;
                weapon[2] = 60;
                weapon[3] = 20;
                weapon[4] = 70;
                weapon[5] = 60;
                weapon[6] = 12000;
            }
            else if(input == 4){
                weapon[0] = 30;
                weapon[1] = 0;
                weapon[2] = 40;
                weapon[3] = 25;
                weapon[4] = 80;
                weapon[5] = 60;
                weapon[6] = 24000;
            }
        }
        else if(cinput == 5){//staves
            if(input == 1){
                weapon[0] = 5;
                weapon[1] = 0;
                weapon[2] = 25;
                weapon[3] = 20;
                weapon[4] = 5;
                weapon[5] = 15;
                weapon[6] = 2000;
            }
            else if(input == 2){
                weapon[0] = 10;
                weapon[1] = 0;
                weapon[2] = 45;
                weapon[3] = 30;
                weapon[4] = 10;
                weapon[5] = 35;
                weapon[6] = 4000;
            }
            else if(input == 3){
                weapon[0] = 15;
                weapon[1] = 0;
                weapon[2] = 65;
                weapon[3] = 40;
                weapon[4] = 15;
                weapon[5] = 60;
                weapon[6] = 8000;
            }
            else if(input == 4){
                weapon[0] = 25;
                weapon[1] = 0;
                weapon[2] = 85;
                weapon[3] = 50;
                weapon[4] = 20;
                weapon[5] = 75;
                weapon[6] = 16000;
            }
        }
        else if(cinput == 6){//seal
            if(input == 1){
                weapon[0] = 10;
                weapon[1] = 0;
                weapon[2] = 15;
                weapon[3] = 45;
                weapon[4] = 0;
                weapon[5] = 20;
                weapon[6] = 2500;
            }
            else if(input == 2){
                weapon[0] = 15;
                weapon[1] = 0;
                weapon[2] = 35;
                weapon[3] = 50;
                weapon[4] = 0;
                weapon[5] = 40;
                weapon[6] = 5000;
            }
            else if(input == 3){
                weapon[0] = 20;
                weapon[1] = 0;
                weapon[2] = 65;
                weapon[3] = 55;
                weapon[4] = 0;
                weapon[5] = 65;
                weapon[6] = 10000;
            }
            else if(input == 4){
                weapon[0] = 25;
                weapon[1] = 0;
                weapon[2] = 75;
                weapon[3] = 60;
                weapon[4] = 0;
                weapon[5] = 80;
                weapon[6] = 15000;
            }
        }


    }
}


