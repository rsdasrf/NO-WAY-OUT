public abstract class Kingdom {
    protected String name;
    protected Kamadan kamadan;
    protected Altreia altreia; 

    public Kingdom(String name, Kamadan kamadan, Altreia altreia) {
        this.name = name;
        this.kamadan = kamadan;
        this.altreia = altreia;
    }

    public String getName() {
        return name;
    }

    public Kamadan getKamadan() {
        return kamadan; 
    }

    public Altreia getAltreia() {
        return altreia; 
    }

    public abstract void enter();
    public abstract void startQuest();
}