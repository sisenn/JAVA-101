public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Sinem Sen", "3456", "BIO");
        Teacher t2 = new Teacher("Asiye Şen", "7654", "TRH");
        Teacher t3 = new Teacher("Ayşe Can", "6765", "FZK");

        Course tarih = new Course("Tarih", "101", "TRH", 0);
        tarih.addTeacher(t2);
        Course fizik = new Course("Fizik", "101", "FZK", 0);
        fizik.addTeacher(t3);
        Course biyoloji = new Course("Biyoloji", "101", "BIO", 0);
        biyoloji.addTeacher(t1);


        Student s1 = new Student("Sinan", "234", "5", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100, 100, 100);
        s1.isPass();
        Student s2 = new Student("Fatma", "134", "3", tarih, fizik, biyoloji);
        s1.addBulkExamNote(14, 96, 89);
        s1.isPass();
        Student s3 = new Student("Ceyda", "204", "5", tarih, fizik, biyoloji);
        s1.addBulkExamNote(34, 60, 89);
        s1.isPass();


    }
}
