package pro.sky.java.course2.lesson02;

public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name,int magicPower, int transgressPower, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
}
