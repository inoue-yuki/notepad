/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notebook;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.print.PrinterJob;
import java.awt.print.*;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Uzivatel
 */
public class Okno extends javax.swing.JFrame {


    JFileChooser fileChooser = new JFileChooser();
    File f;
    PrinterJob pj,job;
    PageFormat pf;
    PrintRequestAttributeSet aset;
    File filename;

    /**
     * Creates new form okno
     */
    public Okno() {
        initComponents();
         
    }
    
    public class PrintDialogExample implements Printable {
        public int print(Graphics g,PageFormat pf, int page) throws
            PrinterException {
            if (page > 0) {
                return NO_SUCH_PAGE;
            }
            Graphics2D g2d = (Graphics2D)g;
            g2d.translate(pf.getImageableX(), pf.getImageableY());
            g.drawString(text.getText()+"\n",1,10);
            return PAGE_EXISTS;
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jSeparator6 = new javax.swing.JSeparator();
        db = new javax.swing.JFileChooser();
        jColorChooser1 = new javax.swing.JColorChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        novy = new javax.swing.JMenuItem();
        otevrit = new javax.swing.JMenuItem();
        ulozit = new javax.swing.JMenuItem();
        ulozitJako = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        ukoncit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        jScrollPane3.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("minosroft");

        text.setColumns(20);
        text.setRows(5);
        jScrollPane2.setViewportView(text);

        jMenu1.setText("Soubor");

        novy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        novy.setText("Nový");
        novy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novyActionPerformed(evt);
            }
        });
        jMenu1.add(novy);

        otevrit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        otevrit.setText("Otevřít...");
        otevrit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otevritActionPerformed(evt);
            }
        });
        jMenu1.add(otevrit);

        ulozit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        ulozit.setText("Uložit");
        ulozit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulozitActionPerformed(evt);
            }
        });
        jMenu1.add(ulozit);

        ulozitJako.setText("Uložit jako...");
        ulozitJako.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulozitJakoActionPerformed(evt);
            }
        });
        jMenu1.add(ulozitJako);
        jMenu1.add(jSeparator2);

        jMenuItem7.setText("Vzhled stránky");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Tisk");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Exportovat");
        jMenu1.add(jMenuItem9);
        jMenu1.add(jSeparator3);

        ukoncit.setText("Ukončit");
        ukoncit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukoncitActionPerformed(evt);
            }
        });
        jMenu1.add(ukoncit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Úpravy");

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Zpět");
        jMenu2.add(jMenuItem10);
        jMenu2.add(jSeparator4);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Vyjmout");
        jMenu2.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setText("Kopírovat");
        jMenu2.add(jMenuItem15);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setText("Vložit");
        jMenu2.add(jMenuItem16);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        jMenuItem17.setText("Odstranit");
        jMenu2.add(jMenuItem17);
        jMenu2.add(jSeparator5);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem18.setText("Najít...");
        jMenu2.add(jMenuItem18);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem19.setText("Najít další");
        jMenu2.add(jMenuItem19);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem20.setText("Nahradit...");
        jMenuItem20.setToolTipText("");
        jMenu2.add(jMenuItem20);

        jMenuItem21.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem21.setText("Přejít...");
        jMenu2.add(jMenuItem21);
        jMenu2.add(jSeparator7);

        jMenuItem22.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem22.setText("Vybrat vše");
        jMenu2.add(jMenuItem22);

        jMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem23.setText("Čas a datum");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem23);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Formát");

        jMenuItem11.setText("Zalamování řádků");
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Písmo...");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem3.setText("Barva");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Zobrazení");

        jMenuItem13.setText("Stavový řádek");
        jMenu4.add(jMenuItem13);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Nápověda");

        jMenuItem1.setText("Zobrazit nápovědu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);
        jMenu5.add(jSeparator1);

        jMenuItem2.setText("O aplikaci Poznámkový blok");
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void otevritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otevritActionPerformed
        fileChooser.showOpenDialog(text);
        f = fileChooser.getSelectedFile();
        this.filename = f.getAbsoluteFile();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            String s;
            while ((s = br.readLine()) != null)
            {
                    text.setText(text.getText()+s+"\n");
            }
        }
        catch (Exception e)
        {
           JOptionPane.showMessageDialog(null,"Chyba při četení ze souboru.");
        }
    }//GEN-LAST:event_otevritActionPerformed

    private void novyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novyActionPerformed
        text.setText("");
        this.filename.delete();
    }//GEN-LAST:event_novyActionPerformed

    private void ukoncitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukoncitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ukoncitActionPerformed

    private void save(boolean jako)
    {
        if (jako) {
            FileFilter ft = new FileNameExtensionFilter("Textové soubory", "txt");
            FileFilter ft2 = new FileNameExtensionFilter("HTML", "html");
            fileChooser.addChoosableFileFilter(ft);
            fileChooser.addChoosableFileFilter(ft2);
            fileChooser.showSaveDialog(text);
            f = fileChooser.getSelectedFile(); 
            this.filename = f.getAbsoluteFile();
        }
        
        String[] radky = text.getText().split("\\r?\\n");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.filename)))
        {
           for (String radek : radky) {
                bw.write(radek);
                bw.newLine();
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Do souboru se nepovedlo zapsat.");
        }
    }
    
    private void ulozitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulozitActionPerformed
        this.save(false);
    }//GEN-LAST:event_ulozitActionPerformed

    private void ulozitJakoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulozitJakoActionPerformed
        this.save(true);
    }//GEN-LAST:event_ulozitJakoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "Tento program vytvořit Dankiel");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       //tisk
        try {
            String cn = UIManager.getSystemLookAndFeelClassName();
            UIManager.setLookAndFeel(cn); 
        } catch (Exception cnf) {
        }
        job = PrinterJob.getPrinterJob();
        aset = new HashPrintRequestAttributeSet();
        job.setPrintable(new PrintDialogExample());
        boolean ok = job.printDialog(aset);
        if (ok) {
            try {
                 job.print(aset);
            } catch (PrinterException ex) {
            }
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // vzhled stránky
       //ještě se musí dokončit
       
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
       // písmo
       //JFontChooser.showDialog(text);
       //text.setFont(JFontChooser.getSelectedFont());
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // čas a datum
        Calendar kalendar = Calendar.getInstance();
        DateFormat formatData = new SimpleDateFormat("H:mm d.M yyyy");
        text.setText(text.getText()+""+formatData.format(kalendar.getTime()));
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //barva
        JColorChooser.showDialog(null,"halo", null);
        JColorChooser   tcc = new JColorChooser(text.getForeground());
        Color newColor = tcc.getColor();
        text.setForeground(newColor);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Okno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser db;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenuItem novy;
    private javax.swing.JMenuItem otevrit;
    private javax.swing.JTextArea text;
    private javax.swing.JMenuItem ukoncit;
    private javax.swing.JMenuItem ulozit;
    private javax.swing.JMenuItem ulozitJako;
    // End of variables declaration//GEN-END:variables
}
