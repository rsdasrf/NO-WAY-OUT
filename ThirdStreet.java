//ThirdStreet
import java.util.Random;
import java.util.Scanner;

public class ThirdStreet extends Kingdom {
    Scanner scanner = new Scanner(System.in);
    BackgroundMusic bgMusic = new BackgroundMusic("soundeffects/gameover.aiff"); 
    private Kamadan kamadan;
    private Altreia altreia;
    public ThirdStreet(Kamadan kamadan,Altreia altreia, BackgroundMusic bgMusic) {
        super("Third Street",kamadan,altreia);
        this.kamadan = kamadan;
        this.bgMusic = bgMusic;
        this.altreia = altreia;
    }
    private void simulateTyping(String message) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                System.err.println("An error occurred during the delay.");
            }
        }
        System.out.println();
    }

    private static void resetStats(Kamadan objKamadan, Altreia objAltreia, Shang objShang){
        objKamadan.setHealth(250);
        objKamadan.setMana(200);
        objAltreia.setHealth(230);
        objAltreia.setMana(250);
        objShang.setHealth(280);
        objShang.setMana(250);
    }

    private static void upgrade() {
        System.out.println("You have leveled up! Choose an upgrade:");
        System.out.println("1. Increase MAXIMUM HEALTH (+50)");
        System.out.println("2. Increase MAXIMUM MANA (+50)");

        System.out.print("Enter your choice: ");
    }
    final String WHITE = "\u001B[97m";
            final String RED = "\u001B[31m";    
            final String GREEN = "\u001B[32m";  
            final String BLUE = "\u001B[34m";  
            final String RESET = "\u001B[0m";   
            final String YELLOW = "\u001B[33m"; 
            final String GRAY = "\u001B[90m";
            final String ORANGE = "\u001B[38;5;202m"; 

            
    @Override
    public void enter() {
        System.out.println("\t\t\t\tWelcome to " + name + ", the land of coding challenges!");
        System.out.println();
        System.out.println(YELLOW+"                                                                1"+YELLOW+"111                                          ");
        System.out.println(YELLOW+"                                                                1                                          ");
        System.out.println(GRAY+"                                                              1"+RED+"1100"+GRAY+"1                                                              ");
        System.out.println(RED+"                                                            1100"+WHITE+"01"+RED+"0001                                                           "+RESET);
        System.out.println(GRAY+"          0101110111110001011111100100011000010011100000110"+RED+"11"+WHITE+"00010100"+RED+"1101"+GRAY+"010100110101000011001011111111111110000000001          "+RESET);                                          
        System.out.println(GRAY+"        101011111111001011110001011001100001110000100111"+RED+"100"+WHITE+"01101000100"+RED+"01111"+GRAY+"10101101111011010100001100110001010001111010001    "+RESET);
        System.out.println(GRAY+"     111100010010110101000100001110011010001000010100"+RED+"10110"+WHITE+"11010101111101"+RED+"1000"+GRAY+"01101100001111101111100111110011010010100110101                      ");
        System.out.println(GRAY+"  0100010100100011110010101110111001100001110101100"+RED+"011001"+WHITE+"1110100100000011"+RED+"1011"+GRAY+"100001111110101100111110010110110011011011111000");
        System.out.println(YELLOW+"      110"+RED+"000010010100011010000001010101101100101010100101110100100100001101111101101100000001101111100011011110110011101"+YELLOW+"011");
        System.out.println(YELLOW+"      111"+RED+"101010100100010000001011001011100100000001011100110001110111011110100100001011011100011101100111011110110011000"+YELLOW+"000");
        System.out.println(YELLOW+"      011"+RED+"110"+BLUE+"0110"+RED+"11000"+BLUE+"000"+RED+"1010"+BLUE+"0111"+RED+"0010"+BLUE+"111"+RED+"01110"+BLUE+"010"+RED+"11000"+BLUE+"1101"+RED+"00"+YELLOW+"0"+RED+"00000"+BLUE+"01"+RED+"111000"+YELLOW+"0"+RED+"0"+BLUE+"00"+RED+"10001"+BLUE+"001"+RED+"01011"+BLUE+"100"+RED+"00010"+BLUE+"101"+RED+"100000"+BLUE+"000"+RED+"1011"+BLUE+"101"+RED+"0100"+YELLOW+"110");
        System.out.println(YELLOW+"      011"+RED+"110"+BLUE+"0110"+RED+"11000"+BLUE+"000"+RED+"1010"+BLUE+"0111"+RED+"0010"+BLUE+"111"+RED+"01110"+BLUE+"010"+RED+"11000"+BLUE+"1101"+RED+"00"+YELLOW+"0"+RED+"0000001"+RED+"111000"+YELLOW+"0"+RED+"0"+BLUE+"00"+RED+"10001"+BLUE+"001"+RED+"01011"+BLUE+"100"+RED+"00010"+BLUE+"101"+RED+"100000"+BLUE+"000"+RED+"1011"+BLUE+"101"+RED+"0100"+YELLOW+"110");
        System.out.println(YELLOW+"      011"+RED+"110"+BLUE+"0110"+RED+"11000"+BLUE+"000"+RED+"1010"+BLUE+"0111"+RED+"0010"+BLUE+"111"+RED+"01110"+BLUE+"010"+RED+"11000"+BLUE+"1101"+RED+"00"+YELLOW+"0"+RED+"0000001"+RED+"111000"+YELLOW+"0"+RED+"0"+BLUE+"00"+RED+"10001"+BLUE+"001"+RED+"01011"+BLUE+"100"+RED+"00010"+BLUE+"101"+RED+"100000"+BLUE+"000"+RED+"1011"+BLUE+"101"+RED+"0100"+YELLOW+"110");
        System.out.println(YELLOW+"      110"+RED+"000010010100011010000001010101101100101010100101110100"+BLUE+"1001"+RED+"00001101111101101100000001101111100011011110110011101"+YELLOW+"011");
        System.out.println(YELLOW+"      011"+RED+"110"+BLUE+"0110"+RED+"11000"+BLUE+"000"+RED+"1010"+BLUE+"0111"+RED+"0010"+BLUE+"111"+RED+"01110"+BLUE+"010"+RED+"11000"+BLUE+"1101"+RED+"00"+YELLOW+"0"+RED+"000"+BLUE+"000111"+RED+"1000"+YELLOW+"0"+RED+"0"+BLUE+"00"+RED+"10001"+BLUE+"001"+RED+"01011"+BLUE+"100"+RED+"00010"+BLUE+"101"+RED+"100000"+BLUE+"000"+RED+"1011"+BLUE+"101"+RED+"0100"+YELLOW+"110");
        System.out.println(YELLOW+"      011"+RED+"110"+BLUE+"0110"+RED+"11000"+BLUE+"000"+RED+"1010"+BLUE+"0111"+RED+"0010"+BLUE+"111"+RED+"01110"+BLUE+"010"+RED+"11000"+BLUE+"1101"+RED+"00"+YELLOW+"0"+RED+"000"+BLUE+"000111"+RED+"1000"+YELLOW+"0"+RED+"0"+BLUE+"00"+RED+"10001"+BLUE+"001"+RED+"01011"+BLUE+"100"+RED+"00010"+BLUE+"101"+RED+"100000"+BLUE+"000"+RED+"1011"+BLUE+"101"+RED+"0100"+YELLOW+"110");
        System.out.println(YELLOW+"      011"+RED+"110"+BLUE+"0110"+RED+"11000"+BLUE+"000"+RED+"1010"+BLUE+"0111"+RED+"0010"+BLUE+"111"+RED+"01110"+BLUE+"010"+RED+"11000"+BLUE+"1101"+RED+"00"+YELLOW+"0"+RED+"000"+BLUE+"000111"+RED+"1000"+YELLOW+"0"+RED+"0"+BLUE+"00"+RED+"10001"+BLUE+"001"+RED+"01011"+BLUE+"100"+RED+"00010"+BLUE+"101"+RED+"100000"+BLUE+"000"+RED+"1011"+BLUE+"101"+RED+"0100"+YELLOW+"110");
        System.out.println(YELLOW+"      110"+RED+"000010010100011010000001010101101100101010100101110100100100001101111101101100000001101111100011011110110011101"+YELLOW+"011");
        System.out.println(YELLOW+"      111"+RED+"1010101001000100000"+GREEN+"0101100101110010000000"+RED+"1011100110"+WHITE+"0011101110"+RED+"111101001000"+GREEN+"01011011100011101"+RED+"100111011110110011000"+YELLOW+"000"+RESET);
        
    }

    @Override
    public void startQuest() {
    Random random = new Random();
    Kamadan objKamadan = getKamadan();
    Palangga objPalangga = new Palangga();
    Altreia objAltreia = new Altreia();
    Shang objShang = new Shang();
    ThirdStreet objThirdStreet = new ThirdStreet(objKamadan, objAltreia,bgMusic);
    SiITYou objSiITYou = new SiITYou(objKamadan, objAltreia,bgMusic);
    SiCS objSiCS = new SiCS(objKamadan, objAltreia,bgMusic);


    StoryLine objStoryLine = new StoryLine();
    Enemy[] enemies = {
            new Boozy(),
            new Sloshed(),
            new Jager()
    };

    for (int i = 0; i < enemies.length; i++) {
        Enemy enemy = enemies[i];
        int roundCounter = 1;
        int choiceCharacter = 0;
        boolean upgradeDone = false;
        

        while (enemy.getHealth() > 0 && (objKamadan.getHealth() > 0 || objPalangga.getHealth() > 0)) {
            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
            System.out.print("|      "+YELLOW+"Kamadan's HP: " + objKamadan.getHealth() +""+RESET+"    | "+YELLOW+"Mana: " + objKamadan.getMana()+""+RESET+"     |"+YELLOW+" Syntax Sleuth"+RESET+" |"+YELLOW+" Logic Master"+RESET+"         |"+YELLOW+" Loop Ninja"+RESET+"       |"+YELLOW+" Mana Regeneration"+RESET+"  |");
            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
            System.out.print("|      "+YELLOW+"Palangga's HP: " + objPalangga.getHealth() +""+RESET+"  | "+YELLOW+"Mana: " + objPalangga.getMana()+""+RESET+"    |"+YELLOW+" LoveyDovey    "+RESET+"|"+YELLOW+" Nikaon Naka, Langga? "+RESET+"|"+YELLOW+" Tulog Na, Langga "+RESET+"|"+YELLOW+" I Love You, Langga "+RESET+"|");
            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
            
            boolean isValid = false;
            while (!isValid) {
                if (roundCounter > 1) {
                    System.out.println("\nChoose your character to attack for the next round:");
                } else {
                    System.out.println("\nChoose your character to attack:");
                }
                System.out.println("1. Kamadan");
                System.out.println("2. Palangga");

                System.out.print("Enter choice (1 or 2): ");
                
                try {
                    String input = scanner.nextLine().trim(); // Trim whitespace
                    
                    // Check if the input is empty
                    if (input.isEmpty()) {
                        System.out.println(RED + "Input cannot be empty. Please enter 1 or 2." + RESET);
                        continue; // Prompt for input again
                    }
                    
                    // Parse the input to an integer
                    choiceCharacter = Integer.parseInt(input);
                    
                    // Check if the choice is valid based on character health
                    if ((choiceCharacter == 1 && objKamadan.getHealth() > 0) || 
                        (choiceCharacter == 2 && objPalangga.getHealth() > 0)) {
                        isValid = true; // Valid choice, exit loop
                    } else {
                        System.out.println(RED + "Invalid choice. Please choose a character that exists." + RESET);
                    }
                } catch (Exception e) {
                    System.out.println(RED + "Invalid input! Please enter a valid number (1 or 2)." + RESET);
                }
            }

            int choice = 0;
            while (choice < 1 || choice > 4) {
                if (choiceCharacter == 1) {
                    System.out.println("\n------------------------------------------");
                    System.out.println("|"+YELLOW+"           THIRDSTREET KINGDOM     "+RESET+"     |");
                    System.out.println("------------------------------------------");
                    System.out.println("Round: " + roundCounter);
                    System.out.println("You have entered as \'Kamadan\'");
                    System.out.print("Kamadan's HP: " + objKamadan.getHealth() + " | Mana: " + objKamadan.getMana() + "\n");
                    System.out.println("Enemy " + "("+(i+1) +"/3) " + enemy.getName() + "'s HP: " + enemy.getHealth());

                    System.out.println("\nChoose your attack:");
                    System.out.println("1. Syntax Sleuth (30 damage, 20 mana)");
                    System.out.println("2. Logic Master (40 damage, 60 mana)");
                    System.out.println("3. Loop Ninja (30 damage, 20 mana)");
                    System.out.println("4. Mana Regeneration (15 damage, +20 mana)");
                } else {
                    System.out.println("\n------------------------------------------");
                    System.out.println("|"+YELLOW+"           THIRDSTREET KINGDOM          "+RESET+"|");
                    System.out.println("------------------------------------------");                    
                    System.out.println("Round: " + roundCounter);
                    System.out.println("You have entered as \'Palangga\'");
                    System.out.print("Palangga's HP: " + objPalangga.getHealth() + " | Mana: " + objPalangga.getMana() + "\n");
                    System.out.println("Enemy " +"("+ (i+1) +"/3) " + enemy.getName() + "'s HP: " + enemy.getHealth());

                    System.out.println("\nChoose your attack:");
                    System.out.println("1. LoveyDovey (1000 damage, 0 mana)");
                    System.out.println("2. Nikaon Naka, Langga? (1000 damage, 0 mana)");
                    System.out.println("3. Tulog Na, Langga (1000 damage, 0 mana)");
                    System.out.println("4. I Love You, Langga (1000 damage, +20 mana)");
                }
                isValid = false;
                while (!isValid) {
                    try {
                        System.out.print("\nEnter Attack (1-4): ");
                        
                        // Read the input as a string to handle empty input
                        String input = scanner.nextLine().trim(); // Trim whitespace
                        
                        // Check if the input is empty
                        if (input.isEmpty()) {
                            System.out.println(RED + "Input cannot be empty. Please enter a number between 1 and 4." + RESET);
                            continue; // Prompt for input again
                        }
                        
                        // Parse the input to an integer
                        choice = Integer.parseInt(input);
                        
                        // Validate the choice
                        if (choice < 1 || choice > 4) {
                            System.out.println(RED + "Invalid Attack! Please enter a number between 1 and 4!" + RESET);
                        } else {
                            isValid = true; // Valid choice, exit loop
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(RED + "Invalid input! Please enter a valid number." + RESET);
                    }
                }
            }

            int attackDamage;
    
                    if (choiceCharacter == 1) {
                        attackDamage = objKamadan.attack(choice);
                    } else {
                        attackDamage = objPalangga.attack(choice);
                    }
    
                    if (attackDamage >= 0) {
                        enemy.setHealth(enemy.getHealth() - attackDamage);
                        if(enemy.getHealth() < 0){
                            enemy.setHealth(0);
                        }
                        System.out.println(" You deal " + attackDamage + " damage to " + enemy.getName() + "!");
                        if(choiceCharacter == 1){
                            if(choice == 1){
                                System.out.println("You used Syntax Sleuth (30 damage, 20 mana)");
                            }else if(choice == 2){
                                System.out.println("You used Logic Master (40 damage, 60 mana)");
                            }else if(choice == 3){
                                System.out.println("You used Loop Ninja (30 damage, 20 mana)");
                            }else{
                                System.out.println("You used Mana Regeneration (15 damage, +20 mana)");
                            }
                        }else{
                            if(choice == 1){
                                System.out.println("You used LoveyDovey (1000 damage, 0 mana)");
                            }else if(choice == 2){
                                System.out.println("You used Nikaon Naka, Langga? (1000 damage, 0 mana)");
                            }else if(choice == 3){
                                System.out.println("You used Tulog Na, Langga (1000 damage, 0 mana)");
                            }else{
                                System.out.println("You used I Love You, Langga (1000 damage, +20 mana)");
                            }
                        }
                    } else if (attackDamage == -1) {
                        simulateTyping("Invalid choice!");
                    } else {
                        System.out.println(RED+"Not enough mana! You cannot attack."+RESET);
                    }
            
            if (enemy.getHealth() > 0) {
                    int enemySkill = random.nextInt(1);
                    int enemyDamage = 0;
                    String skillUsed = " ";
                            
                           if(i == 0){
                                if(enemySkill == 0){
                                    enemyDamage = random.nextInt(21);
                                    skillUsed = enemy.getSkill1();
                                }
                           }else if(i == 1){
                                if(enemySkill == 0){
                                    enemyDamage = random.nextInt(41);
                                    skillUsed = enemy.getSkill1();
                                }
                           }else{
                                if(enemySkill == 0){
                                    enemyDamage = random.nextInt(36);
                                    skillUsed = enemy.getSkill1();
                                }
                            }
    
                simulateTyping(enemy.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.");
                
                if (choiceCharacter == 1) {
                    objKamadan.setHealth(objKamadan.getHealth() - enemyDamage);
                    if(objKamadan.getHealth() < 0){
                        System.out.println("Kamadan collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                        objKamadan.setHealth(0);
                        boolean restartOver = true;
                        scanner.nextLine();
                        
                        objStoryLine.gameLogo();

                        bgMusic.play();          
                while (restartOver) {
                    try {
                        if (bgMusic.isPlaying()) {
                            boolean validInput = false;
                            while (!validInput) {
                                System.out.print("\t\t\t\t\tDo you want to stop the background music? (Yes/No): ");
                                String stopMusicOption = scanner.nextLine();
            
                                if (stopMusicOption.equalsIgnoreCase("Yes")) {
                                    bgMusic.stop(); // Stop the music
                                    validInput = true;  
                                } else if (stopMusicOption.equalsIgnoreCase("No")) {
                                    validInput = true;  
                                } else {
                                    System.out.println("\t\t\t\t\tInvalid input. Please enter Yes or No.");
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("\t\t\t\t\tAn error occurred. Please try again.");
                        e.printStackTrace(); 
                    }

                System.out.print("\t\t\t\t\tDo you want to enter the game? (Yes/No): ");
                String option = scanner.nextLine();

                if (option.equalsIgnoreCase("Yes")) {
                    while (restartOver) {
                    System.out.print("\t\t\t\t\tDo you want to skip the storyline? (Yes/No): ");
                    String optionStoryLine = scanner.nextLine();
                        try {
                            if (optionStoryLine.equalsIgnoreCase("Yes")) {
                                
                                resetStats(objKamadan, objAltreia, objShang);

                                objStoryLine.questOne();
                                objThirdStreet.enter(); 
                                objThirdStreet.startQuest();
                                objSiITYou.enter();
                                objSiITYou.startQuest();
                                objSiCS.enter();
                                objSiCS.startQuest();
                                restartOver = false;
                            }else if (optionStoryLine.equalsIgnoreCase("No")) {
                                resetStats(objKamadan, objAltreia, objShang);
                                
                                objStoryLine.prologue();
                                objStoryLine.questOne();
                                objThirdStreet.enter();
                                objThirdStreet.startQuest();
                                objSiITYou.enter();
                                objSiITYou.startQuest();
                                objSiCS.enter();
                                objSiCS.startQuest();
                                restartOver = false;
                            }else {
                                System.out.println("\t\t\t\t\tInvalid Input. Enter either YES/NO only\n");
                            }
                        } catch (Exception e) {
                            scanner.nextLine();
                        }
                    }
                } else if (option.equalsIgnoreCase("No")) {
                    objStoryLine.displayNo();
                    break;
                } else {
                    System.out.println("\t\t\t\t\tInvalid Input. Enter either YES/NO only\n");
                }
            }
                    }
                } else {
                    objPalangga.setHealth(objPalangga.getHealth() - enemyDamage);
                    if(objPalangga.getHealth() < 0){
                        System.out.println("Palangga collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                        objPalangga.setHealth(0);
                    }
                }
            }
            roundCounter++;
        }

        if (choiceCharacter == 1 && objKamadan.getHealth() > 0 && objPalangga.getHealth() <= 0) {
            simulateTyping("With one final strike, Kamadan has defeated " + enemy.getName() + ". " + enemy.getName() + " staggers back, muttering in defeat...\n");
        } else if(choiceCharacter == 2 && objPalangga.getHealth() > 0 && objKamadan.getHealth() <= 0) {
            simulateTyping("With one final strike, Palangga has defeated " + enemy.getName() + ". " + enemy.getName() + " staggers back, muttering in defeat...\n");
        }else {
            simulateTyping("With one final strike, Kamadan and Palangga have defeated " + enemy.getName() + ". " + enemy.getName() + " stagger back, muttering in defeat...\n");
        }

        if(!upgradeDone){
            int upgradeChoice;
            System.out.println("----------------------------------------------------------------------------------------------------------------------------");
            System.out.print("|"+YELLOW+"      Kamadan's HP: " + objKamadan.getHealth()+""+RESET+"    |"+YELLOW+" Mana: " + objKamadan.getMana()+""+RESET+"     |"+YELLOW+" Syntax Sleuth"+RESET+" |"+YELLOW+" Logic Master"+RESET+"         |"+YELLOW+" Loop Ninja"+RESET+"       |"+YELLOW+" Mana Regeneration"+RESET+"  |");
            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
            System.out.print("|"+YELLOW+"      Palangga's HP: " + objPalangga.getHealth()+""+RESET+"  |"+YELLOW+" Mana: " + objPalangga.getMana()+""+RESET+"    |"+YELLOW+" LoveyDovey"+RESET+"    |"+YELLOW+" Nikaon Naka, Langga?"+RESET+" |"+YELLOW+" Tulog Na, Langga"+RESET+" |"+YELLOW+" I Love You, Langga"+RESET+" |");
            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
            upgrade();

            int chooseCharacter = 0;
            upgradeChoice = 0;
            while (true) {
                try {
            
                    // Read the input as a string to handle empty input
                    String input = scanner.nextLine().trim(); // Trim whitespace
                    
                    // Check if the input is empty
                    if (input.isEmpty()) {
                        System.out.println(RED + "Input cannot be empty. Please enter 1 or 2.\n" + RESET);
                        upgrade();
                        continue; // Prompt for input again
                    }
            
                    // Parse the input to an integer
                    upgradeChoice = Integer.parseInt(input);
            
                    if (upgradeChoice == 1 || upgradeChoice == 2) {
                        break; // Valid choice for upgrade
                    } else {
                        System.out.println(RED + "Invalid Choice. Please Try Again.\n" + RESET);
                        upgrade();
                    }
                } catch (NumberFormatException e) {
                    System.out.println(RED + "Invalid Input. Please Try Again.\n" + RESET);
                    upgrade();

                }
            }
        
            while (true) {
                try {
                    simulateTyping("\nWho do you want to upgrade?");
                    System.out.println("1. Kamadan");
                    System.out.println("2. Palangga");
                    System.out.print("Enter choice: ");
                    
                    // Read the input as a string to handle empty input
                    String input = scanner.nextLine().trim(); // Trim whitespace
                    
                    // Check if the input is empty
                    if (input.isEmpty()) {
                        System.out.println(RED + "Input cannot be empty. Please enter 1 or 2." + RESET);
                        continue; // Prompt for input again
                    }
                    
                    // Parse the input to an integer
                    chooseCharacter = Integer.parseInt(input);
            
                    // Check which character to upgrade
                    if (chooseCharacter == 1) {
                        if (objKamadan.getHealth() > 0) {
                            // Assume upgradeChoice is set somewhere before this block
                            if (upgradeChoice == 1) { // Health upgrade
                                objKamadan.setHealth(objKamadan.getHealth() + 50);
                                if (objKamadan.getHealth() > 250) {
                                    objKamadan.setHealth(250);
                                }
                                simulateTyping("Kamadan increases her HEALTH! UPDATED HEALTH: " + objKamadan.getHealth());
                            } else if (upgradeChoice == 2) { // Mana upgrade
                                objKamadan.setMana(objKamadan.getMana() + 50);
                                if (objKamadan.getMana() > 200) {
                                    objKamadan.setMana(200);
                                }
                                simulateTyping("Kamadan increases her MANA! UPDATED MANA: " + objKamadan.getMana());
                            }
                            break; // Exit the loop after successful upgrade
                        } else {
                            System.out.println("Kamadan has already been defeated. Upgrades cannot be applied.\n");
                        }
                    } else if (chooseCharacter == 2) {
                        if (objPalangga.getHealth() > 0) {
                            if (upgradeChoice == 1) { // Health upgrade
                                objPalangga.setHealth(objPalangga.getHealth() + 50);
                                if (objPalangga.getHealth() > 1000) {
                                    objPalangga.setHealth(1000);
                                }
                                simulateTyping("Palangga increases her HEALTH! UPDATED HEALTH: " + objPalangga.getHealth());
                            } else if (upgradeChoice == 2) { // Mana upgrade
                                objPalangga.setMana(objPalangga.getMana() + 50);
                                if (objPalangga.getMana() > 1000) {
                                    objPalangga.setMana(1000);
                                }
                                simulateTyping("Palangga increases her MANA! UPDATED MANA: " + objPalangga.getMana());
                            }
                            break; // Exit the loop after successful upgrade
                        } else {
                            System.out.println("Palangga has already been defeated. Upgrades cannot be applied.");
                        }
                    } else {
                        System.out.println(RED + "Invalid choice. Please try again." + RESET);
                    }
                } catch (NumberFormatException e) {
                    System.out.println(RED + "Invalid input! Please enter a valid number." + RESET);
                }
            }
        }
    }

    if(objKamadan.getHealth() > 0 && objPalangga.getHealth() > 0){
        simulateTyping("\nKamadan and Palangga stands victorious. The streets are quiet now.");
        simulateTyping("Kamadan takes a deep breath while Palangga smirks lazily, and they both prepare for the next trial.");
    }else{
        simulateTyping("\nPalangga stands victorious. The streets are quiet now.");
        simulateTyping("\"Palangga smirks lazily, effortlessly preparing for the next trial.");
    }
    System.out.println();
    System.out.println("============================================================================================================================");

    objStoryLine.secondNarration();

    System.out.println("============================================================================================================================");

    objStoryLine.unlockKey();
    boolean isTrue = false;

    while (!isTrue) {
        try {
            System.out.println("============================================================================================================================");
            System.out.println("||                                   Enter your ID NUMBER to enter SI IT YOU? Kingdom                                     ||");
            System.out.print("||                                                      ID NUMBER: "); // Prompt for input
            String input = scanner.nextLine().trim(); // Read input as a string and trim whitespace
            
            // Check if the input is empty
            if (input.isEmpty()) {
                System.out.println("||" + RED + "                                    Input cannot be empty! Please enter a valid number.                                 " + RESET + "||");
                System.out.println("============================================================================================================================");
                continue; // Prompt for input again
            }
    
            int enteredGate = Integer.parseInt(input); // Parse the input to an integer
            if (enteredGate == 143) {
                isTrue = true;
                System.out.println("||" + ORANGE + "                                                 Access granted. Welcome!                                               " + RESET + "||");
                System.out.println("============================================================================================================================");
            } else {
                System.out.println("||" + RED + "                                                  Incorrect ID! Try again.                                              " + RESET + "||");
                System.out.println("============================================================================================================================");
            }
        } catch (NumberFormatException e) {
            System.out.println("||" + RED + "                                            Invalid input! Please enter a valid number.                                 " + RESET + "||");
            System.out.println("============================================================================================================================");
        }
    }
    
    objStoryLine.questTwo();
    }
}