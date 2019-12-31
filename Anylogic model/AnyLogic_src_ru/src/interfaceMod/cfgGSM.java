package interfaceMod;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.borland.jbcl.layout.*;
import javax.swing.border.*;

public class cfgGSM extends JFrame {

JPanel contentPane;
  BorderLayout borderLayout1 = new BorderLayout();
  JScrollPane jScrollPane1 = new JScrollPane();
  JPanel jPanel1 = new JPanel();
  XYLayout xYLayout1 = new XYLayout();
  JPanel jPanel2 = new JPanel();
  TitledBorder titledBorder1;
  JLabel jLabelVerUst = new JLabel();
  XYLayout xYLayout2 = new XYLayout();
  JButton saveCfgGSM = new JButton();
  JFormattedTextField inputVerGSM = new JFormattedTextField();
  JLabel jLabelVrUst = new JLabel();
  JFormattedTextField inputVrGSM = new JFormattedTextField();
  JLabel jLabelVerEnd = new JLabel();
  JFormattedTextField inputVerEndGSM = new JFormattedTextField();
  JLabel jLabelVrEnd = new JLabel();
  JFormattedTextField inputVrEndGSM = new JFormattedTextField();
  JButton exitButton = new JButton();
  JPanel jPanel3 = new JPanel();
  Border border1;
  XYLayout xYLayout3 = new XYLayout();

  //Construct the frame
  public cfgGSM() {
    try {
      jbInit();

    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  //Component initialization
  private void jbInit() throws Exception  {
    titledBorder1 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"Характеристики канала связи");
    contentPane = (JPanel) this.getContentPane();
    border1 = BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151));
    contentPane.setBackground(new Color(210, 236, 255));
    contentPane.setFont(new java.awt.Font("MS Outlook", 0, 11));
    contentPane.setLayout(borderLayout1);
    this.setForeground(Color.red);
    this.setSize(new Dimension(302, 325));
    this.setTitle("Параметры канала GSM");
    this.setResizable(false);

    jPanel1.setLayout(xYLayout1);
    jPanel1.setBackground(new Color(210, 236, 255));
    jPanel1.setBorder(null);
    jPanel1.setMinimumSize(new Dimension(4, 4));
    jPanel1.setOpaque(true);
    jPanel1.setToolTipText("");

    jPanel2.setBackground(new Color(210, 236, 255));
    jPanel2.setFont(new java.awt.Font("Georgia", 0, 20));
    jPanel2.setForeground(Color.red);
    jPanel2.setBorder(titledBorder1);
    jPanel2.setDebugGraphicsOptions(0);
    jPanel2.setLayout(xYLayout2);
    jScrollPane1.setFont(new java.awt.Font("Dialog", 0, 20));
    titledBorder1.setTitleFont(new java.awt.Font("Arial", 0, 11));
    jLabelVerUst.setFont(new java.awt.Font("Arial", 0, 11));
    jLabelVerUst.setText("Вероятность установления соединения, %");

    saveCfgGSM.setFont(new java.awt.Font("Arial", 0, 11));
    saveCfgGSM.setText("Сохранить");
    saveCfgGSM.addActionListener(new cfgGSM_saveCfgGSM_actionAdapter(this));
    inputVerGSM.setValue(new Integer(100));

    inputVerGSM.setDebugGraphicsOptions(0);
    inputVerGSM.setHorizontalAlignment(SwingConstants.CENTER);
    jLabelVrUst.setText("Время установления соединения, с");
    jLabelVrUst.setFont(new java.awt.Font("Arial", 0, 11));
    inputVrGSM.setHorizontalAlignment(SwingConstants.CENTER);
    inputVrGSM.setValue(new Integer(15));

    jLabelVerEnd.setText("Вероятность разрыва соединения, %");
    jLabelVerEnd.setFont(new java.awt.Font("Arial", 0, 11));
    inputVerEndGSM.setHorizontalAlignment(SwingConstants.CENTER);
    inputVerEndGSM.setDebugGraphicsOptions(0);
    inputVerEndGSM.setValue(new Integer(100));
    jLabelVrEnd.setFont(new java.awt.Font("Arial", 0, 11));
    jLabelVrEnd.setText("Время прекращения сеанса, с");
    inputVrEndGSM.setValue(new Integer(15));
    inputVrEndGSM.setHorizontalAlignment(SwingConstants.CENTER);
    exitButton.addActionListener(new cfgGSM_exitButton_actionAdapter(this));
    exitButton.setText("Выйти");
    exitButton.addActionListener(new cfgGSM_exitButton_actionAdapter(this));
    exitButton.setFont(new java.awt.Font("Arial", 0, 11));
    jPanel3.setBackground(new Color(210, 236, 255));
    jPanel3.setBorder(border1);
    jPanel3.setLayout(xYLayout3);
    contentPane.add(jScrollPane1, BorderLayout.CENTER);
    jScrollPane1.getViewport().add(jPanel1, null);
    jPanel1.add(jPanel2,                       new XYConstraints(18, 17, 255, 212));
    jPanel2.add(jLabelVerUst,   new XYConstraints(8, 8, -1, -1));
    jPanel2.add(inputVerGSM,       new XYConstraints(89, 26, 59, -1));
    jPanel2.add(inputVrGSM, new XYConstraints(89, 67, 59, -1));
    jPanel2.add(jLabelVrUst,  new XYConstraints(8, 49, -1, -1));
    jPanel2.add(inputVerEndGSM, new XYConstraints(89, 111, 59, -1));
    jPanel2.add(jLabelVrEnd,       new XYConstraints(8, 138, -1, -1));
    jPanel2.add(jLabelVerEnd,     new XYConstraints(8, 93, 0, 0));
    jPanel2.add(inputVrEndGSM, new XYConstraints(89, 155, 59, -1));
    jPanel1.add(saveCfgGSM, new XYConstraints(37, 245, -1, -1));
    jPanel1.add(jPanel3,      new XYConstraints(20, 238, 251, 38));
    jPanel3.add(exitButton,    new XYConstraints(143, 5, 87, -1));
  }

  void saveCfgGSM_actionPerformed(ActionEvent e) {
   Number valueh1 = (Number)inputVerGSM.getValue();
   double valueVerGSM = valueh1.doubleValue();
   aiis.model.set_parVerUstGSM(valueVerGSM);

   Number valueh2 = (Number)inputVrGSM.getValue();
   double valueVrGSM = valueh2.doubleValue();
   aiis.model.set_parVrUstGSM(valueVrGSM);

   Number valueh3 = (Number)inputVerEndGSM.getValue();
   double valueVerEndGSM = valueh3.doubleValue();
   aiis.model.set_parVerEndGSM(valueVerEndGSM);

   Number valueh4 = (Number)inputVrEndGSM.getValue();
   double valueVrEndGSM = valueh4.doubleValue();
   aiis.model.set_parVrEndGSM(valueVrEndGSM);
  }

  void exitButton_actionPerformed(ActionEvent e) {
  this.dispose();
  }
}

class cfgGSM_saveCfgGSM_actionAdapter implements java.awt.event.ActionListener {
  cfgGSM adaptee;
  cfgGSM_saveCfgGSM_actionAdapter(cfgGSM adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.saveCfgGSM_actionPerformed(e);
  }
}

class cfgGSM_exitButton_actionAdapter implements java.awt.event.ActionListener {
  cfgGSM adaptee;

  cfgGSM_exitButton_actionAdapter(cfgGSM adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.exitButton_actionPerformed(e);
  }
}
