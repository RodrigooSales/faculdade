package pets;

public class Passaro extends Animal implements Voador{
    protected String name;
    protected String id;

    public Passaro(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String voar() {
        return getName() + " esta voando";
    }

    @Override
    public String comer() {
        return getName() + super.comer();
    }

    @Override
    public String dormir() {
        return getName() + super.dormir();
    }
}
