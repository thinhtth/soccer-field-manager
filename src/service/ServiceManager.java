/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Service;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class ServiceManager {
     private ArrayList<Service> services = new ArrayList<>();

    public void addService(Service service) {
        services.add(service);
    }

    public void showAllServices() {
        if (services.isEmpty()) {
            System.out.println("Khong co dich vu nao.");
            return;
        }
        for (Service s : services) s.displayInfo();
    }
}
