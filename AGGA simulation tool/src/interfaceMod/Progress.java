package interfaceMod;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.xj.anylogic.*;
import com.xj.anylogic.animation.*;

public class Progress extends JFrame {
  Progress() {
super("...Progress");
    final ProgressMonitor mon = new ProgressMonitor(this,"��� ������� �������������","��������",0,(int)aiis.model.parVrModD*24);

    Runnable runnable = new Runnable(){

      public void run(){

       while((int)Engine.getTime()!=0){
         try{
           if (Engine.isRunning()==false){
        mon.setNote("���������  100%");
        mon.setProgress((int)aiis.model.parVrMod);
        mon.close();
      /*  int n = JOptionPane.showConfirmDialog(Engine.getAnimation(),"������������� ���������. ������� ���������� �� �����?","��������!!!",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch(n){
        case JOptionPane.YES_OPTION: Engine.getAnimationFrame().show(); ;break;
        case JOptionPane.NO_OPTION: ; break;
        case JOptionPane.CANCEL_OPTION:
        case JOptionPane.CLOSED_OPTION: break;
        default:}*/
           }
         mon.setNote("���������  "+Math.round((Engine.getTime()/((int)aiis.model.parVrModD*24))*100)+"%");
         mon.setProgress((int)Engine.getTime());

         if (mon.isCanceled()){
             Engine.restart();
             mon.close();
             break; }





         Thread.sleep(1);
       } catch(InterruptedException e){}

       }



    if (Engine.isRunning()==false){
         mon.close();
      /*  int n = JOptionPane.showConfirmDialog(Engine.getAnimation(),"������������� ���������. ������� ���������� �� �����?","��������!!!",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
switch(n){
case JOptionPane.YES_OPTION: Engine.getAnimationFrame().show(); ;break;
case JOptionPane.NO_OPTION: ; break;
case JOptionPane.CANCEL_OPTION:
case JOptionPane.CLOSED_OPTION: break;
default:}*/
       }
      }
    };
Thread thread = new Thread(runnable);
    thread.start();

//this.setSize(400,400);
  //  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //setVisible(true);

    this.setResizable(false);
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  private void jbInit() throws Exception {
    this.setResizable(false);
    this.setFocusable(true);

  //  this.setFocusable(true);
  }
}



/*    for (int i = 1;i<(int)aiis.model.parVrMod;i++){
    try{
      mon.setNote("���������  "+Math.round((Engine.getTime()/(int)aiis.model.parVrMod)*100)+"%");
      mon.setProgress((int)Engine.getTime());

      if (mon.isCanceled()){
      // mon.setProgress(1000000);
       //Engine.stop();
       mon.close();
       break;
      }
      Thread.sleep(100);
    } catch(InterruptedException e){}
  }*/


