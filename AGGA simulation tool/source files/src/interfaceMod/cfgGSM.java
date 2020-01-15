package interfaceMod;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.borland.jbcl.layout.*;
import javax.swing.border.*;

public class cfgGSM extends JDialog {

  ImageIcon imageOK;
  JPanel contentPane;
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
  JPanel jPanel3 = new JPanel();
  Border border1;
  XYLayout xYLayout3 = new XYLayout();
  JRadioButton jHighLevel = new JRadioButton();
  JRadioButton jNormalLevel = new JRadioButton();
  JRadioButton jLowLevel = new JRadioButton();
  JPanel jPanel5 = new JPanel();
  Border border2;
  TitledBorder titledBorder2;
  XYLayout xYLayout4 = new XYLayout();
  JFormattedTextField inDistance = new JFormattedTextField();
  JLabel jLabel2 = new JLabel();
  JFormattedTextField inHBS = new JFormattedTextField();
  JLabel jLabel6 = new JLabel();
  JPanel jPanel4 = new JPanel();
  JLabel jLabel3 = new JLabel();
  JFormattedTextField inHMS = new JFormattedTextField();
  XYLayout xYLayout5 = new XYLayout();
  Border border3;

  //Construct the frame
  public cfgGSM(Frame frame, String title, boolean modal) {
    super(frame, title, modal);
    //enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      jbInit();

    }
    catch(Exception e) {
     // e.printStackTrace();
    }
  }

  //Component initialization
  private void jbInit() throws Exception  {
    titledBorder1 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"���������� �������� ������ �����");
    imageOK = new ImageIcon(interfaceMod.Frame1.class.getResource("ok.png"));
    contentPane = (JPanel) this.getContentPane();
    border1 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"");
    border2 = BorderFactory.createEtchedBorder(Color.white,new Color(147, 165, 178));
    titledBorder2 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"������� �������� �����");
    border3 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"��������� ����");
    contentPane.setBackground(new Color(210, 236, 255));
    contentPane.setFont(new java.awt.Font("MS Outlook", 0, 11));
    this.setSize(new Dimension(350, 452));
    this.setModal(true);
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
    jLabelVerUst.setText("����������� ������������ ����������, %");

    saveCfgGSM.setFont(new java.awt.Font("Arial", 0, 11));
    saveCfgGSM.setIcon(imageOK);
    saveCfgGSM.setText("���������");
    saveCfgGSM.addActionListener(new cfgGSM_saveCfgGSM_actionAdapter(this));

    inputVerGSM.setValue(new Integer(95));
    inputVerGSM.setDebugGraphicsOptions(0);
    inputVerGSM.setHorizontalAlignment(SwingConstants.CENTER);
    jLabelVrUst.setText("����� ������������ ����������, �");
    jLabelVrUst.setFont(new java.awt.Font("Arial", 0, 11));
    jLabelVrUst.setPreferredSize(new Dimension(262, 14));
    jLabelVrUst.setRequestFocusEnabled(true);
    inputVrGSM.setHorizontalAlignment(SwingConstants.CENTER);
    inputVrGSM.setValue(new Integer(10));

    jLabelVerEnd.setText("����������� ����������������� ������� ����������, %");
    jLabelVerEnd.setFont(new java.awt.Font("Arial", 0, 11));
    inputVerEndGSM.setHorizontalAlignment(SwingConstants.CENTER);
    inputVerEndGSM.setDebugGraphicsOptions(0);
    inputVerEndGSM.setValue(new Integer(5));
    jLabelVrEnd.setFont(new java.awt.Font("Arial", 0, 11));
    jLabelVrEnd.setText("\uF02D\t����� ������������ �������������� ����������, �");
    inputVrEndGSM.setValue(new Integer(1));
    inputVrEndGSM.setHorizontalAlignment(SwingConstants.CENTER);
    jPanel3.setBackground(new Color(210, 236, 255));
    jPanel3.setBorder(border1);
    jPanel3.setLayout(xYLayout3);
    jHighLevel.setBackground(new Color(210, 236, 255));
    jHighLevel.setText("������� �������");
    jHighLevel.addActionListener(new cfgGSM_jHighLevel_actionAdapter(this));
    jNormalLevel.setBackground(new Color(210, 236, 255));
    jNormalLevel.setText("���������� �������");
    jNormalLevel.setSelected(true);
    jNormalLevel.addActionListener(new cfgGSM_jNormalLevel_actionAdapter(this));
    jLowLevel.setBackground(new Color(210, 236, 255));
    jLowLevel.setText("������ �������");
    jLowLevel.addActionListener(new cfgGSM_jLowLevel_actionAdapter(this));
    jPanel5.setBackground(new Color(210, 236, 255));
    jPanel5.setBorder(titledBorder2);
    jPanel5.setLayout(xYLayout4);
    inDistance.setValue(new Double(5.0));
    inDistance.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel2.setText("������ ��, �");
    inHBS.setValue(new Double(30.0));
    inHBS.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel6.setText("���������� �� �� �� ��, ��");
    jPanel4.setLayout(xYLayout5);
    jPanel4.setDebugGraphicsOptions(0);
    jPanel4.setBackground(new Color(210, 236, 255));
    jPanel4.setBorder(border3);
    jLabel3.setText("������ ��, �");
    inHMS.setValue(new Double(2.0));
    inHMS.setHorizontalAlignment(SwingConstants.CENTER);
    contentPane.add(jScrollPane1, BorderLayout.CENTER);
    jScrollPane1.getViewport().add(jPanel1, null);
    jPanel2.add(jLabelVerUst,   new XYConstraints(8, 8, -1, -1));
    jPanel2.add(jLabelVrUst,  new XYConstraints(8, 49, -1, -1));
    jPanel2.add(jLabelVrEnd,       new XYConstraints(8, 138, -1, -1));
    jPanel2.add(jLabelVerEnd,     new XYConstraints(8, 93, 0, 0));
    jPanel2.add(inputVerGSM, new XYConstraints(127, 26, 59, -1));
    jPanel2.add(inputVrGSM, new XYConstraints(127, 67, 59, -1));
    jPanel2.add(inputVerEndGSM, new XYConstraints(127, 111, 59, -1));
    jPanel2.add(inputVrEndGSM, new XYConstraints(127, 155, 59, -1));
    jPanel1.add(jPanel3,       new XYConstraints(14, 360, 317, 45));
    jPanel3.add(saveCfgGSM,   new XYConstraints(100, 4, -1, -1));
    jPanel1.add(jPanel4,         new XYConstraints(169, 10, 164, 125));
    jPanel4.add(inHBS, new XYConstraints(89, 23, 59, -1));
    jPanel4.add(jLabel3, new XYConstraints(2, 1, -1, -1));
    jPanel4.add(jLabel2, new XYConstraints(3, 26, -1, -1));
    jPanel4.add(inHMS, new XYConstraints(89, 0, 59, -1));
    jPanel4.add(jLabel6,  new XYConstraints(3, 52, -1, -1));
    jPanel4.add(inDistance, new XYConstraints(47, 71, 59, -1));
    jPanel1.add(jPanel2,     new XYConstraints(12, 142, 321, 212));
    jPanel1.add(jPanel5,            new XYConstraints(11, 10, 154, 125));
    jPanel5.add(jLowLevel,  new XYConstraints(3, 40, -1, -1));
    jPanel5.add(jHighLevel,  new XYConstraints(3, 0, -1, -1));
    jPanel5.add(jNormalLevel,  new XYConstraints(3, 20, -1, -1));

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      Dimension frameSize = this.getSize();
      if (frameSize.height > screenSize.height) {
        frameSize.height = screenSize.height;
      }
      if (frameSize.width > screenSize.width) {
        frameSize.width = screenSize.width;
      }
      this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
      this.setVisible(false);
  }

 void setHighQuality (){
   inputVerGSM.setValue(new Integer(97));
   inputVrGSM.setValue(new Integer(8));
   inputVerEndGSM.setValue(new Integer(2));
   inputVrEndGSM.setValue(new Double(0.4));
 }

 void setNormalQuality (){
  inputVerGSM.setValue(new Integer(95));
  inputVrGSM.setValue(new Integer(10));
  inputVerEndGSM.setValue(new Integer(5));
  inputVrEndGSM.setValue(new Integer(1));
}

void setLowQuality (){
  inputVerGSM.setValue(new Integer(93));
  inputVrGSM.setValue(new Integer(12));
  inputVerEndGSM.setValue(new Integer(7));
  inputVrEndGSM.setValue(new Integer(2));
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

  Number valueh5 = (Number)inHBS.getValue();
  double valueHBS = valueh5.doubleValue();
  aiis.model.set_parHBSGSM(valueHBS);

  Number valueh6 = (Number)inHMS.getValue();
  double valueHMS = valueh6.doubleValue();
  aiis.model.set_parHMSGSM(valueHMS);

   Number valueh7 = (Number)inDistance.getValue();
   double valueDis = valueh7.doubleValue();
   aiis.model.set_parDGSM(valueDis);

   this.dispose();// ������ ���� �������� ����������
  }

void jNormalLevel_actionPerformed(ActionEvent e) {
  if (jHighLevel.isSelected() | jLowLevel.isSelected()){
    jHighLevel.setSelected(false);
    jLowLevel.setSelected(false);
    jNormalLevel.setSelected(true);
    setNormalQuality();
    }
  else{
    jNormalLevel.setSelected(true);
    setNormalQuality();
      }
  }
void jHighLevel_actionPerformed(ActionEvent e) {
  if (jNormalLevel.isSelected() | jLowLevel.isSelected()){
    jNormalLevel.setSelected(false);
    jLowLevel.setSelected(false);
    jHighLevel.setSelected(true);
    setHighQuality();
  }
  else{
    jHighLevel.setSelected(true);
    setHighQuality();
  }
}

void jLowLevel_actionPerformed(ActionEvent e) {
  if (jNormalLevel.isSelected() | jHighLevel.isSelected()){
      jNormalLevel.setSelected(false);
      jHighLevel.setSelected(false);;
      jLowLevel.setSelected(true);
      setLowQuality();
    }
      else{
        jLowLevel.setSelected(true);
        setLowQuality();
      }
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

class cfgGSM_jNormalLevel_actionAdapter implements java.awt.event.ActionListener {
  cfgGSM adaptee;

  cfgGSM_jNormalLevel_actionAdapter(cfgGSM adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jNormalLevel_actionPerformed(e);
  }
}

class cfgGSM_jHighLevel_actionAdapter implements java.awt.event.ActionListener {
  cfgGSM adaptee;

  cfgGSM_jHighLevel_actionAdapter(cfgGSM adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jHighLevel_actionPerformed(e);
  }
}

class cfgGSM_jLowLevel_actionAdapter implements java.awt.event.ActionListener {
  cfgGSM adaptee;

  cfgGSM_jLowLevel_actionAdapter(cfgGSM adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jLowLevel_actionPerformed(e);
  }
}