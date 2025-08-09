/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.Field;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class FieldService {
    private ArrayList<Field> fields = new ArrayList<>();

    public void addField(Field field) {
        fields.add(field);
    }

    public Field findById(String id) {
        for (Field f : fields) {
            if (f.getId().equalsIgnoreCase(id)) return f;
        }
        return null;
    }

    public void showAllFields() {
        if (fields.isEmpty()) {
            System.out.println("Khong co san nao.");
            return;
        }
        for (Field f : fields) f.displayInfo();
    }
}
