package pro.sky.java.course2.lesson02;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magicPower == hogwarts.magicPower && transgressPower == hogwarts.transgressPower && Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, magicPower, transgressPower);
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressPower=" + transgressPower +
                '}';
    }
}
