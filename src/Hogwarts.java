public abstract class Hogwarts {
    private String name;
    private int powerMagic;
    private int transgress;

    public Hogwarts(String name, int powerMagic, int transgress) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        if (powerMagic < 0 || powerMagic > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.powerMagic = powerMagic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        if (transgress < 0 || transgress > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.transgress = transgress;
    }

    public void compare(Hogwarts student) {
        int sumStudent1 = this.powerMagic + this.transgress;
        int sumStudent2 = student.powerMagic + student.transgress;
        if (sumStudent1 > sumStudent2) {
            System.out.println(this.name + " сильнее " + student.name);
        } else if (sumStudent2 > sumStudent1) {
            System.out.println(student.name + " сильнее " + this.name);
        } else {
            System.out.println(this.name + " равен по силе " + student.name);
        }
    }

}
