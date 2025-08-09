/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDateTime;
/**
 *
 * @author Admin
 */
public class Booking {
    private String bookingId;
    private String customerName;
    private Field field;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Booking(String bookingId, String customerName, Field field, LocalDateTime startTime, LocalDateTime endTime) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.field = field;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // ✅ Thêm hàm public getTotalPrice
    public double getTotalPrice() {
        long hours = java.time.Duration.between(startTime, endTime).toHours();
        return hours * field.getPricePerHour();
    }

    public void displayInfo() {
        System.out.println("Ma dat san: " + bookingId + " | Ten KH: " + customerName);
        field.displayInfo();
        System.out.println("Bat dau: " + startTime + " | Ket thuc: " + endTime);
        System.out.printf("Tong tien: %.2f VND%n", getTotalPrice());
    }
}
