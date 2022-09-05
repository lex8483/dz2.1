public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstPower;

    public Slytherin(String name, int powerMagic, int transgress, int cunning, int determination, int ambition, int resourcefulness, int thirstPower) {
        super(name, powerMagic, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (cunning < 0 || cunning > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (determination < 0 || determination > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (ambition < 0 || ambition > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0 || resourcefulness > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.resourcefulness = resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    public void setThirstPower(int thirstPower) {
        if (thirstPower < 0 || thirstPower > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.thirstPower = thirstPower;
    }
    public void compare(Slytherin student) {
        int sumStudent1 = this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstPower;
        int sumStudent2 = student.cunning + student.determination + student.ambition + student.resourcefulness + student.thirstPower;
        if (sumStudent1 > sumStudent2) {
            System.out.println(this.getName() + " сильнее " + student.getName());
        } else if (sumStudent2 > sumStudent1) {
            System.out.println(student.getName() + " сильнее " + this.getName());
        } else {
            System.out.println(this.getName() + " равен по силе " + student.getName());
        }
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "name=" + getName() +
                ", powerMagic=" + getPowerMagic() +
                ", transgress=" + getTransgress() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstPower=" + thirstPower +
                '}';
    }

}
