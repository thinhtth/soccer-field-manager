/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Field {
    private String id;
    private String type; // Loại sân: "5", "7", "11"
    private String status; // Trạng thái: "Available", "Booked"
    private double pricePerHour;

    public Field(String type, String status, double pricePerHour) {
        this.id = String.valueOf(System.currentTimeMillis());
        this.type = type;
        this.status = status;
        this.pricePerHour = pricePerHour;
    }

    public Field(String id, String type, String status, double pricePerHour) {
        this.id = id;
        this.type = type;
        this.status = status;
        this.pricePerHour = pricePerHour;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + " | Loai: " + type + " | Trang thai: " + status + " | Gia/h: " + pricePerHour + " VND");
    }
}
