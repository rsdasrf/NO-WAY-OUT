public class Kamadan extends Hero {
    public Kamadan() {
        super("Kamadan", 250, 200); // Call the constructor of Hero to set name, health, and mana
    }

    @Override
    public int attack(int choice) {
        int damage = 0;
        int manaCost = 0;

        switch (choice) {
            case 1:
                damage = 30;
                manaCost = 20;
                break;
            case 2:
                damage = 40;
                manaCost = 60;
                break;
            case 3:
                damage = 30;
                manaCost = 20;
                break;
            case 4:
                damage = 15;
                manaCost = 0;
                setMana(getMana() + 20);
                    if(getMana() > 200){
                        setMana(200);
                    }
                System.out.print("You gained 20 mana!");
                break;
            default:
                return -1; 
        }

        if (getMana() >= manaCost) {
            setMana(getMana() - manaCost); 
            return damage; 
        }
        else {
            return -2;
        }
    }
}