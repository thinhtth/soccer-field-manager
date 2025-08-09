/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phanmemquanlysanbongda_tranthaihuuthinh;
import model.*;
import service.*;
import java.time.LocalDateTime;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Phanmemquanlysanbongda_TranThaiHuuThinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        FieldService fieldService = new FieldService();
        BookingService bookingService = new BookingService();
        ServiceManager serviceManager = new ServiceManager();
        EmployeeManager employeeManager = new EmployeeManager();

        int choice;
        do {
            System.out.println("\n=== QUAN LY SAN BONG ===");
            System.out.println("1. Quan ly san");
            System.out.println("2. Quan ly lich dat");
            System.out.println("3. Quan ly dich vu");
            System.out.println("4. Quan ly nhan vien");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    fieldService.showAllFields();
                    break;
                case 2:
                    bookingService.showAllBookings();
                    break;
                case 3:
                    serviceManager.showAllServices();
                    break;
                case 4:
                    employeeManager.showAllEmployees();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 0);

        scanner.close();
    }
  }
    

