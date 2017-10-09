import java.util.*;
public class Application {
    public static void main(String[] args) {
        class Student {
            public String firstName;
            public String lastName;
            public Student(String firstNames, String lastNames) {
                this.firstName = firstNames;
                this.lastName = lastNames;
            }
        }
        Student[] s = new Student[5];
        int i = 0; double resultOver = 0;
        int[] result = new int[5];
        s[0] = new Student("Petr", "Petrov");
        s[1] = new Student("Anna", "Shkadun");
        s[2] = new Student("firstName", "lastName");
        s[3] = new Student("Java", "Programmer");
        s[4] = new Student("Net", "Bins");
        for(i = 0; i < 5; i++) {
            result[i] = (int)(Math.random() * 4) + 1;
            System.out.println("Student: " + s[i].firstName + " " + s[i].lastName + " result: " + result[i]);
        }
        for(i = 0; i < 5; i++) {
            resultOver += result[i];
        }
        System.out.println("resultOver = " + (resultOver / 5));
//--------------------------------------------------------------------------------------------------//
        class Ticket {
            int id;
            String question;

            public Ticket(int ids, String questions) {
                this.id = ids;
                this.question = questions;
            }
        }
        Ticket[] t = new Ticket[10];
        resultOver = 0;
        String[] quest = {"quest1", "quesr2", "quest3", "quest4", "quest5", "quest6",
                "quest7", "quest8", "quest9", "quest10"};
        for(i = 0; i < 5; i++) {
            t[i] = new Ticket(i, quest[(int)(Math.random() * 10)]);
            result[i] = (int)(Math.random() * 4) + 1;
        }
        for(i = 0; i < 5; i++) {
            System.out.println("Имя студента: " + s[i].firstName + " " + s[i].lastName + " " +
                    "Номер билета: " + t[i].question + " Оценка: " + result[i]);
            resultOver += result[i];
        }
        System.out.println("Результат группы: " + (resultOver / 5));
//------------------------------------------------------------------------------------------------------//
        class Group {
            String student;
            String quest;
            int result;
            public Group(String students, String quests, int results) {
                this.student = students;
                this.quest = quests;
                this.result = results;
            }
        }
        double resultGroupOne = 0, resultGroupTwo = 0;
        Group[] g1 = new Group[5];
        Group[] g2 = new Group[5];
        int minPositionOne = 0, minPositionTwo = 0, maxPositionOne = 0, maxPositionTwo = 0, min = 6, max = 0;
        for(i = 0; i < 5; i++) {
            g1[i] = new Group(("Студент из группы 1 " + i), quest[(int)((Math.random() * 10))], (int)((Math.random() * 4) + 1));
            g2[i] = new Group(("Студент из группы 2 " + i), quest[(int)((Math.random() * 10))], (int)((Math.random() * 4) + 1));
        }
        System.out.println("Группа 1: ");
        for(i = 0; i < 5; i++) {
            System.out.println("Студент: " + g1[i].student + " Вопрос: " + g1[i].quest + " Результат: " + g1[i].result);
            resultGroupOne += g1[i].result;
        }
        System.out.println("Результат: " + (resultGroupOne / 5) + "\nГруппы 2: ");
        for(i = 0; i < 5; i++) {
            System.out.println("Студент: " + g2[i].student + " Вопрос: " + g2[i].quest + " Результат: " + g2[i].result);
            resultGroupTwo += g2[i].result;
        }
        System.out.println("Результат группы 2: " + (resultGroupTwo / 5));
        for(i = 0; i < 5; i++) {
            if(g1[i].result > max) {
                max = g1[i].result;
                maxPositionOne = i;
            }
            if(g1[i].result < min) {
                min = g1[i].result;
                minPositionOne = i;
            }
        }
        max = 0; min = 6;
        for(i = 0; i < 5; i++) {
            if(g2[i].result > max) {
                max = g2[i].result;
                maxPositionTwo = i;
            }
            if(g2[i].result < min) {
                min = g2[i].result;
                minPositionTwo = i;
            }
        }
        System.out.println("Максимальный балл в группе 1: " + g1[maxPositionOne].student + ' ' + g1[maxPositionOne].quest + ' ' + g1[maxPositionOne].result +
                " минимальный балл в группе 1: " + g1[minPositionOne].student + ' ' + g1[minPositionOne].quest + ' ' + g1[minPositionOne].result);
        System.out.println("Максимальный балл в группе 2: " + g2[maxPositionTwo].student + ' ' + g2[maxPositionTwo].quest + ' ' + g2[maxPositionTwo].result +
                " минимальный балл в группе 2: " + g2[minPositionTwo].student + ' ' +
                g2[minPositionTwo].quest + ' ' + g2[minPositionTwo].result);
    }
}