package OOP.task5;

import OOP.task5.Groups.Disciplines;

public class main {
    public static void main(String[] args) {
//        MathGroup group1 = new MathGroup();
//        group1.setMark(Disciplines.MATHEMATICS, 5);
//        group1.setMark(Disciplines.MATHEMATICS, 98);
//        group1.setMark(Disciplines.COMPUTER_SCIENCE, 8.78);
//        group1.setMark(Disciplines.COMPUTER_SCIENCE, 0.78);
//        group1.printSubjectMark(Disciplines.MATHEMATICS);
//        group1.printAllMarks();
//        group1.clear();
//        group1.printAllMarks();

        Student john = new Student("John");
        john.Subscribe(Disciplines.MATHEMATICS);
        john.Subscribe(Disciplines.BIOLOGY);

        john.setMark(Disciplines.MATHEMATICS, 5);
        john.setMark(Disciplines.MATHEMATICS, 98);
        john.setMark(Disciplines.COMPUTER_SCIENCE, 8.78);
        john.setMark(Disciplines.COMPUTER_SCIENCE, 0.78);
        //group2.setMark(Disciplines.COMPUTER_SCIENCE, 8.78);
        //group1.printSubjectMark(Disciplines.MATHEMATICS);
        //john.UnSubscribe(Disciplines.COMPUTER_SCIENCE);
        System.out.println(john.subjectMark(Disciplines.MATHEMATICS));

//        john.UnSubscribe(Disciplines.MATHEMATICS);
//        group1.printAllMarks();

    }


}
