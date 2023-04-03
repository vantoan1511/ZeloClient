package gui;

import main.ZeloClient;

public class UI extends javax.swing.JFrame {

    public UI() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        message_section = new javax.swing.JTextArea();
        more_btn = new javax.swing.JButton();
        send_btn = new javax.swing.JLabel();
        message_txt = new javax.swing.JTextField();
        version = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zelo");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Zelo_icon_64.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 104, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nhắn Gửi Yêu Thương");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 6, -1, 64));

        jSeparator1.setForeground(new java.awt.Color(0, 104, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 76, 802, 16));

        message_section.setEditable(false);
        message_section.setColumns(20);
        message_section.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        message_section.setRows(5);
        jScrollPane1.setViewportView(message_section);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 110, 800, 452));

        more_btn.setText("...");
        more_btn.setToolTipText("Sắp ra mắt");
        jPanel1.add(more_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 586, 41, -1));

        send_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sendButton.png"))); // NOI18N
        send_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                send_btnMouseClicked(evt);
            }
        });
        jPanel1.add(send_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 568, -1, -1));

        message_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        message_txt.setToolTipText("Nhập tin nhán tại đây");
        message_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                message_txtActionPerformed(evt);
            }
        });
        jPanel1.add(message_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 580, 673, 38));

        version.setText("1.0");
        jPanel1.add(version, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, -1, -1));

        jLabel4.setText("version:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void send_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send_btnMouseClicked
        // TODO add your handling code here:
        sendMessage();
    }//GEN-LAST:event_send_btnMouseClicked

    private void message_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_message_txtActionPerformed
        // TODO add your handling code here:
        sendMessage();
    }//GEN-LAST:event_message_txtActionPerformed

    public static void main(String[] args) {

        WindowUI.setWindowsUI();

        UI ui = new UI();
        ui.setVisible(true);

        zeloClient = new ZeloClient(ui);
    }

    public void writeChatLog(String message) {
        message_section.append(message);
    }

    private void sendMessage() {
        String message = message_txt.getText();
        if (!message.equals("")) {
            zeloClient.sendMessage(message);
        }
        message_txt.setText("");
    }

    public void init() {
        
        WindowUI.setWindowsUI();

        setVisible(true);

        zeloClient = new ZeloClient(this);
    }
    
    private static ZeloClient zeloClient;
    private String outMessage;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea message_section;
    private javax.swing.JTextField message_txt;
    private javax.swing.JButton more_btn;
    private javax.swing.JLabel send_btn;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables
}
