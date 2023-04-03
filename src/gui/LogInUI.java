package gui;

import database.SQLConnection;
import database.SQLConnectionFactory;
import database.UserAccount;
import java.awt.HeadlessException;

public class LogInUI extends javax.swing.JFrame {

    public LogInUI() throws HeadlessException {
        initComponents();
    }

    public LogInUI(String uid, String password) {
        initComponents();
        this.sdt = uid;
        this.password = password;
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        alert = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        password_txt = new javax.swing.JPasswordField();
        signup_lbl = new javax.swing.JLabel();
        forgot_lbl = new javax.swing.JLabel();
        sdt_txt = new javax.swing.JTextField();
        password_lbl = new javax.swing.JLabel();
        sdt_lbl = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập Zelo");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alert.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        alert.setForeground(new java.awt.Color(255, 0, 0));
        alert.setToolTipText("");
        jPanel1.add(alert, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 250, -1));

        login_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        login_btn.setText("Đăng Nhập");
        login_btn.setToolTipText("Click để đăng nhập");
        login_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_btn.setFocusPainted(false);
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        jPanel1.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        password_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, -1));

        signup_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signup_lbl.setForeground(new java.awt.Color(0, 104, 255));
        signup_lbl.setText("Chưa có tài khoản?");
        signup_lbl.setToolTipText("");
        signup_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_lblMouseClicked(evt);
            }
        });
        jPanel1.add(signup_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        forgot_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        forgot_lbl.setForeground(new java.awt.Color(0, 104, 255));
        forgot_lbl.setText("Quên mật khẩu?");
        forgot_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgot_lblMouseClicked(evt);
            }
        });
        jPanel1.add(forgot_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        sdt_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(sdt_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 250, -1));

        password_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        password_lbl.setText("Mật Khẩu");
        jPanel1.add(password_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 110, -1));

        sdt_lbl.setBackground(new java.awt.Color(255, 255, 255));
        sdt_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sdt_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sdt_lbl.setText("Số Điện Thoại");
        sdt_lbl.setOpaque(true);
        jPanel1.add(sdt_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        header.setBackground(new java.awt.Color(0, 104, 255));
        header.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("ĐĂNG NHẬP");
        header.setOpaque(true);
        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 512, 64));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(true);
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 510, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed

        SQLConnection db = new SQLConnectionFactory().createConnection("mysql", "localhost", "3306", "client", "root", "admin");
        db.connect();
        sdt = sdt_txt.getText();
        password = password_txt.getText();
        UserAccount sa = new UserAccount(sdt, password, null, db);
        if(sa.checkNumber(sdt)) {
            if(sa.checkPassword(sdt, password)) {
                System.out.println("Dang nhap thanh cong!");
                alert.setText("Dang nhap thanh cong!");
                UI ui = new UI();
                this.setVisible(false);
            }
        }
        else 
            System.out.println("SDT chua dang ky!");
//        sdt = sdt_txt.getText();
//        password = password_txt.getText();
//
//        SQLConnection database = new SQLConnectionFactory().createConnection("mysql",
//                "localhost", "3306", "client", "root", "admin");
//        if (database.connect() != 0) {
//            System.out.println("Khong the ket noi toi csdl!");
//            return;
//        }
//        System.out.println("Ket noi csdl thanh cong!");
//
//        if (database.checkField(sdt, password, 3)) {
//            alert.setText("Đăng nhập thành công!");
//            UI ui = new UI();
//            this.setVisible(false);
//        } else {
//            alert.setText("Thông tin không đúng!");
//        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void forgot_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_lblMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_forgot_lblMouseClicked

    private void signup_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_lblMouseClicked
        // TODO add your handling code here:
        sdt = sdt_txt.getText();
        password = password_txt.getText();
        SignUpUI signup = new SignUpUI(sdt, password);
        signup.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signup_lblMouseClicked

    public static void main(String args[]) {

        WindowUI.setWindowsUI();
        LogInUI login = new LogInUI();
        login.setVisible(true);
    }

    private void init() {
        sdt_txt.setText(sdt);
        password_txt.setText(password);
    }

    String sdt;
    String password;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel forgot_lbl;
    private javax.swing.JLabel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_btn;
    private javax.swing.JLabel password_lbl;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JLabel sdt_lbl;
    private javax.swing.JTextField sdt_txt;
    private javax.swing.JLabel signup_lbl;
    // End of variables declaration//GEN-END:variables
}
