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
public class cfgSystem extends JFrame {
 // XYLayout xYLayout1 = new XYLayout();
 int interKolGSM = 0;

//int interIndexGPRS = 0;
int interKolGPRS = 0;

Vector tranGSM = new Vector(10,10);
Vector tranGPRS = new Vector(10,10);







//Vector transferP = new Vector();


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
  XYLayout xYLayout4 = new XYLayout();


/* public GSMcfg(Frame frame, String title, boolean modal) {
    super(frame, title, modal);
    try {
      jbInit();
      pack();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }*/

  public cfgSystem() {
   // this(null, "", false);
    try {
  jbInit();
 // pack();
}
catch(Exception ex) {
  ex.printStackTrace();
}

  }

  private void jbInit() throws Exception {
    titledBorder1 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"Конфигурация системы");




       contentPane = (JPanel) this.getContentPane();
       border1 = BorderFactory.createEtchedBorder(Color.white,new Color(165, 161, 133));
       contentPane.setBackground(new Color(210, 236, 255));
       contentPane.setFont(new java.awt.Font("MS Outlook", 0, 11));
    contentPane.setPreferredSize(new Dimension(254, 231));
       contentPane.setLayout(xYLayout4);
    this.setForeground(Color.red);
    this.setResizable(false);
       this.setSize(new Dimension(254, 280));
       this.setTitle("Структура системы");
       this.setVisible(true);
       jPanel1.setLayout(xYLayout1);
       jPanel1.setBackground(new Color(210, 236, 255));
       jPanel1.setBorder(null);
       jPanel1.setMinimumSize(new Dimension(4, 4));
       jPanel1.setOpaque(true);
       jPanel1.setToolTipText("");

       jPanel2.setBackground(new Color(210, 236, 255));
       jPanel2.setFont(new java.awt.Font("Georgia", 0, 20));
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
       jLabelSET.setText("СЭТ-4ТМ");
       jLabelSET.setFont(new java.awt.Font("Arial", 0, 11));
       jLabelSET.setToolTipText("");
       inputKolSET.setValue(new Integer(100));
       inputKolSET.setDebugGraphicsOptions(0);
       inputKolSET.setHorizontalAlignment(SwingConstants.CENTER);
       inputKolSET.setText("0");



       createChannel.setFont(new java.awt.Font("Arial", 0, 11));
       createChannel.setText("Создать канал");
       createChannel.addActionListener(new cfgSystem_createChannel_actionAdapter(this));
       exitButton.addActionListener(new cfgSystem_exitButton_actionAdapter(this));
       exitButton.setText("Выйти");
       exitButton.addActionListener(new cfgSystem_exitButton_actionAdapter(this));

       exitButton.setFont(new java.awt.Font("Arial", 0, 11));
       jPanel3.setBackground(new Color(210, 236, 255));
       jPanel3.setBorder(border1);
       jPanel3.setLayout(xYLayout3);
       flGSM.setBackground(new Color(210, 236, 255));
       flGSM.setFont(new java.awt.Font("Arial", 0, 11));
       flGSM.setForeground(Color.black);
       flGSM.setLabel("   GSM");
       flGSM.addItemListener(new cfgSystem_flGSM_itemAdapter(this));

       flGPRS.setLabel("   GPRS");
       flGPRS.addItemListener(new cfgSystem_flGPRS_itemAdapter(this));
       flGPRS.setFont(new java.awt.Font("Arial", 0, 11));
       flGPRS.setBackground(new Color(210, 236, 255));
       jVsegoGSM.setToolTipText("");
       jVsegoGSM.setVerifyInputWhenFocusTarget(true);
       jVsegoGSM.setText("0");
       inputKolMIR.setText("0");
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
       jPanel2.add(jLabelTypeChannel, new XYConstraints(8, 8, -1, -1));
       jPanel2.add(jLabelTypeCh, new XYConstraints(8, 72, -1, -1));
       jPanel2.add(jLabelSET, new XYConstraints(30, 92, -1, -1));
       jPanel2.add(inputKolSET, new XYConstraints(23, 110, 59, -1));
       jPanel2.add(flGSM,  new XYConstraints(7, 24, -1, -1));
       jPanel2.add(flGPRS,   new XYConstraints(7, 47, -1, -1));
       jPanel2.add(inputKolMIR,     new XYConstraints(143, 110, 59, -1));
       jPanel2.add(jLabelitogo,   new XYConstraints(94, 8, -1, -1));
       jPanel2.add(jVsegoGSM, new XYConstraints(162, 25, -1, -1));
       jPanel2.add(jVsegoGPRS, new XYConstraints(162, 50, -1, -1));
       jPanel2.add(jLabelMIR,  new XYConstraints(150, 92, -1, -1));
       jPanel3.add(createChannel,  new XYConstraints(11, 5, -1, -1));
       jPanel3.add(exitButton,  new XYConstraints(133, 5, 87, -1));
    jPanel1.add(jPanel2, new XYConstraints(7, 8, 240, 163));
    jPanel1.add(jPanel3, new XYConstraints(8, 179, 237, 38));
    contentPane.add(jScrollPane1,  new XYConstraints(-2, 0, 257, 233));
    jScrollPane1.getViewport().add(jPanel1, null);




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
   //  transferP.addElement(new Integer(123));
     //aiis.model.set_param(transferP);

     if (flGSM.getState() == true){
tranGSM.addElement(new Double(((Number)inputKolSET.getValue()).doubleValue()));
tranGSM.addElement(new Double(((Number)inputKolMIR.getValue()).doubleValue()));
interKolGSM++;
jVsegoGSM.setText(""+interKolGSM);
aiis.model.set_parKolMasGSM(tranGSM);
aiis.model.test.set(0,0,1);

}


else if (flGPRS.getState() == true){
tranGPRS.addElement(new Double(((Number)inputKolSET.getValue()).doubleValue()));
tranGPRS.addElement(new Double(((Number)inputKolMIR.getValue()).doubleValue()));
interKolGPRS++;
jVsegoGPRS.setText(""+interKolGPRS);

aiis.model.set_parKolMasGPRS(tranGPRS);
aiis.model.test.set(0,1,1);

}


/*if (flGSM.getState() == true){

  interMasGSM.set(0,interIndexGSM,((Number)inputKolSET.getValue()).doubleValue());
  interMasGSM.set(1,interIndexGSM,((Number)inputKolMIR.getValue()).doubleValue());
  interKolGSM++;
  interIndexGSM++;
  jVsegoGSM.setText(""+interKolGSM);

}
  else if (flGPRS.getState() == true){

  interMasGPRS.set(0,interIndexGPRS,((Number)inputKolSET.getValue()).doubleValue());
  interMasGPRS.set(1,interIndexGPRS,((Number)inputKolMIR.getValue()).doubleValue());

  interKolGPRS++;
  interIndexGPRS++;
  jVsegoGPRS.setText(""+interKolGPRS);
}*/




  inputKolSET.setText("0");
  inputKolMIR.setText("0");

  flGSM.setState(false);
  flGSM.setEnabled(true);

  flGPRS.setState(false);
  flGPRS.setEnabled(true);

  }

  void flGSM_itemStateChanged(ItemEvent e) {
  if (flGSM.getState() == true)
     {flGPRS.setEnabled(false);}
 else if (flGSM.getState() == false)
    {flGPRS.setEnabled(true);}
  }

  void flGPRS_itemStateChanged(ItemEvent e) {
//flGSM.setEnabled(false);
    if (flGPRS.getState() == true)
{flGSM.setEnabled(false);}
    else if (flGPRS.getState() == false)
    {flGSM.setEnabled(true);}

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












