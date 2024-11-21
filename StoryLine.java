import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class StoryLine {
    public void simulateTyping(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(0); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    final String RED = "\u001B[31m";   
    final String GREEN = "\u001B[32m";  
    final String BLUE = "\u001B[34m";     
    final String RESET = "\u001B[0m";   
    final String YELLOW = "\u001B[33m";
    final String VIOLET = "\u001B[95m"; 

    public void gameLogo(){
        System.out.println("============================================================================================================================");
        System.out.println("||                                             Welcome To No Way Out: The Final Test                                      ||");
        System.out.println("============================================================================================================================");
        System.out.println();
        String asciiArt = """
                ███▄    █  ▒█████      █     █░ ▄▄▄     ▓██   ██▓    ▒█████   █    ██ ▄▄▄█████▓
                ██ ▀█   █ ▒██▒  ██▒   ▓█░ █ ░█░▒████▄    ▒██  ██▒   ▒██▒  ██▒ ██  ▓██▒▓  ██▒ ▓▒
                ▓██  ▀█ ██▒▒██░  ██▒   ▒█░ █ ░█ ▒██  ▀█▄   ▒██ ██░   ▒██░  ██▒▓██  ▒██░▒ ▓██░ ▒░
                ▓██▒  ▐▌██▒▒██   ██░   ░█░ █ ░█ ░██▄▄▄▄██  ░ ▐██▓░   ▒██   ██░▓▓█  ░██░░ ▓██▓ ░ 
                ▒██░   ▓██░░ ████▓▒░   ░░██▒██▓  ▓█   ▓██▒ ░ ██▒▓░   ░ ████▓▒░▒▒█████▓   ▒██▒ ░ 
                ░ ▒░   ▒ ▒ ░ ▒░▒░▒░    ░ ▓░▒ ▒   ▒▒   ▓▒█░  ██▒▒▒    ░ ▒░▒░▒░ ░▒▓▒ ▒ ▒   ▒ ░░   
                ░ ░░   ░ ▒░  ░ ▒ ▒░      ▒ ░ ░    ▒   ▒▒ ░▓██ ░▒░      ░ ▒ ▒░ ░░▒░ ░ ░     ░    
                ░   ░   ░ ░ ░ ░ ▒       ░   ░    ░   ▒   ▒ ▒ ░░     ░ ░ ░ ▒   ░░░ ░ ░   ░      
                ░          ░ ░         ░          ░  ░░ ░            ░ ░     ░              
                ░                                   ░ ░                                 
                """+RESET;

        String[] lines = asciiArt.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            System.out.println(RED + "\t\t\t" + centerText(line, 80)); // Centering the ASCII art lines
        }
        System.out.print(YELLOW+"                                 KAMADAN                                          ALTREIA"+RESET);
        String art = VIOLET+"""

                                                ▄▄▄▄▄▄                    ▄▄▄▄▄▄                   ▄▄█████▄            ▄█████▄▄
                                              ╔▄██████▄▄ ▄▄▄▄▄▄⌐ ▄▄▄▄▄▄ ▐▄███████▄              ¬▄█▓▓▓▓▓▓▓▓█▄▄▄▄▄▄▄▄▄▄█▓▓▓▓▓▓▓▓█▄⌐
                                              ▐█╣▌    ▓▓█▓▓▓▓▓╢██╢╢╢╢╢▓██▓    j╢██             ,▄█▓▓▓▓▓▓▓███▓▓╢╣╣╣╣╢▓▓███╣▓▓▓▓▓▓█▌▄
                                              ▐█▓Γ ╙\\▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄╕╙ j▓██           ,▐█▓▓▓▓▓▓██╢╢╣▓▓▓▓▓▓▓▓▓▓╢╢╢██▓▓▓▓▓▓▓█▄
                                              `██▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█⌐             ██▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓█
                                                ▐███▓▓▓▓██▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓██▌               ██▓▓▓▓╢██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█╢▓▓▓▓▓█
                                                ▐█▓▓▓▓▓▓██▓▓▓▓▓▓█▌▀██▓▓▓▓▓▓▓█▌               ██▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓╢▓█▓▓▓▓▓▓▓█▓▓▓▓▓█
                                                ██▓▓▓▓▓██   ▓████    ▐██▓▓▓▓▓███`             ▀██▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓█▓▀ █▓▓▓▓▓▓█▓▓▓▓█▀
                                                ██▓▓▓▓██▀█▌`▀▀▀     █▌`▀▓█▓▓▓▓██`               ▐█▓▓▓██▓▓▓▓▓▓▓▓██▀▀  ╙▀▀▀█╣▓▓▓█▓▓▓██
                                                ██▓██▓█▌ ███        ███ ▐█▓██▓██`                ▐█▓▓██▌▓▓██▀██▄   ▄██ ▀█▄██▓██▓▓█▌
                                                ██▓█████▄              ▄█████▓██`                 ¬█▓▓████ ▀▓█▓▀    ╨▓▓▓▀ ████▓▓█▌
                                                ▐█▓╢╢██▓██████████████▓▓▓╢╢▓█▌                    █╣▓╢▓█▄ ,,,       ,, ▄██╢▓▓█-
                                                ▐█▓▓▓▓▓█▀█▄m ▀▀▀▀ ╖▄█▀██▓▓▓▓█▌                    █▓╢██▀▀ ██▌▀▀▀▀▀▀▀▓█ ▀▀██▓▓█,
                                                ▐█▓▓▓▓██ ▐█⌐       █▌ ██▓▓▓▓█▌                   ▀███▌▀███▌╢╬▀▓▄▄▓▌║╢╢███▌▀███▀
                                                ▄▓█▓▓▓█▌ ██   ╜╨▀╜   ▐█ ▐█▓▓▓██▄                            ▀██▓╗╗╗╗╣╫╫█▀
                                                ██▓▓▓▓██▄██▄▄▄▄▄▄▄▄▄▄██▄██▓▓▓▓██`                            ╓▐██▀█▀██▀╥     
                                                ██▓▓▓▓█▌ ██████████████ ▐█▓▓▓▓██`
                                              ╔▄██▓▓██▀▀ ██▄██▀  ▀██▄██ '▀██▓▓▓█▄▄
                                              ▐█████▌,   ██ ██    ██ ▐█   ,▐██████


                            """+RESET;
                            System.out.println(art);

            System.out.print(YELLOW+"                                  SHANG                                         PALANGGA"+RESET);

             String art1 = VIOLET+"""

    
                              ▄▓▓▒▄Q  ▄▄▓▓▓▓▓▓▓▓▓▓▒▄  ╓▒▄▓▓▄");                        ,▄▄███████▄▄,
                              ██╬╢╬╟▓▓▓╬╬╢╣╣╣╣╣╣╣╣╣╠╬▓▓▓╬╬╬╬▓█");                      ▄█▓▓▓▓▓▓▓▓▓▓█▓▓█▄
                            ██╣╣╢╫█╬╣╣╣╣╣╣╣╣╣╣╣╣╣╣╣╣╣╣╣▓█╠╢╣▓█");                    ▄▓▓▓██████████▓▓██▌
                            ██╣╢╫▌¿╙╙╬╩▒╟╣╣╣╣╣╣╣╣╬╟╬╣╩╙│╟█╢╢▓█");                   █▓▓▓██▓█4██▌▀███▓███▌
                            ,█▓╢▓▌]µ▄▄▓▄▒║▒╟╣╣╣╣▒║▒╟▒╣▄QQ░╟█╬▓█,");                 █▓█▓██▓██▄█▌░░███▓██▓█
                          ╔█▓▓▀j█╣╬██╬╣╢╣╫▒╢╢╢╢╢▓╢╣╣╣██╣▒▓▌╙▓▓█▄");               █████▓▓▌╒▓▓,░░░▄▓▓▓▓█▓▓█
                        ²╩╙╙╙  j█╣╣████████████████████╣╣▓▌  ╙╙╙╙∩");             ▀████▓▓█▄░░░░░░░░▓▓▓▓▓▓█
                                j█╣╬█▄▀▀▀▓▒∩    ]╫▓▀▀▀▄█╣╣▓▌");                     ▀█▀█████▀▄▄▄▄▀▀▀██▓█▀▀
                                j█╣╬█░:Mê╚░      ]╚#M⌐\"█╣╣▓▌");                        - █░▒▒░▀▓░▒░█▌-
                                ▓▓╬█░  \"░'       \"\"   █╣╣▓⌐");                         ▌░▒▒▒▒▀▄░▒█
                                ▐█▓█▓#▄▄▄,,▄▄▄,▄▄▄▄▄#Φ█▓█▌");                            ▐█░▒░▓░▒▀█▄▀
                                  ╙▀▄ ,▄▀╟▀╙╙╙╙╙▀╚▒µ ▄▀▀");                             ▄█▒▀▄▒░░▀▄▒░░▀▄
                                    ,#╙▌Q╚M,  ,≡Γ╓╫╩#,");                             ▄╢▒╢▒╫█▀█▀█░▒▒▒░▒▀&
                                ╓▓▄ ▄ ╙▀▒╟▀Θ╬░╚╨ ▄ ▄▀▄");                           æ▀▒║▓" ║▒▒▒▀░░░▒▒▒╥,╒▀
                              ]╬Ü,▓▀   ╠╚  ╚▒   ╠▓,╙╟▄");                             ▀▓▄▄ ▒▒▒▒╜╙╙╙ ▒▄▀
                                ╙▀▓▒▓▓▓▒▄▄▄▄▄▄▄▄▄▓▓▓▒▓▀▀");                             █░▀█▀▀▀P██░▀▄
                                    ╙▀█▓▓▓██▓▓██▓▓▓█▀▀");                             █░▒ █    █@▒▄▀
                                    ²╝> ▐█▄▄█⌐ █▄▄╟▌, ⁿ▒ⁿ");                         ╖╓ ██╫╢█ ▄┌█▌╣▄█ ╢╥[
                                  »╣╣▓▓╬╬███▒▓███▓╣╣▓▓╣m");                          ▄▌▄██▓▓██████▓▓████▌                            

          """+RESET;
                      System.out.println(art1);
        System.out.println(RESET); // Reset color after printing
    }
    
    private static String centerText(String text, int width) {
        int padding = (width - text.length()) / 2;
        return " ".repeat(Math.max(0, padding)) + text;
    }
    

    public void displayNo(){
        System.out.println("");
        System.out.println("");
        String asciiArt = 
                " ██▓    █     █░ ██▓ ██▓     ██▓        ▄▄▄       ██▓     █     █░ ▄▄▄     ▓██   ██▓  ██████ \n" +
                "▓██▒   ▓█░ █ ░█░▓██▒▓██▒    ▓██▒       ▒████▄    ▓██▒    ▓█░ █ ░█░▒████▄    ▒██  ██▒▒██    ▒ \n" +
                "▒██▒   ▒█░ █ ░█ ▒██▒▒██░    ▒██░       ▒██  ▀█▄  ▒██░    ▒█░ █ ░█ ▒██  ▀█▄   ▒██ ██░░ ▓██▄   \n" +
                "░██░   ░█░ █ ░█ ░██░▒██░    ▒██░       ░██▄▄▄▄██ ▒██░    ░█░ █ ░█ ░██▄▄▄▄██  ░ ▐██▓░  ▒   ██▒\n" +
                "░██░   ░░██▒██▓ ░██░░██████▒░██████▒    ▓█   ▓██▒░██████▒░░██▒██▓  ▓█   ▓██▒ ░ ██▒▓░▒██████▒▒\n" +
                "░▓     ░ ▓░▒ ▒  ░▓  ░ ▒░▓  ░░ ▒░▓  ░    ▒▒   ▓▒█░░ ▒░▓  ░░ ▓░▒ ▒   ▒▒   ▓▒█░  ██▒▒▒ ▒ ▒▓▒ ▒ ░\n" +
                " ▒ ░     ▒ ░ ░   ▒ ░░ ░ ▒  ░░ ░ ▒  ░     ▒   ▒▒ ░░ ░ ▒  ░  ▒ ░ ░    ▒   ▒▒ ░▓██ ░▒░ ░ ░▒  ░ ░\n" +
                " ▒ ░     ░   ░   ▒ ░  ░ ░     ░ ░        ░   ▒     ░ ░     ░   ░    ░   ▒   ▒ ▒ ░░  ░  ░  ░  \n" +
                " ░         ░     ░      ░  ░    ░  ░         ░  ░    ░  ░    ░          ░  ░░ ░           ░  \n" +
                "                                                                            ░ ░              \n" +
                "  █████▒██▓ ███▄    █ ▓█████▄     ███▄ ▄███▓▓██   ██▓    █     █░ ▄▄▄     ▓██   ██▓          \n" +
                "▓██   ▒▓██▒ ██ ▀█   █ ▒██▀ ██▌   ▓██▒▀█▀ ██▒ ▒██  ██▒   ▓█░ █ ░█░▒████▄    ▒██  ██▒          \n" +
                "▒████ ░▒██▒▓██  ▀█ ██▒░██   █▌   ▓██    ▓██░  ▒██ ██░   ▒█░ █ ░█ ▒██  ▀█▄   ▒██ ██░          \n" +
                "░▓█▒  ░░██░▓██▒  ▐▌██▒░▓█▄   ▌   ▒██    ▒██   ░ ▐██▓░   ░█░ █ ░█ ░██▄▄▄▄██  ░ ▐██▓░          \n" +
                "░▒█░   ░██░▒██░   ▓██░░▒████▓    ▒██▒   ░██▒  ░ ██▒▓░   ░░██▒██▓  ▓█   ▓██▒ ░ ██▒▓░          \n" +
                " ▒ ░   ░▓  ░ ▒░   ▒ ▒  ▒▒▓  ▒    ░ ▒░   ░  ░   ██▒▒▒    ░ ▓░▒ ▒   ▒▒   ▓▒█░  ██▒▒▒           \n" +
                " ░      ▒ ░░ ░░   ░ ▒░ ░ ▒  ▒    ░  ░      ░ ▓██ ░▒░      ▒ ░ ░    ▒   ▒▒ ░▓██ ░▒░           \n" +
                " ░ ░    ▒ ░   ░   ░ ░  ░ ░  ░    ░      ░    ▒ ▒ ░░       ░   ░    ░   ▒   ▒ ▒ ░░            \n" +
                "        ░           ░    ░              ░    ░ ░            ░          ░  ░░ ░               \n" +
                "                       ░                     ░ ░                           ░ ░               \n" +
                " ▄▄▄▄    ▄▄▄       ▄████▄   ██ ▄█▀   ▄▄▄█████▓ ▒█████     ▓██   ██▓ ▒█████   █    ██         \n" +
                "▓█████▄ ▒████▄    ▒██▀ ▀█   ██▄█▒    ▓  ██▒ ▓▒▒██▒  ██▒    ▒██  ██▒▒██▒  ██▒ ██  ▓██▒        \n" +
                "▒██▒ ▄██▒██  ▀█▄  ▒▓█    ▄ ▓███▄░    ▒ ▓██░ ▒░▒██░  ██▒     ▒██ ██░▒██░  ██▒▓██  ▒██░        \n" +
                "▒██░█▀  ░██▄▄▄▄██ ▒▓▓▄ ▄██▒▓██ █▄    ░ ▓██▓ ░ ▒██   ██░     ░ ▐██▓░▒██   ██░▓▓█  ░██░        \n" +
                "░▓█  ▀█▓ ▓█   ▓██▒▒ ▓███▀ ░▒██▒ █▄     ▒██▒ ░ ░ ████▓▒░     ░ ██▒▓░░ ████▓▒░▒▒█████▓         \n" +
                "░▒▓███▀▒ ▒▒   ▓▒█░░ ░▒ ▒  ░▒ ▒▒ ▓▒     ▒ ░░   ░ ▒░▒░▒░       ██▒▒▒ ░ ▒░▒░▒░ ░▒▓▒ ▒ ▒         \n" +
                "▒░▒   ░   ▒   ▒▒ ░  ░  ▒   ░ ░▒ ▒░       ░      ░ ▒ ▒░     ▓██ ░▒░   ░ ▒ ▒░ ░░▒░ ░ ░         \n" +
                " ░    ░   ░   ▒   ░        ░ ░░ ░      ░      ░ ░ ░ ▒      ▒ ▒ ░░  ░ ░ ░ ▒   ░░░ ░ ░         \n" +
                " ░            ░  ░░ ░      ░  ░           ░ ░      ░ ░       ░ ░         ░ ░     ░             \n" +
                "      ░           ░                                        ░ ░                                          ";

                final String RED = "\u001B[31m";
                final String RESET = "\u001B[0m";
        
                String[] lines = asciiArt.split("\n");
                for (int i = 0; i < lines.length; i++) {
                    String line = lines[i];
                    System.out.println(RED + "\t\t\t" + centerText(line, 80));
                }
                System.out.println(RESET);
    }

    
    
    public void prologue() {
        System.out.println();
        simulateTyping("""
            \t\t\tIn the stillness of the night, Kamadan, a diligent student struggling with her OOP
            \t\tstudies, sat in a cluttered room, illuminated only by the soft glow of her computer screen
            \t\tas fatigue weighed heavily on her eyelids at midnight. Desperate for a brief distraction,
            \t\tshe searched for online games and found one titled 'No Way Out: The Final Test,' which promised
            \t\tadventure and escape. Intrigued, she clicked the link, and suddenly, her screen burst into
            \t\tblinding white light, causing her heart to race with confusion and fear.\n
        """);
        

        simulateTyping("""
            \t\tMinutes passed in eerie silence, and when her screen showed no signs of life, she
            \t\tinstinctively pressed the \"Esc\" key, only to see a chilling message flicker: "There is no
            \t\tescaping now.\" Panic surged as she tried to turn off the AVR, but it was too late. The light
            \t\tfrom her monitor enveloped her, sucking her into the game. \"Welcome to CIT-U, player 5!\"
            \t\tthe screen announced, marking the start of Kamadan's challenging journey through three
            \t\tconnected kingdoms, each filled with secrets and trials that would test her coding skills,
            \t\tproblem-solving abilities, and resilience.\n
        """);


        simulateTyping("""
            \t\tKamadan found herself in the dimly lit alleys of Third Street, where the smell of alcohol
            \t\tand sadness filled the air. Due to her curiosity, she started to wander around the place and
            \t\tsaw a big piece of vandalism on the wall with the saying, \"Study hard, party harder!\"
            \t\tHere, she will encounter her first challenge: the Drunkard Minions - three chaotic foes who
            \t\twere once students like her, now trapped in a cycle of partying and regret.\n
        """);

        simulateTyping("""
            \t\tAs Kamadan navigated the dim streets of Third Street, her heart raced with nervousness amid
            \t\tthe thick air of alcohol and regret. She spotted three familiar figures: Boozy, Sloshed, and
            \t\tJager. Once fellow students, now trapped in a cycle of nightlife and despair. Just as she
            \t\tapproached, a large holographic screen lit up, presenting her first quest: \"Escape the Haze of Regret\".\n
        """);

        System.out.println("\t\t\t\t============================================================================");
        System.out.print("\t\t\t\t||               You have successfully entered the game as:                ||\n");
        System.out.println("\t\t\t\t||      ██╗  ██╗ █████╗ ███╗   ███╗ █████╗ ██████╗  █████╗ ███╗   ██╗      ||");
        System.out.println("\t\t\t\t||      ██║ ██╔╝██╔══██╗████╗ ████║██╔══██╗██╔══██╗██╔══██╗████╗  ██║      ||");
        System.out.println("\t\t\t\t||      █████╔╝ ███████║██╔████╔██║███████║██║  ██║███████║██╔██╗ ██║      ||");
        System.out.println("\t\t\t\t||      ██╔═██╗ ██╔══██║██║╚██╔╝██║██╔══██║██║  ██║██╔══██║██║╚██╗██║      ||");
        System.out.println("\t\t\t\t||      ██║  ██╗██║  ██║██║ ╚═╝ ██║██║  ██║██████╔╝██║  ██║██║ ╚████║      ||");
        System.out.println("\t\t\t\t||      ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝      ||");
        System.out.println("\t\t\t\t============================================================================\n\n");

    }

    public void questOne() {
      
        System.out.println( "============================================================================================================================");
        simulateTyping("||                                          Quest #1: Escape the Haze of Regret.                                          ||\n");
        simulateTyping("||                      Objective: You must defeat the three minions by tackling coding challenges.                       ||\n");
        simulateTyping("||                                    Each minion represents a coding struggle from your past.                            ||\n");
        System.out.println( "============================================================================================================================");

        simulateTyping("\tSuccess would not only mean overcoming challenges but also offer a chance to escape this strange game world.\n\n");
        System.out.println();
        System.out.println(BLUE+"                      BOOZY                            SLOSHED                             JAGER");
        System.out.println();
        System.out.println(VIOLET+"                 ▄ ▓ ▄▌j[┌▄L╓ ╓        "+RESET+"||"+YELLOW+"           ▄ ▓ ▄▌j[┌▄L╓ ╓     "+RESET+" ||"+RED+"           ▄ ▓ ▄▌j[┌▄L╓ ╓                         ");
        System.err.println(VIOLET+"                 ▓▄▓▓▓▓▓▓▓▓▓▓▄▓        "+RESET+"||"+YELLOW+"          ▓▄▓▓▓▓▓▓▓▓▓▓▄▓       "+RESET+"||"+RED+"           ▓▄▓▓▓▓▓▓▓▓▓▓▄▓                         ");
        System.err.println(VIOLET+"                 ▓▓▓▓▓▓▓▓▓▓▓▓▓▓        "+RESET+"||"+YELLOW+"          ▓▓▓▓▓▓▓▓▓▓▓▓▓▓       "+RESET+"||"+RED+"           ▓▓▓▓▓▓▓▓▓▓▓▓▓▓                        ");
        System.err.println(VIOLET+"                  ▓▓▓▓▓▓▓▓▓▓▓▓⌐        "+RESET+"||"+YELLOW+"           ▓▓▓▓▓▓▓▓▓▓▓▓⌐       "+RESET+"||"+RED+"            ▓▓▓▓▓▓▓▓▓▓▓▓⌐                     ");
        System.err.println(VIOLET+"                  ▓▓▓▓▓▓▓▓▓▓▓▓⌐        "+RESET+"||"+YELLOW+"           ▓▓▓▓▓▓▓▓▓▓▓▓⌐       "+RESET+"||"+RED+"            ▓▓▓▓▓▓▓▓▓▓▓▓⌐                       ");
        System.err.println(VIOLET+"                   ▒▒▌▐██▌▐▒▒.         "+RESET+"||"+YELLOW+"            ▒▒▌▐██▌▐▒▒.        "+RESET+"||"+RED+"             ▒▒▌▐██▌▐▒▒.                    ");
        System.err.println(VIOLET+"                   ▀╣▓╩▓▓▓▓╣╣          "+RESET+"||"+YELLOW+"            ╣▓╩▓▓▓▓╣╣          "+RESET+"||"+RED+"             ╣▓╩▓▓▓▓╣╣                  ");
        System.err.println(VIOLET+"                   ▀█████▄▌╣╣╢         "+RESET+"||"+YELLOW+"            ▀█████▄▌╣╣╢        "+RESET+"||"+RED+"             ▀█████▄▌╣╣╢                    ");
        System.out.println(VIOLET+"                   ▓▓╣╣▒▒╣╣▓▓          "+RESET+"||"+YELLOW+"            ▓▓╣╣▒▒╣╣▓▓         "+RESET+"||"+RED+"             ▓▓╣╣▒▒╣╣▓▓                   ");
        System.out.println(VIOLET+"                  ╫▓▓▓███▓▓▓           "+RESET+"||"+YELLOW+"           ╫▓▓▓███▓▓▓          "+RESET+"||"+RED+"            ╫▓▓▓███▓▓▓                    ");
        System.out.println(VIOLET+"                 ▄█▓▀██▌▀██▓╟█▄        "+RESET+"||"+YELLOW+"          ▄█▓▀██▌▀██▓╟█▄       "+RESET+"||"+RED+"           ▄█▓▀██▌▀██▓╟█▄                      "+RESET);
        System.out.println();
    }
    
    public void unlockKey(){
        System.out.println("||"+YELLOW+"                   Congratulations! You have scored an ID for taking down the minions in ThirdStreet.                   "+RESET+"||");
        System.out.println("||"+YELLOW+"                                      ID NUMBER: (6 - 3) 4 + 58 - 3 + (10 * 7 + 6)                                      "+RESET+"||");
        System.out.println( "============================================================================================================================\n");
    }
    

    int gate;
    public int enterGate() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.println("============================================================================================================================");
                System.out.println("||"+YELLOW+"                                   Enter your ID NUMBER to enter SI IT YOU? Kingdom                                     "+RESET+"||");
                System.out.print("||"+YELLOW+"                                                      ID NUMBER: "+RESET);
                gate = scanner.nextInt(); 
                return gate;
            }catch(Exception e){
                scanner.next();
                System.out.println("||"+RED+"                                          Invalid Input. Please Try Again.                                              "+RESET+"||");
                System.out.println("============================================================================================================================");

            }
        }
    }
    
    public void secondNarration(){
        simulateTyping("""
            \t\t\tKamadan felt a surge of determination; defeating the minions and solving their 
            \t\tcoding challenges using her skills would earn her an ID a key symbolizing her progress 
            \t\tand a supposed ticket to escape the game. Confident that completing this first quest 
            \t\twould lead her back to reality, she prepared herself for battle, though an unsettling
            \t\tfeeling lingered, making her question if defeating the minions alone would be enough for 
            \t\tfreedom. Her mind raced with thoughts of escape, unaware that the path ahead would tunveil 
            \t\tdeeper layers of the game and the trials that awaited in the next kingdom, SI IT YOU?.

            \t\tBefore reaching the gates of SI IT YOU?, Kamadan discovered a sari-sari store, a beloved 
            \t\tspot for local students. The store owner, Chizmosa, informed her that only those who 
            \t\tdemonstrated their coding skills could advance, as two generals guarded the path ahead. As
            \t\ta reward, Kamadan unlocked a new character, \"Altreia,\" to assist her on her journey. To enter 
            \t\tSI IT YOU?, she needed to input her ID number before entering the next kingdom.\n
        """);
    }



    public void questTwo() {
        System.out.println("============================================================================================================================");
        simulateTyping("||                                            Quest #2: Preserve the Legacy.                                              ||\n");
        simulateTyping("||              Objective: Stop the wandering spirits from Third Street that threaten to spread ignorance by              ||\n");
        simulateTyping("||                         distorting coding and IT principles. You must encapsulate this vital knowledge,                ||\n");
        simulateTyping("||                         restricting access to only trusted individuals and blocking the spirits' influence.            ||\n");
        simulateTyping("||                         Beware of the loopholes they have created in ancient coding wisdom, as they allow              ||\n");
        simulateTyping("||                         misinformation to spread. Protect this knowledge to ensure future generations can              ||\n");
        simulateTyping("||                         access the truth.                                                                              ||\n");
        System.out.println("============================================================================================================================");
    
        simulateTyping("\tUpon defeating the generals, you will unlock a new character named Shang, who will aid you in your journey.\n\n");
        System.out.println();
        System.out.println(BLUE+"                                  GENERAL ADA                                            GENERAL TURING  ");
        String art = YELLOW+"""
                                ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄⌐                                               ╓╓╓╓╓╓╓╓╓╓╓╓                                
                                ▀██████████████████,,,,,                                       ,╟▓░░░░░░░░░░░░▓,
                                ▐██████████████████████                                  ▄▄▄▄▄▄▀░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓&
                            ╔▄▄▄▄▄▄▄███████████████████████╕                          ╔▄▀▒▒▒▒▒▒▒▒▒▒████▓▒▒▒▒▒▒▒▒▒▒█
                            '▀███████████████ ▀███████▀█████▄                        █▌▒▒▒▒▒▒▒▒▒▄████████▄░▒▒▒▒▒▒▒█
                                ▀████████▀████   ▐▀███▌  ▀█████                      █▌▒▒▒▒▒▒▒▒▒█▌       ▀▓░▒▒▒▒▒▒░▓,    
                            ]███████████  ███      ██▌    ▐███                      ██▌▒▒▒▒▒▒▒▒▒██&&&&Γ  &████▒░▒▒▒▒░▓█
                                ▀█████████    ▀       "`      ▀█                 ╔▄▀▒▒▓███▒▒▒▒▒▒██▄▄▄▄▄▄▄▄▄▄▄▄██▌▒▒▒▒▐█
                                ▄██████▌ ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█C                 ▓▌▒▒█  ▄▄█▌▒▒▒▒████▀╓⌐  ████▀⌐███▄▒▒▐█
                                █▒▒▄▄███▌  ▀█▌▄     ▄▀▀▌▄     ▄█C                ▓▌▒▒█▄  ▀█▌▒▒▒▒██▀▀▀   ▄ ╚▀▀▀ ╚███▒▒▐█
                                █▒▒▓█▒██▌    ▐█████&    ,████▓ █                 ▐▌▒▒▒░▓███▌▒▒▒▒█▌       &      ▐██▒▓▌
                                ▀▓▌▒▒█▒[            ▀  ▀      █                   ▐▓▒▒▒▒▒▒█▌▒▒▒▒█▌    ╒▄▄▄      ▐██`
                                    ▀▀█▌N╖       ▀▀▄▄▄         █                    ▀▓▄▄▄▄██▄▒▄▀     ▓█▄▄▄▀▀    ▐█
                                    ╚▀▒╣,                  ▄▀                              ╚▀▀▀█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▀╛
                                        █▒@Ç,,,,,,,,,,,,,,▐▓                                   █████████
                                        `██▀▀▀▀▀▀█▀▀▀▀▀▀▀`                               ▄▀▀▀▀▀█      ▐█▀▀▓╕
                                        ╒▄███▌╙╙╙╙╙╙██▄▄▄                             ╔▄▀▒▒▒▐▓█▀       ▀█▄░░▀▄
                                ,▐███████████     ████████▌▄                        ,█▀█▌▒▒▒▒▐█           █▌▒▒███▌,



    """+RESET;
    System.out.println(art);
    }
    
    public void thirdNarration(){
        //shangUnlock();
        System.out.println("============================================================================================================================\n");
        simulateTyping("""
            \t\t\tFinally, Kamadan and her friends arrive at the grand gates of Si CS, where the ultimate  
            \t\ttest awaits. The formidable Khaiamanan, her real-life OOP 1 professor, stands as the final boss.
            \t\tKnown for his tough teaching style, Khaiamanan challenges them with complex coding 
            \t\tproblems and logic behind data structures.\n
        """);
    }

    public void questThree() {
        System.out.println("============================================================================================================================");
        simulateTyping("||                                            Quest #3: The Final Exam                                                    ||\n");
        simulateTyping("||              Objective: Kamadan and her team must protect essential coding principles from the wandering               ||\n");
        simulateTyping("||                         spirits of Third Street. By encapsulating vital knowledge and restricting access               ||\n");
        simulateTyping("||                         to trusted allies, they will block the spirits\' influence and preserve the truth for           ||\n");
        simulateTyping("||                         future generations.                                                                            ||\n");
        System.out.println("============================================================================================================================\n");
      
        System.out.println(BLUE+"                                                             KHAIAMANAN");
        String art = GREEN+"""
                                                                                                        ╒▄▄▄▄▄m");
                                                                                                ╫▄┐   ▄███████████▄    ╥▓");
                                                                                                ╙▀▓▓███████████████▓▓▓▀");
                                                                                                    ]█▓███████████████▌");
                                                                                                .▄▓▓▓   ▓▒▒▒▓▓  ▓▓▓▌,");
                                                                                                ,▐▓▓▓▓╣▓███▓╣▓██▓█╣▓▓▓▓▓,");
                                                                                                \"▀█▓▓▓╣▓███╢ ╢▓███╣▓▓▓▓█╙");
                                                                                                @     ▓▓▒╢╣▒█▓▓▒╣╢╣▓▓`    @");
                                                                                            ]▓▄ █▄r   ▀▓▓▒▒█╬╣╬▓▌╫▓▓▀    ▄█ g╣▌");
                                                                                        ▓▄▄▄j█████▌ ▄▄▄▓▓█▓▓▓▓▓▓▓▓▄▄▄⌐▐█████▌┌▄▄╣");
                                                                                        ╟████▓▓█▓▓▓▓█▌▒▓▓▒▒▒▒▓▓╢█▓▓▓▓▓▓▓█████");
                                                                                        ╚██▓▓▓▒▒▒▓▓█▓▒▒▒▒█╣▓▌▒▒╣▓█▓▓▒▒▒▓▓▓██▀");
                                                                                            ]▓▓╢╣▒▓▓█▓╣▒▒▓▓▓╣▓▓▓▒▒╣▓██▓▒╢╣▓▓▌");
                                                                                            ╙▓▓▓▓▌'╙▓▒▓▒▒▒▒╣▒▒▒▒▓▒▓▀'▐█▓▓▓▀");
                                                                                            ,▓▒▒▓▌  \"\"▓▓▓▒▓▒▓▓▓▓▓\"\"  ▐█▒▒▓Ç");
                                                                                            ╒▄▓▓▓▓▓▓▓▄   ▐██▓█▓███   ▄▓▓▓▓▓▓▓█▄");
                                                                                        ███▓╢▓▓▓▌╫██  ▐█▓███▓▓▌  ██▌▓█╣▓╣▓▓██");
                                                                                        ╟███████████  ▐█▓█ ██▓▌  ████████████");
                                                                                            ╜ ╜ ╙` ╜    ▐█▓█ ▓▓▓▌    ╙┘ ╜ ╙ └┘");
                                                                                                    ▄▄▄████ ████▄▄▄");
                                                                                                    j████████ ████████Γ");
                                            """+RESET;
                                    System.out.println(art);

        }

        public void endingKP(){
            System.out.println("============================================================================================================================");

            simulateTyping("""
                           Kamadan and Palangga leaned on each other, bruised and exhausted, as the dust of the battlefield settled. 
                           Victory felt hollow without their comrades. But then, Palangga noticed Kamadan's shadow - it didn't match her form. 
                           Slowly, it stretched, twisting unnaturally, rising behind her.\r
                           \r
                           "You think you survived by chance?" the shadow hissed.\r
                           \r
                           Kamadan turned, her eyes widening in horror. 
                           The enemy wasn't defeated - it had simply found a new host. 
                           
                           Now, it lived within her.\n""" //
           
            );
            System.out.println("============================================================================================================================");
            System.out.println();
        }

        public void endingAP(){
            System.out.println("============================================================================================================================");

            simulateTyping("""
                           Altreia and Palangga leaned on each other, bruised and exhausted, as the dust of the battlefield settled. 
                           Victory felt hollow without their comrades. But then, Palangga noticed Altreia's shadow - it didn't match her form. 
                           Slowly, it stretched, twisting unnaturally, rising behind her.\r
                           \r
                           "You think you survived by chance?" the shadow hissed.\r
                           \r
                           Altreia turned, her eyes widening in horror. 
                           The enemy wasn't defeated - it had simply found a new host. 
                           
                           Now, it lived within her.\n""" //
           
            );
            System.out.println("============================================================================================================================");
            System.out.println();
        }

        public void endingSP(){
            System.out.println("============================================================================================================================");

            simulateTyping("""
                           Shang and Palangga leaned on each other, bruised and exhausted, as the dust of the battlefield settled. 
                           Victory felt hollow without their comrades. But then, Palangga noticed Shang's shadow - it didn't match her form. 
                           Slowly, it stretched, twisting unnaturally, rising behind her.\r
                           \r
                           "You think you survived by chance?" the shadow hissed.\r
                           \r
                           Shang turned, her eyes widening in horror. 
                           The enemy wasn't defeated - it had simply found a new host. 
                           
                           Now, it lived within her.\n""" //
           
            );
            System.out.println("============================================================================================================================");
            System.out.println();
        }


        public void endGameHeroes(){
            System.out.println("============================================================================================================================");
            simulateTyping("""
                           The heroes stand victorious, watching as Khaiamanan dissolves into glowing particles. 
                           
                           Kamadan smiles. "We did it. It's over."
                           
                           But Palangga remains still, staring at the final moments of Khaiamanans defeat. Something feels off.
                           
                           Out of the swirling particles, a figure appears Khaiamanan, not the monster, but the man he once was. 
                           He looks at Palangga with sadness in his eyes.
                           
                           "Palangga," Khaiamanan speaks softly. "You were always meant to be here. 
                           But now, you're the only one who can keep this world from falling apart."
                           
                           The others are confused. "What do you mean?" Altreia asks.
                           
                           Khaiamanan continues, "This game, Si CS—it was built on my mind. 
                           I lost myself to it. I kept you here to protect you, but now, if you leave...everything goes with it."
                           
                           Palangga stands frozen, realizing the choice she faces. "So I can't leave? The world will end?"
                           
                           Khaiamanan nods. "Yes, but if you stay, you'll be trapped here forever."
                           
                           The others want to argue, but Palangga turns to them. "I can't let this world die. I have to stay."
                           
                           Khaiamanan reaches out, and they join hands. 
                           The battlefield fades, replaced by a towering building labeled 'No Way Out'. 
                           The heroes are back in the real world, but it feels different.
                           
                           Kamadan looks around, shocked. "This...this is where it all started."
                           
                           Shang frowns. "But we won. Why are we here?"
                           
                           Palangga's voice echoes in their minds: "I'm still here...but the game isn't over."
                           
                           The terminal inside flickers on, displaying a message:
                           
                           "Welcome back, Player 4. Awaiting next challenge."
                           
                           The heroes realize with a chill that the game isn't done. It's just begun.
                           
                           To be continued.
                           """);
            System.out.println("============================================================================================================================");
            System.out.println();
        }


        public void endingKAP(){
            System.out.println("============================================================================================================================");

            simulateTyping("""
                As Kamadan, Altreia, and Palangga stood victorious in Si CS, their hearts raced with a mix of relief and exhaustion. Khaiamanan, the final boss, collapsed into a mist of code, leaving behind a glowing portal.

                "is this it?" Kamadan asked, hesitant.
                
                "it has to be" Altreia replied, gripping her ID tightly.Shang nodded silently, her eyes scanning the flickering portal.
                
                One by one, they stepped through, the light blinding them. Moments later, Kamadan found herself back in her dimly lit room, her cluttered desk and glowing monitor just as she left them.
                She let out a shaky laugh, but relief was cut short by a sudden message flashing across her screen:
                
                "Congratulations, Kamadan. Final Score: 98%. Next Level Loading..."
                
                Before she could react, the screen turned black, and a faint, familiar laugh echoed through her speakers.\n"""//

            );
            System.out.println("============================================================================================================================");
            System.out.println();

        }

        public void endingKSP(){
            System.out.println("============================================================================================================================");

            simulateTyping("""
                As Kamadan, Shang, and Palangga stood victorious in Si CS, their hearts raced with a mix of relief and exhaustion. Khaiamanan, the final boss, collapsed into a mist of code, leaving behind a glowing portal.

                "is this it?" Kamadan asked, hesitant.
                
                "it has to be" Shang replied, gripping her ID tightly. Palangga nodded silently, her eyes scanning the flickering portal.
                
                One by one, they stepped through, the light blinding them. Moments later, Kamadan found herself back in her dimly lit room, her cluttered desk and glowing monitor just as she left them.
                She let out a shaky laugh, but relief was cut short by a sudden message flashing across her screen:
                
                "Congratulations, Kamadan. Final Score: 98%. Next Level Loading..."
                
                Before she could react, the screen turned black, and a faint, familiar laugh echoed through her speakers.\n""" //
           
            );
            System.out.println("============================================================================================================================");
            System.out.println();
            
        }

        public void endingASP(){
            System.out.println("============================================================================================================================");

            simulateTyping("""
                As Altreia, Shang, and Palangga stood victorious in Si CS, their hearts raced with a mix of relief and exhaustion. Khaiamanan, the final boss, collapsed into a mist of code, leaving behind a glowing portal.

                "is this it?" Altreia asked, hesitant.
                
                "it has to be" Shang replied, gripping her ID tightly. Palangga nodded silently, her eyes scanning the flickering portal.
                
                One by one, they stepped through, the light blinding them. Moments later, Altreia found herself back in her dimly lit room, her cluttered desk and glowing monitor just as she left them.
                She let out a shaky laugh, but relief was cut short by a sudden message flashing across her screen:
                
                "Congratulations, Altreia. Final Score: 98%. Next Level Loading..."
                
                Before she could react, the screen turned black, and a faint, familiar laugh echoed through her speakers.\n""" //
           
            );
            System.out.println("============================================================================================================================");
            System.out.println();
            
        }


        public void altreiaUnlock(){
            System.out.println("\t\t\t\t=========================================================================");
            System.out.println("\t\t\t\t||               Congratulations! You have now unlocked:               ||");
            System.out.println("\t\t\t\t||            █████╗ ██╗  ████████╗██████╗ ███████╗██╗ █████╗          ||");
            System.out.println("\t\t\t\t||           ██╔══██╗██║  ╚══██╔══╝██╔══██╗██╔════╝██║██╔══██╗         ||");
            System.out.println("\t\t\t\t||           ███████║██║     ██║   ██████╔╝█████╗  ██║███████║         ||");
            System.out.println("\t\t\t\t||           ██╔══██║██║     ██║   ██╔══██╗██╔══╝  ██║██╔══██║         ||");
            System.out.println("\t\t\t\t||           ██║  ██║███████╗██║   ██║  ██║███████╗██║██║  ██║         ||");
            System.out.println("\t\t\t\t||           ╚═╝  ╚═╝╚══════╝╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝╚═╝  ╚═╝         ||");
            System.out.println("\t\t\t\t=========================================================================");
        }
    
        public void shangUnlock(){
            System.out.println("\t\t\t\t=========================================================================");
            System.out.println("\t\t\t\t||               Congratulations! You have now unlocked:               ||");
            System.out.println("\t\t\t\t||            ███████╗██╗  ██╗ █████╗ ███╗   ██╗ ██████╗               ||");
            System.out.println("\t\t\t\t||            ██╔════╝██║  ██║██╔══██╗████╗  ██║██╔════╝               ||");
            System.out.println("\t\t\t\t||            ███████╗███████║███████║██╔██╗ ██║██║  ███╗              ||");
            System.out.println("\t\t\t\t||            ╚════██║██╔══██║██╔══██║██║╚██╗██║██║   ██║              ||");
            System.out.println("\t\t\t\t||            ███████║██║  ██║██║  ██║██║ ╚████║╚██████╔╝              ||");
            System.out.println("\t\t\t\t||            ╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝               ||");
            System.out.println("\t\t\t\t=========================================================================");
        }
        public void gameover(){
            System.out.println(RED+" ░▒▓██████▓▒░ ░▒▓██████▓▒░░▒▓██████████████▓▒░░▒▓████████▓▒░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓███████▓▒░  ");
            System.out.println(RED+"░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
            System.out.println(RED+"░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
            System.out.println(RED+"░▒▓█▓▒▒▓███▓▒░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒▒▓█▓▒░░▒▓██████▓▒░ ░▒▓███████▓▒░  ");
            System.out.println(RED+"░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▓█▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
            System.out.println(RED+"░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░ ░▒▓█▓▓█▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
            System.out.println(RED+"░▒▓██████▓▒░░ ▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓██████▓▒░   ░▒▓██▓▒░  ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░ ");
                            
        }

}