package BaiTap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào thông tin của 3 nhân viên: ");
        for (int i = 0; i < employees.length; i++) {
            String tenDuong = input.nextLine();
            String ten = input.nextLine();
            double luong = input.nextDouble();
            Address address = new Address();
            address.setTenDuong(tenDuong);
            Employee employee = new Employee(ten, luong);
            employee.setAddress(address);
            employees[i] = employee;
            input.nextLine();
        }
        for (Employee emp :employees) {
            System.out.println(emp.getTen()+ "địa chỉ"+ emp.getAddress().getTenDuong()+ "Lương"+ emp.getLuong());

        }
    }
}
