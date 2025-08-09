/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.Employee;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("Khong co nhan vien nao.");
            return;
        }
        for (Employee e : employees) e.displayInfo();
    }
}
