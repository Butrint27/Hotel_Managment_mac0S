/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Butrint Bajrami
 */
public class User_News extends javax.swing.JFrame {

    /**
     * Creates new form User_News
     */
    public User_News() {
        FlatLightLaf.setup();
        initComponents();
        scaleImage();
        starImage();
        starImage_1();
        starImage_2();
        
           try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
            Statement stmt = con.createStatement();
            String query = ("SELECT * FROM news ORDER BY id DESC LIMIT 1;");
            ResultSet rs =  stmt.executeQuery(query);
            
            if(rs.next()){
                
                  title_label.setText(rs.getString("title"));
                  subtitle_label.setText(rs.getString("subtitle"));
            }
               
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }
           
             try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
            Statement stmt = con.createStatement();
            String query = ("SELECT * FROM news_2 ORDER BY id DESC LIMIT 1;");
            ResultSet rs =  stmt.executeQuery(query);
            
            if(rs.next()){
                
                  title_label2.setText(rs.getString("title"));
                  subtitle_label2.setText(rs.getString("subtitle"));
            }
               
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }
             
               try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
            Statement stmt = con.createStatement();
            String query = ("SELECT * FROM news_3 ORDER BY id DESC LIMIT 1;");
            ResultSet rs =  stmt.executeQuery(query);
            
            if(rs.next()){
                
                  title_label3.setText(rs.getString("title"));
                  subtitle_label3.setText(rs.getString("subtitle"));
            }
               
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public void scaleImage(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Butrint Bajrami\\Documents\\NetBeansProjects\\Hotel_Managment_1\\src\\img\\hotel_prishtina_logo.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
    }
     
      public void starImage(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Butrint Bajrami\\Documents\\NetBeansProjects\\Hotel_Managment_1\\src\\gallery_img\\mail.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(star_label.getWidth(), star_label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        star_label.setIcon(scaledIcon);
    }
      
      public void starImage_1(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Butrint Bajrami\\Documents\\NetBeansProjects\\Hotel_Managment_1\\src\\gallery_img\\mail.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(star_label1.getWidth(), star_label1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        star_label1.setIcon(scaledIcon);
    }
      
      public void starImage_2(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Butrint Bajrami\\Documents\\NetBeansProjects\\Hotel_Managment_1\\src\\gallery_img\\mail.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(star_label2.getWidth(), star_label2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        star_label2.setIcon(scaledIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        gallery_button = new javax.swing.JButton();
        rooms_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        booking_button = new javax.swing.JButton();
        news_button = new javax.swing.JButton();
        contact_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        star_label = new javax.swing.JLabel();
        title_label = new javax.swing.JLabel();
        subtitle_label = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        star_label1 = new javax.swing.JLabel();
        title_label2 = new javax.swing.JLabel();
        subtitle_label2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        star_label2 = new javax.swing.JLabel();
        title_label3 = new javax.swing.JLabel();
        subtitle_label3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(237, 200, 119));

        gallery_button.setBackground(new java.awt.Color(237, 200, 119));
        gallery_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        gallery_button.setForeground(new java.awt.Color(0, 0, 0));
        gallery_button.setText("Gallery");
        gallery_button.setBorder(null);
        gallery_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gallery_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gallery_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gallery_buttonMouseExited(evt);
            }
        });
        gallery_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gallery_buttonActionPerformed(evt);
            }
        });

        rooms_button.setBackground(new java.awt.Color(237, 200, 119));
        rooms_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        rooms_button.setForeground(new java.awt.Color(0, 0, 0));
        rooms_button.setText("Rooms");
        rooms_button.setBorder(null);
        rooms_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rooms_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rooms_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rooms_buttonMouseExited(evt);
            }
        });
        rooms_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rooms_buttonActionPerformed(evt);
            }
        });

        logout_button.setBackground(new java.awt.Color(237, 200, 119));
        logout_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        logout_button.setForeground(new java.awt.Color(0, 0, 0));
        logout_button.setText("Log Out");
        logout_button.setBorder(null);
        logout_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout_buttonMouseExited(evt);
            }
        });
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });

        booking_button.setBackground(new java.awt.Color(237, 200, 119));
        booking_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        booking_button.setForeground(new java.awt.Color(0, 0, 0));
        booking_button.setText("Booking");
        booking_button.setBorder(null);
        booking_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        booking_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                booking_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                booking_buttonMouseExited(evt);
            }
        });
        booking_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_buttonActionPerformed(evt);
            }
        });

        news_button.setBackground(new java.awt.Color(237, 200, 119));
        news_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        news_button.setForeground(new java.awt.Color(0, 0, 0));
        news_button.setText("News");
        news_button.setBorder(null);
        news_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        news_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                news_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                news_buttonMouseExited(evt);
            }
        });
        news_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                news_buttonActionPerformed(evt);
            }
        });

        contact_button.setBackground(new java.awt.Color(237, 200, 119));
        contact_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        contact_button.setForeground(new java.awt.Color(0, 0, 0));
        contact_button.setText("Contact");
        contact_button.setBorder(null);
        contact_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contact_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contact_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contact_buttonMouseExited(evt);
            }
        });
        contact_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
            .addComponent(gallery_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rooms_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(booking_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(news_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contact_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gallery_button, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rooms_button, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(booking_button, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(news_button, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contact_button, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(149, 149, 149)
                .addComponent(logout_button, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(229, 229, 229));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BOOK NOW");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footer_icon/call.png"))); // NOI18N
        jLabel4.setText("+383 38 611611");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footer_icon/email.png"))); // NOI18N
        jLabel5.setText("info@hotel-prishtina.com");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footer_icon/facebook.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footer_icon/instagram.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ABOUT US");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Located in the center of Pristina, 200 m from the NEWBORN monument. Hotel");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("events such as business meetings, seminars, trainings, media events and");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Prishtina offers 2 exclusive conference spaces, both are suitable for various");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("cocktails. They’re all equipped to be made flexible to suit your capacity needs.");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("So, bring along your colleagues and motivate them with our professionally");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("planned meetings in the center of our city.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addGap(289, 289, 289)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(0, 12, Short.MAX_VALUE))))
        );

        jPanel4.setBackground(new java.awt.Color(184, 159, 128));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(star_label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(star_label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        title_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title_label.setForeground(new java.awt.Color(0, 0, 0));
        title_label.setText("jLabel2");

        subtitle_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        subtitle_label.setForeground(new java.awt.Color(0, 0, 0));
        subtitle_label.setText("jLabel3");

        jPanel6.setBackground(new java.awt.Color(184, 159, 128));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(star_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(star_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        title_label2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title_label2.setForeground(new java.awt.Color(0, 0, 0));
        title_label2.setText("jLabel2");

        subtitle_label2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        subtitle_label2.setForeground(new java.awt.Color(0, 0, 0));
        subtitle_label2.setText("jLabel3");

        jPanel5.setBackground(new java.awt.Color(184, 159, 128));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(star_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(star_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        title_label3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title_label3.setForeground(new java.awt.Color(0, 0, 0));
        title_label3.setText("jLabel2");

        subtitle_label3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        subtitle_label3.setForeground(new java.awt.Color(0, 0, 0));
        subtitle_label3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(title_label)
                                    .addComponent(subtitle_label)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(title_label2)
                                    .addComponent(subtitle_label2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(title_label3)
                                    .addComponent(subtitle_label3))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(title_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subtitle_label))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(title_label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subtitle_label2))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(title_label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subtitle_label3)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gallery_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallery_buttonMouseEntered
        gallery_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_gallery_buttonMouseEntered

    private void gallery_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallery_buttonMouseExited
        gallery_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_gallery_buttonMouseExited

    private void gallery_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gallery_buttonActionPerformed
        User_Gallery ug = new User_Gallery();
        ug.show();
        dispose();
    }//GEN-LAST:event_gallery_buttonActionPerformed

    private void rooms_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rooms_buttonMouseEntered
        rooms_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_rooms_buttonMouseEntered

    private void rooms_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rooms_buttonMouseExited
        rooms_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_rooms_buttonMouseExited

    private void rooms_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rooms_buttonActionPerformed
        User_Rooms ur = new User_Rooms();
        ur.show();
        dispose();
    }//GEN-LAST:event_rooms_buttonActionPerformed

    private void logout_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_buttonMouseEntered
        logout_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_logout_buttonMouseEntered

    private void logout_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_buttonMouseExited
        logout_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_logout_buttonMouseExited

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        Login_Side ls = new Login_Side();
        ls.show();
        dispose();
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void booking_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booking_buttonMouseEntered
        booking_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_booking_buttonMouseEntered

    private void booking_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booking_buttonMouseExited
        booking_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_booking_buttonMouseExited

    private void booking_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_buttonActionPerformed
        User_Booking ub = new User_Booking();
        ub.show();
        dispose();
    }//GEN-LAST:event_booking_buttonActionPerformed

    private void news_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_news_buttonMouseEntered
        news_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_news_buttonMouseEntered

    private void news_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_news_buttonMouseExited
        news_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_news_buttonMouseExited

    private void news_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_news_buttonActionPerformed
        User_News un = new User_News();
        un.show();
        dispose();
    }//GEN-LAST:event_news_buttonActionPerformed

    private void contact_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_buttonMouseEntered
        contact_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_contact_buttonMouseEntered

    private void contact_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_buttonMouseExited
        contact_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_contact_buttonMouseExited

    private void contact_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_buttonActionPerformed
        User_Contact uc = new User_Contact();
        uc.show();
        dispose();
    }//GEN-LAST:event_contact_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User_News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_News().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton booking_button;
    private javax.swing.JButton contact_button;
    private javax.swing.JButton gallery_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel label;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton news_button;
    private javax.swing.JButton rooms_button;
    private javax.swing.JLabel star_label;
    private javax.swing.JLabel star_label1;
    private javax.swing.JLabel star_label2;
    private javax.swing.JLabel subtitle_label;
    private javax.swing.JLabel subtitle_label2;
    private javax.swing.JLabel subtitle_label3;
    private javax.swing.JLabel title_label;
    private javax.swing.JLabel title_label2;
    private javax.swing.JLabel title_label3;
    // End of variables declaration//GEN-END:variables
}
