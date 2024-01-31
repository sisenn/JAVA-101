public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int quizNote;


    Course(String name, String code, String prefix, int quizNote) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quizNote = quizNote;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }
        else
            System.out.println("Teacher and prefix is not valid!");
    }

}
