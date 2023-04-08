package handle;

import entity.Student;

import java.util.Scanner;


public class StudentHandle {
    public Student createStudent(Scanner sc , int i) {
        System.out.println("Nhập học sinh thứ "+(i+1));
        System.out.println("Nhập tên:");
        String name =sc.nextLine();
        System.out.println("Nhập điểm môn toán:");
        double scoreMath=Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm môn lý:");
        double scorePhysic =Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm môn hóa:");
        double scoreChemistry =Double.parseDouble(sc.nextLine());
        Student student=new Student(name,scoreMath,scorePhysic,scoreChemistry);
        return student;
    }
    public void displayAllStudent(Student[] students){
        for(Student st: students){
            System.out.println(st.toString());
        }
    }
    public double getAVGScore(Student student){
        return (student.getScoreMath()+ student.getScoreChemistry() + student.getScorePhysic())/3;
    }
    public static double typeA=0;
    public static double typeB=0;
    public static double typeC=0;



    public String classify(double scoreAvg){
        if(scoreAvg>=8){
            typeA++;
            return "A";

        }else if(scoreAvg>=6.5 && scoreAvg<8){
            typeB++;
            return "B";
        }else {
            typeC++;
            return "C";
        }

    }
//    public static double percentType(char type) {
//        double percentage = 0;
//        switch (type) {
//            case 'A':
//                percentage = (double) typeA / students.length * 100;
//                break;
//            case 'B':
//                percentage = (double) typeB / students.length * 100;
//                break;
//            case 'C':
//                percentage = (double) typeC / students.length * 100;
//                break;
//            default:
//                System.out.println("Invalid type");
//        }
//        return percentage;
//    }








    public double percentType(double typeX){
        return (typeX /(typeA+typeB+typeC))*100;
    }


}
