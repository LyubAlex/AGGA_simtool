package interfaceMod;

import java.awt.*;
import javax.swing.*;
import com.borland.jbcl.layout.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.Vector;
import com.xj.jama.Matrix;

public class dcfgMod extends JDialog {
  Vector interReqData = new Vector(4);
  Matrix intReqData = new Matrix(1,4);
  Object[] dataInterval = {new String("��� � �����"),
                           new String("60 �����"),
                           new String("30 �����"),
                           new String("15 �����"),
                           new String("5 �����"),
                           new String("3 ������"),
                };
  ImageIcon imageOK;
  JPanel panel1 = new JPanel();
  XYLayout xYLayout1 = new XYLayout();
  JLabel labelVrMod = new JLabel();
  JPanel jPanel1 = new JPanel();
  Border border1;
  TitledBorder titledBorder1;
  JPanel jPanel2 = new JPanel();
  XYLayout xYLayout2 = new XYLayout();
  JButton bSaveExit = new JButton();
  JFormattedTextField inputVrMod = new JFormattedTextField();
  JPanel jPanel3 = new JPanel();
  Border border2;
  TitledBorder titledBorder2;
  Checkbox chPower = new Checkbox();
  XYLayout xYLayout3 = new XYLayout();
  Checkbox chEnergy = new Checkbox();
  Checkbox chDopPar = new Checkbox();
  Checkbox chEvent = new Checkbox();
  Border border3;
  Border border4;
  JLabel labelVrMod1 = new JLabel();
  JComboBox jComboBox1 = new JComboBox(dataInterval);
  Border border5;
  XYLayout xYLayout5 = new XYLayout();

  public dcfgMod(Frame frame, String title, boolean modal) {
    super(frame, title, modal);

   try {
      jbInit();
     // pack();
    }
    catch(Exception ex) {
     // ex.printStackTrace();
    }
  }

  private void jbInit() throws Exception {

    border1 = BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151));

    titledBorder1 = new TitledBorder(border1,"������� ����������");
    border2 = BorderFactory.createEtchedBorder(Color.white,new Color(147, 178, 165));
    titledBorder2 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"������������ ���������");
    border4 = BorderFactory.createEmptyBorder();
    border5 = BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151));
    panel1.setLayout(xYLayout1);

   imageOK = new ImageIcon(interfaceMod.Frame1.class.getResource("ok.png"));

    this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    this.setModal(true);
    this.setResizable(false);
    panel1.setBackground(new Color(210, 236, 255));
    panel1.setDebugGraphicsOptions(0);
    labelVrMod.setText("������������ �������������, ���-�� ����");
    labelVrMod.setFont(new java.awt.Font("Arial", 0, 11));
    jPanel1.setBackground(new Color(210, 236, 255));
    jPanel1.setBorder(titledBorder1);
    jPanel1.setLayout(xYLayout2);
    jPanel2.setBackground(new Color(210, 236, 255));
    jPanel2.setBorder(border5);
    jPanel2.setLayout(xYLayout5);
    bSaveExit.setForeground(Color.black);
    bSaveExit.setIcon(imageOK);
    bSaveExit.setText("���������");
    bSaveExit.addActionListener(new dcfgMod_bSaveExit_actionAdapter(this));
    inputVrMod.setValue(new Integer(365));
    inputVrMod.setDebugGraphicsOptions(0);
    inputVrMod.setHorizontalAlignment(SwingConstants.CENTER);

    jPanel3.setBackground(new Color(210, 236, 255));
    jPanel3.setBorder(titledBorder2);
    jPanel3.setLayout(xYLayout3);
    chPower.setBackground(new Color(210, 236, 255));
    chPower.setLabel("����� �������� �� �����");
    chPower.addItemListener(new dcfgMod_chPower_itemAdapter(this));
    chEnergy.setLabel("������� �� �����");
    chEnergy.addItemListener(new dcfgMod_chEnergy_itemAdapter(this));
    chEnergy.setBackground(new Color(210, 236, 255));
    chDopPar.setLabel("�������������� ���������");
    chDopPar.addItemListener(new dcfgMod_chDopPar_itemAdapter(this));
    chDopPar.setBackground(new Color(210, 236, 255));
    chEvent.setLabel("������� �������");
    chEvent.addItemListener(new dcfgMod_chEvent_itemAdapter(this));
    chEvent.setBackground(new Color(210, 236, 255));
    labelVrMod1.setFont(new java.awt.Font("Arial", 0, 11));
    labelVrMod1.setText("������ ������ ���������");
    jComboBox1.setEnabled(false);
    jComboBox1.addActionListener(new dcfgMod_jComboBox1_actionAdapter(this));
    getContentPane().add(panel1);
    jPanel1.add(labelVrMod, new XYConstraints(19, 5, -1, -1));
    jPanel3.add(chEvent, new XYConstraints(6, 0, 140, -1));
    jPanel3.add(chPower, new XYConstraints(6, 23, 171, -1));
    jPanel3.add(chEnergy, new XYConstraints(6, 46, 140, -1));
    jPanel3.add(chDopPar, new XYConstraints(6, 69, 186, -1));
    panel1.add(jPanel2,   new XYConstraints(10, 275, 267, 38));
    jPanel2.add(bSaveExit,   new XYConstraints(75, 4, -1, -1));
    jPanel1.add(jComboBox1,       new XYConstraints(92, 76, 87, 21));
    jPanel1.add(labelVrMod1,   new XYConstraints(19, 54, -1, -1));
    jPanel1.add(inputVrMod, new XYConstraints(92, 24, 87, -1));
    jPanel1.add(jPanel3,    new XYConstraints(15, 102, 225, 127));
    panel1.add(jPanel1,    new XYConstraints(8, 10, 271, -1));
    setSize(new Dimension(288, 351));


    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  Dimension frameSize = this.getSize();
  if (frameSize.height > screenSize.height) {
    frameSize.height = screenSize.height;
  }
  if (frameSize.width > screenSize.width) {
    frameSize.width = screenSize.width;
  }
  this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);



    setVisible(false);

  }

  void bSaveExit_actionPerformed(ActionEvent e) {
    Number valueh1 = (Number)inputVrMod.getValue();
    double valueVrMod = valueh1.doubleValue();
    aiis.model.set_parVrModD(valueVrMod);
    aiis.model.set_parVrMod(24*valueVrMod);


 interReqData.removeAllElements();
    for (int i =0;i<=3;i++){

    interReqData.addElement(new Double(intReqData.get(0,i)));
    }
    aiis.model.set_parReqData(interReqData);

    dispose();
  }

  void chEvent_itemStateChanged(ItemEvent e) {
if (chEvent.getState())
{
 // interReqData.addElement(new Integer(1));
 intReqData.set(0,0,1);
}
else
{intReqData.set(0,0,0);}

  }

  void chPower_itemStateChanged(ItemEvent e) {
    if (chPower.getState())
    {
     // interReqData.addElement(new Integer(1));
     intReqData.set(0,2,1);
    }
    else
    {intReqData.set(0,2,0);}

  }

  void chEnergy_itemStateChanged(ItemEvent e) {
    if (chEnergy.getState())
    {
     // interReqData.addElement(new Integer(1));
     intReqData.set(0,1,1);
    }
    else
    {intReqData.set(0,1,0);}

  }

  void chDopPar_itemStateChanged(ItemEvent e) {
    if (chDopPar.getState())
    {
     // interReqData.addElement(new Integer(1));
     intReqData.set(0,3,1);
    }
    else
    {intReqData.set(0,3,0);}

  }

  void jComboBox1_actionPerformed(ActionEvent e) {

  }



}

class dcfgMod_bSaveExit_actionAdapter implements java.awt.event.ActionListener {
  dcfgMod adaptee;

  dcfgMod_bSaveExit_actionAdapter(dcfgMod adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bSaveExit_actionPerformed(e);
  }
}

class dcfgMod_chEvent_itemAdapter implements java.awt.event.ItemListener {
  dcfgMod adaptee;

  dcfgMod_chEvent_itemAdapter(dcfgMod adaptee) {
    this.adaptee = adaptee;
  }
  public void itemStateChanged(ItemEvent e) {
    adaptee.chEvent_itemStateChanged(e);
  }
}

class dcfgMod_chPower_itemAdapter implements java.awt.event.ItemListener {
  dcfgMod adaptee;

  dcfgMod_chPower_itemAdapter(dcfgMod adaptee) {
    this.adaptee = adaptee;
  }
  public void itemStateChanged(ItemEvent e) {
    adaptee.chPower_itemStateChanged(e);
  }
}

class dcfgMod_chEnergy_itemAdapter implements java.awt.event.ItemListener {
  dcfgMod adaptee;

  dcfgMod_chEnergy_itemAdapter(dcfgMod adaptee) {
    this.adaptee = adaptee;
  }
  public void itemStateChanged(ItemEvent e) {
    adaptee.chEnergy_itemStateChanged(e);
  }
}

class dcfgMod_chDopPar_itemAdapter implements java.awt.event.ItemListener {
  dcfgMod adaptee;

  dcfgMod_chDopPar_itemAdapter(dcfgMod adaptee) {
    this.adaptee = adaptee;
  }
  public void itemStateChanged(ItemEvent e) {
    adaptee.chDopPar_itemStateChanged(e);
  }
}

class dcfgMod_jComboBox1_actionAdapter implements java.awt.event.ActionListener {
  dcfgMod adaptee;

  dcfgMod_jComboBox1_actionAdapter(dcfgMod adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jComboBox1_actionPerformed(e);
  }
}
