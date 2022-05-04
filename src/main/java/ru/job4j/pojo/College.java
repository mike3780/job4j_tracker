package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Дмитрий Иванович Иванов");
        student.setGroup(7);
        student.setDate("01.09.2021");

        System.out.println(student.getFullName() + " поступил в колледж " + student.getDate()
                + " и зачислен в группу №" + student.getGroup());
    }
}
