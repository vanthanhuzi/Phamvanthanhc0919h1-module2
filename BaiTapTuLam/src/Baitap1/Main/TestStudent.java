package Baitap1.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        int choose;
        Scanner input = new Scanner(System.in);

        do{
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            switch (choose){
                case 1:
                    System.out.println("nhập số sinh viên cần thêm");
                    int n = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student std = new Student();
                        std.inputInfor();
                        studentList.add(std);
                    }
                    break;
                case 2:
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfor();
                    }
                    break;
                case 3:
                    int minIndex = 0, maxIndex = 0;
                    float minMark, maxMark;
                    minMark = studentList.get(0).getAvgMark();
                    maxMark = studentList.get(0).getAvgMark();
                    for (int i = 0; i < studentList.size(); i++) {
                        if(minMark > studentList.get(i).getAvgMark()){
                            minMark = studentList.get(i).getAvgMark();
                            minIndex = i;
                        }
                    }
                    System.out.println("điểm trung bình thấp nhất là: ");
                   studentList.get(minIndex).showInfor();
                    for (int i = 0; i < studentList.size(); i++) {
                        if(maxMark < studentList.get(i).getAvgMark()){
                            maxMark = studentList.get(i).getAvgMark();
                            maxIndex = i;
                        }
                    }
                    System.out.println("điểm trung bình cao nhất là: ");
                   studentList.get(maxIndex).showInfor();
                    break;
                case 4:
                    System.out.println("nhập rollNo cần tìm kiếm: ");
                    String searchRollNo = input.nextLine();
                    int count = 0;
                    for (Student student: studentList) {
                        if(student.getRollNo().equals(searchRollNo)){
                            student.showInfor();
                            count++;
                        }
                        if(count==0){
                            System.out.println("không tìm thấy sinh viên");
                        }

                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("nhập sai");
            }



    }while (choose!=7);}
    static void showMenu(){
        System.out.println("1. Nhập vào N sinh viên:");
        System.out.println("2. Hiển thị thông tin sinh viên");
        System.out.println("3. Hiển thị max và min theo điểm trung bình ");
        System.out.println("4. Tìm kiếm theo msv");
        System.out.println("5. Sort A-z và hiển thị theo tên sinh viên");
        System.out.println("6. Hiển thị sinh viên được hoc bổng và sort mark giảm dần ");
        System.out.println("7. Thoát");
    }
}

