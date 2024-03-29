/* Machine Learning Based Tic Tac Toe Game made by Karl Saycon
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karl.tictactoe.view;

import com.karl.tictactoe.controller.GameController;
import com.karl.tictactoe.model.Enemy;
import com.karl.tictactoe.model.Player;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author karlsaycon
 */
public class Screen extends javax.swing.JFrame {

    private GameController game;
    private Player player;

    /**
     * Creates new form Screen
     */
    public Screen() {
        this.player = new Player("Player");
        this.game = new GameController(player);
        initComponents();
        setIcon();
        this.game.update(lblStatus);
        draw();
    }

    private void setIcon() {
        // Read the image that will be used as the application icon.
        // Using "/" in front of the image file name will locate the
        // image at the root folder of our application. If you don't
        // use a "/" then the image file should be on the same folder
        // with your class file.
        try {
            URL resource = getClass().getResource("../resources/icon.png");
            BufferedImage image = ImageIO.read(resource);
            setIconImage(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Show the table to the view
    private void draw() {
        if (game.isRunning()) {
            lblStatus.setText("");
        }
        // Update buttons
        this.btn1.setText(game.getTable()[0][0]);
        this.btn2.setText(game.getTable()[0][1]);
        this.btn3.setText(game.getTable()[0][2]);
        this.btn4.setText(game.getTable()[1][0]);
        this.btn5.setText(game.getTable()[1][1]);
        this.btn6.setText(game.getTable()[1][2]);
        this.btn7.setText(game.getTable()[2][0]);
        this.btn8.setText(game.getTable()[2][1]);
        this.btn9.setText(game.getTable()[2][2]);
        // Update scores
        game.drawScores(lblScorePlayer, lblScoreCPU);

        // Update Color
        // btn 1
        if (btn1.getText().equals(player.getType())) {
            btn1.setForeground(Color.green.darker());
        } else {
            btn1.setForeground(Color.red.darker());
        }
        // btn 2
        if (btn2.getText().equals(player.getType())) {
            btn2.setForeground(Color.green.darker());
        } else {
            btn2.setForeground(Color.red.darker());
        }
        // btn 3
        if (btn3.getText().equals(player.getType())) {
            btn3.setForeground(Color.green.darker());
        } else {
            btn3.setForeground(Color.red.darker());
        }
        // btn 4
        if (btn4.getText().equals(player.getType())) {
            btn4.setForeground(Color.green.darker());
        } else {
            btn4.setForeground(Color.red.darker());
        }
        // btn 5
        if (btn5.getText().equals(player.getType())) {
            btn5.setForeground(Color.green.darker());
        } else {
            btn5.setForeground(Color.red.darker());
        }
        // btn 6
        if (btn6.getText().equals(player.getType())) {
            btn6.setForeground(Color.green.darker());
        } else {
            btn6.setForeground(Color.red.darker());
        }
        // btn 7
        if (btn7.getText().equals(player.getType())) {
            btn7.setForeground(Color.green.darker());
        } else {
            btn7.setForeground(Color.red.darker());
        }
        // btn 8
        if (btn8.getText().equals(player.getType())) {
            btn8.setForeground(Color.green.darker());
        } else {
            btn8.setForeground(Color.red.darker());
        }
        // btn 9
        if (btn9.getText().equals(player.getType())) {
            btn9.setForeground(Color.green.darker());
        } else {
            btn9.setForeground(Color.red.darker());
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

        paneMain = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        paneScoreboard = new javax.swing.JPanel();
        lblTitlePlayer = new javax.swing.JLabel();
        lblScorePlayer = new javax.swing.JLabel();
        lblTitleCPU = new javax.swing.JLabel();
        lblScoreCPU = new javax.swing.JLabel();
        sprtScores = new javax.swing.JSeparator();
        paneControl = new javax.swing.JPanel();
        btnRestartGame = new javax.swing.JButton();
        btnResetScoreboard = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        paneStatus = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ticky Tac AI");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        paneMain.setBackground(new java.awt.Color(0, 204, 255));
        paneMain.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Beat the Java AI, AI first! Be Gentle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        paneMain.setForeground(new java.awt.Color(255, 255, 255));

        btn1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btn1.setText("O");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btn2.setText("X");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneMainLayout = new javax.swing.GroupLayout(paneMain);
        paneMain.setLayout(paneMainLayout);
        paneMainLayout.setHorizontalGroup(
            paneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneMainLayout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneMainLayout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneMainLayout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneMainLayout.setVerticalGroup(
            paneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneMainLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(paneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paneScoreboard.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Scoreboard ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        lblTitlePlayer.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lblTitlePlayer.setForeground(new java.awt.Color(0, 125, 152));
        lblTitlePlayer.setText("Player");

        lblScorePlayer.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lblScorePlayer.setForeground(new java.awt.Color(0, 125, 152));
        lblScorePlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScorePlayer.setText("0");

        lblTitleCPU.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        lblTitleCPU.setForeground(new java.awt.Color(135, 1, 1));
        lblTitleCPU.setText("JAVA AI (CPU)");

        lblScoreCPU.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lblScoreCPU.setForeground(new java.awt.Color(135, 1, 1));
        lblScoreCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScoreCPU.setText("0");

        sprtScores.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        javax.swing.GroupLayout paneScoreboardLayout = new javax.swing.GroupLayout(paneScoreboard);
        paneScoreboard.setLayout(paneScoreboardLayout);
        paneScoreboardLayout.setHorizontalGroup(
            paneScoreboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneScoreboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneScoreboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblScorePlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sprtScores)
                    .addGroup(paneScoreboardLayout.createSequentialGroup()
                        .addGroup(paneScoreboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitleCPU)
                            .addComponent(lblTitlePlayer))
                        .addGap(0, 269, Short.MAX_VALUE))
                    .addComponent(lblScoreCPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneScoreboardLayout.setVerticalGroup(
            paneScoreboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneScoreboardLayout.createSequentialGroup()
                .addComponent(lblTitlePlayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblScorePlayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sprtScores, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitleCPU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblScoreCPU)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paneControl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Settings ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        btnRestartGame.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btnRestartGame.setText("Restart");
        btnRestartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartGameActionPerformed(evt);
            }
        });

        btnResetScoreboard.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btnResetScoreboard.setText("Reset Scoreboard");
        btnResetScoreboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetScoreboardActionPerformed(evt);
            }
        });

        btnAbout.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btnAbout.setText("About");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneControlLayout = new javax.swing.GroupLayout(paneControl);
        paneControl.setLayout(paneControlLayout);
        paneControlLayout.setHorizontalGroup(
            paneControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRestartGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResetScoreboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneControlLayout.setVerticalGroup(
            paneControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneControlLayout.createSequentialGroup()
                .addComponent(btnRestartGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnResetScoreboard, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbout)
                .addContainerGap())
        );

        paneStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        lblStatus.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(1, 115, 27));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("#####");

        javax.swing.GroupLayout paneStatusLayout = new javax.swing.GroupLayout(paneStatus);
        paneStatus.setLayout(paneStatusLayout);
        paneStatusLayout.setHorizontalGroup(
            paneStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneStatusLayout.setVerticalGroup(
            paneStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneScoreboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paneScoreboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paneStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paneControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        paneMain.getAccessibleContext().setAccessibleName("Tic Tac Toe");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetScoreboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetScoreboardActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "<html>Are you sure you want to reset <strong>ScoreBoard</strong> ?</html>",
                "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            game.resetScores(lblScorePlayer, lblScoreCPU);
        }
    }//GEN-LAST:event_btnResetScoreboardActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        if (game.isRunning()) {
            player.pressButton(game.getTable(), player.getType(), 0, 0);
            game.update(lblStatus);
            draw();
            game.drawScores(lblScorePlayer, lblScoreCPU);
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        if (game.isRunning()) {
            player.pressButton(game.getTable(), player.getType(), 0, 1);
            game.update(lblStatus);
            draw();
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if (game.isRunning()) {
            player.pressButton(game.getTable(), player.getType(), 0, 2);
            game.update(lblStatus);
            draw();
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if (game.isRunning()) {
            player.pressButton(game.getTable(), player.getType(), 1, 0);
            game.update(lblStatus);
            draw();
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        if (game.isRunning()) {
            player.pressButton(game.getTable(), player.getType(), 1, 1);
            game.update(lblStatus);
            draw();
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        if (game.isRunning()) {
            player.pressButton(game.getTable(), player.getType(), 1, 2);
            game.update(lblStatus);
            draw();
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        if (game.isRunning()) {
            player.pressButton(game.getTable(), player.getType(), 2, 0);
            game.update(lblStatus);
            draw();

        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        if (game.isRunning()) {
            player.pressButton(game.getTable(), player.getType(), 2, 1);
            game.update(lblStatus);
            draw();
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        if (game.isRunning()) {
            player.pressButton(game.getTable(), player.getType(), 2, 2);
            game.update(lblStatus);
            draw();
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnRestartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartGameActionPerformed
        // TODO add your handling code here:
        if (game.isRunning()) {
            lblStatus.setForeground(Color.MAGENTA.darker());
            lblStatus.setText("You cannot do it until the game ends");
        } else {
            Enemy enemy = game.getEnemy();
            game = new GameController(player);
            game.setEnemy(enemy);
            this.game.update(lblStatus);
            draw();
        }
    }//GEN-LAST:event_btnRestartGameActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        JOptionPane.showMessageDialog(null, "<html>- <strong>Tic Tac Toe - AI Game</strong>V1.0 <br>"
                + " - Created by <i style='font-weight: 700'>Karl Saycon</i></html>");
    }//GEN-LAST:event_btnAboutActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnResetScoreboard;
    private javax.swing.JButton btnRestartGame;
    private javax.swing.JLabel lblScoreCPU;
    private javax.swing.JLabel lblScorePlayer;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitleCPU;
    private javax.swing.JLabel lblTitlePlayer;
    private javax.swing.JPanel paneControl;
    private javax.swing.JPanel paneMain;
    private javax.swing.JPanel paneScoreboard;
    private javax.swing.JPanel paneStatus;
    private javax.swing.JSeparator sprtScores;
    // End of variables declaration//GEN-END:variables
}
