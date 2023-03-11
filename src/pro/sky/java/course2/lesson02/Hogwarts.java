package pro.sky.java.course2.lesson02;

public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressPower;

    public Hogwarts(String name, int magicPower, int transgressPower) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressPower = transgressPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressPower() {
        return transgressPower;
    }

    public void setTransgressPower(int transgressPower) {
        this.transgressPower = transgressPower;
    }
}
