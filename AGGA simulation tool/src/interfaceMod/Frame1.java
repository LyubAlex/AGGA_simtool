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
import org.jfree.chart.ChartFrame;
import org.jfree.data.general.PieDataset;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.ui.RefineryUtilities;
import java.util.Calendar;



public class Frame1 extends JFrame {

  public static Vector transferDataGPRS = new Vector();
  public static Vector transferVrGPRS = new Vector();
  public static Vector transferVrGSM = new Vector();
  public static Vector transferTimeSETGPRS = new Vector();
  public static Vector transferTimeMIRGPRS = new Vector();
  public static Vector transferTimeSETGSM = new Vector();
  public static Vector transferTimeMIRGSM = new Vector();
  public static Vector transferTimeUstGSM = new Vector();
  public static Vector transferTimeEndGSM = new Vector();

  graphGPRSData  graphGPRS  =  null;
  graphCounterGPRS graphGPRSSET = null;
  graphCounterGSM graphGSMSET = null;
  graphGPRSTime  graphGPRSVr  =  null;
  graphGSMTime  graphGSMVr  =  null;

  boolean lang = false;
  public String msgRus = "������� ������: ��� ������ � ���-�� ���������!";
  public String msgEng = "Specify channel type and counters number!";

  public String alEng = "Attention!";
  public String alRus = "��������!!!";

  cfgSystem exCfgSystem = new cfgSystem(this, "��������� �������", true);
  cfgGSM exCfgGSM = new cfgGSM(this, "��������� ������ GSM", true);
  cfgGPRS exCfgGPRS = new cfgGPRS(this, "��������� ������ GPRS", true);
  dcfgMod exDcfgMod = new dcfgMod(this, "��������� �������������", true);
  cfgCounter exCfgCounter = new cfgCounter(this, "��������� ��������", true);
  animation exAnimation = new animation(this, "������� �������������", false);

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
  ImageIcon imageRus;
  ImageIcon imageEng;
  ImageIcon imageFon;
  ImageIcon imageGPRS;
  ImageIcon imageGSM;
  ImageIcon imageCounter;
  ImageIcon imageStructure;
  ImageIcon imageVi;
  ImageIcon imageTi;
  ImageIcon imageCountTi;

  JLabel statusBar = new JLabel();
  BorderLayout borderLayout1 = new BorderLayout();
  JPanel jPanel1 = new JPanel();
  XYLayout xYLayout1 = new XYLayout();
  JButton bCfgSys = new JButton();
  JFormattedTextField timeGet = new JFormattedTextField();
  JPanel jPanel2 = new JPanel();
  JButton bPause = new JButton();
  JToolBar jToolBar2 = new JToolBar();
  JButton bRestart = new JButton();
  JButton bRun = new JButton();
  JMenu jMenu1 = new JMenu();
  JButton bOption = new JButton();
  JToolBar jToolBar4 = new JToolBar();
  BoxLayout2 boxLayout21 = new BoxLayout2();
  Border border1;
  JButton bCfgCounter = new JButton();
  JButton bCfgGPRS = new JButton();
  JMenuItem jSystemStructure = new JMenuItem();
  JMenuItem jMenuItem2 = new JMenuItem();
  JMenuItem jMenuItem3 = new JMenuItem();
  JMenuItem jMenuItem4 = new JMenuItem();
  JPanel jPanel3 = new JPanel();
  Border border2;
  TitledBorder titledBorder1;
  public static JFormattedTextField outAllDataGPRS = new JFormattedTextField();
  XYLayout xYLayout2 = new XYLayout();
  JLabel jLabel1 = new JLabel();
  public static JButton bShowGrGPRS = new JButton();
  JLabel jLabel2 = new JLabel();
  public static JFormattedTextField outErrorGPRS = new JFormattedTextField();
  public static JButton bShowGrGPRSVr = new JButton();
   public static JButton bShowGrGPRSSET = new JButton();
  JPanel jPanel4 = new JPanel();
  Border border3;
  XYLayout xYLayout3 = new XYLayout();
  public static JButton bShowGrGSMSET = new JButton();
  public static JButton bShowGrGSMVr = new JButton();
  JLabel jLabel3 = new JLabel();
   public static JFormattedTextField outKolEndGSM = new JFormattedTextField();
  public static JFormattedTextField outKolNeudachGSM = new JFormattedTextField();
  JLabel jLabel4 = new JLabel();
  JPanel jPanel5 = new JPanel();
  Border border4;
 public static JFormattedTextField noAnswerSET = new JFormattedTextField();
  XYLayout xYLayout4 = new XYLayout();
  JLabel jLabel5 = new JLabel();
 public static JFormattedTextField noAnswerMIR = new JFormattedTextField();
  JLabel jLabel6 = new JLabel();
  JPanel jPanel6 = new JPanel();
  Border border5;
  TitledBorder titledBorder2;
  XYLayout xYLayout5 = new XYLayout();
 public static JFormattedTextField noAnswerSETG = new JFormattedTextField();
 public static JFormattedTextField noAnswerMIRG = new JFormattedTextField();
  JLabel jLabel7 = new JLabel();
  JLabel jLabel8 = new JLabel();
  JPanel jPanel7 = new JPanel();
  Border border6;
  XYLayout xYLayout6 = new XYLayout();
  JButton bCfgGSM = new JButton();
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JToolBar jToolBar5 = new JToolBar();
  JButton bOption1 = new JButton();


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
void closeAnimation(){
  exAnimation.dispose();
}

  void allRestart(){
    //����� ������ � ����������
Engine.restart();
timeGet.setValue(new Double(0));
    graphGPRSSET=null;
    graphGSMSET=null;
outAllDataGPRS.setValue(new Double(0));//����� ����, ������������� ����� ����� ������
outErrorGPRS.setValue(new Double(0));
    outKolEndGSM.setValue(new Double(0));
  outKolNeudachGSM.setValue(new Double(0));
  noAnswerSET.setValue(new Double(0));
   noAnswerMIR.setValue(new Double(0));

   noAnswerSETG.setValue(new Double(0));
   noAnswerMIRG.setValue(new Double(0));
graphGPRS = null;
graphGPRSVr  =  null;
    graphGSMVr  =  null;
transferVrGPRS.removeAllElements();
transferDataGPRS.removeAllElements();
    transferTimeSETGPRS.removeAllElements();
transferTimeMIRGPRS.removeAllElements();
    transferTimeSETGSM.removeAllElements();
transferTimeMIRGSM.removeAllElements();
transferVrGSM.removeAllElements();
transferTimeUstGSM.removeAllElements();
    transferTimeEndGSM.removeAllElements();

aiis.model.allDataGPRS=0;


exCfgSystem.tranGSM.removeAllElements();
exCfgSystem.tranGPRS.removeAllElements();



aiis.model.parKolMasGPRS = null;//����� �������� ������� ������
aiis.model.parKolMasGSM = null;
aiis.model.parReqData = null;//����� ������� ������������ ����������

for (int i=0;i<=2;i++){
      aiis.model.askChannel.set(0,i,0);
}
exCfgSystem.interKolGSM=0;
exCfgSystem.interKolGPRS=0;

exCfgSystem.jVsegoGSM.setText("0");
exCfgSystem.jVsegoGPRS.setText("0");

aiis.model.set_parVrMod(365*24);// ��������� ������������ ������������� � �������� �� ��������� (365 ����)
aiis.model.set_parVrModD(365);// ��������� ������������ ������������� � �������� �� ��������� (365 ����)
exDcfgMod.inputVrMod.setValue(new Double(365));
exDcfgMod.chEnergy.setState(false);
exDcfgMod.chEvent.setState(false);
exDcfgMod.chDopPar.setState(false);
exDcfgMod.chPower.setState(false);
for (int i =0;i<=3;i++)
{
   exDcfgMod.intReqData.set(0,i,0);
}



bRestart.setEnabled(false);
bRun.setEnabled(true);
bOption.setEnabled(true);
    }

void saveCfgSystem(){
  timeGet.setValue(new Double(0));
  double timeSET1=aiis.model.parSETmaxTimeoutAnswer;
  double timeMIR1=aiis.model.parMIRmaxTimeoutAnswer;
  double verSET1=aiis.model.parSETverNoAnswer;
  double verMIR1=aiis.model.parMIRverNoAnswer;
  double bitSET1=aiis.model.parBitrateSET;
  double bitMIR1=aiis.model.parBitrateMIR;
  Engine.restart();

//����� ������ �� GPRS

  graphGPRSSET=null;
  graphGSMSET=null;
outAllDataGPRS.setValue(new Double(0));//����� ����, ������������� ����� ����� ������
outErrorGPRS.setValue(new Double(0));
  outKolEndGSM.setValue(new Double(0));
  outKolNeudachGSM.setValue(new Double(0));
  noAnswerSET.setValue(new Double(0));
   noAnswerMIR.setValue(new Double(0));
   noAnswerSETG.setValue(new Double(0));
   noAnswerMIRG.setValue(new Double(0));
graphGPRS = null;
graphGPRSVr  =  null;
graphGSMVr  =  null;
transferVrGPRS.removeAllElements();
transferDataGPRS.removeAllElements();
transferTimeSETGPRS.removeAllElements();
transferTimeMIRGPRS.removeAllElements();
transferTimeSETGSM.removeAllElements();
transferTimeMIRGSM.removeAllElements();
transferVrGSM.removeAllElements();
  transferTimeUstGSM.removeAllElements();
    transferTimeEndGSM.removeAllElements();


aiis.model.allDataGPRS=0;


  for (int i =0;i<=3;i++)
  {
     if (exDcfgMod.intReqData.get(0,i)==1 & i==0)
     {
       exDcfgMod.chEvent.setState(true);
     }
     else if (exDcfgMod.intReqData.get(0,i)==1& i==1)
    {
      exDcfgMod.chEnergy.setState(true);
    }
    else if (exDcfgMod.intReqData.get(0,i)==1& i==2)
    {
      exDcfgMod.chPower.setState(true);
    }
    else if (exDcfgMod.intReqData.get(0,i)==1& i==3)
    {
      exDcfgMod.chDopPar.setState(true);
    }

  }

aiis.model.set_parVrModD(((Number)exDcfgMod.inputVrMod.getValue()).doubleValue());
aiis.model.set_parVrMod(((Number)exDcfgMod.inputVrMod.getValue()).doubleValue()*24);// ��������� ������������ ������������� � �������� �� ��������� (365 ����)

  aiis.model.parSETmaxTimeoutAnswer=timeSET1;
  aiis.model.parMIRmaxTimeoutAnswer=timeMIR1;
  aiis.model.parSETverNoAnswer=verSET1;
  aiis.model.parMIRverNoAnswer=verMIR1;
  aiis.model.parBitrateSET=bitSET1;
  aiis.model.parBitrateMIR=bitMIR1;


bRestart.setEnabled(false);
bRun.setEnabled(true);
bOption.setEnabled(true);
}

  //Component initialization
 private void jbInit() throws Exception  {
  //private void jbInit() {

    image1 = new ImageIcon(interfaceMod.Frame1.class.getResource("gprs16.png"));
    image2 = new ImageIcon(interfaceMod.Frame1.class.getResource("gsm16.png"));
    image3 = new ImageIcon(interfaceMod.Frame1.class.getResource("counter16.png"));
    image4 = new ImageIcon(interfaceMod.Frame1.class.getResource("structure16.png"));


    Calendar curTime = Calendar.getInstance();
    border6 = BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151));
    curTime.setTimeInMillis(System.currentTimeMillis());
    double hour = curTime.get(Calendar.HOUR_OF_DAY);
    double min = curTime.get(Calendar.MINUTE);
    double sec = curTime.get(Calendar.SECOND);
    double day = curTime.get(Calendar.DATE);






    imageRun = new ImageIcon(interfaceMod.Frame1.class.getResource("startmy.png"));
    imagePause = new ImageIcon(interfaceMod.Frame1.class.getResource("stopmy.png"));
    imageRestart = new ImageIcon(interfaceMod.Frame1.class.getResource("resetmy.png"));
    imageOption = new ImageIcon(interfaceMod.Frame1.class.getResource("option.png"));
    imageRus = new ImageIcon(interfaceMod.Frame1.class.getResource("rus16.png"));
    imageEng = new ImageIcon(interfaceMod.Frame1.class.getResource("eng16.png"));

    imageGPRS = new ImageIcon(interfaceMod.Frame1.class.getResource("gprs.png"));
    imageGSM = new ImageIcon(interfaceMod.Frame1.class.getResource("gsm.png"));
    imageCounter = new ImageIcon(interfaceMod.Frame1.class.getResource("counter.png"));
    imageStructure = new ImageIcon(interfaceMod.Frame1.class.getResource("structure.png"));
    imageVi = new ImageIcon(interfaceMod.Frame1.class.getResource("Vi.png"));
    imageTi = new ImageIcon(interfaceMod.Frame1.class.getResource("Ti.png"));
    imageCountTi = new ImageIcon(interfaceMod.Frame1.class.getResource("counterTi.png"));

    contentPane = (JPanel) this.getContentPane();
    border1 = BorderFactory.createEmptyBorder();
    border2 = BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151));
    titledBorder1 = new TitledBorder(border2,"���������� �� GPRS");
    border3 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"���������� �� GSM");
    border4 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"������� ���������� ������������ ��������");
    border5 = BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151));
    titledBorder2 = new TitledBorder(border5,"������� ���������� ������������ ��������");
    contentPane.setLayout(borderLayout1);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setSize(new Dimension(483, 384));
    this.setTitle("AGGA 1.0 - ASCRE GSM-GPRS analysis 1.0");
    statusBar.setBackground(new Color(210, 236, 255));
    statusBar.setText(" ");
    jMenuFile.setText("����");
    jMenuFileExit.setText("�����");
    jMenuFileExit.addActionListener(new Frame1_jMenuFileExit_ActionAdapter(this));
    jMenuFileExit.addActionListener(new Frame1_jMenuFileExit_ActionAdapter(this));
    jMenuHelp.setText("�������");
    jMenuHelpAbout.setText("� ��������� AGGA 1.0");
    jMenuHelpAbout.addActionListener(new Frame1_jMenuHelpAbout_ActionAdapter(this));
    jMenuHelpAbout.addActionListener(new Frame1_jMenuHelpAbout_ActionAdapter(this));

    jPanel1.setLayout(xYLayout1);
    bCfgSys.setToolTipText("������� ��������� �������");
    bCfgSys.setIcon(imageStructure);
    bCfgSys.setText("");
    bCfgSys.addActionListener(new Frame1_bCfgSys_actionAdapter(this));
    timeGet.setText(" ");
    timeGet.addActionListener(new Frame1_timeGet_actionAdapter(this));
    bPause.setMinimumSize(new Dimension(23, 23));
    bPause.setToolTipText("������������� ����������");
    bPause.setIcon(imagePause);
    bPause.addActionListener(new Frame1_bPause_actionAdapter(this));
    bRestart.setIcon(imageRestart);
    bRestart.setMargin(new Insets(2, 14, 2, 14));
    bRestart.addActionListener(new Frame1_bRestart_actionAdapter(this));
    bRestart.setEnabled(false);

    bRestart.setDebugGraphicsOptions(0);
    bRestart.setMaximumSize(new Dimension(29, 27));
    bRestart.setMinimumSize(new Dimension(23, 23));
    bRestart.setOpaque(true);
    bRestart.setPreferredSize(new Dimension(23, 23));
    bRestart.setToolTipText("������������� ������");
    bRestart.setBorderPainted(true);
    bRestart.setContentAreaFilled(true);
   // bRestart.setDisabledSelectedIcon(image1);
    //bRestart.setFocusPainted(true);
    bRun.setIcon(imageRun);
    bRun.addActionListener(new Frame1_bRun_actionAdapter(this));
    bRun.setToolTipText("������ �������������");
    jPanel2.setLayout(boxLayout21);
    jToolBar2.setOrientation(JToolBar.HORIZONTAL);
    jToolBar2.setAlignmentY((float) 0.47826087);
    jToolBar2.setBorder(BorderFactory.createEtchedBorder());
    jToolBar2.setFloatable(false);
    jMenu1.setText("���������");
    jMenuBar1.setBorder(BorderFactory.createEtchedBorder());

    bOption.setToolTipText("��������� �������������");
    bOption.setIcon(imageOption);
    bOption.addActionListener(new Frame1_bOption_actionAdapter(this));

    jToolBar4.setFloatable(false);
    jToolBar4.setVerifyInputWhenFocusTarget(true);
    jToolBar4.setBorder(BorderFactory.createEtchedBorder());

    bOption1.setToolTipText("����� ����� ����������");
    bOption1.setIcon(imageRus);
    bOption1.addActionListener(new Frame1_bOption1_actionAdapter(this));

    jToolBar5.setBorder(BorderFactory.createEtchedBorder());
    jToolBar5.setVerifyInputWhenFocusTarget(true);
    jToolBar5.setFloatable(false);




    bCfgCounter.setToolTipText("��������� ���������");
    bCfgCounter.setIcon(imageCounter);
    bCfgCounter.setText("");
    bCfgCounter.addActionListener(new Frame1_bCfgCounter_actionAdapter(this));
    bCfgGPRS.setToolTipText("��������� ������� GPRS");
    bCfgGPRS.setVerifyInputWhenFocusTarget(true);
    bCfgGPRS.setIcon(imageGPRS);
    bCfgGPRS.setText("");
    bCfgGPRS.addActionListener(new Frame1_bCfgGPRS_actionAdapter(this));
    jSystemStructure.setText("��������� �������");
    jSystemStructure.addActionListener(new Frame1_jSystemStructure_actionAdapter(this));
    jMenuItem2.setText("��������� GSM CSD");
    jMenuItem2.addActionListener(new Frame1_jMenuItem2_actionAdapter(this));
    jMenuItem3.setText("��������� GPRS");
    jMenuItem3.addActionListener(new Frame1_jMenuItem3_actionAdapter(this));
    jMenuItem4.setText("��������� ���������");
    jMenuItem4.addActionListener(new Frame1_jMenuItem4_actionAdapter(this));
    jPanel3.setBorder(titledBorder1);
    jPanel3.setMinimumSize(new Dimension(282, 105));
    jPanel3.setRequestFocusEnabled(true);
    jPanel3.setToolTipText("");
    jPanel3.setLayout(xYLayout2);
    outAllDataGPRS.setHorizontalAlignment(SwingConstants.CENTER);
    outAllDataGPRS.setText("");
    outAllDataGPRS.addMouseListener(new Frame1_outAllDataGPRS_mouseAdapter(this));
    jLabel1.setText("������ ���������� ��������� ������� �� �����:");
    bShowGrGPRS.setIcon(imageVi);
    bShowGrGPRS.setText("");
    bShowGrGPRS.addActionListener(new Frame1_bShowGrGPRS_actionAdapter(this));
    bShowGrGPRS.setEnabled(true);
    bShowGrGPRS.setToolTipText("����� ���������� ������ �� ������� ������");
    jLabel2.setText("����� ����� ���������� ������ �� GPRS �������, �����:");
    outErrorGPRS.setText("");
    outErrorGPRS.addMouseListener(new Frame1_outErrorGPRS_mouseAdapter(this));
    outErrorGPRS.setHorizontalAlignment(SwingConstants.CENTER);
    bShowGrGPRSVr.setIcon(imageTi);
    bShowGrGPRSVr.addActionListener(new Frame1_bShowGrGPRSVr_actionAdapter(this));
    bShowGrGPRSVr.setEnabled(true);
    bShowGrGPRSVr.setToolTipText("������� �������� ������ ������ ������");
    bShowGrGPRSSET.setIcon(imageCountTi);
    bShowGrGPRSSET.setText("");
    bShowGrGPRSSET.setEnabled(true);
    bShowGrGPRSSET.setToolTipText("������� �������� ������ ������ �������� � ������ ");
    bShowGrGPRSSET.addActionListener(new Frame1_bShowGrGPRSSET_actionAdapter(this));
    jPanel4.setBorder(border3);
    jPanel4.setLayout(xYLayout3);

    bShowGrGSMSET.setEnabled(true);
    bShowGrGSMSET.setToolTipText("������� �������� ������ ������ �������� � ������ ");
    bShowGrGSMSET.setHorizontalTextPosition(SwingConstants.TRAILING);
    bShowGrGSMSET.setIcon(imageCountTi);
    bShowGrGSMSET.addActionListener(new Frame1_bShowGrGSMSET_actionAdapter(this));
    bShowGrGSMVr.setIcon(imageTi);
    bShowGrGSMVr.setText("");
    bShowGrGSMVr.addActionListener(new Frame1_bShowGrGSMVr_actionAdapter(this));
    bShowGrGSMVr.setToolTipText("������� �������� ������ ������ ������");
    bShowGrGSMVr.setFocusPainted(true);
    jLabel3.setText("������� ���������� �������� ����������, ��:");
    outKolEndGSM.setHorizontalAlignment(SwingConstants.CENTER);
    outKolEndGSM.setText("");
    outKolEndGSM.addMouseListener(new Frame1_outKolEndGSM_mouseAdapter(this));
    outKolNeudachGSM.setHorizontalAlignment(SwingConstants.CENTER);
    outKolNeudachGSM.setText("");
    outKolNeudachGSM.addMouseListener(new Frame1_outKolNeudachGSM_mouseAdapter(this));
    jLabel4.setText("������� ���������� ��������� ��������, ��:");
    jPanel5.setBorder(border4);
    jPanel5.setDoubleBuffered(true);
    jPanel5.setLayout(xYLayout4);
    noAnswerSET.setHorizontalAlignment(SwingConstants.CENTER);
    noAnswerSET.setText("");
    noAnswerSET.addMouseListener(new Frame1_noAnswerSET_mouseAdapter(this));
    jLabel5.setPreferredSize(new Dimension(0, 0));
    jLabel5.setText("���4��.02 - ");
    noAnswerMIR.setHorizontalAlignment(SwingConstants.CENTER);
    noAnswerMIR.setText("");
    noAnswerMIR.addMouseListener(new Frame1_noAnswerMIR_mouseAdapter(this));
    jLabel6.setText("��� �-01 - ");
    jLabel6.setPreferredSize(new Dimension(0, 0));
    jPanel6.setBorder(titledBorder2);
    jPanel6.setLayout(xYLayout5);
    noAnswerSETG.setText("");
    noAnswerSETG.addMouseListener(new Frame1_noAnswerSETG_mouseAdapter(this));
    noAnswerSETG.setHorizontalAlignment(SwingConstants.CENTER);
    noAnswerMIRG.setText("");
    noAnswerMIRG.addMouseListener(new Frame1_noAnswerMIRG_mouseAdapter(this));
    noAnswerMIRG.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel7.setText("���4��.02 - ");
    jLabel7.setPreferredSize(new Dimension(0, 0));
    jLabel8.setPreferredSize(new Dimension(0, 0));
    jLabel8.setText("��� �-01 - ");
    jPanel7.setBorder(border6);
    jPanel7.setLayout(xYLayout6);
    bCfgGSM.setToolTipText("��������� ������� GSM CSD");
    bCfgGSM.setVerifyInputWhenFocusTarget(true);
    bCfgGSM.setIcon(imageGSM);
    bCfgGSM.setText("");
    bCfgGSM.addActionListener(new Frame1_bCfgGSM_actionAdapter(this));

    jButton1.setText("RUS");
    jButton1.addActionListener(new Frame1_jButton1_actionAdapter(this));
    jButton2.setText("ENG");
    jButton2.addActionListener(new Frame1_jButton2_actionAdapter(this));




    jToolBar2.add(bRun);
    jToolBar2.add(bPause);
    jToolBar2.add(bRestart);
    jToolBar4.add(bOption);
    jPanel2.add(jToolBar2, null);

    jMenuFile.add(jMenuFileExit);
    jMenuHelp.add(jMenuHelpAbout);
    jMenuBar1.add(jMenuFile);
    jMenuBar1.add(jMenu1);
    jMenuBar1.add(jMenuHelp);
    this.setJMenuBar(jMenuBar1);
    contentPane.add(statusBar, BorderLayout.SOUTH);
    contentPane.add(jPanel1, BorderLayout.CENTER);
    jPanel3.add(outAllDataGPRS, new XYConstraints(312, 0, 57, -1));
    jPanel3.add(jLabel2,  new XYConstraints(2, 0, -1, -1));
    jPanel3.add(jLabel1,   new XYConstraints(2, 28, -1, -1));
    jPanel3.add(outErrorGPRS,     new XYConstraints(312, 28, 57, -1));
    jPanel3.add(jPanel6,         new XYConstraints(114, 55, 261, 52));
    jPanel6.add(noAnswerSETG,     new XYConstraints(68, 0, 48, -1));
    jPanel6.add(jLabel7,   new XYConstraints(1, 0, 67, 22));
    jPanel6.add(noAnswerMIRG, new XYConstraints(189, 0, 48, -1));
    jPanel6.add(jLabel8, new XYConstraints(126, 0, 67, 22));
    jPanel3.add(bShowGrGPRSSET,  new XYConstraints(77, 59, 32, 32));
    jPanel3.add(bShowGrGPRS, new XYConstraints(0, 59, 32, 32));
    jPanel3.add(bShowGrGPRSVr,  new XYConstraints(37, 59, 32, 32));
    jPanel1.add(jButton1,    new XYConstraints(8, 231, -1, -1));
    jPanel1.add(jButton2,   new XYConstraints(8, 261, -1, -1));
    jPanel1.add(jPanel7,               new XYConstraints(11, 11, 51, 175));
    jPanel7.add(bCfgGSM,    new XYConstraints(2, 2, 42, 40));
    jPanel7.add(bCfgGPRS,     new XYConstraints(2, 44, 42, 40));
    jPanel7.add(bCfgCounter,  new XYConstraints(2, 86, 42, 40));
    jPanel7.add(bCfgSys,    new XYConstraints(2, 128, 42, 40));
    jPanel1.add(jPanel4,       new XYConstraints(70, 148, 393, 139));
    jPanel1.add(timeGet,        new XYConstraints(8, 201, 57, -1));
    jPanel4.add(jLabel3,  new XYConstraints(3, 0, -1, -1));
    jPanel4.add(outKolEndGSM,          new XYConstraints(312, -1, 57, -1));
    jPanel4.add(outKolNeudachGSM, new XYConstraints(312, 25, 57, -1));
    jPanel4.add(jLabel4, new XYConstraints(3, 25, -1, -1));
    jPanel4.add(jPanel5, new XYConstraints(106, 53, 270, 52));
    contentPane.add(jPanel2, BorderLayout.NORTH);
    jPanel2.add(jToolBar4, null);
    jPanel2.add(jToolBar5, null);
    jToolBar5.add(bOption1);
    jMenu1.add(jSystemStructure);
    jMenu1.add(jMenuItem2);
    jMenu1.add(jMenuItem3);
    jMenu1.add(jMenuItem4);
    jPanel5.add(noAnswerSET,   new XYConstraints(75, 0, 48, -1));
    jPanel5.add(jLabel5,    new XYConstraints(5, 0, 67, 22));
    jPanel5.add(noAnswerMIR,   new XYConstraints(197, 0, 48, -1));
    jPanel5.add(jLabel6,   new XYConstraints(135, 0, 67, 22));
    jPanel4.add(bShowGrGSMSET, new XYConstraints(58, 65, 32, 32));
    jPanel4.add(bShowGrGSMVr, new XYConstraints(18, 65, 32, 32));
    jPanel1.add(jPanel3,   new XYConstraints(70, 3, 393, 142));
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
if (exCfgSystem.tranGSM.isEmpty())
{JOptionPane.showMessageDialog(this,"����������� ������ GSM!������� ��������� �������.","��������!!!",JOptionPane.WARNING_MESSAGE);
 exCfgSystem.show();
}
    else
 {exCfgGSM.show();}
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
JOptionPane.showMessageDialog(this,"����������� ������ �����. ������� ��������� �������!","��������!!!",JOptionPane.WARNING_MESSAGE);
exCfgSystem.show();
}

//aiis.model.parKolMasGSM.
  else {

    //new Progress();
    Engine.run();
    new OutThread(timeGet,exAnimation).start();
    new controlAnimation(exAnimation).start();


    bRestart.setEnabled(true);

    bRun.setEnabled(false);
    bOption.setEnabled(false);
    bCfgSys.setEnabled(false);
    bCfgGSM.setEnabled(false);
    bCfgGPRS.setEnabled(false);
    bCfgCounter.setEnabled(false);

 }


  }

  void bPause_actionPerformed(ActionEvent e) {
if (Engine.isRunning())
{
 Engine.stop();
}
  else
  {
      JOptionPane.showMessageDialog(this,"������� ������������� �� �������!","��������!!!",JOptionPane.WARNING_MESSAGE);
  }

  }

  void bRestart_actionPerformed(ActionEvent e) {
    int n = JOptionPane.showConfirmDialog(Engine.getAnimation(),"��������� ������� ������������ ������?","��������!!!",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
      switch(n){
      case JOptionPane.YES_OPTION:this.saveCfgSystem();break;
      case JOptionPane.NO_OPTION:this. allRestart() ; break;
      case JOptionPane.CANCEL_OPTION:
      case JOptionPane.CLOSED_OPTION: break;
      default:}

    bCfgSys.setEnabled(true);
    bCfgGSM.setEnabled(true);
    bCfgGPRS.setEnabled(true);
    bCfgCounter.setEnabled(true);


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
    if (exCfgSystem.tranGPRS.isEmpty())
    {JOptionPane.showMessageDialog(this,"����������� ������ GPRS!������� ��������� �������.","��������!!!",JOptionPane.WARNING_MESSAGE);
     exCfgSystem.show();
    }
        else
     {exCfgGPRS.show();}


  }

  void bShowGrGPRS_actionPerformed(ActionEvent e) {
    if (transferDataGPRS.size() == 0 ) {
       JOptionPane.showMessageDialog(this,"������ �� GPRS ������ ���!","��������!!!",JOptionPane.WARNING_MESSAGE);
    }
     else {

    if (  graphGPRS == null){
         graphGPRS  =  new  graphGPRSData("����� ���������� ������ �� ������� GPRS",transferDataGPRS);
         graphGPRS.pack(); RefineryUtilities.centerFrameOnScreen(graphGPRS); graphGPRS.setVisible(true);
       }
       else {   graphGPRS.pack(); RefineryUtilities.centerFrameOnScreen(graphGPRS); graphGPRS.setVisible(true);}


  }
  }




  void bCfgCounter_actionPerformed(ActionEvent e) {
    if (exCfgSystem.tranGSM.isEmpty())
    {JOptionPane.showMessageDialog(this,"����������� ������ �����!������� ������� ��������� �������.","��������!!!",JOptionPane.WARNING_MESSAGE);
     exCfgSystem.show();
    }
        else
     {exCfgCounter.show();}






  }




  void jMenuItem2_actionPerformed(ActionEvent e) {
    if (exCfgSystem.tranGSM.isEmpty())
   {JOptionPane.showMessageDialog(this,"����������� ������ GSM!������� ��������� �������.","��������!!!",JOptionPane.WARNING_MESSAGE);
    exCfgSystem.show();
   }
       else
    {exCfgGSM.show();}


  }

  void jSystemStructure_actionPerformed(ActionEvent e) {
exCfgSystem.show();
  }


  void bShowGrGPRSVr_actionPerformed(ActionEvent e) {
    if (transferVrGPRS.size() == 0) {
    JOptionPane.showMessageDialog(this,"������ �� GPRS ������ ���!","��������!!!",JOptionPane.WARNING_MESSAGE);
 }
  else {

    if (  graphGPRSVr == null){
          graphGPRSVr  =  new  graphGPRSTime("������� ����� ������ �� ������� ������",transferVrGPRS);
          graphGPRSVr.pack(); RefineryUtilities.centerFrameOnScreen(graphGPRSVr); graphGPRSVr.setVisible(true);
        }
        else { graphGPRSVr.pack(); RefineryUtilities.centerFrameOnScreen(graphGPRSVr); graphGPRSVr.setVisible(true);}

  }}

  void bShowGrGPRSSET_actionPerformed(ActionEvent e) {
   if (transferTimeSETGPRS.size() == 0 & transferTimeMIRGPRS.size()==0) {
      JOptionPane.showMessageDialog(this,"������ �� GPRS ������ ���!","��������!!!",JOptionPane.WARNING_MESSAGE);
   }
    else {
     if (graphGPRSSET == null) {
        graphGPRSSET = new graphCounterGPRS(
            "������� �������� ������� ������ ������ ��������",
            transferTimeSETGPRS, transferTimeMIRGPRS);
        graphGPRSSET.pack();
        RefineryUtilities.centerFrameOnScreen(graphGPRSSET);
        graphGPRSSET.setVisible(true);
      }
      else {
        graphGPRSSET.pack();
        RefineryUtilities.centerFrameOnScreen(graphGPRSSET);
        graphGPRSSET.setVisible(true);
      }

   }
  }

  void bShowGrGSMSET_actionPerformed(ActionEvent e) {
    if (transferTimeSETGSM.size() == 0 & transferTimeMIRGSM.size()==0) {
    JOptionPane.showMessageDialog(this,"������ �� GSM ������ ���!","��������!!!",JOptionPane.WARNING_MESSAGE);
 }
  else {

    if (  graphGSMSET == null){
      graphGSMSET  =  new graphCounterGSM("������� �������� ������� ������ ������ ��������",transferTimeSETGSM,transferTimeMIRGSM);
              graphGSMSET.pack(); RefineryUtilities.centerFrameOnScreen(graphGSMSET); graphGSMSET.setVisible(true);
             }
             else
             {  graphGSMSET.pack(); RefineryUtilities.centerFrameOnScreen(graphGSMSET); graphGSMSET.setVisible(true);}

  }
  }

  void bShowGrGSMVr_actionPerformed(ActionEvent e) {
    if (transferVrGSM.size() == 0) {
     JOptionPane.showMessageDialog(this,"������ �� GSM ������ ���!","��������!!!",JOptionPane.WARNING_MESSAGE);
  }
   else {

     if (  graphGSMVr == null){
           graphGSMVr  =  new  graphGSMTime("������� ����� ������ �� ������� ������",transferVrGSM,transferTimeUstGSM,transferTimeEndGSM);
           graphGSMVr.pack(); RefineryUtilities.centerFrameOnScreen(graphGSMVr); graphGSMVr.setVisible(true);
         }
         else { graphGSMVr.pack(); RefineryUtilities.centerFrameOnScreen(graphGSMVr); graphGSMVr.setVisible(true);}

   }

  }

  void jMenuItem3_actionPerformed(ActionEvent e) {
    if (exCfgSystem.tranGPRS.isEmpty())
    {JOptionPane.showMessageDialog(this,"����������� ������ GPRS!������� ��������� �������.","��������!!!",JOptionPane.WARNING_MESSAGE);
     exCfgSystem.show();
    }
        else
     {exCfgGPRS.show();}

  }

  void jMenuItem4_actionPerformed(ActionEvent e) {
    if (exCfgSystem.tranGSM.isEmpty())
    {JOptionPane.showMessageDialog(this,"����������� ������ �����!������� ������� ��������� �������.","��������!!!",JOptionPane.WARNING_MESSAGE);
     exCfgSystem.show();
    }
        else
     {exCfgCounter.show();}

  }

  void outAllDataGPRS_actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(this,"����� ������ ������� �� ����!","��������!!!",JOptionPane.WARNING_MESSAGE);
  }



  void outAllDataGPRS_mouseClicked(MouseEvent e) {
JOptionPane.showMessageDialog(this,"����� ������ ������� �� ����!","��������!!!",JOptionPane.WARNING_MESSAGE);
  }

  void outErrorGPRS_mouseClicked(MouseEvent e) {
JOptionPane.showMessageDialog(this,"����� ������ ������� �� ����!","��������!!!",JOptionPane.WARNING_MESSAGE);
  }

  void noAnswerMIRG_mouseClicked(MouseEvent e) {
JOptionPane.showMessageDialog(this,"����� ������ ������� �� ����!","��������!!!",JOptionPane.WARNING_MESSAGE);
  }

  void noAnswerSETG_mouseClicked(MouseEvent e) {
JOptionPane.showMessageDialog(this,"����� ������ ������� �� ����!","��������!!!",JOptionPane.WARNING_MESSAGE);
  }

  void outKolEndGSM_mouseClicked(MouseEvent e) {
JOptionPane.showMessageDialog(this,"����� ������ ������� �� ����!","��������!!!",JOptionPane.WARNING_MESSAGE);
  }

  void outKolNeudachGSM_mouseClicked(MouseEvent e) {
JOptionPane.showMessageDialog(this,"����� ������ ������� �� ����!","��������!!!",JOptionPane.WARNING_MESSAGE);
  }

  void noAnswerMIR_mouseClicked(MouseEvent e) {
JOptionPane.showMessageDialog(this,"����� ������ ������� �� ����!","��������!!!",JOptionPane.WARNING_MESSAGE);
  }

  void noAnswerSET_mouseClicked(MouseEvent e) {
JOptionPane.showMessageDialog(this,"����� ������ ������� �� ����!","��������!!!",JOptionPane.WARNING_MESSAGE);
  }

  void jButton2_actionPerformed(ActionEvent e) {

    exCfgSystem.setTitle("System's structure");
    this.titledBorder1.setTitle("GPRS statistics");

    this.repaint();
  }

  void jButton1_actionPerformed(ActionEvent e) {
    exCfgSystem.setTitle("��������� �������");

    titledBorder1.setTitle("���������� �� GPRS");
  }

  void bOption1_actionPerformed(ActionEvent e) {

    if (lang == false)
    {
      bOption1.setIcon(imageEng);
      //--------------------------------------------------------------//
      exCfgSystem.setTitle("System's structure");
      exCfgSystem.titledBorder1.setTitle("System configuration");
      exCfgSystem.jLabelTypeChannel.setText("Channel type:");
      exCfgSystem.jLabelTypeCh.setText("Counters type and quantity:");
      exCfgSystem.jLabelSET.setText("SE�-4��.02");
      exCfgSystem.createChannel.setToolTipText("Create a channel");
      exCfgSystem.jLabelitogo.setText("All channels:");
      exCfgSystem.jLabelMIR.setText("MIR-�01");
      exCfgSystem.bResetiChannel.setToolTipText("Cancel the last input");
      exCfgSystem.bResetAllChannel.setToolTipText("Reset the configuration");
      exCfgSystem.flRADIO.setLabel("   Radio");
      exCfgSystem.exitButton.setToolTipText("Close");

      exCfgSystem.msg = msgEng;
      exCfgSystem.alert = alEng;
      //--------------------------------------------------------------//


      exCfgGSM.setTitle("GSM settings");
      exCfgGPRS.setTitle("GPRS settings");

      //--------------------------------------------------------------//
      exDcfgMod.setTitle("Simulation settings");
      exDcfgMod.titledBorder1.setTitle("Set parameters");
      exDcfgMod.titledBorder2.setTitle("Requested parameters");
      exDcfgMod.labelVrMod.setText("Simulation time, days");
      exDcfgMod.bSaveExit.setText("Save");
      exDcfgMod.chPower.setLabel("Daily power slices");
      exDcfgMod.chEnergy.setLabel("Daily energy");
      exDcfgMod.chDopPar.setLabel("Additional parameters");
      exDcfgMod.chEvent.setLabel("Event logs");
      exDcfgMod.labelVrMod1.setText("Period of counters polling");
      //--------------------------------------------------------------//



      exCfgCounter.setTitle("Counters parameters");
      exAnimation.setTitle("Simulation in process");

      this.titledBorder1.setTitle("GPRS statistics");
      this.titledBorder2.setTitle("Mean number of missed requests");
      border3 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"GSM statistics");
      border4 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white, new Color(165, 163, 151)), "Mean number of missed requests");
      this.jPanel4.setBorder(border3);
      this.jPanel5.setBorder(border4);

      this.jMenuFile.setText("File");
      this.jMenuFileExit.setText("Exit");
      this.jMenuHelp.setText("Help");
      this.jMenuHelpAbout.setText("About AGGA");
      bCfgSys.setToolTipText("System structure specification");

      bPause.setToolTipText("Pause");
      bRestart.setToolTipText("Restart simulation");
      bRun.setToolTipText("Start simulation");
      jMenu1.setText("Settings");
      bOption.setToolTipText("Simulation settings");
      bOption1.setToolTipText("Language of interface");
      bCfgCounter.setToolTipText("Counters parameters");
      bCfgGPRS.setToolTipText("GPRS settings");
      jSystemStructure.setText("System's structure");
      jMenuItem2.setText("GSM CSD settings");
      jMenuItem3.setText("GPRS settings");
      jMenuItem4.setText("Counters parameters");

      jLabel1.setText("Mean number of repeated transmissions for a channel:");
      bShowGrGPRS.setToolTipText("Transmitted data volume for each channel:");
      jLabel2.setText("Total data volume for GPRS channels, Kb:");

      bShowGrGPRSVr.setToolTipText("Mean polling time of a channel");
      bShowGrGPRSSET.setToolTipText("Mean polling time of a counter in a channel ");
      bShowGrGSMSET.setToolTipText("Mean polling time of a counter in a channel ");
      bShowGrGSMVr.setToolTipText("Mean polling time of a channel");

      jLabel3.setText("Mean number of connection failures, pcs:");
      jLabel4.setText("Mean number of failed calls, pcs:");
      jLabel5.setText("SE�4��.02 - ");
      jLabel6.setText("MIR �-01 - ");
      jLabel7.setText("SE�4��.02 - ");
      jLabel8.setText("MIR �-01 - ");
      bCfgGSM.setToolTipText("GSM CSD settings");







      this.repaint();

      lang = true;
    }
    else
    {
        bOption1.setIcon(imageRus);
        //--------------------------------------------------------------//
        exCfgSystem.setTitle("��������� �������");
        exCfgSystem.titledBorder1.setTitle("������������ �������");
        exCfgSystem.jLabelTypeChannel.setText("��� ������:");
        exCfgSystem.jLabelTypeCh.setText("��� ��������� � �� ����������:");
        exCfgSystem.jLabelSET.setText("���-4��.02");
        exCfgSystem.createChannel.setToolTipText("������� �����");
        exCfgSystem.jLabelitogo.setText("����� �������:");
        exCfgSystem.jLabelMIR.setText("���-�01");
        exCfgSystem.bResetiChannel.setToolTipText("�������� ���������� ����");
        exCfgSystem.bResetAllChannel.setToolTipText("�������� ������������");
        exCfgSystem.flRADIO.setLabel("   ����������");
        exCfgSystem.exitButton.setToolTipText("�������");

        exCfgSystem.msg = msgRus;
        exCfgSystem.alert = alRus;
        //--------------------------------------------------------------//

        exCfgGSM.setTitle("��������� ������ GSM");
        exCfgGPRS.setTitle("��������� ������ GPRS");

        //--------------------------------------------------------------//
        exDcfgMod.setTitle("��������� �������������");
        exDcfgMod.titledBorder1.setTitle("������� ����������");
        exDcfgMod.titledBorder2.setTitle("������������ ���������");
        exDcfgMod.labelVrMod.setText("������������ �������������, ���-�� ����");
        exDcfgMod.bSaveExit.setText("���������");
        exDcfgMod.chPower.setLabel("����� �������� �� �����");
        exDcfgMod.chEnergy.setLabel("������� �� �����");
        exDcfgMod.chDopPar.setLabel("�������������� ���������");
        exDcfgMod.chEvent.setLabel("������� �������");
        exDcfgMod.labelVrMod1.setText("������ ������ ���������");
        //--------------------------------------------------------------//


        exCfgCounter.setTitle("��������� ��������");
        exAnimation.setTitle("������� �������������");

        this.titledBorder1.setTitle("���������� �� GPRS");

        this.titledBorder2.setTitle("������� ���������� ������������ ��������");

        border3 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(165, 163, 151)),"���������� �� GSM");
        border4 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white, new Color(165, 163, 151)), "������� ���������� ������������ ��������");
        this.jPanel4.setBorder(border3);
        this.jPanel5.setBorder(border4);

        this.jMenuFile.setText("����");
        this.jMenuFileExit.setText("�����");
        this.jMenuHelp.setText("�������");
        this.jMenuHelpAbout.setText("� ��������� AGGA 1.0");

        bCfgSys.setToolTipText("������� ��������� �������");


        bPause.setToolTipText("������������� ����������");
        bRestart.setToolTipText("������������� ������");
        bRun.setToolTipText("������ �������������");
        jMenu1.setText("���������");
        bOption.setToolTipText("��������� �������������");
        bOption1.setToolTipText("����� ����� ����������");
        bCfgCounter.setToolTipText("��������� ���������");
        bCfgGPRS.setToolTipText("��������� ������� GPRS");
        jSystemStructure.setText("��������� �������");
        jMenuItem2.setText("��������� GSM CSD");
        jMenuItem3.setText("��������� GPRS");
        jMenuItem4.setText("��������� ���������");
        jLabel1.setText("������ ���������� ��������� ������� �� �����:");
        bShowGrGPRS.setToolTipText("����� ���������� ������ �� ������� ������");
        jLabel2.setText("����� ����� ���������� ������ �� GPRS �������, �����:");
        bShowGrGPRSVr.setToolTipText("������� �������� ������ ������ ������");
        bShowGrGPRSSET.setToolTipText("������� �������� ������ ������ �������� � ������ ");
        bShowGrGSMSET.setToolTipText("������� �������� ������ ������ �������� � ������ ");
        bShowGrGSMVr.setToolTipText("������� �������� ������ ������ ������");
        jLabel3.setText("������� ���������� �������� ����������, ��:");
        jLabel4.setText("������� ���������� ��������� ��������, ��:");
        jLabel5.setText("���4��.02 - ");
        jLabel6.setText("��� �-01 - ");
        jLabel7.setText("���4��.02 - ");
        jLabel8.setText("��� �-01 - ");
        bCfgGSM.setToolTipText("��������� ������� GSM CSD");








        this.repaint();

        lang = false;
    }




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



class Frame1_bCfgCounter_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_bCfgCounter_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bCfgCounter_actionPerformed(e);
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

class Frame1_bShowGrGPRS_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_bShowGrGPRS_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bShowGrGPRS_actionPerformed(e);
  }
}

class Frame1_bShowGrGPRSVr_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_bShowGrGPRSVr_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bShowGrGPRSVr_actionPerformed(e);
  }
}

class Frame1_bShowGrGPRSSET_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_bShowGrGPRSSET_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bShowGrGPRSSET_actionPerformed(e);
  }
}

class Frame1_bShowGrGSMSET_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_bShowGrGSMSET_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bShowGrGSMSET_actionPerformed(e);
  }
}

class Frame1_bShowGrGSMVr_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_bShowGrGSMVr_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bShowGrGSMVr_actionPerformed(e);
  }
}

class Frame1_jMenuItem3_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_jMenuItem3_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuItem3_actionPerformed(e);
  }
}

class Frame1_jMenuItem4_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_jMenuItem4_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuItem4_actionPerformed(e);
  }
}

class Frame1_jMenuHelpAbout_ActionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_jMenuHelpAbout_ActionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuHelpAbout_actionPerformed(e);
  }
}

class Frame1_outAllDataGPRS_mouseAdapter extends java.awt.event.MouseAdapter {
  Frame1 adaptee;

  Frame1_outAllDataGPRS_mouseAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.outAllDataGPRS_mouseClicked(e);
  }
}

class Frame1_outErrorGPRS_mouseAdapter extends java.awt.event.MouseAdapter {
  Frame1 adaptee;

  Frame1_outErrorGPRS_mouseAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.outErrorGPRS_mouseClicked(e);
  }
}

class Frame1_noAnswerMIRG_mouseAdapter extends java.awt.event.MouseAdapter {
  Frame1 adaptee;

  Frame1_noAnswerMIRG_mouseAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.noAnswerMIRG_mouseClicked(e);
  }
}

class Frame1_noAnswerSETG_mouseAdapter extends java.awt.event.MouseAdapter {
  Frame1 adaptee;

  Frame1_noAnswerSETG_mouseAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.noAnswerSETG_mouseClicked(e);
  }
}

class Frame1_outKolEndGSM_mouseAdapter extends java.awt.event.MouseAdapter {
  Frame1 adaptee;

  Frame1_outKolEndGSM_mouseAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.outKolEndGSM_mouseClicked(e);
  }
}

class Frame1_outKolNeudachGSM_mouseAdapter extends java.awt.event.MouseAdapter {
  Frame1 adaptee;

  Frame1_outKolNeudachGSM_mouseAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.outKolNeudachGSM_mouseClicked(e);
  }
}

class Frame1_noAnswerMIR_mouseAdapter extends java.awt.event.MouseAdapter {
  Frame1 adaptee;

  Frame1_noAnswerMIR_mouseAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.noAnswerMIR_mouseClicked(e);
  }
}

class Frame1_noAnswerSET_mouseAdapter extends java.awt.event.MouseAdapter {
  Frame1 adaptee;

  Frame1_noAnswerSET_mouseAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.noAnswerSET_mouseClicked(e);
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

class Frame1_jButton2_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_jButton2_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
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

class Frame1_bOption1_actionAdapter implements java.awt.event.ActionListener {
  Frame1 adaptee;

  Frame1_bOption1_actionAdapter(Frame1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.bOption1_actionPerformed(e);
  }
}





