package gui;

import database.MySQLConnection;
import gui.LogInUI;

import database.SQLConnection;
import database.SQLConnectionFactory;
import database.UserAccount;
import java.awt.HeadlessException;

public class SignUpUI extends javax.swing.JFrame {

    public SignUpUI() throws HeadlessException {
        initComponents();
    }

    public SignUpUI(String uid, String password) {
        initComponents();
        this.sdt = uid;
        this.password = password;
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        password_txt = new javax.swing.JPasswordField();
        notify = new javax.swing.JLabel();
        repassword_txt = new javax.swing.JPasswordField();
        repassword_lbl = new javax.swing.JLabel();
        signup_btn = new javax.swing.JButton();
        login_lbl = new javax.swing.JLabel();
        sdt_txt = new javax.swing.JTextField();
        password_lbl = new javax.swing.JLabel();
        sdt_lbl = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng ký Zelo");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, -1));

        notify.setForeground(new java.awt.Color(255, 0, 0));
        notify.setText(" ");
        jPanel1.add(notify, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 250, -1));

        repassword_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(repassword_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 250, -1));

        repassword_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        repassword_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        repassword_lbl.setText("Nhập Lại Mật Khẩu");
        jPanel1.add(repassword_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, -1));

        signup_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signup_btn.setText("Đăng Ký");
        signup_btn.setToolTipText("Click để đăng ký");
        signup_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_btn.setFocusPainted(false);
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });
        jPanel1.add(signup_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        login_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        login_lbl.setForeground(new java.awt.Color(0, 104, 255));
        login_lbl.setText("Đã có tài khoản?");
        login_lbl.setToolTipText("");
        login_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_lblMouseClicked(evt);
            }
        });
        jPanel1.add(login_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

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
        header.setText("ĐĂNG KÝ");
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

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        // TODO add your handling code here:

        sdt = sdt_txt.getText();
        password = password_txt.getText();
        SQLConnection db = new SQLConnectionFactory().createConnection("mysql",
                "localhost", "3306", "client", "root", "admin");
        db.connect();
        UserAccount ua = new UserAccount(sdt, sdt, "", db);

        if (!password_txt.getText().equals(repassword_txt.getText())) {
            notify.setText("Mật khẩu không trùng khớp!");
        }
        if (ua.checkNumber(sdt)) {
            System.out.println("SDT da ton tai!");
            notify.setText("SDT da dang ky!");
        } else {
            if (ua.addAccount(sdt, password)) {
                System.out.println("DK thanh cong");

            };
        }

//
//        SQLConnection database = new SQLConnectionFactory().createConnection("mysql",
//                "localhost", "3306", "client", "root", "admin");
//        if (database.connect()) {
//            System.out.println("Khong the ket noi toi csdl!");
//            return;
//        }
//        System.out.println("Ket noi csdl thanh cong!");
//
//        if (database.insert("'" + sdt_txt.getText() + "', '', '" + password_txt.getText() + "'")) {
//            notify.setText("Đăng ký thành công!");
//        } else {
//            notify.setText("Đăng ký thất bại!");
//        }
    }//GEN-LAST:event_signup_btnActionPerformed

    private void login_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_lblMouseClicked
        // TODO add your handling code here:
        sdt = sdt_txt.getText();
        password = password_txt.getText();
        LogInUI login = new LogInUI(sdt, password);
        login.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_login_lblMouseClicked

//    public static void main(String args[]) {
//
//        WindowUI.setWindowsUI();
//        SignUpUI login = new SignUpUI();
//        login.setVisible(true);
//    }

    private void init() {
        sdt_txt.setText(sdt);
        password_txt.setText(password);
    }

    private String sdt;
    private String password;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login_lbl;
    private javax.swing.JLabel notify;
    private javax.swing.JLabel password_lbl;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JLabel repassword_lbl;
    private javax.swing.JPasswordField repassword_txt;
    private javax.swing.JLabel sdt_lbl;
    private javax.swing.JTextField sdt_txt;
    private javax.swing.JButton signup_btn;
    // End of variables declaration//GEN-END:variables
}
