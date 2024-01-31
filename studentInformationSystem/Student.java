public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String classes;
    String no;
    double average;

    Student(String name, String no, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.no = no;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        average = 0.0;
    }
    void addBulkExamNote(int not1, int not2, int not3) {
        if (not1 >= 0 && not1 <= 100)
            c1.note = not1;
        if (not2 >= 0 && not2 <= 100)
            c2.note = not2;
        if (not3 >= 0 && not3 <= 100)
            c3.note = not3;
    }

    void printNote() {
        System.out.println(c1.name + "Note =\t" + c1.note);
        System.out.println(c2.name + "Note =\t" + c2.note);
        System.out.println(c3.name + "Note =\t" + c3.note);
    }

    void isPass() {
        printNote();

        if (this.c1.prefix.equals("TRH"))
            this.average = (((this.c1.note + this.c2.note + this.c3.note) / 3) * 0.80) + (this.c1.quizNote * 0.20);
        else if (this.c2.prefix.equals("FZK"))
            this.average = (((this.c1.note + this.c2.note + this.c3.note) /3 * 0.60) + (this.c1.quizNote * 0.40));
        else if (this.c3.prefix.equals("BIO"))
            this.average = (((this.c1.note + this.c2.note + this.c3.note) / 3 * 0.70) + (this.c1.quizNote * 0.30));

        if (this.average >= 55) {
            System.out.println("Average: " + this.average + " Success!");
        }
        else
            System.out.println("Average: " + this.average + " Fail!");
    }
}
