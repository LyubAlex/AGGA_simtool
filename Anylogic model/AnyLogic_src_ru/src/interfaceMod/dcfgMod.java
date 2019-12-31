package interfaceMod;

import java.awt.*;
import javax.swing.*;
import com.borland.jbcl.layout.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.Vector;
import com.xj.jama.Matrix;
import aiis.*;

public class dcfgMod extends JDialog {
  //вектор флагов опрашиваемых данных
  Vector interReqData = new Vector(4);
  Matrix intReqData = new Matrix(1,4);
  JPanel panel1 = new JPanel();
  XYLayout xYLayout1 = new XYLayout();
  JLabel labelVrMod = new JLabel();
  JPanel jPanel1 = new JPanel();
  Border border1;
  TitledBorder titledBorder1;
  JPanel jPanel2 = new JPanel();
  XYLayout xYLayout2 = new XYLayout();
  FlowLayout flowLayout1 = new FlowLayout();
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

  public dcfgMod(Frame frame, String title, boolean modal) {
   super(frame, title, modal);
   try 
   {
      jbInit();
   }
   catch(Exception ex) {
     // ex.printStackTrace();
    }
  }

  private void jbInit() throws Exception {
    border1 = BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151));
    titledBorder1 = new TitledBorder(border1,"Задание параметров");
    border2 = BorderFactory.createEtchedBorder(Color.white,new Color(147, 178, 165));
    titledBorder2 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"Опрашиваемые параметры");
    panel1.setLayout(xYLayout1);
    this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    this.setModal(true);
    this.setResizable(false);
    panel1.setBackground(new Color(210, 255, 236));
    panel1.setDebugGraphicsOptions(0);
    labelVrMod.setText("Длительность моделирования, кол-во дней");
    labelVrMod.setFont(new java.awt.Font("Arial", 0, 11));
    jPanel1.setBackground(new Color(210, 255, 236));
    jPanel1.setBorder(titledBorder1);
    jPanel1.setLayout(xYLayout2);
    jPanel2.setBackground(new Color(210, 255, 236));
    jPanel2.setBorder(BorderFactory.createEtchedBorder());
    jPanel2.setLayout(flowLayout1);
    bSaveExit.setText("Сохранить");
    bSaveExit.addActionListener(new dcfgMod_bSaveExit_actionAdapter(this));
    inputVrMod.setValue(new Integer(100));
    inputVrMod.setDebugGraphicsOptions(0);
    inputVrMod.setHorizontalAlignment(SwingConstants.CENTER);
    inputVrMod.setText("30");
    jPanel3.setBackground(new Color(210, 255, 236));
    jPanel3.setBorder(titledBorder2);
    jPanel3.setLayout(xYLayout3);
    chPower.setBackground(new Color(210, 255, 236));
    chPower.setLabel("Срезы мощности за сутки");
    chPower.addItemListener(new dcfgMod_chPower_itemAdapter(this));
    chEnergy.setLabel("Энергия за сутки");
    chEnergy.addItemListener(new dcfgMod_chEnergy_itemAdapter(this));
    chEnergy.setBackground(new Color(210, 255, 236));
    chDopPar.setLabel("Дополнительный параметры");
    chDopPar.addItemListener(new dcfgMod_chDopPar_itemAdapter(this));
    chDopPar.setBackground(new Color(210, 255, 236));
    chEvent.setLabel("Журналы событий");
    chEvent.addItemListener(new dcfgMod_chEvent_itemAdapter(this));
    chEvent.setBackground(new Color(210, 255, 236));
    getContentPane().add(panel1);
    panel1.add(jPanel1,       new XYConstraints(17, 18, 354, 209));
    jPanel1.add(labelVrMod, new XYConstraints(19, 5, -1, -1));
    jPanel1.add(jPanel3,          new XYConstraints(19, 32, 207, 127));
    jPanel1.add(inputVrMod, new XYConstraints(264, 2, 59, -1));
    panel1.add(jPanel2,        new XYConstraints(20, 235, 241, 38));
    jPanel2.add(bSaveExit, null);
    jPanel3.add(chEvent, new XYConstraints(6, 0, 140, -1));
    jPanel3.add(chPower, new XYConstraints(6, 23, 171, -1));
    jPanel3.add(chEnergy, new XYConstraints(6, 46, 140, -1));
    jPanel3.add(chDopPar, new XYConstraints(6, 69, 186, -1));
    setSize(new Dimension(395, 307));
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

    for (int i =0;i<=3;i++){
    interReqData.addElement(new Double(intReqData.get(0,i)));
    }
    aiis.model.set_parReqData(interReqData);

    dispose();
  }

  void chEvent_itemStateChanged(ItemEvent e) {
  if (chEvent.getState())
  {
   intReqData.set(0,0,1);
  }
  else
  {
  intReqData.set(0,0,0);}
}

  void chPower_itemStateChanged(ItemEvent e) {
    if (chPower.getState())
    {
     intReqData.set(0,2,1);
    }
    else
    {
    intReqData.set(0,2,0);
    }
  }

  void chEnergy_itemStateChanged(ItemEvent e) {
    if (chEnergy.getState())
    {
     intReqData.set(0,1,1);
    }
    else
    {intReqData.set(0,1,0);}
  }

  void chDopPar_itemStateChanged(ItemEvent e) {
    if (chDopPar.getState())
    {
     intReqData.set(0,3,1);
    }
    else
    {intReqData.set(0,3,0);}
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
