public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int powerMagic, int transgress, int nobility, int honor, int courage) {
        super(name, powerMagic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (nobility < 0 || nobility > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (honor < 0 || honor > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        if (courage < 0 || courage > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.courage = courage;
    }
    public void compare(Gryffindor student) {
        int sumStudent1 = this.nobility + this.honor + this.courage;
        int sumStudent2 = student.nobility + student.honor + student.courage;
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
        return "Gryffindor{" +
                "name=" + getName() +
                ", powerMagic=" + getPowerMagic() +
                ", transgress=" + getTransgress() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }
}
