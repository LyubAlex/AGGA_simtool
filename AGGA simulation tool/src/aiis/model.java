// model.java

package aiis;

import java.util.Vector;
import java.util.Hashtable;
import java.awt.Color;
import com.xj.jama.Matrix;
import com.xj.anylogic.*;
import com.xj.anylogic.animation.*;
import com.xj.random.*;


// _XJ_SECTION_BEGIN( AO.Import )
import interfaceMod.*;
import com.xj.anylogic.*;
import java.awt.*;
import javax.swing.*;
// _XJ_SECTION_END
public class model extends ActiveObject
 {

  public static void go( String[] args ) {
    System.out.println( "...started..." );
    try {
      Engine.setRoot( new model() );
    } catch ( Throwable ex ) {
      Engine.traceException( ex );
      Engine.setError( "Exception during model root object creation: " + ex );
    }
    Engine.start( args );
    System.out.println( "...finished..." );
  }

  public void onEngineCreate() {
  }

  public String getType() {
    return "aiis.model";
  }

  protected void getEquations() {
    addFE( _ref_help, new DoubleFunction() {
      public double value() { return todouble(
// _XJ_SECTION_BEGIN( AO.Equation.0.help )
0
// _XJ_SECTION_END
      ); }
      public String toString() { return "help = 0"; }
    }, false, null );
  }

  public void create() {
    timerCreate = new Timer_timerCreate();
    timerCreate.setName( "timerCreate" );
    timerResetModel = new Timer_timerResetModel();
    timerResetModel.setName( "timerResetModel" );
    timerTimeEnd = new Timer_timerTimeEnd();
    timerTimeEnd.setName( "timerTimeEnd" );
    timerStartAsk = new Timer_timerStartAsk();
    timerStartAsk.setName( "timerStartAsk" );
    _ref_timeScale.setup( this, "timeScale", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeScale )
    timeScale = 60
;
// _XJ_SECTION_END
    _ref_statusOprosa.setup( this, "statusOprosa", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.statusOprosa )
    statusOprosa = false
;
// _XJ_SECTION_END
    _ref_help.setup( this, "help", true );
    askCounter = new Type_askCounter();
    for ( int index = 0; index < (0
        ); index++ ) {
    aiis.GPRS _obj = new aiis.GPRS();
    setup_gPRS( _obj, index, false );
    }
    for ( int index = 0; index < (0
        ); index++ ) {
    aiis.GSM _obj = new aiis.GSM();
    setup_gSM( _obj, index, false );
    }
    for ( int index = 0; index < (0
        ); index++ ) {
    aiis.MIRC01 _obj = new aiis.MIRC01();
    setup_mIRGSM( _obj, index, false );
    }
    for ( int index = 0; index < (0
        ); index++ ) {
    aiis.SET _obj = new aiis.SET();
    setup_sETGSM( _obj, index, false );
    }
    for ( int index = 0; index < (0
        ); index++ ) {
    aiis.MIRC01 _obj = new aiis.MIRC01();
    setup_mIRGPRS( _obj, index, false );
    }
    for ( int index = 0; index < (0
        ); index++ ) {
    aiis.SET _obj = new aiis.SET();
    setup_sETGPRS( _obj, index, false );
    }
  }

  public void destroy() {
    gPRS.clear();
    gSM.clear();
    mIRGSM.clear();
    sETGSM.clear();
    mIRGPRS.clear();
    sETGPRS.clear();
    askCounter = null;
    super.destroy();
  }

  protected void startup() {
    timerCreate.restart(
// _XJ_SECTION_BEGIN( ST.Timeout.timerCreate )
timeAsk-10
// _XJ_SECTION_END
);
    timerResetModel.restart(
// _XJ_SECTION_BEGIN( ST.Timeout.timerResetModel )
1.0
// _XJ_SECTION_END
);
    timerTimeEnd.restart(
// _XJ_SECTION_BEGIN( ST.Timeout.timerTimeEnd )
1
// _XJ_SECTION_END
);
    timerStartAsk.restart(
// _XJ_SECTION_BEGIN( ST.Timeout.timerStartAsk )
timeAsk
// _XJ_SECTION_END
);
    startThread( askCounter, "askCounter" );
// _XJ_SECTION_BEGIN( AO.Startup )
//Engine.getAnimationFrame().setTitle("�������� �������");
//Engine.getAnimationFrame().setVisible(false);




//Engine.getAnimation().getToolbar().setVisible(false);
//startThread("testFun");
;
// _XJ_SECTION_END
  }


  // Class parameters
  public static void set_parKolMasGSM(
// _XJ_SECTION_BEGIN( AO.ParameterType.0 )
Vector
// _XJ_SECTION_END
      _value ) {
    parKolMasGSM = _value;
  }

  public static Vector get_parKolMasGSM() {
    return parKolMasGSM;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.0 )
Vector
// _XJ_SECTION_END
 parKolMasGSM;
  public static void set_parVerUstGSM(
// _XJ_SECTION_BEGIN( AO.ParameterType.1 )
double
// _XJ_SECTION_END
      _value ) {
    parVerUstGSM = _value;
  }

  public static double get_parVerUstGSM() {
    return parVerUstGSM;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.1 )
double
// _XJ_SECTION_END
 parVerUstGSM =
// _XJ_SECTION_BEGIN( AO.ParameterValue.1 )
90
// _XJ_SECTION_END
;
  public static void set_parVerEndGSM(
// _XJ_SECTION_BEGIN( AO.ParameterType.2 )
double
// _XJ_SECTION_END
      _value ) {
    parVerEndGSM = _value;
  }

  public static double get_parVerEndGSM() {
    return parVerEndGSM;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.2 )
double
// _XJ_SECTION_END
 parVerEndGSM =
// _XJ_SECTION_BEGIN( AO.ParameterValue.2 )
1
// _XJ_SECTION_END
;
  public static void set_parVrUstGSM(
// _XJ_SECTION_BEGIN( AO.ParameterType.3 )
double
// _XJ_SECTION_END
      _value ) {
    parVrUstGSM = _value;
  }

  public static double get_parVrUstGSM() {
    return parVrUstGSM;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.3 )
double
// _XJ_SECTION_END
 parVrUstGSM =
// _XJ_SECTION_BEGIN( AO.ParameterValue.3 )
15
// _XJ_SECTION_END
;
  public static void set_parVrEndGSM(
// _XJ_SECTION_BEGIN( AO.ParameterType.4 )
double
// _XJ_SECTION_END
      _value ) {
    parVrEndGSM = _value;
  }

  public static double get_parVrEndGSM() {
    return parVrEndGSM;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.4 )
double
// _XJ_SECTION_END
 parVrEndGSM =
// _XJ_SECTION_BEGIN( AO.ParameterValue.4 )
3
// _XJ_SECTION_END
;
  public static void set_parKolMasRADIO(
// _XJ_SECTION_BEGIN( AO.ParameterType.5 )
Vector
// _XJ_SECTION_END
      _value ) {
    parKolMasRADIO = _value;
  }

  public static Vector get_parKolMasRADIO() {
    return parKolMasRADIO;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.5 )
Vector
// _XJ_SECTION_END
 parKolMasRADIO;
  public static void set_parVrModD(
// _XJ_SECTION_BEGIN( AO.ParameterType.6 )
double
// _XJ_SECTION_END
      _value ) {
    parVrModD = _value;
  }

  public static double get_parVrModD() {
    return parVrModD;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.6 )
double
// _XJ_SECTION_END
 parVrModD =
// _XJ_SECTION_BEGIN( AO.ParameterValue.6 )
365
// _XJ_SECTION_END
;
  public static void set_parVrMod(
// _XJ_SECTION_BEGIN( AO.ParameterType.7 )
double
// _XJ_SECTION_END
      _value ) {
    parVrMod = _value;
  }

  public static double get_parVrMod() {
    return parVrMod;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.7 )
double
// _XJ_SECTION_END
 parVrMod =
// _XJ_SECTION_BEGIN( AO.ParameterValue.7 )
525600
// _XJ_SECTION_END
;
  public static void set_parReqData(
// _XJ_SECTION_BEGIN( AO.ParameterType.8 )
Vector
// _XJ_SECTION_END
      _value ) {
    parReqData = _value;
  }

  public static Vector get_parReqData() {
    return parReqData;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.8 )
Vector
// _XJ_SECTION_END
 parReqData;
  public static void set_parSETmaxTimeoutAnswer(
// _XJ_SECTION_BEGIN( AO.ParameterType.9 )
double
// _XJ_SECTION_END
      _value ) {
    parSETmaxTimeoutAnswer = _value;
  }

  public static double get_parSETmaxTimeoutAnswer() {
    return parSETmaxTimeoutAnswer;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.9 )
double
// _XJ_SECTION_END
 parSETmaxTimeoutAnswer =
// _XJ_SECTION_BEGIN( AO.ParameterValue.9 )
0.25
// _XJ_SECTION_END
;
  public static void set_parSETverNoAnswer(
// _XJ_SECTION_BEGIN( AO.ParameterType.10 )
double
// _XJ_SECTION_END
      _value ) {
    parSETverNoAnswer = _value;
  }

  public static double get_parSETverNoAnswer() {
    return parSETverNoAnswer;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.10 )
double
// _XJ_SECTION_END
 parSETverNoAnswer =
// _XJ_SECTION_BEGIN( AO.ParameterValue.10 )
1
// _XJ_SECTION_END
;
  public static void set_parMIRmaxTimeoutAnswer(
// _XJ_SECTION_BEGIN( AO.ParameterType.11 )
double
// _XJ_SECTION_END
      _value ) {
    parMIRmaxTimeoutAnswer = _value;
  }

  public static double get_parMIRmaxTimeoutAnswer() {
    return parMIRmaxTimeoutAnswer;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.11 )
double
// _XJ_SECTION_END
 parMIRmaxTimeoutAnswer =
// _XJ_SECTION_BEGIN( AO.ParameterValue.11 )
0.3
// _XJ_SECTION_END
;
  public static void set_parMIRverNoAnswer(
// _XJ_SECTION_BEGIN( AO.ParameterType.12 )
double
// _XJ_SECTION_END
      _value ) {
    parMIRverNoAnswer = _value;
  }

  public static double get_parMIRverNoAnswer() {
    return parMIRverNoAnswer;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.12 )
double
// _XJ_SECTION_END
 parMIRverNoAnswer =
// _XJ_SECTION_BEGIN( AO.ParameterValue.12 )
1
// _XJ_SECTION_END
;
  public static void set_parKolMasGPRS(
// _XJ_SECTION_BEGIN( AO.ParameterType.13 )
Vector
// _XJ_SECTION_END
      _value ) {
    parKolMasGPRS = _value;
  }

  public static Vector get_parKolMasGPRS() {
    return parKolMasGPRS;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.13 )
Vector
// _XJ_SECTION_END
 parKolMasGPRS;
  public static void set_parCSforGPRS(
// _XJ_SECTION_BEGIN( AO.ParameterType.14 )
int
// _XJ_SECTION_END
      _value ) {
    parCSforGPRS = _value;
  }

  public static int get_parCSforGPRS() {
    return parCSforGPRS;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.14 )
int
// _XJ_SECTION_END
 parCSforGPRS =
// _XJ_SECTION_BEGIN( AO.ParameterValue.14 )
2
// _XJ_SECTION_END
;
  public static void set_parMaxKolSlotUP(
// _XJ_SECTION_BEGIN( AO.ParameterType.15 )
double
// _XJ_SECTION_END
      _value ) {
    parMaxKolSlotUP = _value;
  }

  public static double get_parMaxKolSlotUP() {
    return parMaxKolSlotUP;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.15 )
double
// _XJ_SECTION_END
 parMaxKolSlotUP =
// _XJ_SECTION_BEGIN( AO.ParameterValue.15 )
2
// _XJ_SECTION_END
;
  public static void set_parMaxKolSlotDOWN(
// _XJ_SECTION_BEGIN( AO.ParameterType.16 )
double
// _XJ_SECTION_END
      _value ) {
    parMaxKolSlotDOWN = _value;
  }

  public static double get_parMaxKolSlotDOWN() {
    return parMaxKolSlotDOWN;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.16 )
double
// _XJ_SECTION_END
 parMaxKolSlotDOWN =
// _XJ_SECTION_BEGIN( AO.ParameterValue.16 )
4
// _XJ_SECTION_END
;
  public static void set_timeAsk(
// _XJ_SECTION_BEGIN( AO.ParameterType.17 )
double
// _XJ_SECTION_END
      _value ) {
    timeAsk = _value;
  }

  public static double get_timeAsk() {
    return timeAsk;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.17 )
double
// _XJ_SECTION_END
 timeAsk =
// _XJ_SECTION_BEGIN( AO.ParameterValue.17 )
24
// _XJ_SECTION_END
;
  public static void set_parBitrateSET(
// _XJ_SECTION_BEGIN( AO.ParameterType.18 )
double
// _XJ_SECTION_END
      _value ) {
    parBitrateSET = _value;
  }

  public static double get_parBitrateSET() {
    return parBitrateSET;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.18 )
double
// _XJ_SECTION_END
 parBitrateSET =
// _XJ_SECTION_BEGIN( AO.ParameterValue.18 )
9600
// _XJ_SECTION_END
;
  public static void set_parBitrateMIR(
// _XJ_SECTION_BEGIN( AO.ParameterType.19 )
double
// _XJ_SECTION_END
      _value ) {
    parBitrateMIR = _value;
  }

  public static double get_parBitrateMIR() {
    return parBitrateMIR;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.19 )
double
// _XJ_SECTION_END
 parBitrateMIR =
// _XJ_SECTION_BEGIN( AO.ParameterValue.19 )
9600
// _XJ_SECTION_END
;
  public static void set_parKolFCh(
// _XJ_SECTION_BEGIN( AO.ParameterType.20 )
double
// _XJ_SECTION_END
      _value ) {
    parKolFCh = _value;
  }

  public static double get_parKolFCh() {
    return parKolFCh;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.20 )
double
// _XJ_SECTION_END
 parKolFCh =
// _XJ_SECTION_BEGIN( AO.ParameterValue.20 )
3
// _XJ_SECTION_END
;
  public static void set_parHBS(
// _XJ_SECTION_BEGIN( AO.ParameterType.21 )
double
// _XJ_SECTION_END
      _value ) {
    parHBS = _value;
  }

  public static double get_parHBS() {
    return parHBS;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.21 )
double
// _XJ_SECTION_END
 parHBS =
// _XJ_SECTION_BEGIN( AO.ParameterValue.21 )
30
// _XJ_SECTION_END
;
  public static void set_parHMS(
// _XJ_SECTION_BEGIN( AO.ParameterType.22 )
double
// _XJ_SECTION_END
      _value ) {
    parHMS = _value;
  }

  public static double get_parHMS() {
    return parHMS;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.22 )
double
// _XJ_SECTION_END
 parHMS =
// _XJ_SECTION_BEGIN( AO.ParameterValue.22 )
2
// _XJ_SECTION_END
;
  public static void set_parD(
// _XJ_SECTION_BEGIN( AO.ParameterType.23 )
double
// _XJ_SECTION_END
      _value ) {
    parD = _value;
  }

  public static double get_parD() {
    return parD;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.23 )
double
// _XJ_SECTION_END
 parD =
// _XJ_SECTION_BEGIN( AO.ParameterValue.23 )
5
// _XJ_SECTION_END
;
  public static void set_parMaxMS(
// _XJ_SECTION_BEGIN( AO.ParameterType.24 )
double
// _XJ_SECTION_END
      _value ) {
    parMaxMS = _value;
  }

  public static double get_parMaxMS() {
    return parMaxMS;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.24 )
double
// _XJ_SECTION_END
 parMaxMS =
// _XJ_SECTION_BEGIN( AO.ParameterValue.24 )
20
// _XJ_SECTION_END
;
  public static void set_parMinMS(
// _XJ_SECTION_BEGIN( AO.ParameterType.25 )
double
// _XJ_SECTION_END
      _value ) {
    parMinMS = _value;
  }

  public static double get_parMinMS() {
    return parMinMS;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.25 )
double
// _XJ_SECTION_END
 parMinMS =
// _XJ_SECTION_BEGIN( AO.ParameterValue.25 )
1
// _XJ_SECTION_END
;
  public static void set_parDGSM(
// _XJ_SECTION_BEGIN( AO.ParameterType.26 )
double
// _XJ_SECTION_END
      _value ) {
    parDGSM = _value;
  }

  public static double get_parDGSM() {
    return parDGSM;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.26 )
double
// _XJ_SECTION_END
 parDGSM =
// _XJ_SECTION_BEGIN( AO.ParameterValue.26 )
5
// _XJ_SECTION_END
;
  public static void set_parHBSGSM(
// _XJ_SECTION_BEGIN( AO.ParameterType.27 )
double
// _XJ_SECTION_END
      _value ) {
    parHBSGSM = _value;
  }

  public static double get_parHBSGSM() {
    return parHBSGSM;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.27 )
double
// _XJ_SECTION_END
 parHBSGSM =
// _XJ_SECTION_BEGIN( AO.ParameterValue.27 )
30
// _XJ_SECTION_END
;
  public static void set_parHMSGSM(
// _XJ_SECTION_BEGIN( AO.ParameterType.28 )
double
// _XJ_SECTION_END
      _value ) {
    parHMSGSM = _value;
  }

  public static double get_parHMSGSM() {
    return parHMSGSM;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.28 )
double
// _XJ_SECTION_END
 parHMSGSM =
// _XJ_SECTION_BEGIN( AO.ParameterValue.28 )
2
// _XJ_SECTION_END
;
  public static void set_param(
// _XJ_SECTION_BEGIN( AO.ParameterType.29 )
Vector
// _XJ_SECTION_END
      _value ) {
    param = _value;
  }

  public static Vector get_param() {
    return param;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.29 )
Vector
// _XJ_SECTION_END
 param =
// _XJ_SECTION_BEGIN( AO.ParameterValue.29 )
null
// _XJ_SECTION_END
;

  public void setParams( Vector parKolMasGSM, double parVerUstGSM, double parVerEndGSM, double parVrUstGSM, double parVrEndGSM, Vector parKolMasRADIO, double parVrModD, double parVrMod, Vector parReqData, double parSETmaxTimeoutAnswer, double parSETverNoAnswer, double parMIRmaxTimeoutAnswer, double parMIRverNoAnswer, Vector parKolMasGPRS, int parCSforGPRS, double parMaxKolSlotUP, double parMaxKolSlotDOWN, double timeAsk, double parBitrateSET, double parBitrateMIR, double parKolFCh, double parHBS, double parHMS, double parD, double parMaxMS, double parMinMS, double parDGSM, double parHBSGSM, double parHMSGSM, Vector param ) {
    set_parKolMasGSM( parKolMasGSM );
    set_parVerUstGSM( parVerUstGSM );
    set_parVerEndGSM( parVerEndGSM );
    set_parVrUstGSM( parVrUstGSM );
    set_parVrEndGSM( parVrEndGSM );
    set_parKolMasRADIO( parKolMasRADIO );
    set_parVrModD( parVrModD );
    set_parVrMod( parVrMod );
    set_parReqData( parReqData );
    set_parSETmaxTimeoutAnswer( parSETmaxTimeoutAnswer );
    set_parSETverNoAnswer( parSETverNoAnswer );
    set_parMIRmaxTimeoutAnswer( parMIRmaxTimeoutAnswer );
    set_parMIRverNoAnswer( parMIRverNoAnswer );
    set_parKolMasGPRS( parKolMasGPRS );
    set_parCSforGPRS( parCSforGPRS );
    set_parMaxKolSlotUP( parMaxKolSlotUP );
    set_parMaxKolSlotDOWN( parMaxKolSlotDOWN );
    set_timeAsk( timeAsk );
    set_parBitrateSET( parBitrateSET );
    set_parBitrateMIR( parBitrateMIR );
    set_parKolFCh( parKolFCh );
    set_parHBS( parHBS );
    set_parHMS( parHMS );
    set_parD( parD );
    set_parMaxMS( parMaxMS );
    set_parMinMS( parMinMS );
    set_parDGSM( parDGSM );
    set_parHBSGSM( parHBSGSM );
    set_parHMSGSM( parHMSGSM );
    set_param( param );
  }

  // Structure objects
public double timeScale;
  public VariableRefDouble _ref_timeScale = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeScale = (double)_value; }
    public double getDoubleValue() { return (double)timeScale; } };
public boolean statusOprosa;
  public VariableRefDouble _ref_statusOprosa = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { statusOprosa = _value != 0 ? true : false; }
    public double getDoubleValue() { return statusOprosa ? 1.0 : 0.0; } };
public double help;
  public VariableRefDouble _ref_help = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { help = (double)_value; }
    public double getDoubleValue() { return (double)help; } };
  public Vector_GPRS gPRS = new Vector_GPRS();
  public Vector_GSM gSM = new Vector_GSM();
  public Vector_MIRC01 mIRGSM = new Vector_MIRC01();
  public Vector_SET sETGSM = new Vector_SET();
  public Vector_MIRC01 mIRGPRS = new Vector_MIRC01();
  public Vector_SET sETGPRS = new Vector_SET();
  Timer_timerCreate timerCreate = null;
  class Timer_timerCreate extends StaticTimer {
    Timer_timerCreate() {
      super( model.this );
    }
    public void action() {
// _XJ_SECTION_BEGIN( ST.Action.timerCreate )
askCounter.fireEvent("createSystem");
// _XJ_SECTION_END
    }
  }
  Timer_timerResetModel timerResetModel = null;
  class Timer_timerResetModel extends StaticTimer {
    Timer_timerResetModel() {
      super( model.this );
    }
    public void action() {
// _XJ_SECTION_BEGIN( ST.Action.timerResetModel )
if (parKolMasGSM == null &  parKolMasGPRS == null & parKolMasRADIO == null)
Engine.restart();
// _XJ_SECTION_END
    }
  }
  Timer_timerTimeEnd timerTimeEnd = null;
  class Timer_timerTimeEnd extends StaticTimer {
    Timer_timerTimeEnd() {
      super( model.this );
    }
    public void action() {
      timerTimeEnd.restart(
// _XJ_SECTION_BEGIN( ST.Timeout.timerTimeEnd )
1
// _XJ_SECTION_END
);
// _XJ_SECTION_BEGIN( ST.Action.timerTimeEnd )
if (parVrMod ==0)
{
Engine.stop();
collectionStat();

int n = JOptionPane.showConfirmDialog(Engine.getAnimation(),"������������� ���������. ������� ���������� �� �����?","��������!!!",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
switch(n){
case JOptionPane.YES_OPTION: outputResult();break;
case JOptionPane.NO_OPTION: breakResult(); break;
case JOptionPane.CANCEL_OPTION:
case JOptionPane.CLOSED_OPTION: break;
default:
}}
else{parVrMod--;}
// _XJ_SECTION_END
    }
  }
  Timer_timerStartAsk timerStartAsk = null;
  class Timer_timerStartAsk extends StaticTimer {
    Timer_timerStartAsk() {
      super( model.this );
    }
    public void action() {
      timerStartAsk.restart(
// _XJ_SECTION_BEGIN( ST.Timeout.timerStartAsk )
timeAsk
// _XJ_SECTION_END
);
// _XJ_SECTION_BEGIN( ST.Action.timerStartAsk )
askCounter.fireEvent("Start");
// _XJ_SECTION_END
    }
  }

  protected synchronized aiis.GPRS create_gPRS( int index ) {
    aiis.GPRS _obj = new aiis.GPRS();
    setup_gPRS( _obj, index, false );
    return _obj;
  }
  protected synchronized aiis.GPRS create_gPRS() {
    return create_gPRS( gPRS.isEmpty() ? 0 : gPRS.last().getIndex()+1 );
  }
  protected synchronized aiis.GPRS setup_gPRS( aiis.GPRS obj, int id, boolean autoRun ) {
    obj.setReplication( id );
    register( obj, "gPRS" );
    for ( int i = 0; i < sETGPRS.size(); i++ )
      sETGPRS.item(i).port.connect( obj.portOut );
    for ( int i = 0; i < mIRGPRS.size(); i++ )
      mIRGPRS.item(i).port.connect( obj.portOut );
    gPRS.add( obj );
    if ( autoRun )
      obj.run();
    return obj;
  }
  protected aiis.GPRS setup_gPRS( aiis.GPRS obj ) {
    return setup_gPRS( obj, gPRS.isEmpty() ? 0 : gPRS.last().getIndex()+1, true );
  }
  protected aiis.GPRS setup_gPRS( aiis.GPRS obj, int index ) {
    return setup_gPRS( obj, index, true );
  }
  protected synchronized void dispose_gPRS( aiis.GPRS obj ) {
    int id = gPRS.indexOf( obj );
    gPRS.remove( obj );
    for ( int i = 0; i < sETGPRS.size(); i++ )
      sETGPRS.item(i).port.disconnect( obj.portOut );
    for ( int i = 0; i < mIRGPRS.size(); i++ )
      mIRGPRS.item(i).port.disconnect( obj.portOut );
    unregister( obj );
  }

  protected synchronized aiis.GSM create_gSM( int index ) {
    aiis.GSM _obj = new aiis.GSM();
    setup_gSM( _obj, index, false );
    return _obj;
  }
  protected synchronized aiis.GSM create_gSM() {
    return create_gSM( gSM.isEmpty() ? 0 : gSM.last().getIndex()+1 );
  }
  protected synchronized aiis.GSM setup_gSM( aiis.GSM obj, int id, boolean autoRun ) {
    obj.setReplication( id );
    register( obj, "gSM" );
    for ( int i = 0; i < sETGSM.size(); i++ )
      sETGSM.item(i).port.connect( obj.portOut );
    for ( int i = 0; i < mIRGSM.size(); i++ )
      mIRGSM.item(i).port.connect( obj.portOut );
    gSM.add( obj );
    if ( autoRun )
      obj.run();
    return obj;
  }
  protected aiis.GSM setup_gSM( aiis.GSM obj ) {
    return setup_gSM( obj, gSM.isEmpty() ? 0 : gSM.last().getIndex()+1, true );
  }
  protected aiis.GSM setup_gSM( aiis.GSM obj, int index ) {
    return setup_gSM( obj, index, true );
  }
  protected synchronized void dispose_gSM( aiis.GSM obj ) {
    int id = gSM.indexOf( obj );
    gSM.remove( obj );
    for ( int i = 0; i < sETGSM.size(); i++ )
      sETGSM.item(i).port.disconnect( obj.portOut );
    for ( int i = 0; i < mIRGSM.size(); i++ )
      mIRGSM.item(i).port.disconnect( obj.portOut );
    unregister( obj );
  }

  protected synchronized aiis.MIRC01 create_mIRGSM( int index ) {
    aiis.MIRC01 _obj = new aiis.MIRC01();
    setup_mIRGSM( _obj, index, false );
    return _obj;
  }
  protected synchronized aiis.MIRC01 create_mIRGSM() {
    return create_mIRGSM( mIRGSM.isEmpty() ? 0 : mIRGSM.last().getIndex()+1 );
  }
  protected synchronized aiis.MIRC01 setup_mIRGSM( aiis.MIRC01 obj, int id, boolean autoRun ) {
    obj.setReplication( id );
    register( obj, "mIRGSM" );
    for ( int i = 0; i < gSM.size(); i++ )
      gSM.item(i).portOut.connect( obj.port );
    mIRGSM.add( obj );
    if ( autoRun )
      obj.run();
    return obj;
  }
  protected aiis.MIRC01 setup_mIRGSM( aiis.MIRC01 obj ) {
    return setup_mIRGSM( obj, mIRGSM.isEmpty() ? 0 : mIRGSM.last().getIndex()+1, true );
  }
  protected aiis.MIRC01 setup_mIRGSM( aiis.MIRC01 obj, int index ) {
    return setup_mIRGSM( obj, index, true );
  }
  protected synchronized void dispose_mIRGSM( aiis.MIRC01 obj ) {
    int id = mIRGSM.indexOf( obj );
    mIRGSM.remove( obj );
    for ( int i = 0; i < gSM.size(); i++ )
      gSM.item(i).portOut.disconnect( obj.port );
    unregister( obj );
  }

  protected synchronized aiis.SET create_sETGSM( int index ) {
    aiis.SET _obj = new aiis.SET();
    setup_sETGSM( _obj, index, false );
    return _obj;
  }
  protected synchronized aiis.SET create_sETGSM() {
    return create_sETGSM( sETGSM.isEmpty() ? 0 : sETGSM.last().getIndex()+1 );
  }
  protected synchronized aiis.SET setup_sETGSM( aiis.SET obj, int id, boolean autoRun ) {
    obj.setReplication( id );
    register( obj, "sETGSM" );
    for ( int i = 0; i < gSM.size(); i++ )
      gSM.item(i).portOut.connect( obj.port );
    sETGSM.add( obj );
    if ( autoRun )
      obj.run();
    return obj;
  }
  protected aiis.SET setup_sETGSM( aiis.SET obj ) {
    return setup_sETGSM( obj, sETGSM.isEmpty() ? 0 : sETGSM.last().getIndex()+1, true );
  }
  protected aiis.SET setup_sETGSM( aiis.SET obj, int index ) {
    return setup_sETGSM( obj, index, true );
  }
  protected synchronized void dispose_sETGSM( aiis.SET obj ) {
    int id = sETGSM.indexOf( obj );
    sETGSM.remove( obj );
    for ( int i = 0; i < gSM.size(); i++ )
      gSM.item(i).portOut.disconnect( obj.port );
    unregister( obj );
  }

  protected synchronized aiis.MIRC01 create_mIRGPRS( int index ) {
    aiis.MIRC01 _obj = new aiis.MIRC01();
    setup_mIRGPRS( _obj, index, false );
    return _obj;
  }
  protected synchronized aiis.MIRC01 create_mIRGPRS() {
    return create_mIRGPRS( mIRGPRS.isEmpty() ? 0 : mIRGPRS.last().getIndex()+1 );
  }
  protected synchronized aiis.MIRC01 setup_mIRGPRS( aiis.MIRC01 obj, int id, boolean autoRun ) {
    obj.setReplication( id );
    register( obj, "mIRGPRS" );
    for ( int i = 0; i < gPRS.size(); i++ )
      gPRS.item(i).portOut.connect( obj.port );
    mIRGPRS.add( obj );
    if ( autoRun )
      obj.run();
    return obj;
  }
  protected aiis.MIRC01 setup_mIRGPRS( aiis.MIRC01 obj ) {
    return setup_mIRGPRS( obj, mIRGPRS.isEmpty() ? 0 : mIRGPRS.last().getIndex()+1, true );
  }
  protected aiis.MIRC01 setup_mIRGPRS( aiis.MIRC01 obj, int index ) {
    return setup_mIRGPRS( obj, index, true );
  }
  protected synchronized void dispose_mIRGPRS( aiis.MIRC01 obj ) {
    int id = mIRGPRS.indexOf( obj );
    mIRGPRS.remove( obj );
    for ( int i = 0; i < gPRS.size(); i++ )
      gPRS.item(i).portOut.disconnect( obj.port );
    unregister( obj );
  }

  protected synchronized aiis.SET create_sETGPRS( int index ) {
    aiis.SET _obj = new aiis.SET();
    setup_sETGPRS( _obj, index, false );
    return _obj;
  }
  protected synchronized aiis.SET create_sETGPRS() {
    return create_sETGPRS( sETGPRS.isEmpty() ? 0 : sETGPRS.last().getIndex()+1 );
  }
  protected synchronized aiis.SET setup_sETGPRS( aiis.SET obj, int id, boolean autoRun ) {
    obj.setReplication( id );
    register( obj, "sETGPRS" );
    for ( int i = 0; i < gPRS.size(); i++ )
      gPRS.item(i).portOut.connect( obj.port );
    sETGPRS.add( obj );
    if ( autoRun )
      obj.run();
    return obj;
  }
  protected aiis.SET setup_sETGPRS( aiis.SET obj ) {
    return setup_sETGPRS( obj, sETGPRS.isEmpty() ? 0 : sETGPRS.last().getIndex()+1, true );
  }
  protected aiis.SET setup_sETGPRS( aiis.SET obj, int index ) {
    return setup_sETGPRS( obj, index, true );
  }
  protected synchronized void dispose_sETGPRS( aiis.SET obj ) {
    int id = sETGPRS.indexOf( obj );
    sETGPRS.remove( obj );
    for ( int i = 0; i < gPRS.size(); i++ )
      gPRS.item(i).portOut.disconnect( obj.port );
    unregister( obj );
  }

  public class Vector_GPRS extends ReplicatedObject {
    public aiis.GPRS item( int index ) {
      return (aiis.GPRS)elementAt( index );
    }
    public aiis.GPRS random() {
      return item( Func.uniform_discr( size()-1 ) );
    }
    public aiis.GPRS first() {
      return item( 0 );
    }
    public aiis.GPRS last() {
      return item( size()-1 );
    }
  }
  public class Vector_GSM extends ReplicatedObject {
    public aiis.GSM item( int index ) {
      return (aiis.GSM)elementAt( index );
    }
    public aiis.GSM random() {
      return item( Func.uniform_discr( size()-1 ) );
    }
    public aiis.GSM first() {
      return item( 0 );
    }
    public aiis.GSM last() {
      return item( size()-1 );
    }
  }
  public class Vector_MIRC01 extends ReplicatedObject {
    public aiis.MIRC01 item( int index ) {
      return (aiis.MIRC01)elementAt( index );
    }
    public aiis.MIRC01 random() {
      return item( Func.uniform_discr( size()-1 ) );
    }
    public aiis.MIRC01 first() {
      return item( 0 );
    }
    public aiis.MIRC01 last() {
      return item( size()-1 );
    }
  }
  public class Vector_SET extends ReplicatedObject {
    public aiis.SET item( int index ) {
      return (aiis.SET)elementAt( index );
    }
    public aiis.SET random() {
      return item( Func.uniform_discr( size()-1 ) );
    }
    public aiis.SET first() {
      return item( 0 );
    }
    public aiis.SET last() {
      return item( size()-1 );
    }
  }
// Group class for group _IconGroup
public class _IconGroup extends Group {

  public void setup() {
    setActiveObject( model.this );
    super.setup();
    setSize( 62, 42 );
    setOrigin( -30, -20 );

    add( _shape_ );
    _shape_.setShapeName( "_shape_" );
    _shape_.setPos( -27, -17 );
    _shape_.setFillColor( new Color( 12632256 ) );
    _shape_.setSize( 60, 40 );
    _shape_.setLineWidth( 0 );
    _shape_.setLineColor( null );

    add( _shape_rectangle );
    _shape_rectangle.setShapeName( "_shape_rectangle" );
    _shape_rectangle.setPos( -30, -20 );
    _shape_rectangle.setFillColor( new Color( 16231006 ) );
    _shape_rectangle.setSize( 60, 40 );
    _shape_rectangle.setLineWidth( 1 );
    _shape_rectangle.setLineColor( new Color( 16093485 ) );
  }

  public void init() {
    super.init();
  }

  public void update() {
    super.update();
  }

    public ShapeRect _shape_rectangle = new ShapeRect();
    public ShapeRect _shape_ = new ShapeRect();
}

  public _IconGroup icon = null;
  public Group createIcon() {
    return icon != null ? icon : ( icon = new _IconGroup() );
  }

// Group class for group _StructureGroup
public class _StructureGroup extends Group {

  public void setup() {
    setScale( 0.8 );
    setActiveObject( model.this );
    super.setup();
    setSize( 521, 361 );
    setOrigin( -81, -340 );

    add( _shape_textBox3_904 );
    _shape_textBox3_904.setShapeName( "_shape_textBox3_904" );
    _shape_textBox3_904.setPos( -80, -340 );
    _shape_textBox3_904.setFillColor( new Color( 16777152 ) );
    _shape_textBox3_904.setSize( 520, 100 );
    _shape_textBox3_904.setFontColor( new Color( 0 ) );
    _shape_textBox3_904.setText( "��� ��������� ��������� ����������� � ��������,� ����������� ��������� � ������� �������� �������\n1 ��.���. �������=1��� ���������=3600�\n\"createSystem\"\n\"createSystem\"\n\"createSystem\"\n\n" );

    add( _object_model );
    _object_model.setShapeName( "_object_model" );
    _object_model.setPos( -80, -200 );
    _object_model.setSize( 490, 220 );
    _object_model.setName( "model" );
    _object_model.setNameOffset( 10, 10 );

    add( _shape_sETGPRS );
    _shape_sETGPRS.setShapeName( "_shape_sETGPRS" );
    _shape_sETGPRS.setPos( 360, -20 );
    _shape_sETGPRS.setName( "sETGPRS" );
    _shape_sETGPRS.setNameOffset( -31, -31 );
    _shape_sETGPRS.setActiveObject( model.this.sETGPRS );
    _shape_sETGPRS.setup();

    add( _shape_mIRGPRS );
    _shape_mIRGPRS.setShapeName( "_shape_mIRGPRS" );
    _shape_mIRGPRS.setPos( 360, -100 );
    _shape_mIRGPRS.setName( "mIRGPRS" );
    _shape_mIRGPRS.setNameOffset( -31, -31 );
    _shape_mIRGPRS.setActiveObject( model.this.mIRGPRS );
    _shape_mIRGPRS.setup();

    add( _shape_sETGSM );
    _shape_sETGSM.setShapeName( "_shape_sETGSM" );
    _shape_sETGSM.setPos( 120, -20 );
    _shape_sETGSM.setName( "sETGSM" );
    _shape_sETGSM.setNameOffset( -31, -31 );
    _shape_sETGSM.setActiveObject( model.this.sETGSM );
    _shape_sETGSM.setup();

    add( _shape_mIRGSM );
    _shape_mIRGSM.setShapeName( "_shape_mIRGSM" );
    _shape_mIRGSM.setPos( 120, -100 );
    _shape_mIRGSM.setName( "mIRGSM" );
    _shape_mIRGSM.setNameOffset( -31, -31 );
    _shape_mIRGSM.setActiveObject( model.this.mIRGSM );
    _shape_mIRGSM.setup();

    add( _shape_gSM );
    _shape_gSM.setShapeName( "_shape_gSM" );
    _shape_gSM.setPos( -20, -60 );
    _shape_gSM.setName( "gSM" );
    _shape_gSM.setNameOffset( -31, -31 );
    _shape_gSM.setActiveObject( model.this.gSM );
    _shape_gSM.setup();

    add( _shape_gPRS );
    _shape_gPRS.setShapeName( "_shape_gPRS" );
    _shape_gPRS.setPos( 220, -60 );
    _shape_gPRS.setName( "gPRS" );
    _shape_gPRS.setNameOffset( -31, -31 );
    _shape_gPRS.setActiveObject( model.this.gPRS );
    _shape_gPRS.setup();

    add( _shape_connector_1880 );
    _shape_connector_1880.setShapeName( "_shape_connector_1880" );
    _shape_connector_1880.setPos( 10, -60 );
    _shape_connector_1880.setLineWidth( 1 );
    _shape_connector_1880.setLineColor( new Color( 0 ) );
    _shape_connector_1880.addPoint( 14, -62 );
    _shape_connector_1880.addPoint( 85, -97 );

    add( _shape_connector1_1881 );
    _shape_connector1_1881.setShapeName( "_shape_connector1_1881" );
    _shape_connector1_1881.setPos( 10, -60 );
    _shape_connector1_1881.setLineWidth( 1 );
    _shape_connector1_1881.setLineColor( new Color( 0 ) );
    _shape_connector1_1881.addPoint( 14, -57 );
    _shape_connector1_1881.addPoint( 85, -22 );

    add( _shape_connector2_1882 );
    _shape_connector2_1882.setShapeName( "_shape_connector2_1882" );
    _shape_connector2_1882.setPos( 250, -60 );
    _shape_connector2_1882.setLineWidth( 1 );
    _shape_connector2_1882.setLineColor( new Color( 0 ) );
    _shape_connector2_1882.addPoint( 254, -62 );
    _shape_connector2_1882.addPoint( 325, -97 );

    add( _shape_connector3_1883 );
    _shape_connector3_1883.setShapeName( "_shape_connector3_1883" );
    _shape_connector3_1883.setPos( 250, -60 );
    _shape_connector3_1883.setLineWidth( 1 );
    _shape_connector3_1883.setLineColor( new Color( 0 ) );
    _shape_connector3_1883.addPoint( 254, -57 );
    _shape_connector3_1883.addPoint( 325, -22 );

    add( _shape_askCounter );
    _shape_askCounter.setShapeName( "_shape_askCounter" );
    _shape_askCounter.setPos( 310, -180 );
    _shape_askCounter.setName( "askCounter" );
    _shape_askCounter.setNameOffset( 10, 0 );

    add( _shape_help );
    _shape_help.setShapeName( "_shape_help" );
    _shape_help.setPos( -60, -160 );
    _shape_help.setFillColor( new Color( 10526975 ) );
    _shape_help.setStateVariable( true );
    _shape_help.setName( "help" );
    _shape_help.setNameOffset( 10, 0 );

    add( _shape_statusOprosa );
    _shape_statusOprosa.setShapeName( "_shape_statusOprosa" );
    _shape_statusOprosa.setPos( -60, -140 );
    _shape_statusOprosa.setFillColor( new Color( 10526975 ) );
    _shape_statusOprosa.setStateVariable( true );
    _shape_statusOprosa.setName( "statusOprosa" );
    _shape_statusOprosa.setNameOffset( 10, 0 );

    add( _shape_timeScale );
    _shape_timeScale.setShapeName( "_shape_timeScale" );
    _shape_timeScale.setPos( -60, -120 );
    _shape_timeScale.setFillColor( new Color( 10526975 ) );
    _shape_timeScale.setStateVariable( true );
    _shape_timeScale.setName( "timeScale" );
    _shape_timeScale.setNameOffset( 10, 0 );

    add( _shape_timerStartAsk );
    _shape_timerStartAsk.setShapeName( "_shape_timerStartAsk" );
    _shape_timerStartAsk.setPos( 50, -180 );
    _shape_timerStartAsk.setName( "timerStartAsk" );
    _shape_timerStartAsk.setNameOffset( 10, 0 );

    add( _shape_timerTimeEnd );
    _shape_timerTimeEnd.setShapeName( "_shape_timerTimeEnd" );
    _shape_timerTimeEnd.setPos( 50, -160 );
    _shape_timerTimeEnd.setName( "timerTimeEnd" );
    _shape_timerTimeEnd.setNameOffset( 10, 0 );

    add( _shape_timerResetModel );
    _shape_timerResetModel.setShapeName( "_shape_timerResetModel" );
    _shape_timerResetModel.setPos( 170, -180 );
    _shape_timerResetModel.setName( "timerResetModel" );
    _shape_timerResetModel.setNameOffset( 10, 0 );

    add( _shape_timerCreate );
    _shape_timerCreate.setShapeName( "_shape_timerCreate" );
    _shape_timerCreate.setPos( 170, -160 );
    _shape_timerCreate.setName( "timerCreate" );
    _shape_timerCreate.setNameOffset( 10, 0 );
  }

  public void init() {
    super.init();
    _shape_gPRS.init();
    _shape_gSM.init();
    _shape_mIRGSM.init();
    _shape_sETGSM.init();
    _shape_mIRGPRS.init();
    _shape_sETGPRS.init();
  }

  public void update() {
    super.update();
    _shape_gPRS.update();
    _shape_gSM.update();
    _shape_mIRGSM.update();
    _shape_sETGSM.update();
    _shape_mIRGPRS.update();
    _shape_sETGPRS.update();
  }

    public ShapeTimer _shape_timerCreate = new ShapeTimer();
    public ShapeTimer _shape_timerResetModel = new ShapeTimer();
    public ShapeTimer _shape_timerTimeEnd = new ShapeTimer();
    public ShapeTimer _shape_timerStartAsk = new ShapeTimer();
    public ShapeVar _shape_timeScale = new ShapeVar();
    public ShapeVar _shape_statusOprosa = new ShapeVar();
    public ShapeVar _shape_help = new ShapeVar();
    public ShapeStatechart _shape_askCounter = new ShapeStatechart();
    public ShapePoly _shape_connector3_1883 = new ShapePoly();
    public ShapePoly _shape_connector2_1882 = new ShapePoly();
    public ShapePoly _shape_connector1_1881 = new ShapePoly();
    public ShapePoly _shape_connector_1880 = new ShapePoly();
    public ShapeIcon _shape_gPRS = new ShapeIcon();
    public ShapeIcon _shape_gSM = new ShapeIcon();
    public ShapeIcon _shape_mIRGSM = new ShapeIcon();
    public ShapeIcon _shape_sETGSM = new ShapeIcon();
    public ShapeIcon _shape_mIRGPRS = new ShapeIcon();
    public ShapeIcon _shape_sETGPRS = new ShapeIcon();
    public ShapeBounds _object_model = new ShapeBounds();
    public ShapeComment _shape_textBox3_904 = new ShapeComment();
}

  public _StructureGroup structure = null;
  public Group createStructure() {
    return structure != null ? structure : ( structure = new _StructureGroup() );
  }

// _XJ_SECTION_BEGIN( AO.Code )
  double avKolEndGSM=0;
  double avKolNeudachGSM=0;
  double avKolRepeatGPRS=0;

  double avKolDontAnsSET=0;
  double avKolDontAnsMIR=0;


  double avKolDontAnsSETG=0;
  double avKolDontAnsMIRG=0;

public static Vector kolDataGPRS = new Vector();
public static double allDataGPRS=0;


public static boolean finishAllGSM=false;
public static int kolFinishGSM=0;

public static int kolFinishGPRS=0;
public static boolean finishAllGPRS=false;


public static int kolFinishRADIO=0;
public static boolean finishAllRADIO=false;

boolean stopChannel,waitChannel = false;
boolean nextChannel,otherChannel = false;

public static int scale = 3600;

public static Matrix askChannel = new Matrix(1,3);

void GSMCreate(int kolGSM){// �������� �������� ���������� GSM �������
 for (int i =0;i < kolGSM;i++)
     {
      this.setup_gSM(new GSM(),i);
      this.gSM.item(i).ID = i;
     }

}
void MIRcreateForGSM(int kolMIR){// ������� �������� �������� ���������� ��������� ��� ��� GPRS �������
 for (int i =0;i < kolMIR;i++)
     {
      this.setup_mIRGSM(new MIRC01(),i);
      this.mIRGSM.item(i).ID = i;
     }

}
void SETcreateForGSM(int kolSET){// ������� �������� �������� ���������� ��������� ��� ��� GPRS �������
 for (int i =0;i < kolSET;i++)
     {
      this.setup_sETGSM(new SET(),i);
      this.sETGSM.item(i).ID = i;

     }

}


void GPRSCreate(int kolGPRS){// �������� �������� ���������� GPRS �������
 for (int i =0;i < kolGPRS;i++)
     {
      this.setup_gPRS(new GPRS(),i);
      this.gPRS.item(i).ID = i;
     }

}
/*void RADIOCreate(int kolRADIO){// �������� �������� ���������� GPRS �������
 for (int i =0;i < kolRADIO;i++)
     {
      this.setup_rADIO(new RADIO(),i);
      this.rADIO.item(i).ID = i;
     }

}*/

void MIRcreateForGPRS(int kolMIR){// ������� �������� �������� ���������� ��������� ��� ��� GPRS �������
 for (int i =0;i < kolMIR;i++)
     {
      this.setup_mIRGPRS(new MIRC01(),i);
      this.mIRGPRS.item(i).ID = i;
     }

}
void SETcreateForGPRS(int kolSET){// ������� �������� �������� ���������� ��������� ��� ��� GPRS �������
 for (int i =0;i < kolSET;i++)
     {
      this.setup_sETGPRS(new SET(),i);
      this.sETGPRS.item(i).ID = i;

     }

}





void breakResult(){

}

void collectionStat(){

if (parKolMasGPRS!=null)
{

   if (parKolMasGPRS.size()==1)
   {


    avKolDontAnsSETG=sETGPRS.item(0).SETdontAnswer;
    avKolDontAnsMIRG=mIRGPRS.item(0).MIRdontAnswer;
   }
double sumKolRepeatGPRS=0;

   double sumKolDontSETG=0;
    double sumKolDontMIRG=0;
 for (int i = 0; i<parKolMasGPRS.size()/2;i++)
 {
  kolDataGPRS.addElement(new Double((gPRS.item(i).kolData)/8192));
  allDataGPRS=allDataGPRS+gPRS.item(i).kolData;

  sumKolRepeatGPRS=sumKolRepeatGPRS+gPRS.item(i).kolRepeat;

   sumKolDontSETG=sumKolDontSETG+sETGPRS.item(i).SETdontAnswer;
 sumKolDontMIRG=sumKolDontMIRG+mIRGPRS.item(i).MIRdontAnswer;

   double sumVrOprosa=0;
   for (int j = 0; j<gPRS.item(i).VrOprosaGPRS.size();j++)
   {

    sumVrOprosa=sumVrOprosa+((Number)gPRS.item(i).VrOprosaGPRS.elementAt(j)).doubleValue();
   }
    interfaceMod.Frame1.transferVrGPRS.addElement(new Double((sumVrOprosa/(gPRS.item(i).VrOprosaGPRS.size()))/60));



      double sumTimeSET=0;
      double sumTimeMIR=0;
   for (int k = 0; k<gPRS.item(i).avTimeSET.size();k++)
   {

    sumTimeSET=sumTimeSET+((Number)gPRS.item(i).avTimeSET.elementAt(k)).doubleValue();
     sumTimeMIR=sumTimeMIR+((Number)gPRS.item(i).avTimeMIR.elementAt(k)).doubleValue();
   }
   interfaceMod.Frame1.transferTimeSETGPRS.addElement(new Double((sumTimeSET/(gPRS.item(i).avTimeSET.size()))/60));
   interfaceMod.Frame1.transferTimeMIRGPRS.addElement(new Double((sumTimeMIR/(gPRS.item(i).avTimeMIR.size()))/60));




    }
 avKolRepeatGPRS=sumKolRepeatGPRS/(parKolMasGPRS.size()/2);

  avKolDontAnsSETG=sumKolDontSETG/(parKolMasGPRS.size()/2);
 avKolDontAnsMIRG=sumKolDontMIRG/(parKolMasGPRS.size()/2);



}


if (parKolMasGSM!=null)
{
   if (parKolMasGSM.size()==1)
   {
    avKolEndGSM=gSM.item(0).kolEndGSM;
    avKolNeudachGSM=gSM.item(0).kolNeudach;

    avKolDontAnsSET=sETGSM.item(0).SETdontAnswer;
    avKolDontAnsMIR=mIRGSM.item(0).MIRdontAnswer;
   }

    double sumKolEndGSM=0;
    double sumKolNeudachGSM=0;

    double sumKolDontSET=0;
    double sumKolDontMIR=0;
   for (int i = 0; i<parKolMasGSM.size()/2;i++)
 {


 sumKolEndGSM= sumKolEndGSM+gSM.item(i).kolEndGSM;
 sumKolNeudachGSM= sumKolNeudachGSM+gSM.item(i).kolNeudach;

 sumKolDontSET=sumKolDontSET+sETGSM.item(i).SETdontAnswer;
 sumKolDontMIR=sumKolDontMIR+mIRGSM.item(i).MIRdontAnswer;

 double sumTimeUst=0;
 double sumTimeEnd=0;
   for (int s = 0; s<gSM.item(i).vrUst.size();s++)
   {

    sumTimeUst=sumTimeUst+((Number)gSM.item(i).vrUst.elementAt(s)).doubleValue();
    sumTimeEnd=sumTimeEnd+((Number)gSM.item(i).vrEnd.elementAt(s)).doubleValue();
    }
   interfaceMod.Frame1.transferTimeUstGSM.addElement(new Double((sumTimeUst/(gSM.item(i).vrUst.size()))/60));
   interfaceMod.Frame1.transferTimeEndGSM.addElement(new Double((sumTimeEnd/(gSM.item(i).vrEnd.size()))/60));


  double sumVrOprosa=0;
   for (int j = 0; j<gSM.item(i).VrOprosaGSM.size();j++)
   {

    sumVrOprosa=sumVrOprosa+((Number)gSM.item(i).VrOprosaGSM.elementAt(j)).doubleValue();
   }
    interfaceMod.Frame1.transferVrGSM.addElement(new Double((sumVrOprosa/(gSM.item(i).VrOprosaGSM.size()))/60));


   double sumTimeSET=0;
      double sumTimeMIR=0;
   for (int k = 0; k<gSM.item(i).avTimeSET.size();k++)
   {

    sumTimeSET=sumTimeSET+((Number)gSM.item(i).avTimeSET.elementAt(k)).doubleValue();
   sumTimeMIR=sumTimeMIR+((Number)gSM.item(i).avTimeMIR.elementAt(k)).doubleValue();
   }
   interfaceMod.Frame1.transferTimeSETGSM.addElement(new Double((sumTimeSET/(gSM.item(i).avTimeSET.size()))/60));
    interfaceMod.Frame1.transferTimeMIRGSM.addElement(new Double((sumTimeMIR/(gSM.item(i).avTimeMIR.size()))/60));
 }


 avKolEndGSM=sumKolEndGSM/(parKolMasGSM.size()/2);
 avKolNeudachGSM=sumKolNeudachGSM/(parKolMasGSM.size()/2);

 avKolDontAnsSET=sumKolDontSET/(parKolMasGSM.size()/2);
 avKolDontAnsMIR=sumKolDontMIR/(parKolMasGSM.size()/2);


}

 interfaceMod.Frame1.transferDataGPRS=kolDataGPRS;


}

void outputResult(){
interfaceMod.Frame1.outKolNeudachGSM.setValue(new Double(Math.round(avKolNeudachGSM)));
interfaceMod.Frame1.outKolEndGSM.setValue(new Double(Math.round(avKolEndGSM)));
interfaceMod.Frame1.outAllDataGPRS.setValue(new Double(allDataGPRS/8192));
  interfaceMod.Frame1.outErrorGPRS.setValue(new Double(Math.round(avKolRepeatGPRS)));

interfaceMod.Frame1.noAnswerMIR.setValue(new Double(Math.round(avKolDontAnsMIR)));
interfaceMod.Frame1.noAnswerSET.setValue(new Double(Math.round(avKolDontAnsSET)));


interfaceMod.Frame1.noAnswerMIRG.setValue(new Double(Math.round(avKolDontAnsMIRG)));
interfaceMod.Frame1.noAnswerSETG.setValue(new Double(Math.round(avKolDontAnsSETG)));

}











;
// _XJ_SECTION_END
// Class inner statecharts
// Statechart Type_askCounter
public Type_askCounter askCounter;
class Type_askCounter extends Statechart {

  public static final short transition1 = 1;
  public static final short transition12 = 2;
  public static final short transition11 = 3;
  public static final short transition6 = 4;
  public static final short transition = 5;
  public static final short �_���_�_ = 6;
  public static final short ���___�_____�__�_����_��___�__ = 7;
  public static final short �����___��__�_�_____�__�_���� = 8;
  public static final short �_���_�__________ = 9;
  public static final short �_���_�______��_�___��__�_�_____�__�_���� = 10;

  protected Node[] getNodes() { return new Node[]{
    new Node( 1, eInitialMarker, "pointer", -1, -1, 9 ),
    new Node( 14, eTransition, "transition1", -1, 6, 8 ),
    new Node( 5, eTransition, "transition12", -1, 7, 6 ),
    new Node( 6, eTransition, "transition11", -1, 10, 7 ),
    new Node( 7, eTransition, "transition6", -1, 8, 10 ),
    new Node( 8, eTransition, "transition", -1, 9, 6 ),
    new Node( 13, eState, "��������", -1 ),
    new Node( 10, eState, "����� �� ���� ������� ��������", -1 ),
    new Node( 11, eState, "������ ������ �� ���� �������", -1 ),
    new Node( 12, eState, "�������� ��������", -1 ),
    new Node( 9, eState, "�������� ��������� ������ �� ���� �������", -1 ),
  }; }
  protected void calculate( int node, int codeType ) {
    switch ( node ) {
// Transition: transition1
      case 1: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.askCounter.14.Trigger )
"Start"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition11
      case 3: switch ( codeType ) {
        case eTrigger: nodeTriggerChangeEvent(
// _XJ_SECTION_BEGIN( SC.askCounter.6.Trigger )
finishAllGPRS==true & finishAllRADIO==true & finishAllGSM==true
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition
      case 5: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.askCounter.8.Trigger )
"createSystem"
// _XJ_SECTION_END
          ); break;
      } break;
// State: ��������
      case 6: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.askCounter.13.EntryAction )
statusOprosa=randomTrue(0.5);
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ����� �� ���� ������� ��������
      case 7: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.askCounter.10.EntryAction )
finishAllGPRS=false;
kolFinishGPRS=0;

finishAllRADIO=false;
kolFinishRADIO=0;

finishAllGSM=false;
kolFinishGSM=0;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ������ ������ �� ���� �������
      case 8: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.askCounter.11.EntryAction )

 for (int q=0;q<3;q++)
{
   if (askChannel.get(0,q)==1 & q==1)
     {
      for (int i = 0; i<parKolMasGPRS.size()/2;i++)
          {
            //������������� ���������� ������� GPRS
            gPRS.item(i).set_maxKolSlotUP(parMaxKolSlotUP);
            gPRS.item(i).set_maxKolSlotDOWN(parMaxKolSlotDOWN);
            gPRS.item(i).set_typeCS(parCSforGPRS);

            gPRS.item(i).kolChannelBS=8*parKolFCh;
            gPRS.item(i).Ht=parHBS;
            gPRS.item(i).Hr=parHMS;
            gPRS.item(i).distance=parD;
            gPRS.item(i).maxMS=parMaxMS;
            gPRS.item(i).minMS=parMinMS;

            gPRS.item(i).powerBS=24;//���
            gPRS.item(i).gainBS=5;//���
            gPRS.item(i).gainMS=3;//���

            //������������� ���������� ��������� ���
            sETGPRS.item(i).set_maxTimeoutAnswer(parSETmaxTimeoutAnswer);
            sETGPRS.item(i).set_bitrate(parBitrateSET);
            sETGPRS.item(i).set_parReqData(parReqData);
            sETGPRS.item(i).set_verNoAnswer(parSETverNoAnswer);


            //������������� ���������� ��������� ���
            mIRGPRS.item(i).set_maxTimeoutAnswer(parMIRmaxTimeoutAnswer);
            mIRGPRS.item(i).set_parReqData(parReqData);
            mIRGPRS.item(i).set_bitrate(parBitrateMIR);
            mIRGPRS.item(i).set_verNoAnswer(parMIRverNoAnswer);

            if (statusOprosa)
            {
             mIRGPRS.item(i).oprosAlgoritm.fireEvent("startMIRGPRS");
            }
            else if (statusOprosa==false)
            {
             sETGPRS.item(i).oprosAlgoritm.fireEvent("startSETGPRS");
            }

          }


     }
   else if (askChannel.get(0,q)==0 & q==1)
     {
      finishAllGPRS=true;
     }
   else if (askChannel.get(0,q)==1 & q==2)
     {
      for (int i = 0; i<parKolMasRADIO.size()/2;i++)
          {
           // rADIO.item(i).RADIO.fireEvent("startRADIO");
          }

     }
   else if (askChannel.get(0,q)==0 & q==2)
     {
      finishAllRADIO=true;
     }

   else if (askChannel.get(0,q)==1 & q==0)
     {
      for (int i = 0; i<parKolMasGSM.size()/2;i++)
          {
      //������������� ��������� ������ GSM
      gSM.item(i).set_parVerUstGSM(parVerUstGSM);
      gSM.item(i).set_parVerEndGSM(parVerEndGSM);
      gSM.item(i).set_parVrUstGSM(parVrUstGSM);
      gSM.item(i).set_parVrEndGSM(parVrEndGSM);

      gSM.item(i).Ht=parHBSGSM;
      gSM.item(i).Hr=parHMSGSM;
      gSM.item(i).distance=parDGSM;

      gSM.item(i).powerBS=24;//���
      gSM.item(i).gainBS=5;//���
      gSM.item(i).gainMS=3;//���

      //������������� ���������� ��������� ���
      sETGSM.item(i).set_maxTimeoutAnswer(parSETmaxTimeoutAnswer);
      sETGSM.item(i).set_parReqData(parReqData);
      sETGSM.item(i).set_bitrate(parBitrateSET);
      sETGSM.item(i).set_verNoAnswer(parSETverNoAnswer);

      //������������� ���������� ��������� ���
      mIRGSM.item(i).set_maxTimeoutAnswer(parMIRmaxTimeoutAnswer);
      mIRGSM.item(i).set_bitrate(parBitrateMIR);
      mIRGSM.item(i).set_parReqData(parReqData);
      mIRGSM.item(i).set_verNoAnswer(parMIRverNoAnswer);

     // gSM.GSM.fireEvent("startGSM");
       if (statusOprosa)
            {
             mIRGSM.item(i).oprosAlgoritm.fireEvent("startMIRGSM");
            }
            else if (statusOprosa==false)
            {
            sETGSM.item(i).oprosAlgoritm.fireEvent("startSETGSM");
            }
}
     }
   else if (askChannel.get(0,q)==0 & q==0)
     {
      finishAllGSM=true;
     }

}
;
// _XJ_SECTION_END
          } break;
      } break;
// State: �������� ��������
      case 9: switch ( codeType ) {
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.askCounter.12.ExitAction )

for (int q=0;q<3;q++)
{
 if (askChannel.get(0,q)==1 & q==1)
   {
    //dispose_gPRS(gPRS.item(0));
    GPRSCreate(parKolMasGPRS.size()/2);//�������� ������� GPRS
    MIRcreateForGPRS(parKolMasGPRS.size()/2);
    SETcreateForGPRS(parKolMasGPRS.size()/2);
   }
 else if (askChannel.get(0,q)==1 & q==2)
   {

    //RADIOCreate(parKolMasRADIO.size()/2);//�������� ������� RADIO
   }
 else if (askChannel.get(0,q)==1 & q==0)
   {
    GSMCreate(parKolMasGSM.size()/2);
    MIRcreateForGSM(parKolMasGSM.size()/2);
    SETcreateForGSM(parKolMasGSM.size()/2);
   }

}
;
// _XJ_SECTION_END
          } break;
      } break;
// State: �������� ��������� ������ �� ���� �������
      case 10: switch ( codeType ) {
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.askCounter.9.ExitAction )
 if (parKolMasGPRS!=null)
{
  for(int i=0;i<parKolMasGPRS.size()/2;i++)
{
 gPRS.item(i).VrOprosaGPRS.addElement(new Double(gPRS.item(i).currentTimeOpros));
 gPRS.item(i).currentTimeOpros=0;

 gPRS.item(i).avTimeSET.addElement(new Double(sETGPRS.item(i).avTimeSETGPRS/(((Double)parKolMasGPRS.get(2*i)).doubleValue())));
 sETGPRS.item(i).avTimeSETGPRS=0;

 gPRS.item(i).avTimeMIR.addElement(new Double(mIRGPRS.item(i).avTimeMIRGPRS/(((Double)parKolMasGPRS.get(2*i+1)).doubleValue())));
 mIRGPRS.item(i).avTimeMIRGPRS=0;
 }
 set_param(gPRS.item(0).VrOprosaGPRS);
}

 if (parKolMasGSM!=null)
{
    for(int i=0;i<parKolMasGSM.size()/2;i++)
 {
 gSM.item(i).vrUst.addElement(new Double(gSM.item(i).timeUstI));
  gSM.item(i).timeUstI=0;
  gSM.item(i).vrEnd.addElement(new Double(gSM.item(i).timeEndI));
  gSM.item(i).timeEndI=0;


   gSM.item(i).VrOprosaGSM.addElement(new Double(gSM.item(i).timeTransfer));
 gSM.item(i).timeTransfer=0;
 gSM.item(i).timeService=0;


 gSM.item(i).avTimeSET.addElement(new Double(sETGSM.item(i).avTimeSETGSM/(((Double)parKolMasGSM.get(2*i)).doubleValue())));
 sETGSM.item(i).avTimeSETGSM=0;

    gSM.item(i).avTimeMIR.addElement(new Double(mIRGSM.item(i).avTimeMIRGSM/(((Double)parKolMasGSM.get(2*i+1)).doubleValue())));
 mIRGSM.item(i).avTimeMIRGSM=0;
 }
}
;
// _XJ_SECTION_END
          } break;
      } break;
    }
  }

} // end of the Type_askCounter statechart
 // Stop conditions for experiment Simulation

  // class for the experiment Simulation
  public static class Simulation extends SimulationExperiment {

    public void runModel( aiis.model _root2 ) {
      final aiis.model _root = _root2;
      super.runModel( (ActiveObject)_root );
    }

    public void runExperiment() {
      Engine.setSysVar( "HTOL", "0.01" );
      Engine.setRealTimeScale( 1 );
      Engine.setRealTimeMode( true );
      aiis.model _root = new aiis.model();
      runModel( _root );
    }

    public void setParameters( ActiveObject _root2 ) {
      aiis.model _root = (aiis.model)_root2;
      long index = Engine.getReplication();
    }

    public static void main( String[] args ) {
      System.out.println( "Started..." );
      new Simulation().run( args );
      System.out.println( "Finished..." );
    }

  }

}
