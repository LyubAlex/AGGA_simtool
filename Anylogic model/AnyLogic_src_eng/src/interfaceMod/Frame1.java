package interfaceMod;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.borland.jbcl.layout.*;
import com.xj.anylogic.Engine;
import com.xj.anylogic.*;
import javax.swing.border.*;
import com.xj.anylogic.VectorFunction;
import java.util.Vector;




public class Frame1 extends JFrame {

public static Vector transferDataGPRS1 = new Vector();


boolean isStoped = false;

  cfgSystem exCfgSystem = new cfgSystem(this,"Структура системы",true);
  cfgGSM exCfgGSM = new cfgGSM(this,"Параметры канала GSM",true);
  cfgGPRS exCfgGPRS = new cfgGPRS(this,"Параметры канала GPRS",true);
  dcfgMod exDcfgMod = new dcfgMod(this,"Параметры моделирования",true);
  cfgCounter exCfgCounter = new cfgCounter(this,"Параметры счётчика",true);
 graphGPRSData  demo  =  new  graphGPRSData("Объём переданных данных по каналам GPRS");

  JPanel contentPane;
  JMenuBar jMenuBar1 = new JMenuBar();
  JMenu jMenuFile = new JMenu();
  JMenuItem jMenuFileExit = new JMenuItem();
  JMenu jMenuHelp = new JMenu();
  JMenuItem jMenuHelpAbout = new JMenuItem();
  ImageIcon image1;
  ImageIcon image2;
  ImageIcon image3;
  ImageIcon image4;
  ImageIcon imageRun;
  ImageIcon imageRestart;
  ImageIcon imagePause;
  ImageIcon imageOption;
  ImageIcon imageFon;
  ImageIcon imageGPRS;
  ImageIcon imageGSM;
  ImageIcon imageCounter;
  ImageIcon imageStructure;

  JLabel statusBar = new JLabel();
  BorderLayout borderLayout1 = new BorderLayout();
  JPanel jPanel1 = new JPanel();
  XYLayout xYLayout1 = new XYLayout();
  JButton bCfgSys = new JButton();
  JButton bCfgGSM = new JButton();
  JFormattedTextField timeGet = new JFormattedTextField();
  JPanel jPanel2 = new JPanel();
  JButton bPause = new JButton();
  JToolBar jToolBar2 = new JToolBar();
  JButton bRestart = new JButton();
  JButton bRun = new JButton();
  JMenu jMenu1 = new JMenu();
  JButton jButton10 = new JButton();
  JButton jButton11 = new JButton();
  JToolBar jToolBar3 = new JToolBar();
  JButton jButton12 = new JButton();
  JButton bOption = new JButton();
  JToolBar jToolBar4 = new JToolBar();
  BoxLayout2 boxLayout21 = new BoxLayout2();
  Border border1;
  JButton jCfgCounter = new JButton();
  JButton bCfgGPRS = new JButton();
  JMenuItem jSystemStructure = new JMenuItem();
  JMenuItem jMenuItem2 = new JMenuItem();
  JMenuItem jMenuItem3 = new JMenuItem();
  JMenuItem jMenuItem4 = new JMenuItem();
  JButton bCfgSystemSmall = new JButton();
  JPanel jPanel3 = new JPanel();
  Border border2;
  TitledBorder titledBorder1;
  JFormattedTextField jFormattedTextField1 = new JFormattedTextField();
  XYLayout xYLayout2 = new XYLayout();
  JButton jButton1 = new JButton();


  //Construct the frame
  public Frame1() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);

    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }


  void allRestart(){
    //сброс модели и параметров

timeGet.setValue(new Double(0));
//сброс массивов

exCfgSystem.tranGSM.removeAllElements();
exCfgSystem.tranGPRS.removeAllElements();

aiis.model.parKolMasGPRS = null;
aiis.model.parKolMasGSM = null;
aiis.model.parReqData = null;
for (int i=0;i<=2;i++){
      aiis.model.askChannel.set(i,0);
}
exCfgSystem.interKolGSM=0;
exCfgSystem.interKolGPRS=0;

exCfgSystem.jVsegoGSM.setText("0");
exCfgSystem.jVsegoGPRS.setText("0");

aiis.model.set_parVrMod(365*24);// установка длительности моделирования в значение по умолчанию (365 дней)

Engine.restart();
bRestart.setEnabled(false);
bRun.setEnabled(true);
bOption.setEnabled(true);
    }

void saveCfgSystem(){

  Engine.restart();
timeGet.setValue(new Double(0));
aiis.model.set_parVrMod(365*24);// установка длительности моделирования в значение по умолчанию (365 дней)

bRestart.setEnabled(false);
bRun.setEnabled(true);
  bOption.setEnabled(true);

    }

  //Component initialization
  private void jbInit() throws Exception  {

//Dialog loginWin = new login(this,"Окно входа");

//loginWin.show();


    image1 = new ImageIcon(interfaceMod.Frame1.class.getResource("gprs16.png"));
    image2 = new ImageIcon(interfaceMod.Frame1.class.getResource("gsm16.png"));
    image3 = new ImageIcon(interfaceMod.Frame1.class.getResource("counter16.png"));
    image4 = new ImageIcon(interfaceMod.Frame1.class.getResource("structure16.png"));

    imageRun = new ImageIcon(interfaceMod.Frame1.class.getResource("startmy.png"));
    imagePause = new ImageIcon(interfaceMod.Frame1.class.getResource("stopmy.png"));
    imageRestart = new ImageIcon(interfaceMod.Frame1.class.getResource("resetmy.png"));
    imageOption = new ImageIcon(interfaceMod.Frame1.class.getResource("option.png"));
    imageGPRS = new ImageIcon(interfaceMod.Frame1.class.getResource("gprs.png"));
    imageGSM = new ImageIcon(interfaceMod.Frame1.class.getResource("gsm.png"));
    imageCounter = new ImageIcon(interfaceMod.Frame1.class.getResource("counter.png"));
    imageStructure = new ImageIcon(interfaceMod.Frame1.class.getResource("structure.png"));

    contentPane = (JPanel) this.getContentPane();
    border1 = BorderFactory.createEmptyBorder();
    border2 = BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151));
    titledBorder1 = new TitledBorder(border2,"Статистика по GPRS");
    contentPane.setLayout(borderLayout1);
    this.setSize(new Dimension(500, 400));
    this.setTitle("Моделирование АИИС КУЭ");
    statusBar.setBackground(new Color(210, 236, 255));
    statusBar.setText(" ");
    jMenuFile.setText("Файл");
    jMenuFileExit.setText("Выйти");
    jMenuFileExit.addActionListener(new Frame1_jMenuFileExit_ActionAdapter(this));
    jMenuFileExit.addActionListener(new Frame1_jMenuFileExit_ActionAdapter(this));
    jMenuHelp.setText("Справка");
    jMenuHelpAbout.setText("О AIISMOD 1.0");
    jMenuHelpAbout.addActionListener(new Frame1_jMenuHelpAbout_ActionAdapter(this));

    jPanel1.setLayout(xYLayout1);
    bCfgSys.setToolTipText("Структура системы");
    bCfgSys.setIcon(imageStructure);
    bCfgSys.setText("");
    bCfgSys.addActionListener(new Frame1_bCfgSys_actionAdapter(this));
    bCfgGSM.setToolTipText("Настройка каналов GSM CSD");
    bCfgGSM.setVerifyInputWhenFocusTarget(true);
    bCfgGSM.setIcon(imageGSM);
    bCfgGSM.setText("");
    bCfgGSM.addActionListener(new Frame1_bCfgGSM_actionAdapter(this));
    timeGet.setText(" ");
    timeGet.addActionListener(new Frame1_timeGet_actionAdapter(this));
    bPause.setToolTipText("Приостановить выполнение");
    bPause.setIcon(imagePause);
    bPause.addActionListener(new Frame1_bPause_actionAdapter(this));
    bRestart.setIcon(imageRestart);
    bRestart.setMargin(new Insets(2, 14, 2, 14));
    bRestart.addActionListener(new Frame1_bRestart_actionAdapter(this));
    bRestart.setEnabled(false);

    bRestart.setDebugGraphicsOptions(0);
    bRestart.setMaximumSize(new Dimension(23, 23));
    bRestart.setMinimumSize(new Dimension(23, 23));
    bRestart.setOpaque(true);
    bRestart.setPreferredSize(new Dimension(29, 27));
    bRestart.setToolTipText("Перезагрузить");
    bRestart.setBorderPainted(true);
    bRestart.setContentAreaFilled(true);
   // bRestart.setDisabledSelectedIcon(image1);
    //bRestart.setFocusPainted(true);
    bRun.setIcon(imageRun);
    bRun.addActionListener(new Frame1_bRun_actionAdapter(this));
    bRun.setToolTipText("Начать выполение модели");
    jPanel2.setLayout(boxLayout21);
    jToolBar2.setBorder(BorderFactory.createEtchedBorder());
    jToolBar2.setFloatable(false);
    jMenu1.setText("Настройки");
    jMenuBar1.setBorder(BorderFactory.createEtchedBorder());

    jButton10.setToolTipText("Help");
    jButton10.setIcon(image3);
    jButton11.setToolTipText("Close File");
    jButton11.setIcon(image2);
    jToolBar3.setBorder(BorderFactory.createEtchedBorder());
    jToolBar3.setVerifyInputWhenFocusTarget(true);
    jToolBar3.setFloatable(false);
    jButton12.setIcon(image1);
    jButton12.addActionListener(new Frame1_jButton12_actionAdapter(this));
    jButton12.setToolTipText("Open File");
    bOption.setToolTipText("Настройки моделирования");
    bOption.setIcon(imageOption);
    bOption.addActionListener(new Frame1_bOption_actionAdapter(this));
    jToolBar4.setFloatable(false);
    jToolBar4.setVerifyInputWhenFocusTarget(true);
    jToolBar4.setBorder(BorderFactory.createEtchedBorder());

    jCfgCounter.setToolTipText("Параметры счётчиков");
    jCfgCounter.setIcon(imageCounter);
    jCfgCounter.setText("");
    jCfgCounter.addActionListener(new Frame1_jCfgCounter_actionAdapter(this));
    bCfgGPRS.setToolTipText("Настройка каналов GPRS");
    bCfgGPRS.setVerifyInputWhenFocusTarget(true);
    bCfgGPRS.setIcon(imageGPRS);
    bCfgGPRS.setText("");
    bCfgGPRS.addActionListener(new Frame1_bCfgGPRS_actionAdapter(this));
    jSystemStructure.setText("Структура системы");
    jSystemStructure.addActionListener(new Frame1_jSystemStructure_actionAdapter(this));
    jMenuItem2.setText("Параметры GSM CSD");
    jMenuItem2.addActionListener(new Frame1_jMenuItem2_actionAdapter(this));
    jMenuItem3.setText("Параметры GPRS");
    jMenuItem4.setText("Параметры счётчиков");
    bCfgSystemSmall.setIcon(image4);
    jPanel3.setBorder(titledBorder1);
    jPanel3.setLayout(xYLayout2);
    jFormattedTextField1.setText("");
    jButton1.setText("jButton1");
    jButton1.addActionListener(new Frame1_jButton1_actionAdapter(this));
    jToolBar2.add(bRun);
    jToolBar2.add(bPause);
    jToolBar2.add(bRestart);
    jToolBar4.add(bOption);
    jPanel2.add(jToolBar3, null);
    jToolBar3.add(jButton12);
    jToolBar3.add(jButton11);
    jToolBar3.add(bCfgSystemSmall, null);
    jToolBar3.add(jButton10);
    jPanel2.add(jToolBar2, null);

    jMenuFile.add(jMenuFileExit);
    jMenuHelp.add(jMenuHelpAbout);
    jMenuBar1.add(jMenuFile);
    jMenuBar1.add(jMenu1);
    jMenuBar1.add(jMenuHelp);
    this.setJMenuBar(jMenuBar1);
    contentPane.add(statusBar, BorderLayout.SOUTH);
    contentPane.add(jPanel1, BorderLayout.CENTER);
    jPanel1.add(bCfgGPRS,      new XYConstraints(10, 8, 42, 40));
    jPanel1.add(bCfgGSM, new XYConstraints(10, 53, 42, 40));
    jPanel1.add(jCfgCounter,  new XYConstraints(10, 99, 42, 40));
    jPanel1.add(bCfgSys, new XYConstraints(10, 146, 42, 40));
    jPanel1.add(jPanel3,    new XYConstraints(84, 10, 288, 124));
    jPanel3.add(jFormattedTextField1,     new XYConstraints(11, 2, 82, -1));
    jPanel1.add(jButton1, new XYConstraints(206, 236, -1, -1));
    jPanel1.add(timeGet, new XYConstraints(113, 170, 90, -1));
    contentPane.add(jPanel2, BorderLayout.NORTH);
    jPanel2.add(jToolBar4, null);
    jMenu1.add(jSystemStructure);
    jMenu1.add(jMenuItem2);
    jMenu1.add(jMenuItem3);
    jMenu1.add(jMenuItem4);
   // jToolBar2.addSeparator();




imageFon = new ImageIcon(interfaceMod.Frame1.class.getResource("telt.png"));



  }

  //File | Exit action performed
  public void jMenuFileExit_actionPerformed(ActionEvent e) {
   Engine.finish();
    System.exit(0);

  }

  //Help | About action performed
  public void jMenuHelpAbout_actionPerformed(ActionEvent e) {
    Frame1_AboutBox dlg = new Frame1_AboutBox(this);
    Dimension dlgSize = dlg.getPreferredSize();
    Dimension frmSize = getSize();
    Point loc = getLocation();
    dlg.setLocation((frmSize.width - dlgSize.width) / 2 + loc.x, (frmSize.height - dlgSize.height) / 2 + loc.y);
    dlg.setModal(true);
    dlg.pack();
    dlg.show();
  }

  //Overridden so we can exit when window is closed
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      jMenuFileExit_actionPerformed(null);
    }
  }



class Frame1_jMenuFileExit_ActionAdapter implements ActionListener {
  Frame1 adaptee;

  Frame1_jMenuFileExit_ActionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuFileExit_actionPerformed(e);
  }
}

class Frame1_jMenuHelpAbout_ActionAdapter implements ActionListener {
  Frame1 adaptee;

  Frame1_jMenuHelpAbout_ActionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuHelpAbout_actionPerformed(e);
  }
}

  void bCfgSys_actionPerformed(ActionEvent e) {
exCfgSystem.show();


  }

  void bCfgGSM_actionPerformed(ActionEvent e) {

 exCfgGSM.show();
  }



  void jButton7_actionPerformed(ActionEvent e) {
Engine.stop();
  }

  void jButton8_actionPerformed(ActionEvent e) {
Engine.restart();
  }

  void jButton9_actionPerformed(ActionEvent e) {
  double valueh2 = Engine.getTime();

  timeGet.setValue(new Double(valueh2));
  }

  void timeGet_actionPerformed(ActionEvent e) {

  }

  void bRun_actionPerformed(ActionEvent e) {


if (aiis.model.parKolMasGPRS == null & aiis.model.parKolMasGSM == null & aiis.model.parKolMasRADIO == null &
         exCfgSystem.tranGSM.isEmpty()==true & exCfgSystem.tranGPRS.isEmpty()==true){
  JOptionPane.showMessageDialog(this,"Отсутствуют каналы связи. Задайте структуру системы!","Внимание!!!",JOptionPane.WARNING_MESSAGE);
//Engine.showMessage("Что же ты так!!! Отсутствуют каналы связи","Внимание!!!",Engine.MESSAGE_WARNING, Engine.SHOW_AND_CONTINUE);
}

//aiis.model.parKolMasGSM.
  else {
    new OutThread(timeGet).start();
    new Progress();
    Engine.run();
   bRestart.setEnabled(true);

    bRun.setEnabled(false);
    bOption.setEnabled(false);
    bCfgSys.setEnabled(false);
    bCfgGSM.setEnabled(false);



 }


  }

  void bPause_actionPerformed(ActionEvent e) {
Engine.stop();


  }

  void bRestart_actionPerformed(ActionEvent e) {
    int n = JOptionPane.showConfirmDialog(Engine.getAnimation(),"Сохранить текущую конфигурацию ситемы?","Внимание!!!",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
      switch(n){
      case JOptionPane.YES_OPTION:this.saveCfgSystem();break;
      case JOptionPane.NO_OPTION:this. allRestart() ; break;
      case JOptionPane.CANCEL_OPTION:
      case JOptionPane.CLOSED_OPTION: break;
      default:}

    bCfgSys.setEnabled(true);
    bCfgGSM.setEnabled(true);

exCfgSystem.bResetiChannel.setEnabled(false);
    exCfgSystem.bResetAllChannel.setEnabled(false);

  }



  void jCheckBox1_actionPerformed(ActionEvent e) {
Engine.setRealTimeMode( true );
  }

  void bOption_actionPerformed(ActionEvent e) {

 exDcfgMod.show();
  }

  void bCfgGPRS_actionPerformed(ActionEvent e) {


exCfgGPRS.show();
  }

  void jButton2_actionPerformed(ActionEvent e) {
 //Engine.getAnimationFrame().setTitle("sssssss");
 //Engine.getAnimation().getToolbar().setVisible(false);
 Engine.showAnimationFrame(false);

  }





  void jCfgCounter_actionPerformed(ActionEvent e) {
exCfgCounter.show();
  }



  void jButton12_actionPerformed(ActionEvent e) {

  }

  void jMenuItem2_actionPerformed(ActionEvent e) {

  }

  void jSystemStructure_actionPerformed(ActionEvent e) {
exCfgSystem.show();
  }

  void jButton1_actionPerformed(ActionEvent e) {
    //graphGPRSData  demo  =  new  graphGPRSData("Объём переданных данных по каналам GPRS");
    demo.pack(); RefineryUtilities.centerFrameOnScreen(demo); demo.setVisible(true);
//new displayGraph();
  }







}

class Frame1_bCfgSys_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_bCfgSys_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bCfgSys_actionPerformed(e);
  }
}

class Frame1_bCfgGSM_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_bCfgGSM_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bCfgGSM_actionPerformed(e);
  }
}

class Frame1_timeGet_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_timeGet_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.timeGet_actionPerformed(e);
  }
}

class Frame1_bRun_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_bRun_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bRun_actionPerformed(e);
  }
}

class Frame1_bPause_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_bPause_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bPause_actionPerformed(e);
  }
}

class Frame1_bRestart_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_bRestart_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bRestart_actionPerformed(e);
  }
}

class Frame1_bOption_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_bOption_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bOption_actionPerformed(e);
  }
}



class Frame1_jCfgCounter_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_jCfgCounter_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jCfgCounter_actionPerformed(e);
  }
}

class Frame1_jButton12_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_jButton12_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton12_actionPerformed(e);
  }
}

class Frame1_bCfgGPRS_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_bCfgGPRS_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bCfgGPRS_actionPerformed(e);
  }
}

class Frame1_jMenuFileExit_ActionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_jMenuFileExit_ActionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuFileExit_actionPerformed(e);
  }
}

class Frame1_jMenuItem2_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_jMenuItem2_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuItem2_actionPerformed(e);
  }
}

class Frame1_jSystemStructure_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_jSystemStructure_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jSystemStructure_actionPerformed(e);
  }
}

class Frame1_jButton1_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_jButton1_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}
