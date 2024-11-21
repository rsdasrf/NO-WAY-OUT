import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StoryLine objStoryLine = new StoryLine();
        Kamadan kamadan = new Kamadan();
        Altreia altreia = new Altreia();
        BackgroundMusic bgMusic = new BackgroundMusic("resources\\music.aiff");
        ThirdStreet objThirdStreet = new ThirdStreet(kamadan,altreia,bgMusic);
        SiITYou objSiITYou = new SiITYou(kamadan,altreia,bgMusic);
        SiCS objSiCS = new SiCS(kamadan,altreia,bgMusic);
         
        objStoryLine.gameLogo();

        boolean enterGame = true;
        boolean musicPromptDisplayed = false;
        boolean isMusicPlaying = true;
        bgMusic.play();

        while (enterGame) {
           
                if (!musicPromptDisplayed) {
                    try {
                        boolean validInput = false;
    
                        while (!validInput) {
                            System.out.print("\t\t\t\t\tDo you want to stop the background music? (Yes/No): ");
                            String stopMusicOption = scan.nextLine();
    
                            if (stopMusicOption.equalsIgnoreCase("Yes")) {
                                if (isMusicPlaying) {
                                    bgMusic.stop();
                                    isMusicPlaying = false; 
                                }
                                validInput = true;
                                musicPromptDisplayed = true; 
                            } else if (stopMusicOption.equalsIgnoreCase("No")) {
                                validInput = true;
                                musicPromptDisplayed = true; 
                            } else {
                                System.out.println("\t\t\t\t\tInvalid Input. Enter either YES/NO only\n");
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("\t\t\t\t\tAn error occurred. Please try again.");
                        e.printStackTrace();
                    }
                }
            System.out.print("\t\t\t\t\tDo you want to enter the game? (Yes/No): ");
            String option = scan.nextLine();

            if (option.equalsIgnoreCase("Yes")) {
                while (enterGame) {
                System.out.print("\t\t\t\t\tDo you want to skip the storyline? (Yes/No): ");
                String optionStoryLine = scan.nextLine();
                    try {
                        if (optionStoryLine.equalsIgnoreCase("Yes")) {
                            objStoryLine.questOne();
                            objThirdStreet.enter();
                            objThirdStreet.startQuest();
                            objSiITYou.enter();
                            objSiITYou.startQuest();
                            objSiCS.enter();
                            objSiCS.startQuest();
                            enterGame = false;
                        }else if (optionStoryLine.equalsIgnoreCase("No")) {
                            objStoryLine.prologue();
                            objStoryLine.questOne();
                            objThirdStreet.enter();
                            objThirdStreet.startQuest();
                            objSiITYou.enter();
                            objSiITYou.startQuest();
                            objSiCS.enter();
                            objSiCS.startQuest();
                            enterGame = false;
                        }else {
                            System.out.println("\t\t\t\t\tInvalid Input. Enter either YES/NO only\n");
                        }
                    } catch (Exception e) {
                        scan.nextLine();
                    }
                }
            } else if (option.equalsIgnoreCase("No")) {
                objStoryLine.displayNo();
                break;
            } else {
                System.out.println("\t\t\t\t\tInvalid Input. Enter either YES/NO only\n");
            }
        
        }
    

        if (isMusicPlaying) {
            bgMusic.stop();
        }
  
    }
}