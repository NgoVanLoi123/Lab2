import entity.Student;
import handle.StudentHandle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số lượng học sinh:");
        int n=Integer.parseInt(sc.nextLine());
        Student[] students =new Student[n];
        StudentHandle studentHandle =new StudentHandle();
        for(int i=0;i<n;i++){
            Student student=studentHandle.createStudent(sc,i);
            students[i]=student;

        }
        studentHandle.displayAllStudent(students);
        for(Student i: students){
            System.out.println("Điểm trung bình của "+ i.getName()+" là: "+studentHandle.getAVGScore(i));
            System.out.println("Xếp loại là của "+i.getName()+" là: "+studentHandle.classify(studentHandle.getAVGScore(i)));
        }

        System.out.println("% từng loại là:");
        System.out.println( "Loại A: "+studentHandle.percentType(studentHandle.typeA)+"%");
        System.out.println( "Loại B: "+studentHandle.percentType(studentHandle.typeB)+"%");
        System.out.println( "Loại C: "+studentHandle.percentType(studentHandle.typeC)+"%");



    }
}