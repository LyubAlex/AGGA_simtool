package interfaceMod;

import javax.swing.*;
import java.awt.*;
import com.borland.jbcl.layout.*;
import javax.swing.border.*;
import java.awt.event.*;
import com.xj.anylogic.Engine;

public class animation extends JDialog {
  ImageIcon imageOK;
  ImageIcon imageWait1;
  ImageIcon imageWait2;
  ImageIcon imageExitWin;
  BorderLayout borderLayout1 = new BorderLayout();
  JPanel jPanel1 = new JPanel();
  XYLayout xYLayout1 = new XYLayout();
  Border border1;
  Border border2;
  Border border3;
  Border border4;
  JLabel jLabel1 = new JLabel();
  JButton jButton1 = new JButton();
  JLabel jLabel3 = new JLabel();
  JLabel anim1 = new JLabel();
  JLabel anim2 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel statusBar = new JLabel();

  public animation(Frame frame, String title, boolean modal) {
   super(frame, title, modal);
    try {
      jbInit();
   //pack();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  void jbInit() throws Exception {
    border1 = new EtchedBorder(EtchedBorder.RAISED,Color.white,new Color(165, 163, 151));
    border4 = BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151));
    this.getContentPane().setLayout(borderLayout1);
    imageWait1 = new ImageIcon(interfaceMod.Frame1.class.getResource("wait1.png"));
    imageWait2 = new ImageIcon(interfaceMod.Frame1.class.getResource("wait2.png"));
    imageOK = new ImageIcon(interfaceMod.Frame1.class.getResource("ok.png"));
    imageExitWin = new ImageIcon(interfaceMod.Frame1.class.getResource("exitWin.png"));
    jPanel1.setLayout(xYLayout1);
    this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    this.setResizable(false);
    this.setSize(new Dimension(277, 148));

    jLabel1.setText("��� ������� �������������!");
    jButton1.setText("������");
    jButton1.addActionListener(new animation_jButton1_actionAdapter(this));
    jLabel3.setText("���������!");
    anim1.setIcon(imageWait1);
    anim2.setIcon(imageWait2);
    jLabel4.setText("���������:");
    statusBar.setEnabled(true);
    statusBar.setFont(new java.awt.Font("Dialog", 0, 12));
    statusBar.setText("0 %");
    this.getContentPane().add(jPanel1, BorderLayout.CENTER);
    jPanel1.add(jLabel1, new XYConstraints(73, 14, -1, -1));
    jPanel1.add(jLabel3, new XYConstraints(120, 34, -1, -1));
    jPanel1.add(anim2,  new XYConstraints(21, 32, -1, -1));
    jPanel1.add(anim1,   new XYConstraints(21, 32, -1, -1));
    jPanel1.add(jButton1, new XYConstraints(114, 82, -1, -1));
    jPanel1.add(jLabel4,     new XYConstraints(98, 55, -1, -1));
    jPanel1.add(statusBar,     new XYConstraints(170, 54, -1, -1));
  }

  void selectSET_itemStateChanged(ItemEvent e) {

}
  void bExit_actionPerformed(ActionEvent e) {
this.dispose();
  }

  void jButton1_actionPerformed(ActionEvent e) {
    Engine.stop();
    dispose();
  }
}

class animation_jButton1_actionAdapter implements java.awt.event.ActionListener {
  animation adaptee;

  animation_jButton1_actionAdapter(animation adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}
