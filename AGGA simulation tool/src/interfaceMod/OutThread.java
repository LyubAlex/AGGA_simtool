package interfaceMod;

import com.xj.anylogic.Engine;
import javax.swing.JFormattedTextField;
import org.jfree.ui.RefineryUtilities;

public class OutThread extends Thread {
   private JFormattedTextField textField;
   private animation fr;
   OutThread(JFormattedTextField text ,animation frame){fr=frame;textField=text;}
   public void run() {
   RefineryUtilities.centerFrameOnScreen(fr); fr.setVisible(true);
   fr.anim1.setVisible(false);
   fr.anim2.setVisible(true);
   while(Engine.isRunning())
  {
    try
    {
      if (Engine.isRunning()){
         if (fr.anim1.isVisible()==true & fr.anim2.isVisible()==false)
         {
          fr.anim1.setVisible(false);
          fr.anim2.setVisible(true);
         }
         else if (fr.anim1.isVisible()==false & fr.anim2.isVisible()==true)
         {fr.anim2.setVisible(false);
         fr.anim1.setVisible(true);
         }
       double a = aiis.model.parVrModD*24;
       double b=Engine.getTime();
       textField.setValue(new Double(Math.round((b/a)*100))+new String(" %"));
       fr.statusBar.setText(""+(Math.round((b/a)*100))+"%");
         }
    else {fr.dispose();}
    Thread.sleep(200);
    }
        catch(InterruptedException e){}
  }
  }
}
