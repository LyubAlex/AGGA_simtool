package interfaceMod;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.borland.jbcl.layout.*;
import javax.swing.border.*;

import com.xj.anylogic.*;
import com.xj.jama.Matrix;

import aiis.*;
import java.util.Vector;


/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2008</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */
public class cfgSystem extends JDialog {
 // XYLayout xYLayout1 = new XYLayout();
/* int cfgKolGSM;


int cfgKolGPRS;

Vector cfgTranGSM;
Vector cfgTranGPRS;*/

 public int interKolGSM = 0;
 public int interKolGPRS = 0;
 public int interKolRADIO = 0;

// public Vector tranGSM = new Vector(10,10);
// public Vector tranGPRS = new Vector(10,10);

 public Vector tranGSM = new Vector();
 public Vector tranRADIO = new Vector();
 public Vector tranGPRS = new Vector();
  ImageIcon imageDeleteI;
  ImageIcon imageExitWin;
   ImageIcon  imageDeleteAll;
    ImageIcon  imageCreate;
  JPanel contentPane;
  JScrollPane jScrollPane1 = new JScrollPane();
  JPanel jPanel1 = new JPanel();
  XYLayout xYLayout1 = new XYLayout();
  JPanel jPanel2 = new JPanel();
  TitledBorder titledBorder1;
  JLabel jLabelTypeChannel = new JLabel();
  XYLayout xYLayout2 = new XYLayout();
  JLabel jLabelTypeCh = new JLabel();
  JLabel jLabelSET = new JLabel();
  JFormattedTextField inputKolSET = new JFormattedTextField();

  JButton createChannel = new JButton();
  XYLayout xYLayout3 = new XYLayout();
  JButton exitButton = new JButton();
  JPanel jPanel3 = new JPanel();
  Border border1;
  Checkbox flGSM = new Checkbox();
  Checkbox flGPRS = new Checkbox();
  JTextArea jVsegoGSM = new JTextArea();
  JFormattedTextField inputKolMIR = new JFormattedTextField();
  JTextArea jVsegoGPRS = new JTextArea();
  JLabel jLabelitogo = new JLabel();
  JLabel jLabelMIR = new JLabel();
  JButton bResetiChannel = new JButton();
  JButton bResetAllChannel = new JButton();
  JTextArea jVsegoRADIO = new JTextArea();
  Checkbox flRADIO = new Checkbox();



public cfgSystem(Frame frame, String title, boolean modal) {
    super(frame, title, modal);

    try
 { jbInit();

 }
 /// pack();

catch(Exception ex) {
 // ex.printStackTrace();
}

  }

  public void jbInit() throws Exception {
    titledBorder1 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"Конфигурация системы");


imageDeleteI = new ImageIcon(interfaceMod.Frame1.class.getResource("deleteI.png"));
imageExitWin = new ImageIcon(interfaceMod.Frame1.class.getResource("exitWin.png"));
imageDeleteAll = new ImageIcon(interfaceMod.Frame1.class.getResource("deleteAll.png"));
imageCreate = new ImageIcon(interfaceMod.Frame1.class.getResource("create.png"));
       contentPane = (JPanel) this.getContentPane();
       border1 = BorderFactory.createEtchedBorder(Color.white,new Color(165, 161, 133));
       contentPane.setBackground(new Color(210, 236, 255));
       contentPane.setFont(new java.awt.Font("MS Outlook", 0, 11));
    contentPane.setPreferredSize(new Dimension(254, 231));
    //this.setForeground(Color.red);
    this.setResizable(false);
       this.setSize(new Dimension(262, 282));
       //this.setTitle("Структура системы");
      // this.setVisible(true);
       jPanel1.setLayout(xYLayout1);
       jPanel1.setBackground(new Color(210, 236, 255));
       jPanel1.setBorder(null);
       jPanel1.setMinimumSize(new Dimension(4, 4));
       jPanel1.setOpaque(true);
       jPanel1.setToolTipText("");

       jPanel2.setBackground(new Color(210, 236, 255));
       jPanel2.setFont(new java.awt.Font("Georgia", 0, 20));
    jPanel2.setForeground(Color.black);
       jPanel2.setBorder(titledBorder1);
       jPanel2.setDebugGraphicsOptions(0);
       jPanel2.setLayout(xYLayout2);
       jScrollPane1.setFont(new java.awt.Font("Dialog", 0, 20));
       titledBorder1.setTitleFont(new java.awt.Font("Arial", 0, 11));
       titledBorder1.setTitle("Конфигурация системы");
       jLabelTypeChannel.setFont(new java.awt.Font("Arial", 0, 11));
       jLabelTypeChannel.setText("Тип канала:");







       jLabelTypeCh.setText("Тип счётчиков и их количество:");
       jLabelTypeCh.setFont(new java.awt.Font("Arial", 0, 11));
       jLabelSET.setText("СЭТ-4ТМ.02");
       jLabelSET.setFont(new java.awt.Font("Arial", 0, 11));
       jLabelSET.setToolTipText("");
       inputKolSET.setValue(new Integer(0));
       inputKolSET.setDebugGraphicsOptions(0);
       inputKolSET.setHorizontalAlignment(SwingConstants.CENTER);
     //  inputKolSET.setText("0");



       createChannel.setFont(new java.awt.Font("Arial", 0, 11));
    createChannel.setToolTipText("Создать канал");
       createChannel.addActionListener(new cfgSystem_createChannel_actionAdapter(this));
       createChannel.setIcon(imageCreate);
    createChannel.setMargin(new Insets(2, 14, 2, 14));
    createChannel.setText("");
       exitButton.addActionListener(new cfgSystem_exitButton_actionAdapter(this));
       exitButton.addActionListener(new cfgSystem_exitButton_actionAdapter(this));

       exitButton.setFont(new java.awt.Font("Arial", 0, 11));
    exitButton.setToolTipText("Выйти");
       exitButton.setIcon(imageExitWin);
    exitButton.setText("");
       jPanel3.setBackground(new Color(210, 236, 255));
       jPanel3.setBorder(border1);
       jPanel3.setLayout(xYLayout3);
       flGSM.setBackground(new Color(210, 236, 255));
       flGSM.setFont(new java.awt.Font("Arial", 0, 11));
       flGSM.setForeground(Color.black);
       flGSM.setLabel("   GSM CSD");
       flGSM.addItemListener(new cfgSystem_flGSM_itemAdapter(this));

       flGPRS.setLabel("   GPRS");
       flGPRS.addItemListener(new cfgSystem_flGPRS_itemAdapter(this));
       flGPRS.setFont(new java.awt.Font("Arial", 0, 11));
       flGPRS.setBackground(new Color(210, 236, 255));
       jVsegoGSM.setToolTipText("");
       jVsegoGSM.setVerifyInputWhenFocusTarget(true);
       jVsegoGSM.setText("0");
       //inputKolMIR.setText("0");
       inputKolMIR.setHorizontalAlignment(SwingConstants.CENTER);
       inputKolMIR.setDebugGraphicsOptions(0);
       inputKolMIR.setValue(new Integer(0));
       jVsegoGPRS.setText("0");
       jLabelitogo.setText("Всего каналов:");
       jLabelitogo.setFont(new java.awt.Font("Arial", 0, 11));
       jLabelMIR.setToolTipText("");
       jLabelMIR.setVerifyInputWhenFocusTarget(true);
       jLabelMIR.setFont(new java.awt.Font("Arial", 0, 11));
       jLabelMIR.setText("МИР-С01");
    bResetiChannel.setEnabled(false);
    bResetiChannel.setToolTipText("Отменить предыдущий ввод");
    bResetiChannel.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
    bResetiChannel.addActionListener(new cfgSystem_bResetiChannel_actionAdapter(this));
    bResetiChannel.setIcon(imageDeleteI);
    bResetiChannel.setText("");
    bResetAllChannel.setEnabled(false);
    bResetAllChannel.setToolTipText("Сбросить конфигурацию");
    bResetAllChannel.addActionListener(new cfgSystem_bResetAllChannel_actionAdapter(this));
    bResetAllChannel.setIcon(imageDeleteAll);
    bResetAllChannel.setText("");
    jVsegoRADIO.setText("0");
    flRADIO.setEnabled(false);
    flRADIO.setFont(new java.awt.Font("Arial", 0, 11));
    flRADIO.setLabel("   Радиоканал");
    flRADIO.addItemListener(new cfgSystem_flRADIO_itemAdapter(this));
    jPanel2.add(jLabelTypeChannel, new XYConstraints(8, 8, -1, -1));
       jPanel2.add(flGSM,  new XYConstraints(7, 24, -1, -1));
       jPanel2.add(flGPRS,   new XYConstraints(7, 47, -1, -1));
       jPanel2.add(jLabelitogo,      new XYConstraints(125, 8, -1, -1));
       jPanel2.add(jVsegoGSM, new XYConstraints(162, 25, -1, -1));
       jPanel2.add(jVsegoGPRS,   new XYConstraints(162, 48, -1, -1));
    jPanel2.add(jLabelTypeCh, new XYConstraints(8, 92, -1, -1));
    jPanel2.add(inputKolSET, new XYConstraints(23, 130, 59, -1));
    jPanel2.add(inputKolMIR, new XYConstraints(143, 130, 59, -1));
    jPanel2.add(jLabelMIR, new XYConstraints(150, 112, -1, -1));
    jPanel2.add(jLabelSET,    new XYConstraints(23, 112, -1, -1));
    jPanel2.add(jVsegoRADIO,         new XYConstraints(162, 72, 8, -1));
    jPanel2.add(flRADIO,  new XYConstraints(7, 70, -1, -1));
    jPanel3.add(bResetiChannel, new XYConstraints(76, 6, 38, -1));
    jPanel3.add(createChannel, new XYConstraints(34, 6, 38, -1));
    jPanel3.add(bResetAllChannel, new XYConstraints(118, 6, 38, -1));
    jPanel3.add(exitButton, new XYConstraints(160, 6, 38, -1));
    jPanel1.add(jPanel2,   new XYConstraints(7, 8, 240, 182));
    jPanel1.add(jPanel3,      new XYConstraints(8, 200, 237, 42));
    contentPane.add(jScrollPane1, BorderLayout.CENTER);
    jScrollPane1.getViewport().add(jPanel1, null);


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

void deleteGSM(){
       if ((tranGSM.isEmpty() == false & tranGPRS.isEmpty() == true)|(tranGSM.isEmpty() == false & tranGPRS.isEmpty() == false))
     {


    tranGSM.remove(interKolGSM);
    interKolGSM--;
    tranGSM.remove(interKolGSM);
      if (tranGSM.size()==0 ){
         aiis.model.askChannel.set(0,0,0);
         }

    this.bResetiChannel.setEnabled(false);
     }

  else
  { JOptionPane.showMessageDialog(this,"Канал GSM отсутствует!","Ошибка!!!",JOptionPane.ERROR_MESSAGE);
  }

  if (tranGSM.isEmpty() == true & tranGPRS.isEmpty() == true)
  {
    this.bResetAllChannel.setEnabled(false);
  }

}

    void deleteGPRS(){
      if ((tranGSM.isEmpty() == true & tranGPRS.isEmpty() == false)|(tranGSM.isEmpty() == false & tranGPRS.isEmpty() == false))
      {    tranGPRS.remove(interKolGPRS);
        interKolGPRS--;
        tranGPRS.remove(interKolGPRS);
        if (tranGPRS.size()==0 ){
     aiis.model.askChannel.set(0,1,0);
     }

        this.bResetiChannel.setEnabled(false);
  }
  /*else if (tranGSM.isEmpty() == false & tranGPRS.isEmpty() == false)
  {
    tranGPRS.remove(interKolGPRS);
        interKolGPRS--;
        tranGPRS.remove(interKolGPRS);
this.bResetiChannel.setEnabled(false);
  }*/

  else
  { JOptionPane.showMessageDialog(this,"Канал GPRS отсутствует!","Ошибка!!!",JOptionPane.ERROR_MESSAGE);
  }

if (tranGSM.isEmpty() == true & tranGPRS.isEmpty() == true)
{
  this.bResetAllChannel.setEnabled(false);
}
}


   /*  protected void processWindowEvent(WindowEvent e) {
       super.processWindowEvent(e);
       if (e.getID() == WindowEvent.WINDOW_CLOSING) {
         System.exit(101);
       }
     }*/

     void exitButton_actionPerformed(ActionEvent e) {
   this.dispose();
     }

     void createChannel_actionPerformed(ActionEvent e) {



   if (flGSM.getState() == false & flGPRS.getState() == false & flRADIO.getState() == false)
{JOptionPane.showMessageDialog(this,"Введите данные: тип канала и кол-во счётчиков!","Внимание!!!",JOptionPane.WARNING_MESSAGE);}
else{
     if (flGSM.getState()){

tranGSM.addElement(new Double(((Number)inputKolSET.getValue()).doubleValue()));
tranGSM.addElement(new Double(((Number)inputKolMIR.getValue()).doubleValue()));
interKolGSM++;

jVsegoGSM.setText(""+interKolGSM);
aiis.model.set_parKolMasGSM(tranGSM);
aiis.model.askChannel.set(0,0,1);

}
else if (flGPRS.getState()){
tranGPRS.addElement(new Double(((Number)inputKolSET.getValue()).doubleValue()));
tranGPRS.addElement(new Double(((Number)inputKolMIR.getValue()).doubleValue()));
interKolGPRS++;
jVsegoGPRS.setText(""+interKolGPRS);

aiis.model.set_parKolMasGPRS(tranGPRS);
aiis.model.askChannel.set(0,1,1);

}
     else if (flRADIO.getState()){
 tranRADIO.addElement(new Double(((Number)inputKolSET.getValue()).doubleValue()));
 tranRADIO.addElement(new Double(((Number)inputKolMIR.getValue()).doubleValue()));
 interKolRADIO++;
 jVsegoRADIO.setText(""+interKolRADIO);

 aiis.model.set_parKolMasRADIO(tranRADIO);
 aiis.model.askChannel.set(0,2,1);

 }

   inputKolSET.setValue(new Integer(0));
   inputKolMIR.setValue(new Integer(0));

 // inputKolSET.setText("0");
 // inputKolMIR.setText("0");

  flGSM.setState(false);
  flGSM.setEnabled(true);

  flGPRS.setState(false);
  flGPRS.setEnabled(true);

 // flRADIO.setState(false);
  //flRADIO.setEnabled(true);

  bResetiChannel.setEnabled(true);
  bResetAllChannel.setEnabled(true);

  }}

  void flGSM_itemStateChanged(ItemEvent e) {
  if (flGSM.getState() == true)
     {flGPRS.setEnabled(false);
     flRADIO.setEnabled(false);

     }
 else if (flGSM.getState() == false)
    {flGPRS.setEnabled(true);
    flRADIO.setEnabled(true);

    }
  }

  void flGPRS_itemStateChanged(ItemEvent e) {

    if (flGPRS.getState() == true)
{flGSM.setEnabled(false);
    flRADIO.setEnabled(false);
    }
    else if (flGPRS.getState() == false)
    {flGSM.setEnabled(true);
    flRADIO.setEnabled(true);
    }

  }

  void bResetiChannel_actionPerformed(ActionEvent e) {
  int whatChannel = JOptionPane.showConfirmDialog(this,"Удалить GSM(Да) или GPRS(Нет) канал?","Внимание!!!",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
  switch(whatChannel){
         case JOptionPane.YES_OPTION:this.deleteGSM();break;
         case JOptionPane.NO_OPTION:this. deleteGPRS() ; break;
         case JOptionPane.CANCEL_OPTION:
         case JOptionPane.CLOSED_OPTION: break;
         default:}






 jVsegoGSM.setText(""+interKolGSM);
 jVsegoGPRS.setText(""+interKolGPRS);
}


  void bResetAllChannel_actionPerformed(ActionEvent e) {
   flGSM.setState(false);
   flGPRS.setState(false);

   inputKolSET.setValue(new Integer(0));
   inputKolMIR.setValue(new Integer(0));

    tranGSM.removeAllElements();
    tranGPRS.removeAllElements();

    aiis.model.parKolMasGPRS = null;
    aiis.model.parKolMasGSM = null;

    for (int i=0;i<=2;i++){
          aiis.model.askChannel.set(i,0);
    }
  interKolGSM=0;
   interKolGPRS=0;

  jVsegoGSM.setText("0");
  jVsegoGPRS.setText("0");

  this.bResetAllChannel.setEnabled(false);
  this.bResetiChannel.setEnabled(false);
 }

  void flRADIO_itemStateChanged(ItemEvent e) {
    if (flRADIO.getState() == true)
{flGSM.setEnabled(false);
 flGPRS.setEnabled(false);
    }
    else if (flRADIO.getState() == false)
    {flGSM.setEnabled(true);
    flGPRS.setEnabled(true);
    }

  }






   }

   class cfgSystem_exitButton_actionAdapter implements java.awt.event.ActionListener {
     cfgSystem adaptee;

     cfgSystem_exitButton_actionAdapter(cfgSystem adaptee) {
       this.adaptee = adaptee;
     }
     public void actionPerformed(ActionEvent e) {
       adaptee.exitButton_actionPerformed(e);
     }
   }

   class cfgSystem_createChannel_actionAdapter implements java.awt.event.ActionListener {
     cfgSystem adaptee;

     cfgSystem_createChannel_actionAdapter(cfgSystem adaptee) {
       this.adaptee = adaptee;
     }
     public void actionPerformed(ActionEvent e) {
       adaptee.createChannel_actionPerformed(e);
     }
   }

   class cfgSystem_flGSM_itemAdapter implements java.awt.event.ItemListener {
     cfgSystem adaptee;

     cfgSystem_flGSM_itemAdapter(cfgSystem adaptee) {
       this.adaptee = adaptee;
     }
     public void itemStateChanged(ItemEvent e) {
       adaptee.flGSM_itemStateChanged(e);
     }
   }

   class cfgSystem_flGPRS_itemAdapter implements java.awt.event.ItemListener {
     cfgSystem adaptee;

     cfgSystem_flGPRS_itemAdapter(cfgSystem adaptee) {
       this.adaptee = adaptee;
     }
     public void itemStateChanged(ItemEvent e) {
       adaptee.flGPRS_itemStateChanged(e);
     }
   }

class cfgSystem_bResetiChannel_actionAdapter implements java.awt.event.ActionListener {
  cfgSystem adaptee;

  cfgSystem_bResetiChannel_actionAdapter(cfgSystem adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bResetiChannel_actionPerformed(e);
  }
}

class cfgSystem_bResetAllChannel_actionAdapter implements java.awt.event.ActionListener {
  cfgSystem adaptee;

  cfgSystem_bResetAllChannel_actionAdapter(cfgSystem adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bResetAllChannel_actionPerformed(e);
  }
}

class cfgSystem_flRADIO_itemAdapter implements java.awt.event.ItemListener {
  cfgSystem adaptee;

  cfgSystem_flRADIO_itemAdapter(cfgSystem adaptee) {
    this.adaptee = adaptee;
  }
  public void itemStateChanged(ItemEvent e) {
    adaptee.flRADIO_itemStateChanged(e);
  }
}












