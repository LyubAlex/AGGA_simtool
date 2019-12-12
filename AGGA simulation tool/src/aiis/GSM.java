// GSM.java

package aiis;

import java.util.Vector;
import java.util.Hashtable;
import java.awt.Color;
import com.xj.jama.Matrix;
import com.xj.anylogic.*;
import com.xj.anylogic.animation.*;
import com.xj.random.*;


public class GSM extends ActiveObject
 {

  public static void main( String[] args ) {
    System.out.println( "...started..." );
    try {
      Engine.setRoot( new GSM() );
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
    return "aiis.GSM";
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
    _ref_timeoutALL.setup( this, "timeoutALL", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeoutALL )
    timeoutALL = 0.18
;
// _XJ_SECTION_END
    _ref_help.setup( this, "help", true );
    _ref_Ls.setup( this, "Ls", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.Ls )
    Ls = 0
;
// _XJ_SECTION_END
    _ref_noise.setup( this, "noise", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.noise )
    noise = 0
;
// _XJ_SECTION_END
    _ref_Pr.setup( this, "Pr", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.Pr )
    Pr = 0
;
// _XJ_SECTION_END
    _ref_Lpr.setup( this, "Lpr", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.Lpr )
    Lpr = 0
;
// _XJ_SECTION_END
    _ref_Lg.setup( this, "Lg", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.Lg )
    Lg = 0
;
// _XJ_SECTION_END
    _ref_distance.setup( this, "distance", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.distance )
    distance = 0
;
// _XJ_SECTION_END
    _ref_f.setup( this, "f", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.f )
    f = 930
;
// _XJ_SECTION_END
    _ref_gainMS.setup( this, "gainMS", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.gainMS )
    gainMS = 0
;
// _XJ_SECTION_END
    _ref_gainBS.setup( this, "gainBS", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.gainBS )
    gainBS = 0
;
// _XJ_SECTION_END
    _ref_powerBS.setup( this, "powerBS", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.powerBS )
    powerBS = 0
;
// _XJ_SECTION_END
    _ref_Hr.setup( this, "Hr", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.Hr )
    Hr = 0
;
// _XJ_SECTION_END
    _ref_Ht.setup( this, "Ht", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.Ht )
    Ht = 0
;
// _XJ_SECTION_END
    _ref_kolNeudach.setup( this, "kolNeudach", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.kolNeudach )
    kolNeudach = 0
;
// _XJ_SECTION_END
    _ref_kolRepeat.setup( this, "kolRepeat", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.kolRepeat )
    kolRepeat = 0
;
// _XJ_SECTION_END
    _ref_timeEndI.setup( this, "timeEndI", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeEndI )
    timeEndI = 0
;
// _XJ_SECTION_END
    _ref_timeUstI.setup( this, "timeUstI", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeUstI )
    timeUstI = 0
;
// _XJ_SECTION_END
    _ref_timeTransfer.setup( this, "timeTransfer", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeTransfer )
    timeTransfer = 0
;
// _XJ_SECTION_END
    _ref_timeTransferI.setup( this, "timeTransferI", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeTransferI )
    timeTransferI = 0
;
// _XJ_SECTION_END
    _ref_endGSM.setup( this, "endGSM", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.endGSM )
    endGSM = false
;
// _XJ_SECTION_END
    _ref_idGSM.setup( this, "idGSM", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.idGSM )
    idGSM = 0
;
// _XJ_SECTION_END
    _ref_timeScale.setup( this, "timeScale", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeScale )
    timeScale = 60
;
// _XJ_SECTION_END
    _ref_timeOutFromMIR.setup( this, "timeOutFromMIR", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeOutFromMIR )
    timeOutFromMIR = 0
;
// _XJ_SECTION_END
    _ref_timeOutFromSET.setup( this, "timeOutFromSET", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeOutFromSET )
    timeOutFromSET = 0
;
// _XJ_SECTION_END
    _ref_bitrate.setup( this, "bitrate", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.bitrate )
    bitrate = 0
;
// _XJ_SECTION_END
    _ref_timeWaitCalling.setup( this, "timeWaitCalling", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeWaitCalling )
    timeWaitCalling = 0
;
// _XJ_SECTION_END
    _ref_timeService.setup( this, "timeService", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeService )
    timeService = 0
;
// _XJ_SECTION_END
    _ref_BER.setup( this, "BER", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.BER )
    BER = 0
;
// _XJ_SECTION_END
    _ref_SNR.setup( this, "SNR", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.SNR )
    SNR = 0
;
// _XJ_SECTION_END
    _ref_ID.setup( this, "ID", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.ID )
    ID = 0
;
// _XJ_SECTION_END
    _ref_transferData.setup( this, "transferData", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.transferData )
    transferData = 0
;
// _XJ_SECTION_END
    _ref_currentCounter.setup( this, "currentCounter", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.currentCounter )
    currentCounter = 0
;
// _XJ_SECTION_END
    _ref_statusCalling.setup( this, "statusCalling", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.statusCalling )
    statusCalling = false
;
// _XJ_SECTION_END
    _ref_statusBER.setup( this, "statusBER", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.statusBER )
    statusBER = false
;
// _XJ_SECTION_END
    _ref_kolBlok.setup( this, "kolBlok", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.kolBlok )
    kolBlok = 0
;
// _XJ_SECTION_END
    _ref_timeWaitAccess.setup( this, "timeWaitAccess", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeWaitAccess )
    timeWaitAccess = 0
;
// _XJ_SECTION_END
    _ref_kolEndGSM.setup( this, "kolEndGSM", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.kolEndGSM )
    kolEndGSM = 0
;
// _XJ_SECTION_END
    GSM = new Type_GSM();
    portOut = new Port();
    portOut.setup( "portOut", this );
    portIn = new Port();
    portIn.setup( "portIn", this );
  }

  public void destroy() {
    GSM = null;
    portOut = null;
    portIn = null;
    super.destroy();
  }

  protected void startup() {
    startThread( GSM, "GSM" );
  }

  public static class _Type_lookupTable_CSthroughput extends LookupTable { 
    public _Type_lookupTable_CSthroughput() {
      super( 
    "CSthroughput",    LookupTable.SPLINE,
    LookupTable.USE_NEAREST, 0.0,
    new double[]{ 3, 6, 8, 11, 16, 20 },
    new double[]{ 1500, 4500, 8000, 9600, 9600, 9600 } );
    }
  }
  public static _Type_lookupTable_CSthroughput CSthroughput = new _Type_lookupTable_CSthroughput();
  public static double CSthroughput( double x ) {
    return CSthroughput.lookup( x );
  }
  public static Matrix CSthroughput( Matrix x ) {
    return CSthroughput.lookup( x );
  }
  public static HyperArray CSthroughput( HyperArray x ) {
    return CSthroughput.lookup( x );
  }

  // Class parameters
  public static void set_parVerUstGSM( 
// _XJ_SECTION_BEGIN( AO.ParameterType.0 )
double
// _XJ_SECTION_END
      _value ) {
    parVerUstGSM = _value;
  }

  public static double get_parVerUstGSM() {
    return parVerUstGSM;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.0 )
double
// _XJ_SECTION_END
 parVerUstGSM = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.0 )
90
// _XJ_SECTION_END
;
  public static void set_parVerEndGSM( 
// _XJ_SECTION_BEGIN( AO.ParameterType.1 )
double
// _XJ_SECTION_END
      _value ) {
    parVerEndGSM = _value;
  }

  public static double get_parVerEndGSM() {
    return parVerEndGSM;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.1 )
double
// _XJ_SECTION_END
 parVerEndGSM = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.1 )
2
// _XJ_SECTION_END
;
  public static void set_parVrEndGSM( 
// _XJ_SECTION_BEGIN( AO.ParameterType.2 )
double
// _XJ_SECTION_END
      _value ) {
    parVrEndGSM = _value;
  }

  public static double get_parVrEndGSM() {
    return parVrEndGSM;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.2 )
double
// _XJ_SECTION_END
 parVrEndGSM = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.2 )
3
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
10
// _XJ_SECTION_END
;
  public static void set_timeWave( 
// _XJ_SECTION_BEGIN( AO.ParameterType.4 )
double
// _XJ_SECTION_END
      _value ) {
    timeWave = _value;
  }

  public static double get_timeWave() {
    return timeWave;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.4 )
double
// _XJ_SECTION_END
 timeWave = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.4 )
0.1
// _XJ_SECTION_END
;

  public void setParams( double parVerUstGSM, double parVerEndGSM, double parVrEndGSM, double parVrUstGSM, double timeWave ) {
    set_parVerUstGSM( parVerUstGSM );
    set_parVerEndGSM( parVerEndGSM );
    set_parVrEndGSM( parVrEndGSM );
    set_parVrUstGSM( parVrUstGSM );
    set_timeWave( timeWave );
  }

  // Structure objects
public double timeoutALL;
  public VariableRefDouble _ref_timeoutALL = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeoutALL = (double)_value; }
    public double getDoubleValue() { return (double)timeoutALL; } };
public double help;
  public VariableRefDouble _ref_help = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { help = (double)_value; }
    public double getDoubleValue() { return (double)help; } };
public double Ls;
  public VariableRefDouble _ref_Ls = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { Ls = (double)_value; }
    public double getDoubleValue() { return (double)Ls; } };
public double noise;
  public VariableRefDouble _ref_noise = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { noise = (double)_value; }
    public double getDoubleValue() { return (double)noise; } };
public double Pr;
  public VariableRefDouble _ref_Pr = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { Pr = (double)_value; }
    public double getDoubleValue() { return (double)Pr; } };
public double Lpr;
  public VariableRefDouble _ref_Lpr = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { Lpr = (double)_value; }
    public double getDoubleValue() { return (double)Lpr; } };
public double Lg;
  public VariableRefDouble _ref_Lg = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { Lg = (double)_value; }
    public double getDoubleValue() { return (double)Lg; } };
public double distance;
  public VariableRefDouble _ref_distance = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { distance = (double)_value; }
    public double getDoubleValue() { return (double)distance; } };
public double f;
  public VariableRefDouble _ref_f = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { f = (double)_value; }
    public double getDoubleValue() { return (double)f; } };
public double gainMS;
  public VariableRefDouble _ref_gainMS = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { gainMS = (double)_value; }
    public double getDoubleValue() { return (double)gainMS; } };
public double gainBS;
  public VariableRefDouble _ref_gainBS = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { gainBS = (double)_value; }
    public double getDoubleValue() { return (double)gainBS; } };
public double powerBS;
  public VariableRefDouble _ref_powerBS = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { powerBS = (double)_value; }
    public double getDoubleValue() { return (double)powerBS; } };
public double Hr;
  public VariableRefDouble _ref_Hr = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { Hr = (double)_value; }
    public double getDoubleValue() { return (double)Hr; } };
public double Ht;
  public VariableRefDouble _ref_Ht = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { Ht = (double)_value; }
    public double getDoubleValue() { return (double)Ht; } };
public double kolNeudach;
  public VariableRefDouble _ref_kolNeudach = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { kolNeudach = (double)_value; }
    public double getDoubleValue() { return (double)kolNeudach; } };
public int kolRepeat;
  public VariableRefDouble _ref_kolRepeat = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { kolRepeat = (int)_value; }
    public double getDoubleValue() { return (double)kolRepeat; } };
public double timeEndI;
  public VariableRefDouble _ref_timeEndI = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeEndI = (double)_value; }
    public double getDoubleValue() { return (double)timeEndI; } };
public double timeUstI;
  public VariableRefDouble _ref_timeUstI = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeUstI = (double)_value; }
    public double getDoubleValue() { return (double)timeUstI; } };
public double timeTransfer;
  public VariableRefDouble _ref_timeTransfer = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeTransfer = (double)_value; }
    public double getDoubleValue() { return (double)timeTransfer; } };
public double timeTransferI;
  public VariableRefDouble _ref_timeTransferI = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeTransferI = (double)_value; }
    public double getDoubleValue() { return (double)timeTransferI; } };
public boolean endGSM;
  public VariableRefDouble _ref_endGSM = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { endGSM = _value != 0 ? true : false; }
    public double getDoubleValue() { return endGSM ? 1.0 : 0.0; } };
public double idGSM;
  public VariableRefDouble _ref_idGSM = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { idGSM = (double)_value; }
    public double getDoubleValue() { return (double)idGSM; } };
public double timeScale;
  public VariableRefDouble _ref_timeScale = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeScale = (double)_value; }
    public double getDoubleValue() { return (double)timeScale; } };
public double timeOutFromMIR;
  public VariableRefDouble _ref_timeOutFromMIR = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeOutFromMIR = (double)_value; }
    public double getDoubleValue() { return (double)timeOutFromMIR; } };
public double timeOutFromSET;
  public VariableRefDouble _ref_timeOutFromSET = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeOutFromSET = (double)_value; }
    public double getDoubleValue() { return (double)timeOutFromSET; } };
public double bitrate;
  public VariableRefDouble _ref_bitrate = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { bitrate = (double)_value; }
    public double getDoubleValue() { return (double)bitrate; } };
public double timeWaitCalling;
  public VariableRefDouble _ref_timeWaitCalling = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeWaitCalling = (double)_value; }
    public double getDoubleValue() { return (double)timeWaitCalling; } };
public double timeService;
  public VariableRefDouble _ref_timeService = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeService = (double)_value; }
    public double getDoubleValue() { return (double)timeService; } };
public double BER;
  public VariableRefDouble _ref_BER = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { BER = (double)_value; }
    public double getDoubleValue() { return (double)BER; } };
public double SNR;
  public VariableRefDouble _ref_SNR = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { SNR = (double)_value; }
    public double getDoubleValue() { return (double)SNR; } };
public int ID;
  public VariableRefDouble _ref_ID = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { ID = (int)_value; }
    public double getDoubleValue() { return (double)ID; } };
public double transferData;
  public VariableRefDouble _ref_transferData = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { transferData = (double)_value; }
    public double getDoubleValue() { return (double)transferData; } };
public int currentCounter;
  public VariableRefDouble _ref_currentCounter = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { currentCounter = (int)_value; }
    public double getDoubleValue() { return (double)currentCounter; } };
public boolean statusCalling;
  public VariableRefDouble _ref_statusCalling = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { statusCalling = _value != 0 ? true : false; }
    public double getDoubleValue() { return statusCalling ? 1.0 : 0.0; } };
public boolean statusBER;
  public VariableRefDouble _ref_statusBER = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { statusBER = _value != 0 ? true : false; }
    public double getDoubleValue() { return statusBER ? 1.0 : 0.0; } };
public int kolBlok;
  public VariableRefDouble _ref_kolBlok = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { kolBlok = (int)_value; }
    public double getDoubleValue() { return (double)kolBlok; } };
public double timeWaitAccess;
  public VariableRefDouble _ref_timeWaitAccess = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeWaitAccess = (double)_value; }
    public double getDoubleValue() { return (double)timeWaitAccess; } };
public double kolEndGSM;
  public VariableRefDouble _ref_kolEndGSM = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { kolEndGSM = (double)_value; }
    public double getDoubleValue() { return (double)kolEndGSM; } };
  public Port portOut;
  public Port portIn;

// Group class for group _IconGroup
public class _IconGroup extends Group {

  public void setup() {
    setActiveObject( GSM.this );
    super.setup();
    setSize( 70, 42 );
    setOrigin( -35, -20 );

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

    add( _shape_text );
    _shape_text.setShapeName( "_shape_text" );
    _shape_text.setPos( -14, -9 );
    _shape_text.setFillColor( new Color( 0 ) );
    _shape_text.setLineWidth( 0 );
    _shape_text.setLineColor( null );
    _shape_text.setText( "GSM" );
    _shape_text.setFont( "Tahoma", 12, java.awt.Font.PLAIN );
    _shape_text.setFontColor( new Color( 0 ) );

    add( _shape_portIn );
    _shape_portIn.setShapeName( "_shape_portIn" );
    _shape_portIn.setPos( -30, 0 );
    _shape_portIn.setFillColor( new Color( 16777215 ) );

    add( _shape_portOut );
    _shape_portOut.setShapeName( "_shape_portOut" );
    _shape_portOut.setPos( 30, 0 );
    _shape_portOut.setFillColor( new Color( 16777215 ) );
  }

  public void init() {
    super.init();
  }

  public void update() {
    super.update();
  }

    public ShapePort _shape_portOut = new ShapePort();
    public ShapePort _shape_portIn = new ShapePort();
    public ShapeText _shape_text = new ShapeText();
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
    setActiveObject( GSM.this );
    super.setup();
    setSize( 646, 621 );
    setOrigin( -146, -170 );

    add( _shape_textBox1_10 );
    _shape_textBox1_10.setShapeName( "_shape_textBox1_10" );
    _shape_textBox1_10.setPos( 0, -170 );
    _shape_textBox1_10.setFillColor( new Color( 16777152 ) );
    _shape_textBox1_10.setSize( 500, 100 );
    _shape_textBox1_10.setFontColor( new Color( 0 ) );
    _shape_textBox1_10.setText( "kolEndGSM - количество внезапно разорванных соединений всего\nkolEndGSMSet - количество внезапно разорванных соединений во время опроса СЭТ\nkolEndGSMMir - количество внезапно разорванных соединений во время опроса МИР\n" );

    add( _shape_textBox5_29 );
    _shape_textBox5_29.setShapeName( "_shape_textBox5_29" );
    _shape_textBox5_29.setPos( -120, 240 );
    _shape_textBox5_29.setFillColor( new Color( 16777152 ) );
    _shape_textBox5_29.setSize( 170, 190 );
    _shape_textBox5_29.setFontColor( new Color( 0 ) );
    _shape_textBox5_29.setText( "Собираемая статистика\n" );

    add( _shape_textBox_60 );
    _shape_textBox_60.setShapeName( "_shape_textBox_60" );
    _shape_textBox_60.setPos( -120, 50 );
    _shape_textBox_60.setFillColor( new Color( 16777152 ) );
    _shape_textBox_60.setSize( 170, 170 );
    _shape_textBox_60.setFontColor( new Color( 0 ) );
    _shape_textBox_60.setText( "Системные переменные" );

    add( _shape_textBox4_63 );
    _shape_textBox4_63.setShapeName( "_shape_textBox4_63" );
    _shape_textBox4_63.setPos( 70, 240 );
    _shape_textBox4_63.setFillColor( new Color( 16777152 ) );
    _shape_textBox4_63.setSize( 170, 190 );
    _shape_textBox4_63.setFontColor( new Color( 0 ) );
    _shape_textBox4_63.setText( "Модель Хаты" );

    add( _shape_textBox3_78 );
    _shape_textBox3_78.setShapeName( "_shape_textBox3_78" );
    _shape_textBox3_78.setPos( 70, 50 );
    _shape_textBox3_78.setFillColor( new Color( 16777152 ) );
    _shape_textBox3_78.setSize( 170, 170 );
    _shape_textBox3_78.setFontColor( new Color( 0 ) );
    _shape_textBox3_78.setText( "Вспомогательные переменные" );

    add( _object_GSM );
    _object_GSM.setShapeName( "_object_GSM" );
    _object_GSM.setPos( -140, 10 );
    _object_GSM.setSize( 400, 440 );
    _object_GSM.setName( "GSM" );
    _object_GSM.setNameOffset( 10, 10 );

    add( _shape_portIn );
    _shape_portIn.setShapeName( "_shape_portIn" );
    _shape_portIn.setPos( -140, 230 );
    _shape_portIn.setFillColor( new Color( 16777215 ) );

    add( _shape_portOut );
    _shape_portOut.setShapeName( "_shape_portOut" );
    _shape_portOut.setPos( 260, 230 );
    _shape_portOut.setFillColor( new Color( 16777215 ) );

    add( _shape_GSM );
    _shape_GSM.setShapeName( "_shape_GSM" );
    _shape_GSM.setPos( 60, 30 );
    _shape_GSM.setName( "GSM" );
    _shape_GSM.setNameOffset( 10, 0 );

    add( _shape_kolEndGSM );
    _shape_kolEndGSM.setShapeName( "_shape_kolEndGSM" );
    _shape_kolEndGSM.setPos( -100, 290 );
    _shape_kolEndGSM.setFillColor( new Color( 10526975 ) );
    _shape_kolEndGSM.setStateVariable( true );
    _shape_kolEndGSM.setName( "kolEndGSM" );
    _shape_kolEndGSM.setNameOffset( 10, 0 );

    add( _shape_timeWaitAccess );
    _shape_timeWaitAccess.setShapeName( "_shape_timeWaitAccess" );
    _shape_timeWaitAccess.setPos( -100, 160 );
    _shape_timeWaitAccess.setFillColor( new Color( 10526975 ) );
    _shape_timeWaitAccess.setStateVariable( true );
    _shape_timeWaitAccess.setName( "timeWaitAccess" );
    _shape_timeWaitAccess.setNameOffset( 10, 0 );

    add( _shape_kolBlok );
    _shape_kolBlok.setShapeName( "_shape_kolBlok" );
    _shape_kolBlok.setPos( -10, 290 );
    _shape_kolBlok.setFillColor( new Color( 10526975 ) );
    _shape_kolBlok.setStateVariable( true );
    _shape_kolBlok.setName( "kolBlok" );
    _shape_kolBlok.setNameOffset( 10, 0 );

    add( _shape_statusBER );
    _shape_statusBER.setShapeName( "_shape_statusBER" );
    _shape_statusBER.setPos( 90, 110 );
    _shape_statusBER.setFillColor( new Color( 10526975 ) );
    _shape_statusBER.setStateVariable( true );
    _shape_statusBER.setName( "statusBER" );
    _shape_statusBER.setNameOffset( 10, 0 );

    add( _shape_statusCalling );
    _shape_statusCalling.setShapeName( "_shape_statusCalling" );
    _shape_statusCalling.setPos( -100, 130 );
    _shape_statusCalling.setFillColor( new Color( 10526975 ) );
    _shape_statusCalling.setStateVariable( true );
    _shape_statusCalling.setName( "statusCalling" );
    _shape_statusCalling.setNameOffset( 10, 0 );

    add( _shape_currentCounter );
    _shape_currentCounter.setShapeName( "_shape_currentCounter" );
    _shape_currentCounter.setPos( 90, 190 );
    _shape_currentCounter.setFillColor( new Color( 10526975 ) );
    _shape_currentCounter.setStateVariable( true );
    _shape_currentCounter.setName( "currentCounter" );
    _shape_currentCounter.setNameOffset( 10, 0 );

    add( _shape_transferData );
    _shape_transferData.setShapeName( "_shape_transferData" );
    _shape_transferData.setPos( 90, 130 );
    _shape_transferData.setFillColor( new Color( 10526975 ) );
    _shape_transferData.setStateVariable( true );
    _shape_transferData.setName( "transferData" );
    _shape_transferData.setNameOffset( 10, 0 );

    add( _shape_ID );
    _shape_ID.setShapeName( "_shape_ID" );
    _shape_ID.setPos( -20, 90 );
    _shape_ID.setFillColor( new Color( 10526975 ) );
    _shape_ID.setStateVariable( true );
    _shape_ID.setName( "ID" );
    _shape_ID.setNameOffset( 10, 0 );

    add( _shape_SNR );
    _shape_SNR.setShapeName( "_shape_SNR" );
    _shape_SNR.setPos( 140, 420 );
    _shape_SNR.setFillColor( new Color( 10526975 ) );
    _shape_SNR.setStateVariable( true );
    _shape_SNR.setName( "SNR" );
    _shape_SNR.setNameOffset( 10, 0 );

    add( _shape_BER );
    _shape_BER.setShapeName( "_shape_BER" );
    _shape_BER.setPos( 80, 270 );
    _shape_BER.setFillColor( new Color( 10526975 ) );
    _shape_BER.setStateVariable( true );
    _shape_BER.setName( "BER" );
    _shape_BER.setNameOffset( 10, 0 );

    add( _shape_timeService );
    _shape_timeService.setShapeName( "_shape_timeService" );
    _shape_timeService.setPos( -100, 310 );
    _shape_timeService.setFillColor( new Color( 10526975 ) );
    _shape_timeService.setStateVariable( true );
    _shape_timeService.setName( "timeService" );
    _shape_timeService.setNameOffset( 10, 0 );

    add( _shape_timeWaitCalling );
    _shape_timeWaitCalling.setShapeName( "_shape_timeWaitCalling" );
    _shape_timeWaitCalling.setPos( -100, 180 );
    _shape_timeWaitCalling.setFillColor( new Color( 10526975 ) );
    _shape_timeWaitCalling.setStateVariable( true );
    _shape_timeWaitCalling.setName( "timeWaitCalling" );
    _shape_timeWaitCalling.setNameOffset( 10, 0 );

    add( _shape_bitrate );
    _shape_bitrate.setShapeName( "_shape_bitrate" );
    _shape_bitrate.setPos( -100, 110 );
    _shape_bitrate.setFillColor( new Color( 10526975 ) );
    _shape_bitrate.setStateVariable( true );
    _shape_bitrate.setName( "bitrate" );
    _shape_bitrate.setNameOffset( 10, 0 );

    add( _shape_timeOutFromSET );
    _shape_timeOutFromSET.setShapeName( "_shape_timeOutFromSET" );
    _shape_timeOutFromSET.setPos( 90, 150 );
    _shape_timeOutFromSET.setFillColor( new Color( 10526975 ) );
    _shape_timeOutFromSET.setStateVariable( true );
    _shape_timeOutFromSET.setName( "timeOutFromSET" );
    _shape_timeOutFromSET.setNameOffset( 10, 0 );

    add( _shape_timeOutFromMIR );
    _shape_timeOutFromMIR.setShapeName( "_shape_timeOutFromMIR" );
    _shape_timeOutFromMIR.setPos( 90, 170 );
    _shape_timeOutFromMIR.setFillColor( new Color( 10526975 ) );
    _shape_timeOutFromMIR.setStateVariable( true );
    _shape_timeOutFromMIR.setName( "timeOutFromMIR" );
    _shape_timeOutFromMIR.setNameOffset( 10, 0 );

    add( _shape_timeScale );
    _shape_timeScale.setShapeName( "_shape_timeScale" );
    _shape_timeScale.setPos( -100, 90 );
    _shape_timeScale.setFillColor( new Color( 10526975 ) );
    _shape_timeScale.setStateVariable( true );
    _shape_timeScale.setName( "timeScale" );
    _shape_timeScale.setNameOffset( 10, 0 );

    add( _shape_idGSM );
    _shape_idGSM.setShapeName( "_shape_idGSM" );
    _shape_idGSM.setPos( -20, 110 );
    _shape_idGSM.setFillColor( new Color( 10526975 ) );
    _shape_idGSM.setStateVariable( true );
    _shape_idGSM.setName( "idGSM" );
    _shape_idGSM.setNameOffset( 10, 0 );

    add( _shape_endGSM );
    _shape_endGSM.setShapeName( "_shape_endGSM" );
    _shape_endGSM.setPos( -20, 130 );
    _shape_endGSM.setFillColor( new Color( 10526975 ) );
    _shape_endGSM.setStateVariable( true );
    _shape_endGSM.setName( "endGSM" );
    _shape_endGSM.setNameOffset( 10, 0 );

    add( _shape_timeTransferI );
    _shape_timeTransferI.setShapeName( "_shape_timeTransferI" );
    _shape_timeTransferI.setPos( -100, 200 );
    _shape_timeTransferI.setFillColor( new Color( 10526975 ) );
    _shape_timeTransferI.setStateVariable( true );
    _shape_timeTransferI.setName( "timeTransferI" );
    _shape_timeTransferI.setNameOffset( 10, 0 );

    add( _shape_timeTransfer );
    _shape_timeTransfer.setShapeName( "_shape_timeTransfer" );
    _shape_timeTransfer.setPos( -100, 410 );
    _shape_timeTransfer.setFillColor( new Color( 10526975 ) );
    _shape_timeTransfer.setStateVariable( true );
    _shape_timeTransfer.setName( "timeTransfer" );
    _shape_timeTransfer.setNameOffset( 10, 0 );

    add( _shape_timeUstI );
    _shape_timeUstI.setShapeName( "_shape_timeUstI" );
    _shape_timeUstI.setPos( -100, 330 );
    _shape_timeUstI.setFillColor( new Color( 10526975 ) );
    _shape_timeUstI.setStateVariable( true );
    _shape_timeUstI.setName( "timeUstI" );
    _shape_timeUstI.setNameOffset( 10, 0 );

    add( _shape_timeEndI );
    _shape_timeEndI.setShapeName( "_shape_timeEndI" );
    _shape_timeEndI.setPos( -100, 350 );
    _shape_timeEndI.setFillColor( new Color( 10526975 ) );
    _shape_timeEndI.setStateVariable( true );
    _shape_timeEndI.setName( "timeEndI" );
    _shape_timeEndI.setNameOffset( 10, 0 );

    add( _shape_kolRepeat );
    _shape_kolRepeat.setShapeName( "_shape_kolRepeat" );
    _shape_kolRepeat.setPos( -100, 390 );
    _shape_kolRepeat.setFillColor( new Color( 10526975 ) );
    _shape_kolRepeat.setStateVariable( true );
    _shape_kolRepeat.setName( "kolRepeat" );
    _shape_kolRepeat.setNameOffset( 10, 0 );

    add( _shape_kolNeudach );
    _shape_kolNeudach.setShapeName( "_shape_kolNeudach" );
    _shape_kolNeudach.setPos( -100, 370 );
    _shape_kolNeudach.setFillColor( new Color( 10526975 ) );
    _shape_kolNeudach.setStateVariable( true );
    _shape_kolNeudach.setName( "kolNeudach" );
    _shape_kolNeudach.setNameOffset( 10, 0 );

    add( _shape_Ht );
    _shape_Ht.setShapeName( "_shape_Ht" );
    _shape_Ht.setPos( 130, 270 );
    _shape_Ht.setFillColor( new Color( 10526975 ) );
    _shape_Ht.setStateVariable( true );
    _shape_Ht.setName( "Ht" );
    _shape_Ht.setNameOffset( 10, 0 );

    add( _shape_Hr );
    _shape_Hr.setShapeName( "_shape_Hr" );
    _shape_Hr.setPos( 170, 270 );
    _shape_Hr.setFillColor( new Color( 10526975 ) );
    _shape_Hr.setStateVariable( true );
    _shape_Hr.setName( "Hr" );
    _shape_Hr.setNameOffset( 10, 0 );

    add( _shape_powerBS );
    _shape_powerBS.setShapeName( "_shape_powerBS" );
    _shape_powerBS.setPos( 80, 290 );
    _shape_powerBS.setFillColor( new Color( 10526975 ) );
    _shape_powerBS.setStateVariable( true );
    _shape_powerBS.setName( "powerBS" );
    _shape_powerBS.setNameOffset( 10, 0 );

    add( _shape_gainBS );
    _shape_gainBS.setShapeName( "_shape_gainBS" );
    _shape_gainBS.setPos( 80, 310 );
    _shape_gainBS.setFillColor( new Color( 10526975 ) );
    _shape_gainBS.setStateVariable( true );
    _shape_gainBS.setName( "gainBS" );
    _shape_gainBS.setNameOffset( 10, 0 );

    add( _shape_gainMS );
    _shape_gainMS.setShapeName( "_shape_gainMS" );
    _shape_gainMS.setPos( 80, 330 );
    _shape_gainMS.setFillColor( new Color( 10526975 ) );
    _shape_gainMS.setStateVariable( true );
    _shape_gainMS.setName( "gainMS" );
    _shape_gainMS.setNameOffset( 10, 0 );

    add( _shape_f );
    _shape_f.setShapeName( "_shape_f" );
    _shape_f.setPos( 170, 290 );
    _shape_f.setFillColor( new Color( 10526975 ) );
    _shape_f.setStateVariable( true );
    _shape_f.setName( "f" );
    _shape_f.setNameOffset( 10, 0 );

    add( _shape_distance );
    _shape_distance.setShapeName( "_shape_distance" );
    _shape_distance.setPos( 80, 350 );
    _shape_distance.setFillColor( new Color( 10526975 ) );
    _shape_distance.setStateVariable( true );
    _shape_distance.setName( "distance" );
    _shape_distance.setNameOffset( 10, 0 );

    add( _shape_Lg );
    _shape_Lg.setShapeName( "_shape_Lg" );
    _shape_Lg.setPos( 80, 380 );
    _shape_Lg.setFillColor( new Color( 10526975 ) );
    _shape_Lg.setStateVariable( true );
    _shape_Lg.setName( "Lg" );
    _shape_Lg.setNameOffset( 10, 0 );

    add( _shape_Lpr );
    _shape_Lpr.setShapeName( "_shape_Lpr" );
    _shape_Lpr.setPos( 80, 400 );
    _shape_Lpr.setFillColor( new Color( 10526975 ) );
    _shape_Lpr.setStateVariable( true );
    _shape_Lpr.setName( "Lpr" );
    _shape_Lpr.setNameOffset( 10, 0 );

    add( _shape_Pr );
    _shape_Pr.setShapeName( "_shape_Pr" );
    _shape_Pr.setPos( 140, 380 );
    _shape_Pr.setFillColor( new Color( 10526975 ) );
    _shape_Pr.setStateVariable( true );
    _shape_Pr.setName( "Pr" );
    _shape_Pr.setNameOffset( 10, 0 );

    add( _shape_noise );
    _shape_noise.setShapeName( "_shape_noise" );
    _shape_noise.setPos( 140, 400 );
    _shape_noise.setFillColor( new Color( 10526975 ) );
    _shape_noise.setStateVariable( true );
    _shape_noise.setName( "noise" );
    _shape_noise.setNameOffset( 10, 0 );

    add( _shape_Ls );
    _shape_Ls.setShapeName( "_shape_Ls" );
    _shape_Ls.setPos( 80, 420 );
    _shape_Ls.setFillColor( new Color( 10526975 ) );
    _shape_Ls.setStateVariable( true );
    _shape_Ls.setName( "Ls" );
    _shape_Ls.setNameOffset( 10, 0 );

    add( _shape_help );
    _shape_help.setShapeName( "_shape_help" );
    _shape_help.setPos( 180, 330 );
    _shape_help.setFillColor( new Color( 10526975 ) );
    _shape_help.setStateVariable( true );
    _shape_help.setName( "help" );
    _shape_help.setNameOffset( 10, 0 );

    add( _shape_timeoutALL );
    _shape_timeoutALL.setShapeName( "_shape_timeoutALL" );
    _shape_timeoutALL.setPos( 210, 390 );
    _shape_timeoutALL.setFillColor( new Color( 10526975 ) );
    _shape_timeoutALL.setStateVariable( true );
    _shape_timeoutALL.setName( "timeoutALL" );
    _shape_timeoutALL.setNameOffset( 10, 0 );
  }

  public void init() {
    super.init();
  }

  public void update() {
    super.update();
  }

    public ShapeVar _shape_timeoutALL = new ShapeVar();
    public ShapeVar _shape_help = new ShapeVar();
    public ShapeVar _shape_Ls = new ShapeVar();
    public ShapeVar _shape_noise = new ShapeVar();
    public ShapeVar _shape_Pr = new ShapeVar();
    public ShapeVar _shape_Lpr = new ShapeVar();
    public ShapeVar _shape_Lg = new ShapeVar();
    public ShapeVar _shape_distance = new ShapeVar();
    public ShapeVar _shape_f = new ShapeVar();
    public ShapeVar _shape_gainMS = new ShapeVar();
    public ShapeVar _shape_gainBS = new ShapeVar();
    public ShapeVar _shape_powerBS = new ShapeVar();
    public ShapeVar _shape_Hr = new ShapeVar();
    public ShapeVar _shape_Ht = new ShapeVar();
    public ShapeVar _shape_kolNeudach = new ShapeVar();
    public ShapeVar _shape_kolRepeat = new ShapeVar();
    public ShapeVar _shape_timeEndI = new ShapeVar();
    public ShapeVar _shape_timeUstI = new ShapeVar();
    public ShapeVar _shape_timeTransfer = new ShapeVar();
    public ShapeVar _shape_timeTransferI = new ShapeVar();
    public ShapeVar _shape_endGSM = new ShapeVar();
    public ShapeVar _shape_idGSM = new ShapeVar();
    public ShapeVar _shape_timeScale = new ShapeVar();
    public ShapeVar _shape_timeOutFromMIR = new ShapeVar();
    public ShapeVar _shape_timeOutFromSET = new ShapeVar();
    public ShapeVar _shape_bitrate = new ShapeVar();
    public ShapeVar _shape_timeWaitCalling = new ShapeVar();
    public ShapeVar _shape_timeService = new ShapeVar();
    public ShapeVar _shape_BER = new ShapeVar();
    public ShapeVar _shape_SNR = new ShapeVar();
    public ShapeVar _shape_ID = new ShapeVar();
    public ShapeVar _shape_transferData = new ShapeVar();
    public ShapeVar _shape_currentCounter = new ShapeVar();
    public ShapeVar _shape_statusCalling = new ShapeVar();
    public ShapeVar _shape_statusBER = new ShapeVar();
    public ShapeVar _shape_kolBlok = new ShapeVar();
    public ShapeVar _shape_timeWaitAccess = new ShapeVar();
    public ShapeVar _shape_kolEndGSM = new ShapeVar();
    public ShapeStatechart _shape_GSM = new ShapeStatechart();
    public ShapePort _shape_portOut = new ShapePort();
    public ShapePort _shape_portIn = new ShapePort();
    public ShapeBounds _object_GSM = new ShapeBounds();
    public ShapeComment _shape_textBox3_78 = new ShapeComment();
    public ShapeComment _shape_textBox4_63 = new ShapeComment();
    public ShapeComment _shape_textBox_60 = new ShapeComment();
    public ShapeComment _shape_textBox5_29 = new ShapeComment();
    public ShapeComment _shape_textBox1_10 = new ShapeComment();
}

  public _StructureGroup structure = null;
  public Group createStructure() {
    return structure != null ? structure : ( structure = new _StructureGroup() );
  }

// _XJ_SECTION_BEGIN( AO.Code )
Vector VrOprosaGSM = new Vector();
Vector avTimeSET = new Vector();
Vector avTimeMIR = new Vector(); 

Vector vrUst = new Vector();
Vector vrEnd = new Vector();  

boolean connect,disconnect = false;
boolean AllCounter,oprosSET,oprosMIR = false;
boolean repeatFrame,transferOk = false; 

double log10(double x)
{
 double y = (Math.log(x))/(Math.log(10));
 return y;
}
double HataModel()
{
 double Ahr = (1.1*log10(f)-0.7)*Hr-(1.56*log10(f)-0.8);
 Lg = 69.55+26.16*log10(f)-13.82*log10(Ht)-Ahr+(44.9-6.55*log10(Ht))*log10(distance);
 Lpr = Lg-2*((log10(f/28))*(log10(f/28)))-5.4;
 Ls = Lg - 4.78*(log10(f))*(log10(f))+17.33*log10(f)-40.94;
 Pr = powerBS+gainBS-Ls+gainMS;
 noise = DistrUniform.sample(-150,-100);
 SNR=Pr-noise;
 if (SNR<0)
 {BER=0.5;}
 else
 {BER = 1/(2+SNR);}
 return BER;
}

;
// _XJ_SECTION_END
// Class inner statecharts
// Statechart Type_GSM
public Type_GSM GSM;
class Type_GSM extends Statechart {

  public static final short transition4 = 4;
  public static final short transition3 = 5;
  public static final short transition20 = 6;
  public static final short transition14 = 7;
  public static final short transition19 = 8;
  public static final short transition13 = 9;
  public static final short transition11 = 10;
  public static final short transition10 = 11;
  public static final short transition9 = 12;
  public static final short transition2 = 13;
  public static final short transition24 = 14;
  public static final short transition23 = 15;
  public static final short transition22 = 16;
  public static final short transition15 = 17;
  public static final short transition6 = 18;
  public static final short transition1 = 19;
  public static final short transition = 20;
  public static final short О_ида_и__да____ = 21;
  public static final short _____р_п_р_дачи__адра = 22;
  public static final short __р_дача_да____ = 23;
  public static final short О__а__зад_р__а___ради__а_ал_ = 24;
  public static final short Жда_ь = 25;
  public static final short Разр______ди___и_ = 26;
  public static final short Н_удач____д_з___ = 28;
  public static final short У__а___л__и_____ди___и_ = 29;
  public static final short _____ = 30;
  public static final short _р___дура_д_з___а = 31;
  public static final short Начал_ = 32;

  protected Node[] getNodes() { return new Node[]{
    new Node( 111, eInitialMarker, "pointer1", 27, -1, 21 ),
    new Node( 4, eInitialMarker, "pointer", -1, -1, 32 ),
    new Node( 99, eDynamicChoice, "branch", 27 ),
    new Node( 79, eDynamicChoice, "branch5", -1 ),
    new Node( 124, eTransition, "transition4", -1, 27, 30 ),
    new Node( 122, eTransition, "transition3", 27, 21, 24 ),
    new Node( 116, eTransition, "transition20", -1, 25, 3 ),
    new Node( 114, eTransition, "transition14", -1, 26, 30 ),
    new Node( 112, eTransition, "transition19", -1, 27, 26 ),
    new Node( 108, eTransition, "transition13", 27, 22, 21 ),
    new Node( 105, eTransition, "transition11", 27, 2, 21 ),
    new Node( 100, eTransition, "transition10", 27, 2, 22 ),
    new Node( 98, eTransition, "transition9", 27, 23, 2 ),
    new Node( 87, eTransition, "transition2", 27, 24, 23 ),
    new Node( 84, eTransition, "transition24", -1, 29, 27 ),
    new Node( 83, eTransition, "transition23", -1, 28, 25 ),
    new Node( 82, eTransition, "transition22", -1, 3, 28 ),
    new Node( 49, eTransition, "transition15", -1, 30, 32 ),
    new Node( 27, eTransition, "transition6", -1, 3, 29 ),
    new Node( 21, eTransition, "transition1", -1, 31, 3 ),
    new Node( 6, eTransition, "transition", -1, 32, 31 ),
    new Node( 106, eState, "Ожидание данных", 27 ),
    new Node( 102, eState, "Повтор передачи кадра", 27 ),
    new Node( 86, eState, "Передача данных", 27 ),
    new Node( 85, eState, "Общая задержка в радиоканале", 27 ),
    new Node( 115, eState, "Ждать", -1 ),
    new Node( 113, eState, "Разрыв соединения", -1 ),
    new Node( 110, eState, "", -1 ),
    new Node( 81, eState, "Неудачный дозвон", -1 ),
    new Node( 80, eState, "Установление соединения", -1 ),
    new Node( 47, eState, "Конец", -1 ),
    new Node( 7, eState, "Процедура дозвона", -1 ),
    new Node( 2, eState, "Начало", -1 ),
  }; }
  protected void calculate( int node, int codeType ) {
    switch ( node ) {
// Branch State: branch
      case 2: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.99.Action )
BER=HataModel();
if (BER<=0)
{statusBER=false;}
else
{statusBER=randomTrue(BER);}
if (statusBER)
{repeatFrame=true;}
else if (statusBER==false)
{transferOk=true;}
;
// _XJ_SECTION_END
          } break;
      } break;
// Branch State: branch5
      case 3: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.79.Action )
if (randomTrue(parVerUstGSM/100))
{connect=true;}
else
{disconnect=true;}
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition4
      case 4: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent( 
// _XJ_SECTION_BEGIN( SC.GSM.124.Trigger )
"stopGSM"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition3
      case 5: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent( 
// _XJ_SECTION_BEGIN( SC.GSM.122.Trigger )
"sendData"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition19
      case 8: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent( 
// _XJ_SECTION_BEGIN( SC.GSM.112.Trigger )
"callEND"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition13
      case 9: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.108.Action )
model m = (model)getOwner();

for(int i=0;i<(m.parKolMasGSM.size()/2);i++)
{
 if (ID==i)
   {
    if (currentCounter==1)
       {
         if (timeTransferI>=20)
           {
           m.sETGSM.item(i).openCloseChannel = false;
           m.sETGSM.item(i).avTimeSETGSM=m.sETGSM.item(i).avTimeSETGSM+timeTransferI;
           m.sETGSM.item(i).oprosAlgoritm.fireEvent("receiveData");
           m.gSM.item(i).timeTransferI=0;
           }
         else 
           {
           m.sETGSM.item(i).avTimeSETGSM=m.sETGSM.item(i).avTimeSETGSM+timeTransferI;
           m.sETGSM.item(i).oprosAlgoritm.fireEvent("receiveData");
           m.gSM.item(i).timeTransferI=0;
           }

        }
    else if (currentCounter==2)
       {
        m.mIRGSM.item(i).oprosAlgoritm.fireEvent("receiveData");
         m.mIRGSM.item(i).avTimeMIRGSM=m.mIRGSM.item(i).avTimeMIRGSM+timeTransferI;
          m.gSM.item(i).timeTransferI=0;
       }
   }
}
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition11
      case 10: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GSM.105.Guard )
transferOk
// _XJ_SECTION_END
          ); break;
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.105.Action )
transferOk=false;
model m = (model)getOwner();

for(int i=0;i<(m.parKolMasGSM.size()/2);i++)
{
 if (ID==i)
   {
    if (currentCounter==1)
       {
              if (timeTransferI>=20)
           {
           m.sETGSM.item(i).openCloseChannel = false;
           m.sETGSM.item(i).oprosAlgoritm.fireEvent("receiveData");
           m.sETGSM.item(i).avTimeSETGSM=m.sETGSM.item(i).avTimeSETGSM+timeTransferI;
           m.gPRS.item(i).timeTransferI=0;
           
           }
         else 
           {
           m.sETGSM.item(i).avTimeSETGSM=m.sETGSM.item(i).avTimeSETGSM+timeTransferI;
           m.sETGSM.item(i).oprosAlgoritm.fireEvent("receiveData");
           m.gSM.item(i).timeTransferI=0;
           }
        }
    else if (currentCounter==2)
       {
        m.mIRGSM.item(i).oprosAlgoritm.fireEvent("receiveData");
        m.mIRGSM.item(i).avTimeMIRGSM=m.mIRGSM.item(i).avTimeMIRGSM+timeTransferI;
          m.gSM.item(i).timeTransferI=0;
       }
   }
}
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition10
      case 11: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GSM.100.Guard )
repeatFrame
// _XJ_SECTION_END
          ); break;
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.100.Action )
repeatFrame=false;
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition22
      case 16: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GSM.82.Guard )
disconnect
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition6
      case 18: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GSM.27.Guard )
connect
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition
      case 20: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent( 
// _XJ_SECTION_BEGIN( SC.GSM.6.Trigger )
"startGSM"
// _XJ_SECTION_END
          ); break;
      } break;
// State: Ожидание данных
      case 21: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.106.EntryAction )
bitrate=9600;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Повтор передачи кадра
      case 22: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.102.EntryAction )

timeTransfer=timeTransfer+((transferData/bitrate)+timeoutALL);
timeTransferI=timeTransferI+((transferData/bitrate)+timeoutALL);
;
// _XJ_SECTION_END
          } break;
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.102.ExitAction )
kolRepeat++;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Передача данных
      case 23: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.86.EntryAction )
timeTransfer=timeTransfer+(transferData/bitrate);
timeTransferI=timeTransferI+(transferData/bitrate);
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Общая задержка в радиоканале
      case 24: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.85.EntryAction )
if (currentCounter==1)
    {
     timeTransfer=timeTransfer+timeOutFromSET;
     timeTransferI=timeTransferI+timeOutFromSET;
    }
else if (currentCounter==2)
    {
     timeTransfer=timeTransfer+timeOutFromMIR;
     timeTransferI=timeTransferI+timeOutFromMIR;
    }
timeoutALL=DistrNormal.sample(0.175,0.825);
timeTransfer=timeTransfer+timeoutALL;
timeTransferI=timeTransferI+timeoutALL;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Ждать
      case 25: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.115.EntryAction )
timeWaitCalling=timeWaitCalling+5;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Разрыв соединения
      case 26: switch ( codeType ) {
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.113.ExitAction )
timeEndI=uniform(1,parVrEndGSM);
timeService=timeService+timeEndI;
//timeTransfer=timeTransfer+timeService;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: 
      case 27: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.110.EntryAction )
endGSM=randomTrue(parVerEndGSM/100);
idGSM = this.getCurrentState();
if (endGSM)
{
 model m = (model)getOwner();
 m.gSM.item(ID).GSM.fireEvent("stopGSM");
 kolEndGSM++;
 if (currentCounter==1)
   {
     m.sETGSM.item(ID).oprosAlgoritm.stop();
     m.sETGSM.item(ID).oprosAlgoritm.startup();
     m.sETGSM.item(ID).closeChannelSET++;  
   }
     else if (currentCounter==2)
   {
     m.mIRGSM.item(ID).oprosAlgoritm.stop();
     m.mIRGSM.item(ID).oprosAlgoritm.startup();
     m.mIRGSM.item(ID).closeChannelMIR++;  
   }
     endGSM=false;
}
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Неудачный дозвон
      case 28: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.81.EntryAction )
kolNeudach++;
;
// _XJ_SECTION_END
          } break;
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.81.ExitAction )
disconnect=false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Установление соединения
      case 29: switch ( codeType ) {
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.80.ExitAction )
statusCalling=true;

model m = (model)getOwner();
for(int i=0;i<(m.parKolMasGSM.size()/2);i++)
{
 if (ID==i)
   {
    if (currentCounter==1)
       {
        m.sETGSM.item(i).oprosAlgoritm.fireEvent("callOK");
       }
    else if (currentCounter==2)
       {
        m.mIRGSM.item(i).oprosAlgoritm.fireEvent("callOK");
       }
   }
}
timeUstI=(uniform(1,parVrUstGSM)+timeWaitCalling);
timeService=timeService+timeUstI;
timeWaitCalling=0;
connect = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Конец
      case 30: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.47.EntryAction )
model.kolFinishGSM++;
if (model.kolFinishGSM==(model.parKolMasGSM.size())/2)
{model.finishAllGSM=true;}
statusCalling=false;
;
// _XJ_SECTION_END
          } break;
      } break;
    }
  }

} // end of the Type_GSM statechart
}
