/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Booking;
import model.Field;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class BookingService {
        private ArrayList<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public void showAllBookings() {
        if (bookings.isEmpty()) {
            System.out.println("Khong co lich dat nao.");
            return;
        }
        for (Booking b : bookings) b.displayInfo();
    }

    public double calculateTotalRevenue() {
        double total = 0;
        for (Booking b : bookings) {
            total += b.getTotalPrice();
        }
        return total;
    }
}
