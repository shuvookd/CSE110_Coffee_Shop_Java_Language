package Coffe_Shop;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Coffe_Shop extends javax.swing.JFrame {

    double[] drink = new double[5];
    double[] cake = new double[5];
    double[] cost = new double[5];
    double[] i = new double[10];

    public Coffe_Shop() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        chkcappuccino = new javax.swing.JCheckBox();
        chkice = new javax.swing.JCheckBox();
        chkcold = new javax.swing.JCheckBox();
        chklattle = new javax.swing.JCheckBox();
        chkhot = new javax.swing.JCheckBox();
        lvlcappuccino = new javax.swing.JTextField();
        lvlice = new javax.swing.JTextField();
        lvlhot = new javax.swing.JTextField();
        lvlcold = new javax.swing.JTextField();
        lvllattle = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        chkcoffe = new javax.swing.JCheckBox();
        chkblackforest = new javax.swing.JCheckBox();
        chkfoam = new javax.swing.JCheckBox();
        chkcup = new javax.swing.JCheckBox();
        chkchocolate = new javax.swing.JCheckBox();
        lvlblackforest = new javax.swing.JTextField();
        lvlcoffe = new javax.swing.JTextField();
        lvlfoam = new javax.swing.JTextField();
        lvlchocolate = new javax.swing.JTextField();
        lvlcup = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lvlcostdrink = new javax.swing.JTextField();
        lvlcostcake = new javax.swing.JTextField();
        lvlservicecharge = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lvltax = new javax.swing.JTextField();
        lvltotal = new javax.swing.JTextField();
        lvlsubtotal = new javax.swing.JTextField();

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jCheckBox11.setText("jCheckBox1");

        jCheckBox12.setText("jCheckBox2");

        jCheckBox13.setText("jCheckBox3");

        jCheckBox14.setText("jCheckBox4");

        jCheckBox15.setText("jCheckBox5");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox11))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jCheckBox11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jCheckBox12)
                .addGap(58, 58, 58)
                .addComponent(jCheckBox13)
                .addGap(53, 53, 53)
                .addComponent(jCheckBox14)
                .addGap(39, 39, 39)
                .addComponent(jCheckBox15)
                .addGap(90, 90, 90))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        receipt.setColumns(20);
        receipt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        receipt.setRows(5);
        jScrollPane1.setViewportView(receipt);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 380, 420));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(89, 85, 85)))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(116, 106, 108));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 65)); // NOI18N
        jLabel1.setText("Coffe Management Systems");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 1200, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        chkcappuccino.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        chkcappuccino.setText("Cappuccino");
        chkcappuccino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkcappuccinoMouseClicked(evt);
            }
        });
        chkcappuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkcappuccinoActionPerformed(evt);
            }
        });

        chkice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        chkice.setText("Ice Cappuccino");
        chkice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkiceMouseClicked(evt);
            }
        });
        chkice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkiceActionPerformed(evt);
            }
        });

        chkcold.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        chkcold.setText("Cold Chocolate");
        chkcold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkcoldMouseClicked(evt);
            }
        });
        chkcold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkcoldActionPerformed(evt);
            }
        });

        chklattle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        chklattle.setText("Cold Coffe");
        chklattle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chklattleMouseClicked(evt);
            }
        });
        chklattle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chklattleActionPerformed(evt);
            }
        });

        chkhot.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        chkhot.setText("Hot chocolate");
        chkhot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkhotMouseClicked(evt);
            }
        });
        chkhot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkhotActionPerformed(evt);
            }
        });

        lvlcappuccino.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvlcappuccino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvlcappuccino.setText("0");
        lvlcappuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlcappuccinoActionPerformed(evt);
            }
        });

        lvlice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvlice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvlice.setText("0");
        lvlice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvliceMouseClicked(evt);
            }
        });
        lvlice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvliceActionPerformed(evt);
            }
        });

        lvlhot.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvlhot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvlhot.setText("0");
        lvlhot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvlhotMouseClicked(evt);
            }
        });

        lvlcold.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvlcold.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvlcold.setText("0");
        lvlcold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvlcoldMouseClicked(evt);
            }
        });
        lvlcold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlcoldActionPerformed(evt);
            }
        });

        lvllattle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvllattle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvllattle.setText("0");
        lvllattle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvllattleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkcappuccino)
                    .addComponent(chklattle)
                    .addComponent(chkice)
                    .addComponent(chkcold)
                    .addComponent(chkhot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lvlcappuccino, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(lvlice)
                    .addComponent(lvlhot)
                    .addComponent(lvlcold)
                    .addComponent(lvllattle))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkcappuccino)
                    .addComponent(lvlcappuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkice)
                    .addComponent(lvlice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkhot)
                    .addComponent(lvlhot, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkcold)
                    .addComponent(lvlcold, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chklattle)
                    .addComponent(lvllattle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 380, 290));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        chkcoffe.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        chkcoffe.setText("Coffe Cake");
        chkcoffe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkcoffeMouseClicked(evt);
            }
        });
        chkcoffe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkcoffeActionPerformed(evt);
            }
        });

        chkblackforest.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        chkblackforest.setText("Black Forest Cake");
        chkblackforest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkblackforestMouseClicked(evt);
            }
        });

        chkfoam.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        chkfoam.setText("Foam Cake");
        chkfoam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkfoamMouseClicked(evt);
            }
        });

        chkcup.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        chkcup.setText("Cup cake");
        chkcup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkcupMouseClicked(evt);
            }
        });
        chkcup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkcupActionPerformed(evt);
            }
        });

        chkchocolate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        chkchocolate.setText("Chocolate Cake");
        chkchocolate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkchocolateMouseClicked(evt);
            }
        });
        chkchocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkchocolateActionPerformed(evt);
            }
        });

        lvlblackforest.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvlblackforest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvlblackforest.setText("0");
        lvlblackforest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvlblackforestMouseClicked(evt);
            }
        });
        lvlblackforest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlblackforestActionPerformed(evt);
            }
        });

        lvlcoffe.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvlcoffe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvlcoffe.setText("0");
        lvlcoffe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvlcoffeMouseClicked(evt);
            }
        });
        lvlcoffe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlcoffeActionPerformed(evt);
            }
        });

        lvlfoam.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvlfoam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvlfoam.setText("0");
        lvlfoam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvlfoamMouseClicked(evt);
            }
        });

        lvlchocolate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvlchocolate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvlchocolate.setText("0");
        lvlchocolate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvlchocolateMouseClicked(evt);
            }
        });

        lvlcup.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvlcup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvlcup.setText("0");
        lvlcup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvlcupMouseClicked(evt);
            }
        });
        lvlcup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlcupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkchocolate)
                    .addComponent(chkcup)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(chkcoffe, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chkfoam))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(chkblackforest)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lvlcoffe)
                    .addComponent(lvlblackforest, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(lvlfoam)
                    .addComponent(lvlcup)
                    .addComponent(lvlchocolate))
                .addGap(33, 33, 33))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkblackforest)
                    .addComponent(lvlblackforest, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkcoffe)
                    .addComponent(lvlcoffe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lvlfoam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkfoam))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lvlcup, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkcup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lvlchocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkchocolate))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 390, 290));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Total");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Receipt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 600, 380, 60));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Cost of Drinks");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Cost of Cakes");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Service Charge");

        lvlcostdrink.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvlcostdrink.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvlcostdrink.setText("0");
        lvlcostdrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlcostdrinkActionPerformed(evt);
            }
        });

        lvlcostcake.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvlcostcake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvlcostcake.setText("0");

        lvlservicecharge.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvlservicecharge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvlservicecharge.setText("10");
        lvlservicecharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlservicechargeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lvlservicecharge)
                    .addComponent(lvlcostcake)
                    .addComponent(lvlcostdrink, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lvlcostdrink, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lvlcostcake, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lvlservicecharge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 380, 180));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Tax");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Sub Total");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Total");

        lvltax.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvltax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvltax.setText("5");
        lvltax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvltaxActionPerformed(evt);
            }
        });

        lvltotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvltotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvltotal.setText(" 0.00");
        lvltotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvltotalActionPerformed(evt);
            }
        });

        lvlsubtotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvlsubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lvlsubtotal.setText(" 0.00");
        lvlsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlsubtotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lvltax)
                    .addComponent(lvlsubtotal)
                    .addComponent(lvltotal, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lvltax, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lvlsubtotal))
                .addGap(16, 16, 16)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lvltotal))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 390, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkcappuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkcappuccinoActionPerformed


    }//GEN-LAST:event_chkcappuccinoActionPerformed

    private void chkhotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkhotActionPerformed

    }//GEN-LAST:event_chkhotActionPerformed

    private void chklattleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chklattleActionPerformed

    }//GEN-LAST:event_chklattleActionPerformed

    private void chkcoffeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkcoffeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkcoffeActionPerformed

    private void chkcupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkcupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkcupActionPerformed

    private void chkchocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkchocolateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkchocolateActionPerformed

    private void lvlblackforestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlblackforestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lvlblackforestActionPerformed

    private void lvlcupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlcupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lvlcupActionPerformed

    private void lvlcoffeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlcoffeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lvlcoffeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chkcoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkcoldActionPerformed

    }//GEN-LAST:event_chkcoldActionPerformed

    private void lvlcoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlcoldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lvlcoldActionPerformed

    private void lvliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvliceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lvliceActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        lvlcostdrink.setText("0");
        lvlcostcake.setText("0");
        lvlservicecharge.setText("0");
        lvltax.setText("5");
        lvlsubtotal.setText("0");
        lvltotal.setText("0");
        lvlblackforest.setText("0");
        lvlcoffe.setText("0");
        lvlfoam.setText("0");
        lvlcup.setText("0");
        lvlchocolate.setText("0");
        lvlcappuccino.setText("0");
        lvlice.setText("0");
        lvlhot.setText("0");
        lvlcold.setText("0");
        lvllattle.setText("0");
        lvlservicecharge.setText("10");
        receipt.setText(null);
        chkblackforest.setSelected(false);
        chkcoffe.setSelected(false);
        chkfoam.setSelected(false);
        chkcup.setSelected(false);
        chkchocolate.setSelected(false);
        chkcappuccino.setSelected(false);
        chkice.setSelected(false);
        chkhot.setSelected(false);
        chkcold.setSelected(false);
        chklattle.setSelected(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void lvlcappuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlcappuccinoActionPerformed
        lvlcappuccino.setText(null);
    }//GEN-LAST:event_lvlcappuccinoActionPerformed

    private void lvlcostdrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlcostdrinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lvlcostdrinkActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        drink[0] = Double.parseDouble(lvlcappuccino.getText());
        drink[1] = Double.parseDouble(lvlice.getText());
        drink[2] = Double.parseDouble(lvlhot.getText());
        drink[3] = Double.parseDouble(lvlcold.getText());
        drink[4] = Double.parseDouble(lvllattle.getText());

        cake[0] = Double.parseDouble(lvlblackforest.getText());
        cake[1] = Double.parseDouble(lvlcoffe.getText());
        cake[2] = Double.parseDouble(lvlfoam.getText());
        cake[3] = Double.parseDouble(lvlcup.getText());
        cake[4] = Double.parseDouble(lvlchocolate.getText());
        cost[0] = Double.parseDouble(lvltax.getText());
        cost[1] = Double.parseDouble(lvlsubtotal.getText());
        cost[2] = Double.parseDouble(lvltotal.getText());

        int refs = 1325 + (int) (Math.random() * 4238);
        //int ref = (refs);

        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-YYYY");
        Tdate.format(timer.getTime());

        receipt.append("Coffe Management Systems:\n"
                + "Referance:\t\t" + refs
                + "\n==============================\t\t"
                + "\nCappuccino:\t\t" + drink[0]
                + "\nIce Cappuccino:\t" + drink[1]
                + "\nHot Chocolate:\t" + drink[2]
                + "\nCold Chocolate:\t" + drink[3]
                + "\nCoffe:\t\t" + drink[4]
                + "\n==============================\t\t"
                + "\nBlack Forest Cake:\t" + cake[0]
                + "\nCoffe Cake:\t\t" + cake[1]
                + "\nFoam Cake:\t\t" + cake[2]
                + "\nCup Cake:\t\t" + cake[3]
                + "\nChocolate Cake:\t" + cake[4]
                + "\n==============================\t\t"
                + "\nServiceCharge:\t10.0"
                + "\nTax:\t\t" + cost[0]
                + "\nSub Total:\t\t" + cost[1]
                + "\nTotal:\t\t" + cost[2]
                + "\n==============================\t\t"
                + "\n\nDate: " + Tdate.format(timer.getTime())
                + "\tTime: " + tTime.format(timer.getTime())
                + "\n\nThank You...\n\n"
        );
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lvltotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvltotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lvltotalActionPerformed

    private void chkiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkiceActionPerformed


    }//GEN-LAST:event_chkiceActionPerformed

    private void chkcappuccinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkcappuccinoMouseClicked
        double ccap = Double.parseDouble(lvlcostdrink.getText());
        double cappuccino = Double.parseDouble(lvlcappuccino.getText());
        double icappuccino = 20.00;
        if (chkcappuccino.isSelected()) {
            i[0] = (cappuccino * icappuccino) + ccap;
            String pdrink = String.format("%.2f", i[0]);
            lvlcostdrink.setText(pdrink);

        }
    }//GEN-LAST:event_chkcappuccinoMouseClicked

    private void chkiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkiceMouseClicked
        double cice = Double.parseDouble(lvlcostdrink.getText());
        double ice = Double.parseDouble(lvlice.getText());
        double iicecappuccino = 30.00;
        if (chkice.isSelected()) {
            i[1] = (ice * iicecappuccino) + cice;
            String pdrink = String.format("%.2f", i[1]);
            lvlcostdrink.setText(pdrink);

        }
    }//GEN-LAST:event_chkiceMouseClicked

    private void chkhotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkhotMouseClicked
        double chot = Double.parseDouble(lvlcostdrink.getText());
        double hot = Double.parseDouble(lvlhot.getText());
        double ihot = 40.00;
        if (chkhot.isSelected()) {
            i[2] = (hot * ihot) + chot;
            String pdrink = String.format("%.2f", i[2]);
            lvlcostdrink.setText(pdrink);

        }
    }//GEN-LAST:event_chkhotMouseClicked

    private void chkcoldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkcoldMouseClicked
        double ccold = Double.parseDouble(lvlcostdrink.getText());
        double cold = Double.parseDouble(lvlcold.getText());
        double icold = 30.00;
        if (chkcold.isSelected()) {
            i[3] = (cold * icold) + ccold;
            String pdrink = String.format("%.2f", i[3]);
            lvlcostdrink.setText(pdrink);

        }
    }//GEN-LAST:event_chkcoldMouseClicked

    private void chklattleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chklattleMouseClicked
        double clattle = Double.parseDouble(lvlcostdrink.getText());
        double lattle = Double.parseDouble(lvllattle.getText());
        double ilattle = 25.00;
        if (chkcold.isSelected()) {
            i[4] = (lattle * ilattle) + clattle;
            String pdrink = String.format("%.2f", i[4]);
            lvlcostdrink.setText(pdrink);

        }
    }//GEN-LAST:event_chklattleMouseClicked

    private void chkblackforestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkblackforestMouseClicked
        double cblackforest = Double.parseDouble(lvlcostcake.getText());
        double blackforest = Double.parseDouble(lvlblackforest.getText());
        double iblackforest = 50.00;
        if (chkblackforest.isSelected()) {
            i[0] = (blackforest * iblackforest) + cblackforest;
            String pcake = String.format("%.2f", i[0]);
            lvlcostcake.setText(pcake);

        }
    }//GEN-LAST:event_chkblackforestMouseClicked

    private void chkcoffeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkcoffeMouseClicked
        double ccoffe = Double.parseDouble(lvlcostcake.getText());
        double coffe = Double.parseDouble(lvlcoffe.getText());
        double icoffe = 40.00;
        if (chkcoffe.isSelected()) {
            i[1] = (coffe * icoffe) + ccoffe;
            String pcake = String.format("%.2f", i[1]);
            lvlcostcake.setText(pcake);

        }
    }//GEN-LAST:event_chkcoffeMouseClicked

    private void chkfoamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkfoamMouseClicked
        double cfoam = Double.parseDouble(lvlcostcake.getText());
        double foam = Double.parseDouble(lvlfoam.getText());
        double ifoam = 60.00;
        if (chkfoam.isSelected()) {
            i[2] = (foam * ifoam) + cfoam;
            String pcake = String.format("%.2f", i[2]);
            lvlcostcake.setText(pcake);

        }
    }//GEN-LAST:event_chkfoamMouseClicked

    private void chkcupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkcupMouseClicked
        double ccup = Double.parseDouble(lvlcostcake.getText());
        double cup = Double.parseDouble(lvlcup.getText());
        double icup = 60.00;
        if (chkcup.isSelected()) {
            i[3] = (cup * icup) + ccup;
            String pcake = String.format("%.2f", i[3]);
            lvlcostcake.setText(pcake);

        }
    }//GEN-LAST:event_chkcupMouseClicked

    private void chkchocolateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkchocolateMouseClicked
        double cchocolate = Double.parseDouble(lvlcostcake.getText());
        double chocolate = Double.parseDouble(lvlchocolate.getText());
        double ichocolate = 80.00;
        if (chkchocolate.isSelected()) {
            i[4] = (chocolate * ichocolate) + cchocolate;
            String pcake = String.format("%.2f", i[4]);
            lvlcostcake.setText(pcake);

        }
    }//GEN-LAST:event_chkchocolateMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        drink[0] = Double.parseDouble(lvlcostdrink.getText());
        drink[1] = Double.parseDouble(lvlcostcake.getText());
        drink[2] = Double.parseDouble(lvlservicecharge.getText());
        drink[3] = Double.parseDouble(lvltax.getText());

        double ctotal = (drink[0] + drink[1] + drink[2] + drink[3]);
        //String itaxtotal = String.format(" %.2f", ctotal);
        //lvltax.setText(itaxtotal);

        double subtotal = (ctotal);
        String isubtotal = String.format(" %.2f", subtotal);
        lvlsubtotal.setText(isubtotal);

        double alltotal = (ctotal);
        String itotal = String.format(" %.2f", alltotal);
        lvltotal.setText(itotal);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lvlservicechargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlservicechargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lvlservicechargeActionPerformed

    private void lvlcoldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlcoldMouseClicked
        lvlcold.setText(null);
    }//GEN-LAST:event_lvlcoldMouseClicked

    private void lvliceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvliceMouseClicked
        lvlice.setText(null);
    }//GEN-LAST:event_lvliceMouseClicked

    private void lvlhotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlhotMouseClicked
        lvlhot.setText(null);
    }//GEN-LAST:event_lvlhotMouseClicked

    private void lvllattleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvllattleMouseClicked
        lvllattle.setText(null);
    }//GEN-LAST:event_lvllattleMouseClicked

    private void lvlblackforestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlblackforestMouseClicked
        lvlblackforest.setText(null);
    }//GEN-LAST:event_lvlblackforestMouseClicked

    private void lvlcoffeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlcoffeMouseClicked
        lvlcoffe.setText(null);
    }//GEN-LAST:event_lvlcoffeMouseClicked

    private void lvlfoamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlfoamMouseClicked
        lvlfoam.setText(null);
    }//GEN-LAST:event_lvlfoamMouseClicked

    private void lvlcupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlcupMouseClicked
        lvlcup.setText(null);
    }//GEN-LAST:event_lvlcupMouseClicked

    private void lvlchocolateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlchocolateMouseClicked
        lvlchocolate.setText(null);
    }//GEN-LAST:event_lvlchocolateMouseClicked

    private void lvlsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlsubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lvlsubtotalActionPerformed

    private void lvltaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvltaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lvltaxActionPerformed

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
            java.util.logging.Logger.getLogger(Coffe_Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coffe_Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coffe_Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coffe_Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coffe_Shop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkblackforest;
    private javax.swing.JCheckBox chkcappuccino;
    private javax.swing.JCheckBox chkchocolate;
    private javax.swing.JCheckBox chkcoffe;
    private javax.swing.JCheckBox chkcold;
    private javax.swing.JCheckBox chkcup;
    private javax.swing.JCheckBox chkfoam;
    private javax.swing.JCheckBox chkhot;
    private javax.swing.JCheckBox chkice;
    private javax.swing.JCheckBox chklattle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lvlblackforest;
    private javax.swing.JTextField lvlcappuccino;
    private javax.swing.JTextField lvlchocolate;
    private javax.swing.JTextField lvlcoffe;
    private javax.swing.JTextField lvlcold;
    private javax.swing.JTextField lvlcostcake;
    private javax.swing.JTextField lvlcostdrink;
    private javax.swing.JTextField lvlcup;
    private javax.swing.JTextField lvlfoam;
    private javax.swing.JTextField lvlhot;
    private javax.swing.JTextField lvlice;
    private javax.swing.JTextField lvllattle;
    private javax.swing.JTextField lvlservicecharge;
    private javax.swing.JTextField lvlsubtotal;
    private javax.swing.JTextField lvltax;
    private javax.swing.JTextField lvltotal;
    private javax.swing.JTextArea receipt;
    // End of variables declaration//GEN-END:variables
}
