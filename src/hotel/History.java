/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.sql.Timestamp;

/**
 *
 * @author Butrint Bajrami
 */
public class History {
    
    private int id;
    private int admin_id;
    private Timestamp date;
    
    public History(int id, int admin_id, Timestamp date){
        this.id = id;
        this.admin_id = admin_id;
        this.date = date;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
        
}
