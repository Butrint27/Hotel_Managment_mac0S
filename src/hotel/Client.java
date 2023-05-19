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
public class Client {
    
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String security_question;
    private String security_answer;   
    private Timestamp date;
    
    public Client(int id, String name, String surname, String email, String password, String security_question, String security_answer, Timestamp date){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.security_question = security_question;
        this.security_answer = security_answer;  
        this.date = date;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurity_question() {
        return security_question;
    }

    public void setSecurity_question(String security_question) {
        this.security_question = security_question;
    }

    public String getSecurity_answer() {
        return security_answer;
    }

    public void setSecurity_answer(String security_answer) {
        this.security_answer = security_answer;
    }   
    
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
