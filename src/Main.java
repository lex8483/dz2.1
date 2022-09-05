public class Main {
    public static void main(String[] args) {
        Gryffindor student1 = new Gryffindor("Гарри Поттер",4,23,12,23,19);
        Gryffindor student2 = new Gryffindor("Гермиона Грейнджер",42,43,14,23,1);
        Gryffindor student3 = new Gryffindor("Рон Уизли",14,87,32,42,9);
        Puffenduy student4 = new Puffenduy("Захария Смит",12,4,34,56,23);
        Puffenduy student5 = new Puffenduy("Седрик Диггори",41,54,23,46,63);
        Puffenduy student6 = new Puffenduy("Джастин Финч-Флетчли",23,12,12,2,53);
        Kogtevran student7 = new Kogtevran("Чжоу Чанг",76,35,34,45,2);
        Kogtevran student8 = new Kogtevran("Падма Патил",67,29,54,35,21);
        Kogtevran student9 = new Kogtevran("Маркус Белби",16,75,14,75,12);
        Slytherin student10 = new Slytherin("Драко Малфой",4,61,34,12,45,34,23);
        Slytherin student11 = new Slytherin("Грэхэм Монтегю",23,53,3,54,23,14,67);
        Slytherin student12 = new Slytherin("Грегори Гойл",14,33,54,2,54,4,7);
        System.out.println(student1 + "\n" + student8 + "\n" + student10);
        student1.compare(student3);
        student12.compare(student11);
        student1.compare(student9);
    }

}