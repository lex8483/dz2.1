public class Kogtevran extends Hogwarts {
    private int wise;
    private int witty;
    private int creativity;

    public Kogtevran(String name, int powerMagic, int transgress, int wise, int witty, int creativity) {
        super(name, powerMagic, transgress);
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        if (wise < 0 || wise > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        if (witty < 0 || witty > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if (creativity < 0 || creativity > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.creativity = creativity;
    }
    public void compare(Kogtevran student) {
        int sumStudent1 = this.wise + this.witty + this.creativity;
        int sumStudent2 = student.wise + student.witty + student.creativity;
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
        return "Kogtevran{" +
                "name=" + getName() +
                ", powerMagic=" + getPowerMagic() +
                ", transgress=" + getTransgress() +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                '}';
    }
}
