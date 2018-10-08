/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplex;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
/**
 *
 * @author Dika
 */
public class SimplexGui extends javax.swing.JFrame {
    /**
     * Creates new form SimplexGui
     */
    public SimplexGui() {
        initD();
        initComponents();
    }
    private String[] var={"Z","S1","S2","S3"};
    private int index=0;
    public int locX,locY;
    private void initD(){
        jTableTemp=new javax.swing.JTable();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Kesimpulan = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_SimplexHasil = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton_hitung = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_LengthVar = new javax.swing.JLabel();
        jTextField_varX1 = new javax.swing.JTextField();
        jTextField_varX2 = new javax.swing.JTextField();
        jTextField_varX3 = new javax.swing.JTextField();
        jTextField_NK = new javax.swing.JTextField();
        jButton_Insert = new javax.swing.JButton();
        jLabel_varS1 = new javax.swing.JLabel();
        jTextField_varS1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_varS2 = new javax.swing.JTextField();
        jLabel_varS3 = new javax.swing.JLabel();
        jTextField_varS3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_Setting = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simplex Method Apps");
        setBackground(new java.awt.Color(12, 44, 67));
        setUndecorated(true);
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea_Kesimpulan.setColumns(20);
        jTextArea_Kesimpulan.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextArea_Kesimpulan.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Kesimpulan);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 380, 90));

        jTable_SimplexHasil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable_SimplexHasil.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTable_SimplexHasil.setForeground(new java.awt.Color(0, 1, 0));
        jTable_SimplexHasil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_SimplexHasil.setGridColor(new java.awt.Color(0, 1, 0));
        jTable_SimplexHasil.setRowHeight(18);
        jScrollPane3.setViewportView(jTable_SimplexHasil);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 530, 290));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 63, 65));
        jLabel5.setText("Kesimpulan         :");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 170, 30));

        jButton_hitung.setBackground(new java.awt.Color(255, 255, 255));
        jButton_hitung.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_hitung.setForeground(new java.awt.Color(29, 113, 183));
        jButton_hitung.setText("Hitung");
        jButton_hitung.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 113, 183), 1, true));
        jButton_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hitungActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 120, 40));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(60, 63, 66));
        jPanel2.setForeground(new java.awt.Color(60, 63, 66));

        jPanel1.setBackground(new java.awt.Color(29, 113, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X1          :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X2          :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X3          :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NK         :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel_LengthVar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel_LengthVar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_LengthVar.setText("Masukan nilai dTraining : ");
        jPanel1.add(jLabel_LengthVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTextField_varX1.setBackground(new java.awt.Color(29, 113, 183));
        jTextField_varX1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_varX1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_varX1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 113, 183), 2, true));
        jTextField_varX1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField_varX1InputMethodTextChanged(evt);
            }
        });
        jTextField_varX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_varX1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_varX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 130, -1));

        jTextField_varX2.setBackground(new java.awt.Color(29, 113, 183));
        jTextField_varX2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_varX2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_varX2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 113, 183), 2, true));
        jPanel1.add(jTextField_varX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, -1));

        jTextField_varX3.setBackground(new java.awt.Color(29, 113, 183));
        jTextField_varX3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_varX3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_varX3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 113, 183), 2, true));
        jPanel1.add(jTextField_varX3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 130, -1));

        jTextField_NK.setBackground(new java.awt.Color(29, 113, 183));
        jTextField_NK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_NK.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_NK.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 113, 183), 2, true));
        jPanel1.add(jTextField_NK, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 130, -1));

        jButton_Insert.setBackground(new java.awt.Color(29, 113, 183));
        jButton_Insert.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_Insert.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Insert.setText("Insert");
        jButton_Insert.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InsertActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 120, 40));

        jLabel_varS1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel_varS1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_varS1.setText("S1          :");
        jPanel1.add(jLabel_varS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jTextField_varS1.setBackground(new java.awt.Color(29, 113, 183));
        jTextField_varS1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_varS1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_varS1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 113, 183), 2, true));
        jPanel1.add(jTextField_varS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("S2          :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jTextField_varS2.setBackground(new java.awt.Color(29, 113, 183));
        jTextField_varS2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_varS2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_varS2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 113, 183), 2, true));
        jPanel1.add(jTextField_varS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 130, -1));

        jLabel_varS3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel_varS3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_varS3.setText("S3          :");
        jPanel1.add(jLabel_varS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jTextField_varS3.setBackground(new java.awt.Color(29, 113, 183));
        jTextField_varS3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_varS3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_varS3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 113, 183), 2, true));
        jPanel1.add(jTextField_varS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 130, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 112, 170, 20));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 170, 20));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, 20));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, 20));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 170, 20));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, 20));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 170, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(60, 63, 66));
        jPanel3.setForeground(new java.awt.Color(60, 63, 66));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel3MouseMoved(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplex/Delete_32px.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel_Setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplex/Settings_32px.png"))); // NOI18N
        jLabel_Setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SettingMouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplex/Refresh_32px.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplex/Menu_32px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simplex/Info_32px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel_Setting)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Setting)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(14, 14, 14))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void addTable(){
        List<String> nameVar=new ArrayList<>();
        DefaultTableModel modelHasil;
        DefaultTableModel modelTemp;
        modelHasil=(DefaultTableModel) jTable_SimplexHasil.getModel();
        modelTemp=(DefaultTableModel) jTableTemp.getModel();
        JTableHeader h=jTable_SimplexHasil.getTableHeader();
        Color biruWin=new Color(29,113,183);
         h.setBackground(biruWin);
         h.setForeground(Color.WHITE);
        int ln=3;
        modelHasil.addColumn("Interasi");
        modelHasil.addColumn("BV");
        for (int i = 0; i < ln; i++) {
        nameVar.add("X"+(i+1));
        String temp=nameVar.get(i);
        modelHasil.addColumn(temp);
        modelTemp.addColumn(temp);
         }
         for (int i = 0; i < ln; i++) {
            nameVar.add("S"+(i+1));
            modelHasil.addColumn(nameVar.get(ln+i));
            modelTemp.addColumn(nameVar.get(ln+i));
        }
          modelHasil.addColumn("NK");
          modelHasil.addColumn("Rasio");
          modelTemp.addColumn("NK"); 
          modelTemp.addColumn("Rasio");
    }
    private void jButton_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InsertActionPerformed
        // TODO add your handling code here:
         DefaultTableModel modelHasil;
        modelHasil=(DefaultTableModel) jTable_SimplexHasil.getModel();
        DefaultTableModel modelTemp;
        modelTemp=(DefaultTableModel) jTableTemp.getModel();
        String nl="0";
        if(index!=0){
            nl="";
        }
        if(index<4){
            try{
            double varX1 = Double.parseDouble(jTextField_varX1.getText());
            double varX2 = Double.parseDouble(jTextField_varX2.getText());
            double varX3 = Double.parseDouble(jTextField_varX3.getText());
            double varS1 = Double.parseDouble(jTextField_varS1.getText());
            double varS2 = Double.parseDouble(jTextField_varS2.getText());
            double varS3 = Double.parseDouble(jTextField_varS3.getText());
            double varNK = Double.parseDouble(jTextField_NK.getText());
         modelTemp.addRow(new Object[]{varX1,varX2,varX3,varS1,varS2,varS3,varNK,0.0});
         
         modelHasil.addRow(new Object[]{nl,var[index],varX1,varX2,varX3,varS1,varS2,varS3,varNK,0.0});
         jTextField_varX1.setText(null);
        jTextField_varX2.setText(null);
        jTextField_varX3.setText(null);
        jTextField_varS1.setText(null);
        jTextField_varS2.setText(null);
        jTextField_varS3.setText(null);
        jTextField_NK.setText(null);
        index++;
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(" error : "+ex);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "input tidak sesuai!!");
        }
        }
    }//GEN-LAST:event_jButton_InsertActionPerformed

    private void jButton_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hitungActionPerformed
        // TODO add your handling code here:
        try{
        SimplexMethod sm=new SimplexMethod();
        sm.setJTable(jTableTemp);
        sm.setTabelHasil(jTable_SimplexHasil);
        sm.SetModel();
        sm.setTextArea(jTextArea_Kesimpulan);
        sm.calc();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" Error : "+e);
        }
    }//GEN-LAST:event_jButton_hitungActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Created by Andika Maulana\nEmail : andik4maulana@gmail.com"
                + "\n\n\t\tCopyright <2017>");
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelHasil;
        modelHasil=(DefaultTableModel) jTable_SimplexHasil.getModel();
        modelHasil.setRowCount(0);
        DefaultTableModel modelTemp;
        modelTemp=(DefaultTableModel) jTableTemp.getModel();
        modelTemp.setRowCount(0);
        jTextArea_Kesimpulan.setText(null);
        index=0;
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel_SettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SettingMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel_SettingMouseClicked

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        jPanel3.setLocation(evt.getLocationOnScreen().x-locX,evt.getLocationOnScreen().y-locY);
        locX=evt.getLocationOnScreen().x-jPanel3.getX();
        locY=evt.getLocationOnScreen().y-jPanel3.getY();
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel3MouseMoved

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        if(jPanel3.contains(evt.getPoint())){
         locX=evt.getLocationOnScreen().x-jPanel3.getX();
         locY=evt.getLocationOnScreen().y-jPanel3.getY();
         
        }
    }//GEN-LAST:event_jPanel3MousePressed

    private void jTextField_varX1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField_varX1InputMethodTextChanged
        // TODO add your handling code here:
        jTextField_varX2.setText(jTextField_varX1.getText());
    }//GEN-LAST:event_jTextField_varX1InputMethodTextChanged

    private void jTextField_varX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_varX1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_varX1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(SimplexGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimplexGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimplexGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimplexGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimplexGui().setVisible(true);
            }
        });
    }
    private javax.swing.JTable jTableTemp;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Insert;
    private javax.swing.JButton jButton_hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_LengthVar;
    private javax.swing.JLabel jLabel_Setting;
    private javax.swing.JLabel jLabel_varS1;
    private javax.swing.JLabel jLabel_varS3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable_SimplexHasil;
    private javax.swing.JTextArea jTextArea_Kesimpulan;
    private javax.swing.JTextField jTextField_NK;
    private javax.swing.JTextField jTextField_varS1;
    private javax.swing.JTextField jTextField_varS2;
    private javax.swing.JTextField jTextField_varS3;
    private javax.swing.JTextField jTextField_varX1;
    private javax.swing.JTextField jTextField_varX2;
    private javax.swing.JTextField jTextField_varX3;
    // End of variables declaration//GEN-END:variables
}
