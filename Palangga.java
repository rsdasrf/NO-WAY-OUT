public class Palangga extends Hero {
    public Palangga() {
        super("Palangga", 1000, 1000); 
    }

    @Override
    public int attack(int choice) {
        int damage = 0;

        switch (choice) {
            case 1:
                damage = 1000;
                break;
            case 2:
                damage = 1000;
                break;
            case 3:
                damage = 1000;
                break;
            case 4:
                damage = 1000;
                System.out.println("You gained 20 mana!");
                break;
            default:
                return -1; 
        }
        return damage;
    }
}