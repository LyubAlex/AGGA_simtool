package interfaceMod;

import com.xj.anylogic.Engine;

public class controlAnimation extends Thread {
  private animation fr;
  controlAnimation(animation frame){fr=frame;}

  public void run() {

   while(true)
  {
    try
    {
if (Engine.isRunning()==false)
{
  fr.dispose();
  //this.destroy();
}
    Thread.sleep(1);
    }
        catch(InterruptedException e){}
  }
  }
}
