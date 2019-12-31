package interfaceMod;

import javax.swing.*;
import java.awt.*;
import com.borland.jbcl.layout.*;
import javax.swing.border.*;
import java.awt.event.*;

public class cfgCounter extends JDialog {

  Object[] data = {new Integer(1200),
                   new Integer(2400),
                   new Integer(4800),
                   new Integer(9600)
               };

  public String msg = "Задайте тип счётчика!";
  public String alert = "Внимание!!!";

  ImageIcon imageOK;
  ImageIcon imageExitWin;
  BorderLayout borderLayout1 = new BorderLayout();
  JPanel jPanel1 = new JPanel();
  XYLayout xYLayout1 = new XYLayout();
  Border border1;
  JPanel jPanel2 = new JPanel();
  Border border2;
  JComboBox jSelectBitrate = new JComboBox(data);
  XYLayout xYLayout3 = new XYLayout();
  JLabel jLabel1 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JFormattedTextField inputTimeOutAnswer = new JFormattedTextField();
  Checkbox selectMIR = new Checkbox();
  JPanel jPanel3 = new JPanel();
  Border border3;
  Checkbox selectSET = new Checkbox();
  XYLayout xYLayout2 = new XYLayout();
  JPanel jPanel4 = new JPanel();
  Border border4;
  XYLayout xYLayout4 = new XYLayout();
  JButton bExit = new JButton();
  JButton bSaveCfg = new JButton();
  JLabel jLabel3 = new JLabel();
  JFormattedTextField inputVerNoAnswer = new JFormattedTextField();
  JLabel jLabel4 = new JLabel();

  public cfgCounter(Frame frame, String title, boolean modal) {
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
    border2 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"Параметры счетчика");
    border3 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"Тип счетчика");
    border4 = BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151));
    this.getContentPane().setLayout(borderLayout1);

    imageOK = new ImageIcon(interfaceMod.Frame1.class.getResource("ok.png"));
    imageExitWin = new ImageIcon(interfaceMod.Frame1.class.getResource("exitWin.png"));
    jPanel1.setLayout(xYLayout1);
    this.setSize(new Dimension(258, 337));
    jPanel2.setBackground(new Color(210, 236, 255));
    jPanel2.setBorder(border2);
    jPanel2.setLayout(xYLayout3);
    jLabel1.setText("Скорость обмена данными, бит/с");
    jLabel2.setText("Максимальное значение таймаута");
    inputTimeOutAnswer.setHorizontalAlignment(SwingConstants.CENTER);
    inputTimeOutAnswer.setValue(new Integer(250));

    jPanel1.setBackground(new Color(210, 236, 255));
    selectMIR.setLabel("МИР С-01");
    selectMIR.addItemListener(new cfgCounter_selectMIR_itemAdapter(this));
    selectMIR.setBackground(new Color(210, 236, 255));
    jPanel3.setBackground(new Color(210, 236, 255));
    jPanel3.setBorder(border3);
    jPanel3.setLayout(xYLayout2);
    selectSET.setBackground(new Color(210, 236, 255));
    selectSET.setLabel("СЭТ-4ТМ");
    selectSET.addItemListener(new cfgCounter_selectSET_itemAdapter(this));
    jPanel4.setBackground(new Color(210, 236, 255));
    jPanel4.setBorder(border4);
    jPanel4.setLayout(xYLayout4);
    bExit.setIcon(imageExitWin);
    bExit.setText("Выйти");
    bExit.addActionListener(new cfgCounter_bExit_actionAdapter(this));

    bSaveCfg.setIcon(imageOK);
    bSaveCfg.setText("Сохранить");
    bSaveCfg.addActionListener(new cfgCounter_bSaveCfg_actionAdapter(this));
    jLabel3.setText("Вероятность отсутствия ответа,%");

    inputVerNoAnswer.setHorizontalAlignment(SwingConstants.CENTER);
    inputVerNoAnswer.setSelectionStart(0);
   inputVerNoAnswer.setValue(new Integer(1));
    jLabel4.setText("ответа, мсек.");
    this.getContentPane().add(jPanel1, BorderLayout.CENTER);
    jPanel1.add(jPanel2,                 new XYConstraints(15, 11, 225, 236));
    jPanel2.add(jPanel3,              new XYConstraints(5, 0, 203, 54));
    jPanel3.add(selectSET,   new XYConstraints(6, 0, -1, -1));
    jPanel3.add(selectMIR, new XYConstraints(105, 0, -1, -1));
    jPanel2.add(jSelectBitrate, new XYConstraints(106, 81, 71, 22));
    jPanel2.add(jLabel1, new XYConstraints(5, 57, -1, 17));
    jPanel2.add(jLabel2, new XYConstraints(5, 108, -1, 17));
    jPanel2.add(jLabel4,    new XYConstraints(5, 122, -1, -1));
    jPanel2.add(inputTimeOutAnswer, new XYConstraints(105, 137, 72, -1));
    jPanel2.add(jLabel3, new XYConstraints(4, 163, -1, 17));
    jPanel2.add(inputVerNoAnswer, new XYConstraints(104, 185, 72, -1));
    jPanel1.add(jPanel4,                 new XYConstraints(17, 253, 221, 45));
    jPanel4.add(bExit,  new XYConstraints(122, 8, -1, -1));
    jPanel4.add(bSaveCfg,     new XYConstraints(10, 8, -1, -1));










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

  void selectSET_itemStateChanged(ItemEvent e) {
if (selectSET.getState())
{
  selectMIR.setEnabled(false);

  jSelectBitrate.setSelectedIndex(3);
  inputTimeOutAnswer.setValue(new Double(250));
  inputVerNoAnswer.setValue(new Double(1));
}
else if (selectSET.getState()==false)
{
  selectMIR.setEnabled(true);

}
  }

  void selectMIR_itemStateChanged(ItemEvent e) {
    if (selectMIR.getState())
    {
      selectSET.setEnabled(false);
      jSelectBitrate.setSelectedIndex(3);
inputTimeOutAnswer.setValue(new Double(300));
inputVerNoAnswer.setValue(new Double(1));

    }
    else if (selectMIR.getState()==false)
    {
      selectSET.setEnabled(true);

    }

}


  void bExit_actionPerformed(ActionEvent e) {
this.dispose();
  }

  void bSaveCfg_actionPerformed(ActionEvent e) {
    if (selectSET.getState()==false & selectMIR.getState()==false)
      {
        JOptionPane.showMessageDialog(this,msg,alert,JOptionPane.WARNING_MESSAGE);


      }
      else if (selectSET.getState()==true)
      {
        Number valueh1 = (Number)inputTimeOutAnswer.getValue();
        double valueTimeOut = valueh1.doubleValue();
        aiis.model.set_parSETmaxTimeoutAnswer(valueTimeOut/1000);

        Number valueh2 = (Number)inputVerNoAnswer.getValue();
        double valueVer = valueh2.doubleValue();
        aiis.model.set_parSETverNoAnswer(valueVer);

        if (jSelectBitrate.getSelectedIndex()==0)
        {
          aiis.model.set_parBitrateSET(1200);
        }
        else  if (jSelectBitrate.getSelectedIndex()==1)
        {
          aiis.model.set_parBitrateSET(2400);
        }
        else  if (jSelectBitrate.getSelectedIndex()==2)
        {
          aiis.model.set_parBitrateSET(4800);
        }
        else  if (jSelectBitrate.getSelectedIndex()==3)
        {
          aiis.model.set_parBitrateSET(9600);
        }

      selectSET.setState(false);
        selectMIR.setEnabled(true);


      }
      else if (selectMIR.getState()==true)
      {
      Number valueh1 = (Number)inputTimeOutAnswer.getValue();
      double valueTimeOut = valueh1.doubleValue();
      aiis.model.set_parMIRmaxTimeoutAnswer(valueTimeOut/1000);

      Number valueh2 = (Number)inputVerNoAnswer.getValue();
      double valueVer = valueh2.doubleValue();
      aiis.model.set_parMIRverNoAnswer(valueVer);

      if (jSelectBitrate.getSelectedIndex()==0)
      {
        aiis.model.set_parBitrateMIR(1200);
      }
      else  if (jSelectBitrate.getSelectedIndex()==1)
      {
        aiis.model.set_parBitrateMIR(2400);
      }
      else  if (jSelectBitrate.getSelectedIndex()==2)
      {
        aiis.model.set_parBitrateMIR(4800);
      }
      else  if (jSelectBitrate.getSelectedIndex()==3)
      {
        aiis.model.set_parBitrateMIR(9600);
      }

      selectMIR.setState(false);
      selectSET.setEnabled(true);


      }


  }





}

class cfgCounter_selectSET_itemAdapter implements java.awt.event.ItemListener {
  cfgCounter adaptee;

  cfgCounter_selectSET_itemAdapter(cfgCounter adaptee) {
    this.adaptee = adaptee;
  }
  public void itemStateChanged(ItemEvent e) {
    adaptee.selectSET_itemStateChanged(e);
  }
}

class cfgCounter_selectMIR_itemAdapter implements java.awt.event.ItemListener {
  cfgCounter adaptee;

  cfgCounter_selectMIR_itemAdapter(cfgCounter adaptee) {
    this.adaptee = adaptee;
  }
  public void itemStateChanged(ItemEvent e) {
    adaptee.selectMIR_itemStateChanged(e);
  }
}

class cfgCounter_bSaveCfg_actionAdapter implements java.awt.event.ActionListener {
  cfgCounter adaptee;

  cfgCounter_bSaveCfg_actionAdapter(cfgCounter adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bSaveCfg_actionPerformed(e);
  }
}

class cfgCounter_bExit_actionAdapter implements java.awt.event.ActionListener {
  cfgCounter adaptee;

  cfgCounter_bExit_actionAdapter(cfgCounter adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bExit_actionPerformed(e);
  }
}
