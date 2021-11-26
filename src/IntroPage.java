
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IntroPage extends javax.swing.JFrame {

    public IntroPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel22 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel2.setLayout(null);

        jLabel1.setText("Phone Number");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(155, 77, 84, 16);

        jLabel2.setText("Password");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(155, 124, 55, 16);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(279, 72, 206, 40);

        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(400, 180, 80, 40);
        jPanel2.add(jPasswordField2);
        jPasswordField2.setBounds(280, 130, 206, 40);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgonline-com-ua-ReplaceColor-ev9GSf9jTzsuZCSP.jpg"))); // NOI18N
        jLabel22.setText("jLabel22");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(-30, 0, 1100, 520);

        jTabbedPane1.addTab("Introductory Screen", jPanel2);

        jPanel1.setLayout(null);

        jPanel5.setLayout(null);

        jLabel15.setText("Message:");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(140, 90, 70, 20);

        jLabel16.setText("Email:");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(143, 265, 36, 16);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(230, 90, 250, 80);
        jPanel5.add(jTextField2);
        jTextField2.setBounds(220, 260, 250, 40);

        jLabel17.setText("Contact:");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(140, 320, 48, 16);
        jPanel5.add(jTextField5);
        jTextField5.setBounds(220, 310, 250, 40);

        jButton3.setText("Post");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(510, 310, 90, 40);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgonline-com-ua-ReplaceColor-ev9GSf9jTzsuZCSP.jpg"))); // NOI18N
        jLabel23.setText("jLabel23");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(-10, -60, 2060, 450);

        jTabbedPane3.addTab("Make Post", jPanel5);

        jPanel6.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Post ID", "Message", "Email", "Contact"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(0, 100, 820, 263);

        jTabbedPane3.addTab("See Posts", jPanel6);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Post ID", "Message", "Email", "Contact"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jButton4.setText("Remove Selected");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(134, 134, 134))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Remove Post", jPanel8);

        jLabel18.setText("Blood Group:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "AB+", "AB-", "O+", "O-" }));

        jLabel19.setText("Location:");

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Number", "City"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jButton5))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField8)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Search For Donor", jPanel7);

        jPanel4.setLayout(null);

        jLabel20.setText("Active Status:");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(150, 70, 110, 30);

        jButton6.setText("Set");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6);
        jButton6.setBounds(290, 137, 110, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable" }));
        jPanel4.add(jComboBox3);
        jComboBox3.setBounds(290, 70, 110, 30);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgonline-com-ua-ReplaceColor-ev9GSf9jTzsuZCSP.jpg"))); // NOI18N
        jPanel4.add(jLabel25);
        jLabel25.setBounds(-20, -80, 1100, 510);

        jTabbedPane3.addTab("Set Active Status", jPanel4);

        jPanel1.add(jTabbedPane3);
        jTabbedPane3.setBounds(0, 80, 830, 410);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("Name:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(25, 21, 52, 24);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(87, 21, 260, 20);

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setText("Blood Group:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(359, 21, 106, 24);

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(478, 21, 70, 20);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setText("Location:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(560, 20, 73, 24);

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(650, 20, 300, 20);
        jPanel1.add(jLabel21);
        jLabel21.setBounds(20, 50, 0, 0);

        jTabbedPane1.addTab("Home", jPanel1);

        jPanel3.setLayout(null);

        jLabel3.setText("Name");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(180, 30, 100, 40);

        jLabel4.setText("City");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(180, 80, 110, 30);

        jLabel5.setText("Blood Group");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(180, 130, 110, 30);

        jLabel6.setText("Number");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(180, 180, 110, 30);

        jLabel7.setText("Password");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(180, 230, 100, 30);

        jLabel8.setText("NID");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(180, 280, 110, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField3);
        jTextField3.setBounds(300, 30, 240, 40);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField4);
        jTextField4.setBounds(300, 80, 240, 40);
        jPanel3.add(jTextField6);
        jTextField6.setBounds(300, 180, 243, 40);
        jPanel3.add(jPasswordField1);
        jPasswordField1.setBounds(300, 230, 243, 40);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField7);
        jTextField7.setBounds(300, 280, 243, 40);

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(450, 330, 90, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "AB+", "AB-", "O+", "O-" }));
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(300, 130, 240, 40);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgonline-com-ua-ReplaceColor-ev9GSf9jTzsuZCSP.jpg"))); // NOI18N
        jPanel3.add(jLabel24);
        jLabel24.setBounds(0, 0, 1140, 490);

        jTabbedPane1.addTab("Register Now", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String BG = (String) jComboBox1.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "");
            String sql = "Insert into user_table(Name,City,BloodGroup,Password,Number,NID) Values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,jTextField3.getText());
            pst.setString(2,jTextField4.getText());
            pst.setString(3,BG);
            pst.setString(4,jPasswordField1.getText());
            pst.setString(5,jTextField6.getText());
            pst.setString(6,jTextField7.getText());
            pst.executeUpdate();
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jPasswordField1.setText("");
            JOptionPane.showMessageDialog(null, "Thank you for registering!");
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed
String Name = null;
String Contact = null;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "");
            String sql = "Select * from user_table where Number=? and Password=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,jTextField1.getText());
            pst.setString(2, jPasswordField2.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Sign in successfull!");
                Name = rs.getString("Name");
                Contact = rs.getString("Number");
                jLabel10.setText(rs.getString("Name"));
                jLabel14.setText(rs.getString("BloodGroup"));
                jLabel13.setText(rs.getString("City"));
                jTextField5.setText(Contact);
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                jTextField1.setText("");
                jPasswordField2.setText("");
            }
            con.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        DefaultTableModel tbl = (DefaultTableModel)jTable1.getModel();
        tbl.getDataVector().removeAllElements();
        tbl.fireTableDataChanged();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "");
            Statement st = con.createStatement();
            String sql = "select * from post_table";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                String ID = String.valueOf(rs.getInt("ID"));
                String Message = rs.getString("Message");
                String Email = rs.getString("Email");
                String Contact = rs.getString("Number");
                String tbData[] = {ID, Message, Email, Contact};
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tbData);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        DefaultTableModel tbl2 = (DefaultTableModel)jTable2.getModel();
        tbl2.getDataVector().removeAllElements();
        tbl2.fireTableDataChanged();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "");
            //Statement st = con.createStatement();
            String sql = "select * from post_table where Number = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Contact);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                String ID = String.valueOf(rs.getInt("ID"));
                String Message = rs.getString("Message");
                String Email = rs.getString("Email");
                String Contact = rs.getString("Number");
                String tbData[] = {ID, Message, Email, Contact};
                DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
                tblModel.addRow(tbData);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "");
            String sql = "Insert into post_table(Message,Email,Number) Values(?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,jTextArea1.getText());
            pst.setString(2,jTextField2.getText());
            pst.setString(3,jTextField5.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Posted successfully");
            jTextArea1.setText("");
            jTextField2.setText("");
            jTextField5.setText("");
            DefaultTableModel tbl = (DefaultTableModel)jTable1.getModel();
        tbl.getDataVector().removeAllElements();
        tbl.fireTableDataChanged();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "");
            Statement st = con.createStatement();
            sql = "select * from post_table";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                String ID = String.valueOf(rs.getInt("ID"));
                String Message = rs.getString("Message");
                String Email = rs.getString("Email");
                String Contact = rs.getString("Number");
                String tbData[] = {ID, Message, Email, Contact};
                tbl = (DefaultTableModel)jTable1.getModel();
                tbl.addRow(tbData);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        DefaultTableModel tbl2 = (DefaultTableModel)jTable2.getModel();
        tbl2.getDataVector().removeAllElements();
        tbl2.fireTableDataChanged();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "");
            //Statement st = con.createStatement();
            sql = "select * from post_table where Number = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, Contact);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                String ID = String.valueOf(rs.getInt("ID"));
                String Message = rs.getString("Message");
                String Email = rs.getString("Email");
                String Contact = rs.getString("Number");
                String tbData[] = {ID, Message, Email, Contact};
                tbl2 = (DefaultTableModel)jTable2.getModel();
                tbl2.addRow(tbData);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
        String ID = tblModel.getValueAt(jTable2.getSelectedRow(), 0).toString();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "");
            String sql = "Delete from post_table where ID = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,ID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Post removed successfully.");
            DefaultTableModel tbl = (DefaultTableModel)jTable1.getModel();
        tbl.getDataVector().removeAllElements();
        tbl.fireTableDataChanged();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "");
            Statement st = con.createStatement();
            sql = "select * from post_table";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                ID = String.valueOf(rs.getInt("ID"));
                String Message = rs.getString("Message");
                String Email = rs.getString("Email");
                String Contact = rs.getString("Number");
                String tbData[] = {ID, Message, Email, Contact};
                tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tbData);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        DefaultTableModel tbl2 = (DefaultTableModel)jTable2.getModel();
        tbl2.getDataVector().removeAllElements();
        tbl2.fireTableDataChanged();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "");
            //Statement st = con.createStatement();
            sql = "select * from post_table where Number = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, Contact);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                ID = String.valueOf(rs.getInt("ID"));
                String Message = rs.getString("Message");
                String Email = rs.getString("Email");
                String Contact = rs.getString("Number");
                String tbData[] = {ID, Message, Email, Contact};
                tblModel = (DefaultTableModel)jTable2.getModel();
                tblModel.addRow(tbData);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String bg = (String) jComboBox2.getSelectedItem();
        DefaultTableModel tbl = (DefaultTableModel)jTable3.getModel();
        tbl.getDataVector().removeAllElements();
        tbl.fireTableDataChanged();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "");
            String sql = "Select name, number, city from user_table WHERE bloodgroup=? AND city=? AND Available=1";
            PreparedStatement pst = con.prepareStatement(sql);
            //Statement st = con.createStatement();
            pst.setString(1, bg);
            pst.setString(2, jTextField8.getText());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                String Name = rs.getString("Name");
                String Number = rs.getString("Number");
                String City = rs.getString("City");
                String tbData[] = {Name,Number,City};
                DefaultTableModel tblModel = (DefaultTableModel)jTable3.getModel();
                tblModel.addRow(tbData);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String status = (String) jComboBox3.getSelectedItem();
        if(status == "Available")
        {
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "");
            String sql = "UPDATE user_table set Available = 1 where Number = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,Contact);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully set as available");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        }
        else if(status == "Unavailable")
        {
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "");
            String sql = "UPDATE user_table set Available = 0 where Number = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,Contact);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully set as unavailable");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(IntroPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntroPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
