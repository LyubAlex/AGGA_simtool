package interfaceMod;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.borland.jbcl.layout.*;

public class Frame1_AboutBox extends JDialog implements ActionListener {

  JPanel panel1 = new JPanel();
  JPanel panel2 = new JPanel();
  JPanel insetsPanel2 = new JPanel();
  JPanel insetsPanel3 = new JPanel();
  JButton button1 = new JButton();
  JLabel imageLabel = new JLabel();
  JLabel label1 = new JLabel();
  JLabel label2 = new JLabel();
  JLabel label3 = new JLabel();
  JLabel label4 = new JLabel();
  ImageIcon image1 = new ImageIcon();
  BorderLayout borderLayout2 = new BorderLayout();
  String product = "AGGA - ASKUE GSM-GPRS analysis";
  String version = "Версия 1.1";
  String copyright = "Copyright (c) 2019";
  XYLayout xYLayout3 = new XYLayout();
  JLabel label5 = new JLabel();
  JLabel label7 = new JLabel();
  GridLayout gridLayout1 = new GridLayout();
  public Frame1_AboutBox(Frame parent) {
    super(parent);
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  Frame1_AboutBox() {
    this(null);
  }

  private void jbInit() throws Exception  {
    image1 = new ImageIcon(interfaceMod.Frame1.class.getResource("about.png"));
    imageLabel.setIcon(image1);
    this.setTitle("About");
    panel1.setLayout(gridLayout1);
    panel2.setLayout(borderLayout2);
    insetsPanel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    label1.setRequestFocusEnabled(true);
    label1.setText("АСКУЭ, построенных на базе технологий");
    label2.setText(version);
    label3.setText(copyright);
    label4.setText("Программа предназначена для анализ систем ");
    insetsPanel3.setLayout(xYLayout3);
    insetsPanel3.setBorder(BorderFactory.createEmptyBorder(10, 60, 10, 10));
    button1.setText("Ok");
    button1.addActionListener(new Frame1_AboutBox_button1_actionAdapter(this));
    button1.addActionListener(this);
    label5.setText("передачи данных мобильных сетей связи");
    label7.setText("AGGA-ASCRE GSM-GPRS analysis ");
    insetsPanel2.add(imageLabel, null);
    panel2.add(insetsPanel3, BorderLayout.CENTER);
    panel2.add(insetsPanel2, BorderLayout.WEST);
    this.getContentPane().add(panel1, null);
    insetsPanel3.add(label2,  new XYConstraints(0, 15, 268, -1));
    insetsPanel3.add(label3,  new XYConstraints(0, 30, 268, -1));
    insetsPanel3.add(label4,  new XYConstraints(0, 45, 268, -1));
    insetsPanel3.add(label1,  new XYConstraints(0, 60, 268, -1));
    insetsPanel3.add(label5,  new XYConstraints(0, 75, 268, -1));
    insetsPanel3.add(label7,  new XYConstraints(0, 0, 268, -1));
    insetsPanel3.add(button1, new XYConstraints(52, 98, -1, -1));
    panel1.add(panel2, null);
    setResizable(true);
  }

  protected void processWindowEvent(WindowEvent e) {
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      cancel();
    }
    super.processWindowEvent(e);
  }

  void cancel() {
    dispose();
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button1) {
      cancel();
    }
  }

  void button1_actionPerformed(ActionEvent e) {
this.dispose();
  }
}

class Frame1_AboutBox_button1_actionAdapter implements java.awt.event.ActionListener {
  Frame1_AboutBox adaptee;

  Frame1_AboutBox_button1_actionAdapter(Frame1_AboutBox adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.button1_actionPerformed(e);
  }
}
