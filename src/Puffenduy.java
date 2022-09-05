public class Puffenduy extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Puffenduy(String name, int powerMagic, int transgress, int hardworking, int loyal, int honest) {
        super(name, powerMagic, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        if (hardworking < 0 || hardworking > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        if (loyal < 0 || loyal > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        if (honest < 0 || honest > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.honest = honest;
    }
    public void compare(Puffenduy student) {
        int sumStudent1 = this.hardworking + this.loyal + this.honest;
        int sumStudent2 = student.hardworking + student.loyal + student.honest;
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
        return "Puffenduy{" +
                "name=" + getName() +
                ", powerMagic=" + getPowerMagic() +
                ", transgress=" + getTransgress() +
                ", hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
}

