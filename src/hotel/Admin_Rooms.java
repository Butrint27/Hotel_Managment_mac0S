/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Butrint Bajrami
 */
public class Admin_Rooms extends javax.swing.JFrame {
    
     File f = null;
     String path = null;
     private ImageIcon format = null;
     String fname = null;
     int s = 0;
     
     Connection con;
     PreparedStatement pst;
     ResultSet rs;

    
    public Admin_Rooms() {
        FlatLightLaf.setup();
        initComponents();
        scaleImage();
        
        gallery_1();
        gallery_2();
        gallery_3();
        gallery_4();
        gallery_5();
        gallery_6();
        
        Connect();
        
        imagePath.setVisible(false);
        id_field.setVisible(false);
        
        show_reservation_table();
    }
    
     public void Connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
        }catch(Exception e){
            
        }
    }
    
     public void scaleImage(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Butrint Bajrami\\Documents\\NetBeansProjects\\Hotel_Managment_1\\src\\img\\hotel_prishtina_logo.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
    }
     
     public void gallery_1(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Butrint Bajrami\\Documents\\NetBeansProjects\\Hotel_Managment_1\\src\\gallery_img\\icons8-picture-480.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label_1.getWidth(), label_1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label_1.setIcon(scaledIcon);
    }
     
      public void gallery_2(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Butrint Bajrami\\Documents\\NetBeansProjects\\Hotel_Managment_1\\src\\gallery_img\\icons8-picture-480.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label_2.getWidth(), label_2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label_2.setIcon(scaledIcon);
    }
      
       public void gallery_3(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Butrint Bajrami\\Documents\\NetBeansProjects\\Hotel_Managment_1\\src\\gallery_img\\icons8-picture-480.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label_3.getWidth(), label_3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label_3.setIcon(scaledIcon);
    }
       
        public void gallery_4(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Butrint Bajrami\\Documents\\NetBeansProjects\\Hotel_Managment_1\\src\\gallery_img\\icons8-picture-480.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label_4.getWidth(), label_4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label_4.setIcon(scaledIcon);
    }
        
         public void gallery_5(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Butrint Bajrami\\Documents\\NetBeansProjects\\Hotel_Managment_1\\src\\gallery_img\\icons8-picture-480.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label_5.getWidth(), label_5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label_5.setIcon(scaledIcon);
    }
         
          public void gallery_6(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Butrint Bajrami\\Documents\\NetBeansProjects\\Hotel_Managment_1\\src\\gallery_img\\icons8-picture-480.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label_6.getWidth(), label_6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label_6.setIcon(scaledIcon);
    }
          
       public void show_reservation_table(){
       String sql = "SELECT * FROM reservation";
       
       try{
           Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           DefaultTableModel model = (DefaultTableModel)reservation_table.getModel();
            while(rs.next()){
                model.addRow(new String [] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)});
            }            
       }catch(Exception e){
          JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
       }
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
        logout_button = new javax.swing.JButton();
        client_button = new javax.swing.JButton();
        staff_button = new javax.swing.JButton();
        gallery_button = new javax.swing.JButton();
        news_button = new javax.swing.JButton();
        rooms_button = new javax.swing.JButton();
        restaurant_button = new javax.swing.JButton();
        messages_button = new javax.swing.JButton();
        profile_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        label_1 = new javax.swing.JLabel();
        browse_1 = new javax.swing.JButton();
        save_1 = new javax.swing.JButton();
        label_4 = new javax.swing.JLabel();
        browse_4 = new javax.swing.JButton();
        save_4 = new javax.swing.JButton();
        label_2 = new javax.swing.JLabel();
        browse_2 = new javax.swing.JButton();
        save_2 = new javax.swing.JButton();
        label_5 = new javax.swing.JLabel();
        browse_5 = new javax.swing.JButton();
        save_5 = new javax.swing.JButton();
        label_3 = new javax.swing.JLabel();
        browse_3 = new javax.swing.JButton();
        save_3 = new javax.swing.JButton();
        label_6 = new javax.swing.JLabel();
        browse_6 = new javax.swing.JButton();
        save_6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        imagePath = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reservation_table = new javax.swing.JTable();
        update_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        id_field = new javax.swing.JTextField();
        room_field = new javax.swing.JTextField();
        children_field = new javax.swing.JTextField();
        date_field = new javax.swing.JTextField();
        name_field = new javax.swing.JTextField();
        surname_field = new javax.swing.JTextField();
        email_field = new javax.swing.JTextField();
        adults_field = new javax.swing.JTextField();
        checkin_field = new javax.swing.JTextField();
        checkout_field = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(237, 200, 119));

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

        client_button.setBackground(new java.awt.Color(237, 200, 119));
        client_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        client_button.setForeground(new java.awt.Color(0, 0, 0));
        client_button.setText("Clients");
        client_button.setBorder(null);
        client_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        client_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                client_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                client_buttonMouseExited(evt);
            }
        });
        client_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_buttonActionPerformed(evt);
            }
        });

        staff_button.setBackground(new java.awt.Color(237, 200, 119));
        staff_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        staff_button.setForeground(new java.awt.Color(0, 0, 0));
        staff_button.setText("Staff");
        staff_button.setBorder(null);
        staff_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        staff_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                staff_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                staff_buttonMouseExited(evt);
            }
        });
        staff_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_buttonActionPerformed(evt);
            }
        });

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

        restaurant_button.setBackground(new java.awt.Color(237, 200, 119));
        restaurant_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        restaurant_button.setForeground(new java.awt.Color(0, 0, 0));
        restaurant_button.setText("Restaurant");
        restaurant_button.setBorder(null);
        restaurant_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restaurant_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                restaurant_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                restaurant_buttonMouseExited(evt);
            }
        });
        restaurant_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurant_buttonActionPerformed(evt);
            }
        });

        messages_button.setBackground(new java.awt.Color(237, 200, 119));
        messages_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        messages_button.setForeground(new java.awt.Color(0, 0, 0));
        messages_button.setText("Messages");
        messages_button.setBorder(null);
        messages_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        messages_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                messages_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                messages_buttonMouseExited(evt);
            }
        });
        messages_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messages_buttonActionPerformed(evt);
            }
        });

        profile_button.setBackground(new java.awt.Color(237, 200, 119));
        profile_button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        profile_button.setForeground(new java.awt.Color(0, 0, 0));
        profile_button.setText("Profile");
        profile_button.setBorder(null);
        profile_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profile_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profile_buttonMouseExited(evt);
            }
        });
        profile_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
            .addComponent(logout_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(client_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rooms_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(restaurant_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gallery_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(staff_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(news_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(messages_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profile_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(client_button, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rooms_button, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restaurant_button, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staff_button, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gallery_button, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(news_button, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messages_button, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profile_button, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(150, 150, 150)
                .addComponent(logout_button, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(237, 200, 119));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("        Rooms");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        browse_1.setBackground(new java.awt.Color(237, 200, 119));
        browse_1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        browse_1.setForeground(new java.awt.Color(0, 0, 0));
        browse_1.setText("Browse");
        browse_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        browse_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                browse_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                browse_1MouseExited(evt);
            }
        });
        browse_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse_1ActionPerformed(evt);
            }
        });

        save_1.setBackground(new java.awt.Color(237, 200, 119));
        save_1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        save_1.setForeground(new java.awt.Color(0, 0, 0));
        save_1.setText("Save");
        save_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                save_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                save_1MouseExited(evt);
            }
        });
        save_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_1ActionPerformed(evt);
            }
        });

        browse_4.setBackground(new java.awt.Color(237, 200, 119));
        browse_4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        browse_4.setForeground(new java.awt.Color(0, 0, 0));
        browse_4.setText("Browse");
        browse_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        browse_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                browse_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                browse_4MouseExited(evt);
            }
        });
        browse_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse_4ActionPerformed(evt);
            }
        });

        save_4.setBackground(new java.awt.Color(237, 200, 119));
        save_4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        save_4.setForeground(new java.awt.Color(0, 0, 0));
        save_4.setText("Save");
        save_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                save_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                save_4MouseExited(evt);
            }
        });
        save_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_4ActionPerformed(evt);
            }
        });

        browse_2.setBackground(new java.awt.Color(237, 200, 119));
        browse_2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        browse_2.setForeground(new java.awt.Color(0, 0, 0));
        browse_2.setText("Browse");
        browse_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        browse_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                browse_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                browse_2MouseExited(evt);
            }
        });
        browse_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse_2ActionPerformed(evt);
            }
        });

        save_2.setBackground(new java.awt.Color(237, 200, 119));
        save_2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        save_2.setForeground(new java.awt.Color(0, 0, 0));
        save_2.setText("Save");
        save_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                save_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                save_2MouseExited(evt);
            }
        });
        save_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_2ActionPerformed(evt);
            }
        });

        browse_5.setBackground(new java.awt.Color(237, 200, 119));
        browse_5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        browse_5.setForeground(new java.awt.Color(0, 0, 0));
        browse_5.setText("Browse");
        browse_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        browse_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                browse_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                browse_5MouseExited(evt);
            }
        });
        browse_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse_5ActionPerformed(evt);
            }
        });

        save_5.setBackground(new java.awt.Color(237, 200, 119));
        save_5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        save_5.setForeground(new java.awt.Color(0, 0, 0));
        save_5.setText("Save");
        save_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                save_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                save_5MouseExited(evt);
            }
        });
        save_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_5ActionPerformed(evt);
            }
        });

        browse_3.setBackground(new java.awt.Color(237, 200, 119));
        browse_3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        browse_3.setForeground(new java.awt.Color(0, 0, 0));
        browse_3.setText("Browse");
        browse_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        browse_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                browse_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                browse_3MouseExited(evt);
            }
        });
        browse_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse_3ActionPerformed(evt);
            }
        });

        save_3.setBackground(new java.awt.Color(237, 200, 119));
        save_3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        save_3.setForeground(new java.awt.Color(0, 0, 0));
        save_3.setText("Save");
        save_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                save_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                save_3MouseExited(evt);
            }
        });
        save_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_3ActionPerformed(evt);
            }
        });

        browse_6.setBackground(new java.awt.Color(237, 200, 119));
        browse_6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        browse_6.setForeground(new java.awt.Color(0, 0, 0));
        browse_6.setText("Browse");
        browse_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        browse_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                browse_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                browse_6MouseExited(evt);
            }
        });
        browse_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse_6ActionPerformed(evt);
            }
        });

        save_6.setBackground(new java.awt.Color(237, 200, 119));
        save_6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        save_6.setForeground(new java.awt.Color(0, 0, 0));
        save_6.setText("Save");
        save_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                save_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                save_6MouseExited(evt);
            }
        });
        save_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(browse_5)
                .addGap(18, 18, 18)
                .addComponent(save_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(536, 536, 536))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(browse_1)
                            .addGap(18, 18, 18)
                            .addComponent(save_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                            .addComponent(browse_2)
                            .addGap(18, 18, 18)
                            .addComponent(save_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(268, 268, 268)
                            .addComponent(browse_3)
                            .addGap(18, 18, 18)
                            .addComponent(save_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(94, 94, 94))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(label_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_5, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                            .addGap(78, 78, 78)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_6, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(browse_4)
                            .addGap(18, 18, 18)
                            .addComponent(save_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 727, Short.MAX_VALUE)
                            .addComponent(browse_6)
                            .addGap(18, 18, 18)
                            .addComponent(save_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(97, 97, 97)))
                    .addGap(2, 2, 2)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(629, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browse_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(browse_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(save_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(browse_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(save_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(browse_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(save_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(45, 45, 45)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(label_6, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(label_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(browse_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(save_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(browse_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(save_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(38, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePath)
                .addGap(536, 536, 536))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(237, 200, 119));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("      Reservation");

        reservation_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reservation_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Email", "Room", "Adults", "Children", "Check_In", "Check_Out", "Date"
            }
        ));
        reservation_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservation_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reservation_table);

        update_button.setBackground(new java.awt.Color(237, 203, 118));
        update_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_button.setForeground(new java.awt.Color(0, 0, 0));
        update_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_icon/update_icon.png"))); // NOI18N
        update_button.setText("Update");
        update_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                update_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                update_buttonMouseExited(evt);
            }
        });
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        delete_button.setBackground(new java.awt.Color(237, 203, 118));
        delete_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_button.setForeground(new java.awt.Color(0, 0, 0));
        delete_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_icon/delete_icon.png"))); // NOI18N
        delete_button.setText("Delete");
        delete_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete_buttonMouseExited(evt);
            }
        });
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        id_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        room_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        room_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room_fieldActionPerformed(evt);
            }
        });

        children_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        date_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_fieldActionPerformed(evt);
            }
        });

        name_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });

        surname_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        surname_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surname_fieldActionPerformed(evt);
            }
        });

        email_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_fieldActionPerformed(evt);
            }
        });

        adults_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adults_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adults_fieldActionPerformed(evt);
            }
        });

        checkin_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkin_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkin_fieldActionPerformed(evt);
            }
        });

        checkout_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkout_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkout_fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(update_button, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(delete_button, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(id_field))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(surname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(checkin_field, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(checkout_field, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(room_field, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adults_field, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(children_field, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(date_field, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adults_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(room_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(surname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(children_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkin_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkout_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                .addContainerGap())
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

    private void client_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_buttonMouseEntered
        client_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_client_buttonMouseEntered

    private void client_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_buttonMouseExited
        client_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_client_buttonMouseExited

    private void client_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_buttonActionPerformed
        Admin_Client ac = new Admin_Client();
        ac.show();
        dispose();
    }//GEN-LAST:event_client_buttonActionPerformed

    private void staff_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_buttonMouseEntered
        staff_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_staff_buttonMouseEntered

    private void staff_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_buttonMouseExited
        staff_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_staff_buttonMouseExited

    private void staff_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_buttonActionPerformed
        Admin_Staff af = new Admin_Staff();
        af.show();
        dispose();
    }//GEN-LAST:event_staff_buttonActionPerformed

    private void gallery_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallery_buttonMouseEntered
        gallery_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_gallery_buttonMouseEntered

    private void gallery_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallery_buttonMouseExited
        gallery_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_gallery_buttonMouseExited

    private void gallery_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gallery_buttonActionPerformed
        Admin_Gallery ag = new Admin_Gallery();
        ag.show();
        dispose();
    }//GEN-LAST:event_gallery_buttonActionPerformed

    private void news_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_news_buttonMouseEntered
        news_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_news_buttonMouseEntered

    private void news_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_news_buttonMouseExited
        news_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_news_buttonMouseExited

    private void news_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_news_buttonActionPerformed
        Admin_News an = new Admin_News();
        an.show();
        dispose();
    }//GEN-LAST:event_news_buttonActionPerformed

    private void rooms_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rooms_buttonMouseEntered
        rooms_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_rooms_buttonMouseEntered

    private void rooms_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rooms_buttonMouseExited
        rooms_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_rooms_buttonMouseExited

    private void rooms_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rooms_buttonActionPerformed
        Admin_Rooms ar = new Admin_Rooms();
        ar.show();
        dispose();
    }//GEN-LAST:event_rooms_buttonActionPerformed

    private void restaurant_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurant_buttonMouseEntered
        restaurant_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_restaurant_buttonMouseEntered

    private void restaurant_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurant_buttonMouseExited
        restaurant_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_restaurant_buttonMouseExited

    private void restaurant_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurant_buttonActionPerformed
        Admin_Resturant ar = new Admin_Resturant();
        dispose();
        ar.show();
    }//GEN-LAST:event_restaurant_buttonActionPerformed

    private void messages_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messages_buttonMouseEntered
        messages_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_messages_buttonMouseEntered

    private void messages_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messages_buttonMouseExited
        messages_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_messages_buttonMouseExited

    private void messages_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messages_buttonActionPerformed
        Admin_Messages am = new Admin_Messages();
        am.show();
        dispose();
    }//GEN-LAST:event_messages_buttonActionPerformed

    private void profile_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_buttonMouseEntered
        profile_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_profile_buttonMouseEntered

    private void profile_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_buttonMouseExited
        profile_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_profile_buttonMouseExited

    private void profile_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_buttonActionPerformed
        Admin_Profile ap = new Admin_Profile();
        ap.show();
        dispose();
    }//GEN-LAST:event_profile_buttonActionPerformed

    private void browse_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browse_1MouseEntered
        browse_1.setForeground(Color.WHITE);
    }//GEN-LAST:event_browse_1MouseEntered

    private void browse_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browse_1MouseExited
        browse_1.setForeground(Color.BLACK);
    }//GEN-LAST:event_browse_1MouseExited

    private void browse_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse_1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG","png","jpeg","jpg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load = fileChooser.showOpenDialog(null);

        if(load==fileChooser.APPROVE_OPTION){
            f = fileChooser.getSelectedFile();
            path = f.getAbsolutePath();
            imagePath.setText(path);
            ImageIcon ii = new ImageIcon(path);
            Image img = ii.getImage().getScaledInstance(label_1.getWidth(),label_1.getHeight(), Image.SCALE_SMOOTH);
            label_1.setIcon(new ImageIcon(img));

        }
    }//GEN-LAST:event_browse_1ActionPerformed

    private void save_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_1MouseEntered
        save_1.setForeground(Color.WHITE);
    }//GEN-LAST:event_save_1MouseEntered

    private void save_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_1MouseExited
        save_1.setForeground(Color.BLACK);
    }//GEN-LAST:event_save_1MouseExited

    private void save_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_1ActionPerformed
        System.out.println("Image Path - " + path);
        System.out.println("Image Name - " + f.getName());
        File f = new File(path);

        try{
            InputStream is = new FileInputStream(f);

            pst = con.prepareStatement("INSERT INTO room_1(roomName,roomPath,roomFile) VALUES (?,?,?)");
            pst.setString(1, f.getName());
            pst.setString(2, path);
            pst.setBlob(3, is);

            int inserted = pst.executeUpdate();

            if(inserted > 0){
                JOptionPane.showMessageDialog(null,"Image inserted successful");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_save_1ActionPerformed

    private void browse_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browse_4MouseEntered
        browse_4.setForeground(Color.WHITE);
    }//GEN-LAST:event_browse_4MouseEntered

    private void browse_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browse_4MouseExited
        browse_4.setForeground(Color.BLACK);
    }//GEN-LAST:event_browse_4MouseExited

    private void browse_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse_4ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG","png","jpeg","jpg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load = fileChooser.showOpenDialog(null);

        if(load==fileChooser.APPROVE_OPTION){
            f = fileChooser.getSelectedFile();
            path = f.getAbsolutePath();
            imagePath.setText(path);
            ImageIcon ii = new ImageIcon(path);
            Image img = ii.getImage().getScaledInstance(label_4.getWidth(),label_4.getHeight(), Image.SCALE_SMOOTH);
            label_4.setIcon(new ImageIcon(img));

        }
    }//GEN-LAST:event_browse_4ActionPerformed

    private void save_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_4MouseEntered
        save_4.setForeground(Color.WHITE);
    }//GEN-LAST:event_save_4MouseEntered

    private void save_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_4MouseExited
        save_4.setForeground(Color.BLACK);
    }//GEN-LAST:event_save_4MouseExited

    private void save_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_4ActionPerformed
        System.out.println("Image Path - " + path);
        System.out.println("Image Name - " + f.getName());
        File f = new File(path);

        try{
            InputStream is = new FileInputStream(f);

            pst = con.prepareStatement("INSERT INTO room_4(roomName,roomPath,roomFile) VALUES (?,?,?)");
            pst.setString(1, f.getName());
            pst.setString(2, path);
            pst.setBlob(3, is);

            int inserted = pst.executeUpdate();

            if(inserted > 0){
                JOptionPane.showMessageDialog(null,"Image inserted successful");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_save_4ActionPerformed

    private void browse_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browse_2MouseEntered
        browse_2.setForeground(Color.WHITE);
    }//GEN-LAST:event_browse_2MouseEntered

    private void browse_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browse_2MouseExited
        browse_2.setForeground(Color.BLACK);
    }//GEN-LAST:event_browse_2MouseExited

    private void browse_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse_2ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG","png","jpeg","jpg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load = fileChooser.showOpenDialog(null);

        if(load==fileChooser.APPROVE_OPTION){
            f = fileChooser.getSelectedFile();
            path = f.getAbsolutePath();
            imagePath.setText(path);
            ImageIcon ii = new ImageIcon(path);
            Image img = ii.getImage().getScaledInstance(label_2.getWidth(),label_2.getHeight(), Image.SCALE_SMOOTH);
            label_2.setIcon(new ImageIcon(img));

        }
    }//GEN-LAST:event_browse_2ActionPerformed

    private void save_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_2MouseEntered
        save_2.setForeground(Color.WHITE);
    }//GEN-LAST:event_save_2MouseEntered

    private void save_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_2MouseExited
        save_2.setForeground(Color.BLACK);
    }//GEN-LAST:event_save_2MouseExited

    private void save_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_2ActionPerformed
        System.out.println("Image Path - " + path);
        System.out.println("Image Name - " + f.getName());
        File f = new File(path);

        try{
            InputStream is = new FileInputStream(f);

            pst = con.prepareStatement("INSERT INTO room_2(roomName,roomPath,roomFile) VALUES (?,?,?)");
            pst.setString(1, f.getName());
            pst.setString(2, path);
            pst.setBlob(3, is);

            int inserted = pst.executeUpdate();

            if(inserted > 0){
                JOptionPane.showMessageDialog(null,"Image inserted successful");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_save_2ActionPerformed

    private void browse_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browse_5MouseEntered
        browse_5.setForeground(Color.WHITE);
    }//GEN-LAST:event_browse_5MouseEntered

    private void browse_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browse_5MouseExited
        browse_5.setForeground(Color.BLACK);
    }//GEN-LAST:event_browse_5MouseExited

    private void browse_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse_5ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG","png","jpeg","jpg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load = fileChooser.showOpenDialog(null);

        if(load==fileChooser.APPROVE_OPTION){
            f = fileChooser.getSelectedFile();
            path = f.getAbsolutePath();
            imagePath.setText(path);
            ImageIcon ii = new ImageIcon(path);
            Image img = ii.getImage().getScaledInstance(label_5.getWidth(),label_5.getHeight(), Image.SCALE_SMOOTH);
            label_5.setIcon(new ImageIcon(img));

        }
    }//GEN-LAST:event_browse_5ActionPerformed

    private void save_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_5MouseEntered
        save_5.setForeground(Color.WHITE);
    }//GEN-LAST:event_save_5MouseEntered

    private void save_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_5MouseExited
        save_5.setForeground(Color.BLACK);
    }//GEN-LAST:event_save_5MouseExited

    private void save_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_5ActionPerformed
        System.out.println("Image Path - " + path);
        System.out.println("Image Name - " + f.getName());
        File f = new File(path);

        try{
            InputStream is = new FileInputStream(f);

            pst = con.prepareStatement("INSERT INTO room_5(roomName,roomPath,roomFile) VALUES (?,?,?)");
            pst.setString(1, f.getName());
            pst.setString(2, path);
            pst.setBlob(3, is);

            int inserted = pst.executeUpdate();

            if(inserted > 0){
                JOptionPane.showMessageDialog(null,"Image inserted successful");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_save_5ActionPerformed

    private void browse_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browse_3MouseEntered
        browse_3.setForeground(Color.WHITE);
    }//GEN-LAST:event_browse_3MouseEntered

    private void browse_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browse_3MouseExited
        browse_3.setForeground(Color.BLACK);
    }//GEN-LAST:event_browse_3MouseExited

    private void browse_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse_3ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG","png","jpeg","jpg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load = fileChooser.showOpenDialog(null);

        if(load==fileChooser.APPROVE_OPTION){
            f = fileChooser.getSelectedFile();
            path = f.getAbsolutePath();
            imagePath.setText(path);
            ImageIcon ii = new ImageIcon(path);
            Image img = ii.getImage().getScaledInstance(label_3.getWidth(),label_3.getHeight(), Image.SCALE_SMOOTH);
            label_3.setIcon(new ImageIcon(img));

        }
    }//GEN-LAST:event_browse_3ActionPerformed

    private void save_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_3MouseEntered
        save_3.setForeground(Color.WHITE);
    }//GEN-LAST:event_save_3MouseEntered

    private void save_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_3MouseExited
        save_3.setForeground(Color.BLACK);
    }//GEN-LAST:event_save_3MouseExited

    private void save_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_3ActionPerformed
        System.out.println("Image Path - " + path);
        System.out.println("Image Name - " + f.getName());
        File f = new File(path);

        try{
            InputStream is = new FileInputStream(f);

            pst = con.prepareStatement("INSERT INTO room_3(roomName,roomPath,roomFile) VALUES (?,?,?)");
            pst.setString(1, f.getName());
            pst.setString(2, path);
            pst.setBlob(3, is);

            int inserted = pst.executeUpdate();

            if(inserted > 0){
                JOptionPane.showMessageDialog(null,"Image inserted successful");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_save_3ActionPerformed

    private void browse_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browse_6MouseEntered
        browse_6.setForeground(Color.WHITE);
    }//GEN-LAST:event_browse_6MouseEntered

    private void browse_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browse_6MouseExited
        browse_6.setForeground(Color.BLACK);
    }//GEN-LAST:event_browse_6MouseExited

    private void browse_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse_6ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG","png","jpeg","jpg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load = fileChooser.showOpenDialog(null);

        if(load==fileChooser.APPROVE_OPTION){
            f = fileChooser.getSelectedFile();
            path = f.getAbsolutePath();
            imagePath.setText(path);
            ImageIcon ii = new ImageIcon(path);
            Image img = ii.getImage().getScaledInstance(label_6.getWidth(),label_6.getHeight(), Image.SCALE_SMOOTH);
            label_6.setIcon(new ImageIcon(img));

        }
    }//GEN-LAST:event_browse_6ActionPerformed

    private void save_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_6MouseEntered
        save_6.setForeground(Color.WHITE);
    }//GEN-LAST:event_save_6MouseEntered

    private void save_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_6MouseExited
        save_6.setForeground(Color.BLACK);
    }//GEN-LAST:event_save_6MouseExited

    private void save_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_6ActionPerformed
        System.out.println("Image Path - " + path);
        System.out.println("Image Name - " + f.getName());
        File f = new File(path);

        try{
            InputStream is = new FileInputStream(f);

            pst = con.prepareStatement("INSERT INTO room_6(roomName,roomPath,roomFile) VALUES (?,?,?)");
            pst.setString(1, f.getName());
            pst.setString(2, path);
            pst.setBlob(3, is);

            int inserted = pst.executeUpdate();

            if(inserted > 0){
                JOptionPane.showMessageDialog(null,"Image inserted successful");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_save_6ActionPerformed

    private void reservation_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservation_tableMouseClicked
        int i = reservation_table.getSelectedRow();
        TableModel model = reservation_table.getModel();
        id_field.setText(model.getValueAt(i, 0).toString());
        name_field.setText(model.getValueAt(i,1).toString());
        surname_field.setText(model.getValueAt(i,2).toString());
        email_field.setText(model.getValueAt(i,3).toString());
        room_field.setText(model.getValueAt(i,4).toString());
        adults_field.setText(model.getValueAt(i,5).toString());
        children_field.setText(model.getValueAt(i,6).toString());
        checkin_field.setText(model.getValueAt(i,7).toString());
        checkout_field.setText(model.getValueAt(i,8).toString());
        date_field.setText(model.getValueAt(i,9).toString());
    }//GEN-LAST:event_reservation_tableMouseClicked

    private void update_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_buttonMouseEntered
        update_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_update_buttonMouseEntered

    private void update_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_buttonMouseExited
        update_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_update_buttonMouseExited

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        String sql = "update reservation set"
        + " name = '" + name_field.getText() + "',"
        + " surname = '" + surname_field.getText() + "',"
        + " email = '" + email_field.getText() + "',"
        + " room = '" + room_field.getText() + "',"
        + " adults = '" + adults_field.getText() + "',"
        + " children = '" + children_field.getText() + "',"
        + " check_in = '" + checkin_field.getText() + "',"
        + " check_out = '" + checkout_field.getText() + "'"
        + " where id =" + id_field.getText();

        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Update Success");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_update_buttonActionPerformed

    private void delete_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_buttonMouseEntered
        delete_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_delete_buttonMouseEntered

    private void delete_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_buttonMouseExited
        delete_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_delete_buttonMouseExited

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        String query = "delete from reservation where id =" + id_field.getText();

        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_managment","root","bajrami27");
            PreparedStatement pst = con.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete Success");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Somethink went wrong with connection","title",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void room_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_room_fieldActionPerformed

    private void date_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_fieldActionPerformed

    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_fieldActionPerformed

    private void surname_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surname_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surname_fieldActionPerformed

    private void email_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_fieldActionPerformed

    private void adults_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adults_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adults_fieldActionPerformed

    private void checkin_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkin_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkin_fieldActionPerformed

    private void checkout_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkout_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkout_fieldActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Rooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adults_field;
    private javax.swing.JButton browse_1;
    private javax.swing.JButton browse_2;
    private javax.swing.JButton browse_3;
    private javax.swing.JButton browse_4;
    private javax.swing.JButton browse_5;
    private javax.swing.JButton browse_6;
    private javax.swing.JTextField checkin_field;
    private javax.swing.JTextField checkout_field;
    private javax.swing.JTextField children_field;
    private javax.swing.JButton client_button;
    private javax.swing.JTextField date_field;
    private javax.swing.JButton delete_button;
    private javax.swing.JTextField email_field;
    private javax.swing.JButton gallery_button;
    private javax.swing.JTextField id_field;
    private javax.swing.JTextField imagePath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label_1;
    private javax.swing.JLabel label_2;
    private javax.swing.JLabel label_3;
    private javax.swing.JLabel label_4;
    private javax.swing.JLabel label_5;
    private javax.swing.JLabel label_6;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton messages_button;
    private javax.swing.JTextField name_field;
    private javax.swing.JButton news_button;
    private javax.swing.JButton profile_button;
    private javax.swing.JTable reservation_table;
    private javax.swing.JButton restaurant_button;
    private javax.swing.JTextField room_field;
    private javax.swing.JButton rooms_button;
    private javax.swing.JButton save_1;
    private javax.swing.JButton save_2;
    private javax.swing.JButton save_3;
    private javax.swing.JButton save_4;
    private javax.swing.JButton save_5;
    private javax.swing.JButton save_6;
    private javax.swing.JButton staff_button;
    private javax.swing.JTextField surname_field;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}
