// GPRS.java

package aiis;

import java.util.Vector;
import java.util.Hashtable;
import java.awt.Color;
import com.xj.jama.Matrix;
import com.xj.anylogic.*;
import com.xj.anylogic.animation.*;
import com.xj.random.*;


public class GPRS extends ActiveObject
 {

  public static void main( String[] args ) {
    System.out.println( "...started..." );
    try {
      Engine.setRoot( new GPRS() );
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
    return "aiis.GPRS";
  }

  protected void getEquations() {
    addFE( _ref_verBlok, new DoubleFunction() {
      public double value() { return todouble( 
// _XJ_SECTION_BEGIN( AO.Equation.0.verBlok )
modelErlang(kolChannelBS)
// _XJ_SECTION_END
      ); }
      public String toString() { return "verBlok = modelErlang(kolChannelBS)"; }
    }, false, new VariableRef[]{ _ref_kolChannelBS } );
    addFE( _ref_kolMS, new DoubleFunction() {
      public double value() { return todouble( 
// _XJ_SECTION_BEGIN( AO.Equation.37.kolMS )
Math.round(DistrUniform.sample(minMS,maxMS))
// _XJ_SECTION_END
      ); }
      public String toString() { return "kolMS = Math.round(DistrUniform.sample(minMS,maxMS))"; }
    }, false, new VariableRef[]{ _ref_minMS, _ref_maxMS } );
    addFE( _ref_A, new DoubleFunction() {
      public double value() { return todouble( 
// _XJ_SECTION_BEGIN( AO.Equation.91.A )
(kolMS*intZayavok*timeObs)/3600
// _XJ_SECTION_END
      ); }
      public String toString() { return "A = (kolMS*intZayavok*timeObs)/3600"; }
    }, false, new VariableRef[]{ _ref_kolMS, _ref_intZayavok, _ref_timeObs } );
    addFE( _ref_timeObs, new DoubleFunction() {
      public double value() { return todouble( 
// _XJ_SECTION_BEGIN( AO.Equation.128.timeObs )
DistrExponential.sample(180)
// _XJ_SECTION_END
      ); }
      public String toString() { return "timeObs = DistrExponential.sample(180)"; }
    }, false, null );
    addFE( _ref_intZayavok, new DoubleFunction() {
      public double value() { return todouble( 
// _XJ_SECTION_BEGIN( AO.Equation.168.intZayavok )
DistrPoisson.sample(3)
// _XJ_SECTION_END
      ); }
      public String toString() { return "intZayavok = DistrPoisson.sample(3)"; }
    }, false, null );
  }

  public void create() {
    _ref_minMS.setup( this, "minMS", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.minMS )
    minMS = 1
;
// _XJ_SECTION_END
    _ref_maxMS.setup( this, "maxMS", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.maxMS )
    maxMS = 1
;
// _XJ_SECTION_END
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
    _ref_SNR.setup( this, "SNR", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.SNR )
    SNR = 0
;
// _XJ_SECTION_END
    _ref_timeTransferI.setup( this, "timeTransferI", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeTransferI )
    timeTransferI = 0
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
    _ref_verRepeat.setup( this, "verRepeat", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.verRepeat )
    verRepeat = 0
;
// _XJ_SECTION_END
    _ref_kolSlotDOWN.setup( this, "kolSlotDOWN", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.kolSlotDOWN )
    kolSlotDOWN = 0
;
// _XJ_SECTION_END
    _ref_transferCondition.setup( this, "transferCondition", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.transferCondition )
    transferCondition = 0
;
// _XJ_SECTION_END
    _ref_currentTimeOpros.setup( this, "currentTimeOpros", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.currentTimeOpros )
    currentTimeOpros = 0
;
// _XJ_SECTION_END
    _ref_currentCounter.setup( this, "currentCounter", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.currentCounter )
    currentCounter = 0
;
// _XJ_SECTION_END
    _ref_timeWait.setup( this, "timeWait", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeWait )
    timeWait = 0
;
// _XJ_SECTION_END
    _ref_bitrate.setup( this, "bitrate", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.bitrate )
    bitrate = 0
;
// _XJ_SECTION_END
    _ref_kolData.setup( this, "kolData", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.kolData )
    kolData = 0
;
// _XJ_SECTION_END
    _ref_kolRepeat.setup( this, "kolRepeat", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.kolRepeat )
    kolRepeat = 0
;
// _XJ_SECTION_END
    _ref_bitrateForSlot.setup( this, "bitrateForSlot", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.bitrateForSlot )
    bitrateForSlot = 9600
;
// _XJ_SECTION_END
    _ref_transferData.setup( this, "transferData", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.transferData )
    transferData = 0
;
// _XJ_SECTION_END
    _ref_kolSlotUP.setup( this, "kolSlotUP", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.kolSlotUP )
    kolSlotUP = 0
;
// _XJ_SECTION_END
    _ref_kolBlok.setup( this, "kolBlok", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.kolBlok )
    kolBlok = 0
;
// _XJ_SECTION_END
    _ref_currentVer.setup( this, "currentVer", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.currentVer )
    currentVer = 0
;
// _XJ_SECTION_END
    _ref_verBlok.setup( this, "verBlok", true );
    _ref_kolChannelBS.setup( this, "kolChannelBS", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.kolChannelBS )
    kolChannelBS = 0
;
// _XJ_SECTION_END
    _ref_kolMS.setup( this, "kolMS", true );
    _ref_A.setup( this, "A", true );
    _ref_timeObs.setup( this, "timeObs", true );
    _ref_intZayavok.setup( this, "intZayavok", true );
    _ref_statusFER.setup( this, "statusFER", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.statusFER )
    statusFER = false
;
// _XJ_SECTION_END
    _ref_ID.setup( this, "ID", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.ID )
    ID = 0
;
// _XJ_SECTION_END
    GPRS = new Type_GPRS();
    portOut = new Port();
    portOut.setup( "portOut", this );
    portIn = new Port();
    portIn.setup( "portIn", this );
  }

  public void destroy() {
    GPRS = null;
    portOut = null;
    portIn = null;
    super.destroy();
  }

  protected void startup() {
    startThread( GPRS, "GPRS" );
  }

  public static class _Type_lookupTable_CS1 extends LookupTable { 
    public _Type_lookupTable_CS1() {
      super( 
    "CS1",    LookupTable.LINEAR,
    LookupTable.USE_NEAREST, 0.0,
    new double[]{ 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 22 },
    new double[]{ 0.5, 0.5, 0.3, 0.15, 0.04, 0.015, 0.004, 0.001, 0.0005, 0.00001, 0.000005, 0.0000001, 0.0000001 } );
    }
  }
  public static _Type_lookupTable_CS1 CS1 = new _Type_lookupTable_CS1();
  public static double CS1( double x ) {
    return CS1.lookup( x );
  }
  public static Matrix CS1( Matrix x ) {
    return CS1.lookup( x );
  }
  public static HyperArray CS1( HyperArray x ) {
    return CS1.lookup( x );
  }
  public static class _Type_lookupTable_CS1throughput extends LookupTable { 
    public _Type_lookupTable_CS1throughput() {
      super( 
    "CS1throughput",    LookupTable.LINEAR,
    LookupTable.USE_NEAREST, 0.0,
    new double[]{ 0, 0, 3, 7, 11, 15, 19, 23, 27, 27 },
    new double[]{ 100, 100, 3000, 6500, 8400, 9000, 9050, 9050, 9050, 9050 } );
    }
  }
  public static _Type_lookupTable_CS1throughput CS1throughput = new _Type_lookupTable_CS1throughput();
  public static double CS1throughput( double x ) {
    return CS1throughput.lookup( x );
  }
  public static Matrix CS1throughput( Matrix x ) {
    return CS1throughput.lookup( x );
  }
  public static HyperArray CS1throughput( HyperArray x ) {
    return CS1throughput.lookup( x );
  }
  public static class _Type_lookupTable_CS2 extends LookupTable { 
    public _Type_lookupTable_CS2() {
      super( 
    "CS2",    LookupTable.LINEAR,
    LookupTable.USE_NEAREST, 0.0,
    new double[]{ 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 22 },
    new double[]{ 0.8, 0.8, 0.65, 0.45, 0.25, 0.12, 0.05, 0.01, 0.0065, 0.0025, 0.00001, 0.000005, 0.000005 } );
    }
  }
  public static _Type_lookupTable_CS2 CS2 = new _Type_lookupTable_CS2();
  public static double CS2( double x ) {
    return CS2.lookup( x );
  }
  public static Matrix CS2( Matrix x ) {
    return CS2.lookup( x );
  }
  public static HyperArray CS2( HyperArray x ) {
    return CS2.lookup( x );
  }
  public static class _Type_lookupTable_CS2throughput extends LookupTable { 
    public _Type_lookupTable_CS2throughput() {
      super( 
    "CS2throughput",    LookupTable.LINEAR,
    LookupTable.USE_NEAREST, 0.0,
    new double[]{ 0, 0, 3, 7, 11, 15, 19, 23, 27, 27 },
    new double[]{ 100, 100, 2000, 6700, 11000, 12800, 13400, 13400, 13400, 13400 } );
    }
  }
  public static _Type_lookupTable_CS2throughput CS2throughput = new _Type_lookupTable_CS2throughput();
  public static double CS2throughput( double x ) {
    return CS2throughput.lookup( x );
  }
  public static Matrix CS2throughput( Matrix x ) {
    return CS2throughput.lookup( x );
  }
  public static HyperArray CS2throughput( HyperArray x ) {
    return CS2throughput.lookup( x );
  }
  public static class _Type_lookupTable_CS3 extends LookupTable { 
    public _Type_lookupTable_CS3() {
      super( 
    "CS3",    LookupTable.LINEAR,
    LookupTable.USE_NEAREST, 0.0,
    new double[]{ 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 22 },
    new double[]{ 0.9, 0.9, 0.8, 0.65, 0.45, 0.25, 0.13, 0.055, 0.02, 0.006, 0.0015, 0.00001, 0.00001 } );
    }
  }
  public static _Type_lookupTable_CS3 CS3 = new _Type_lookupTable_CS3();
  public static double CS3( double x ) {
    return CS3.lookup( x );
  }
  public static Matrix CS3( Matrix x ) {
    return CS3.lookup( x );
  }
  public static HyperArray CS3( HyperArray x ) {
    return CS3.lookup( x );
  }
  public static class _Type_lookupTable_CS3throughput extends LookupTable { 
    public _Type_lookupTable_CS3throughput() {
      super( 
    "CS3throughput",    LookupTable.LINEAR,
    LookupTable.USE_NEAREST, 0.0,
    new double[]{ 0, 0, 3, 7, 11, 15, 19, 23, 27, 27 },
    new double[]{ 100, 100, 1000, 4000, 10000, 13800, 15100, 15600, 15600, 15600 } );
    }
  }
  public static _Type_lookupTable_CS3throughput CS3throughput = new _Type_lookupTable_CS3throughput();
  public static double CS3throughput( double x ) {
    return CS3throughput.lookup( x );
  }
  public static Matrix CS3throughput( Matrix x ) {
    return CS3throughput.lookup( x );
  }
  public static HyperArray CS3throughput( HyperArray x ) {
    return CS3throughput.lookup( x );
  }
  public static class _Type_lookupTable_CS4 extends LookupTable { 
    public _Type_lookupTable_CS4() {
      super( 
    "CS4",    LookupTable.LINEAR,
    LookupTable.USE_NEAREST, 0.0,
    new double[]{ 0, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 22 },
    new double[]{ 1, 1, 1, 0.99, 0.98, 0.9, 0.8, 0.65, 0.5, 0.35, 0.22, 0.14, 0.08, 0.08 } );
    }
  }
  public static _Type_lookupTable_CS4 CS4 = new _Type_lookupTable_CS4();
  public static double CS4( double x ) {
    return CS4.lookup( x );
  }
  public static Matrix CS4( Matrix x ) {
    return CS4.lookup( x );
  }
  public static HyperArray CS4( HyperArray x ) {
    return CS4.lookup( x );
  }
  public static class _Type_lookupTable_CS4throughput extends LookupTable { 
    public _Type_lookupTable_CS4throughput() {
      super( 
    "CS4throughput",    LookupTable.LINEAR,
    LookupTable.USE_NEAREST, 0.0,
    new double[]{ 0, 0, 3, 7, 11, 15, 19, 23, 27, 27 },
    new double[]{ 100, 100, 500, 1500, 5800, 11000, 15500, 18000, 19000, 19000 } );
    }
  }
  public static _Type_lookupTable_CS4throughput CS4throughput = new _Type_lookupTable_CS4throughput();
  public static double CS4throughput( double x ) {
    return CS4throughput.lookup( x );
  }
  public static Matrix CS4throughput( Matrix x ) {
    return CS4throughput.lookup( x );
  }
  public static HyperArray CS4throughput( HyperArray x ) {
    return CS4throughput.lookup( x );
  }

  // Class parameters
  public static void set_timeWave( 
// _XJ_SECTION_BEGIN( AO.ParameterType.0 )
double
// _XJ_SECTION_END
      _value ) {
    timeWave = _value;
  }

  public static double get_timeWave() {
    return timeWave;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.0 )
double
// _XJ_SECTION_END
 timeWave = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.0 )
0.002
// _XJ_SECTION_END
;
  public static void set_maxKolSlotUP( 
// _XJ_SECTION_BEGIN( AO.ParameterType.1 )
double
// _XJ_SECTION_END
      _value ) {
    maxKolSlotUP = _value;
  }

  public static double get_maxKolSlotUP() {
    return maxKolSlotUP;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.1 )
double
// _XJ_SECTION_END
 maxKolSlotUP = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.1 )
0
// _XJ_SECTION_END
;
  public static void set_typeCS( 
// _XJ_SECTION_BEGIN( AO.ParameterType.2 )
int
// _XJ_SECTION_END
      _value ) {
    typeCS = _value;
  }

  public static int get_typeCS() {
    return typeCS;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.2 )
int
// _XJ_SECTION_END
 typeCS = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.2 )
0
// _XJ_SECTION_END
;
  public static void set_maxKolSlotDOWN( 
// _XJ_SECTION_BEGIN( AO.ParameterType.3 )
double
// _XJ_SECTION_END
      _value ) {
    maxKolSlotDOWN = _value;
  }

  public static double get_maxKolSlotDOWN() {
    return maxKolSlotDOWN;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.3 )
double
// _XJ_SECTION_END
 maxKolSlotDOWN = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.3 )
0
// _XJ_SECTION_END
;

  public void setParams( double timeWave, double maxKolSlotUP, int typeCS, double maxKolSlotDOWN ) {
    set_timeWave( timeWave );
    set_maxKolSlotUP( maxKolSlotUP );
    set_typeCS( typeCS );
    set_maxKolSlotDOWN( maxKolSlotDOWN );
  }

  // Structure objects
public double minMS;
  public VariableRefDouble _ref_minMS = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { minMS = (double)_value; }
    public double getDoubleValue() { return (double)minMS; } };
public double maxMS;
  public VariableRefDouble _ref_maxMS = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { maxMS = (double)_value; }
    public double getDoubleValue() { return (double)maxMS; } };
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
public double SNR;
  public VariableRefDouble _ref_SNR = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { SNR = (double)_value; }
    public double getDoubleValue() { return (double)SNR; } };
public double timeTransferI;
  public VariableRefDouble _ref_timeTransferI = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeTransferI = (double)_value; }
    public double getDoubleValue() { return (double)timeTransferI; } };
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
public double verRepeat;
  public VariableRefDouble _ref_verRepeat = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { verRepeat = (double)_value; }
    public double getDoubleValue() { return (double)verRepeat; } };
public int kolSlotDOWN;
  public VariableRefDouble _ref_kolSlotDOWN = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { kolSlotDOWN = (int)_value; }
    public double getDoubleValue() { return (double)kolSlotDOWN; } };
public int transferCondition;
  public VariableRefDouble _ref_transferCondition = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { transferCondition = (int)_value; }
    public double getDoubleValue() { return (double)transferCondition; } };
public double currentTimeOpros;
  public VariableRefDouble _ref_currentTimeOpros = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { currentTimeOpros = (double)_value; }
    public double getDoubleValue() { return (double)currentTimeOpros; } };
public int currentCounter;
  public VariableRefDouble _ref_currentCounter = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { currentCounter = (int)_value; }
    public double getDoubleValue() { return (double)currentCounter; } };
public double timeWait;
  public VariableRefDouble _ref_timeWait = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeWait = (double)_value; }
    public double getDoubleValue() { return (double)timeWait; } };
public double bitrate;
  public VariableRefDouble _ref_bitrate = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { bitrate = (double)_value; }
    public double getDoubleValue() { return (double)bitrate; } };
public double kolData;
  public VariableRefDouble _ref_kolData = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { kolData = (double)_value; }
    public double getDoubleValue() { return (double)kolData; } };
public int kolRepeat;
  public VariableRefDouble _ref_kolRepeat = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { kolRepeat = (int)_value; }
    public double getDoubleValue() { return (double)kolRepeat; } };
public double bitrateForSlot;
  public VariableRefDouble _ref_bitrateForSlot = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { bitrateForSlot = (double)_value; }
    public double getDoubleValue() { return (double)bitrateForSlot; } };
public double transferData;
  public VariableRefDouble _ref_transferData = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { transferData = (double)_value; }
    public double getDoubleValue() { return (double)transferData; } };
public int kolSlotUP;
  public VariableRefDouble _ref_kolSlotUP = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { kolSlotUP = (int)_value; }
    public double getDoubleValue() { return (double)kolSlotUP; } };
public int kolBlok;
  public VariableRefDouble _ref_kolBlok = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { kolBlok = (int)_value; }
    public double getDoubleValue() { return (double)kolBlok; } };
public double currentVer;
  public VariableRefDouble _ref_currentVer = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { currentVer = (double)_value; }
    public double getDoubleValue() { return (double)currentVer; } };
public double verBlok;
  public VariableRefDouble _ref_verBlok = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { verBlok = (double)_value; }
    public double getDoubleValue() { return (double)verBlok; } };
public double kolChannelBS;
  public VariableRefDouble _ref_kolChannelBS = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { kolChannelBS = (double)_value; }
    public double getDoubleValue() { return (double)kolChannelBS; } };
public double kolMS;
  public VariableRefDouble _ref_kolMS = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { kolMS = (double)_value; }
    public double getDoubleValue() { return (double)kolMS; } };
public double A;
  public VariableRefDouble _ref_A = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { A = (double)_value; }
    public double getDoubleValue() { return (double)A; } };
public double timeObs;
  public VariableRefDouble _ref_timeObs = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeObs = (double)_value; }
    public double getDoubleValue() { return (double)timeObs; } };
public double intZayavok;
  public VariableRefDouble _ref_intZayavok = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { intZayavok = (double)_value; }
    public double getDoubleValue() { return (double)intZayavok; } };
public boolean statusFER;
  public VariableRefDouble _ref_statusFER = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { statusFER = _value != 0 ? true : false; }
    public double getDoubleValue() { return statusFER ? 1.0 : 0.0; } };
public int ID;
  public VariableRefDouble _ref_ID = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { ID = (int)_value; }
    public double getDoubleValue() { return (double)ID; } };
  public Port portOut;
  public Port portIn;

// Group class for group _IconGroup
public class _IconGroup extends Group {

  public void setup() {
    setActiveObject( GPRS.this );
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
    _shape_text.setPos( -18, -9 );
    _shape_text.setFillColor( new Color( 0 ) );
    _shape_text.setLineWidth( 0 );
    _shape_text.setLineColor( null );
    _shape_text.setText( "GPRS" );
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
    setActiveObject( GPRS.this );
    super.setup();
    setSize( 1066, 502 );
    setOrigin( -16, -1 );

    add( _shape_textBox2_10 );
    _shape_textBox2_10.setShapeName( "_shape_textBox2_10" );
    _shape_textBox2_10.setPos( 480, 10 );
    _shape_textBox2_10.setFillColor( new Color( 16777152 ) );
    _shape_textBox2_10.setSize( 570, 300 );
    _shape_textBox2_10.setFontColor( new Color( 0 ) );
    _shape_textBox2_10.setText( "Общая задержка в канале GSM при распространении в прямом и обратном направлениях, вызванная обработкой сигнала, кодированием/декодированием речи, канальным кодированием и т.д., составляет около 180 мс." );

    add( _shape_textBox_20 );
    _shape_textBox_20.setShapeName( "_shape_textBox_20" );
    _shape_textBox_20.setPos( 10, 180 );
    _shape_textBox_20.setFillColor( new Color( 16777152 ) );
    _shape_textBox_20.setSize( 220, 120 );
    _shape_textBox_20.setFontColor( new Color( 0 ) );
    _shape_textBox_20.setText( "Модель Эрланга-вероятность блокировки\n" );

    add( _shape_textBox1_25 );
    _shape_textBox1_25.setShapeName( "_shape_textBox1_25" );
    _shape_textBox1_25.setPos( 240, 260 );
    _shape_textBox1_25.setFillColor( new Color( 16777152 ) );
    _shape_textBox1_25.setSize( 140, 230 );
    _shape_textBox1_25.setFontColor( new Color( 0 ) );
    _shape_textBox1_25.setText( "Собираемая статистика\n\n" );

    add( _shape_textBox4_48 );
    _shape_textBox4_48.setShapeName( "_shape_textBox4_48" );
    _shape_textBox4_48.setPos( 10, 40 );
    _shape_textBox4_48.setFillColor( new Color( 16777152 ) );
    _shape_textBox4_48.setSize( 220, 130 );
    _shape_textBox4_48.setFontColor( new Color( 0 ) );
    _shape_textBox4_48.setText( "Вспомогательные переменные" );

    add( _shape_textBox5_49 );
    _shape_textBox5_49.setShapeName( "_shape_textBox5_49" );
    _shape_textBox5_49.setPos( 240, 40 );
    _shape_textBox5_49.setFillColor( new Color( 16777152 ) );
    _shape_textBox5_49.setSize( 140, 200 );
    _shape_textBox5_49.setFontColor( new Color( 0 ) );
    _shape_textBox5_49.setText( "Системные переменные" );

    add( _shape_textBox6_64 );
    _shape_textBox6_64.setShapeName( "_shape_textBox6_64" );
    _shape_textBox6_64.setPos( 10, 310 );
    _shape_textBox6_64.setFillColor( new Color( 16777152 ) );
    _shape_textBox6_64.setSize( 220, 180 );
    _shape_textBox6_64.setFontColor( new Color( 0 ) );
    _shape_textBox6_64.setText( "Модель Хаты-распр. сигнала" );

    add( _object_GPRS );
    _object_GPRS.setShapeName( "_object_GPRS" );
    _object_GPRS.setPos( -10, 0 );
    _object_GPRS.setSize( 410, 500 );
    _object_GPRS.setName( "GPRS" );
    _object_GPRS.setNameOffset( 10, 10 );

    add( _shape_portIn );
    _shape_portIn.setShapeName( "_shape_portIn" );
    _shape_portIn.setPos( -10, 250 );
    _shape_portIn.setFillColor( new Color( 16777215 ) );

    add( _shape_portOut );
    _shape_portOut.setShapeName( "_shape_portOut" );
    _shape_portOut.setPos( 400, 250 );
    _shape_portOut.setFillColor( new Color( 16777215 ) );

    add( _shape_GPRS );
    _shape_GPRS.setShapeName( "_shape_GPRS" );
    _shape_GPRS.setPos( 180, 20 );
    _shape_GPRS.setName( "GPRS" );
    _shape_GPRS.setNameOffset( 10, 0 );

    add( _shape_ID );
    _shape_ID.setShapeName( "_shape_ID" );
    _shape_ID.setPos( 260, 90 );
    _shape_ID.setFillColor( new Color( 10526975 ) );
    _shape_ID.setStateVariable( true );
    _shape_ID.setName( "ID" );
    _shape_ID.setNameOffset( 10, 0 );

    add( _shape_statusFER );
    _shape_statusFER.setShapeName( "_shape_statusFER" );
    _shape_statusFER.setPos( 30, 100 );
    _shape_statusFER.setFillColor( new Color( 10526975 ) );
    _shape_statusFER.setStateVariable( true );
    _shape_statusFER.setName( "statusFER" );
    _shape_statusFER.setNameOffset( 10, 0 );

    add( _shape_intZayavok );
    _shape_intZayavok.setShapeName( "_shape_intZayavok" );
    _shape_intZayavok.setPos( 120, 230 );
    _shape_intZayavok.setFillColor( new Color( 10526975 ) );
    _shape_intZayavok.setStateVariable( true );
    _shape_intZayavok.setName( "intZayavok" );
    _shape_intZayavok.setNameOffset( 10, 0 );

    add( _shape_timeObs );
    _shape_timeObs.setShapeName( "_shape_timeObs" );
    _shape_timeObs.setPos( 50, 230 );
    _shape_timeObs.setFillColor( new Color( 10526975 ) );
    _shape_timeObs.setStateVariable( true );
    _shape_timeObs.setName( "timeObs" );
    _shape_timeObs.setNameOffset( 10, 0 );

    add( _shape_A );
    _shape_A.setShapeName( "_shape_A" );
    _shape_A.setPos( 50, 250 );
    _shape_A.setFillColor( new Color( 10526975 ) );
    _shape_A.setStateVariable( true );
    _shape_A.setName( "A" );
    _shape_A.setNameOffset( 10, 0 );

    add( _shape_kolMS );
    _shape_kolMS.setShapeName( "_shape_kolMS" );
    _shape_kolMS.setPos( 50, 270 );
    _shape_kolMS.setFillColor( new Color( 10526975 ) );
    _shape_kolMS.setStateVariable( true );
    _shape_kolMS.setName( "kolMS" );
    _shape_kolMS.setNameOffset( 10, 0 );

    add( _shape_kolChannelBS );
    _shape_kolChannelBS.setShapeName( "_shape_kolChannelBS" );
    _shape_kolChannelBS.setPos( 120, 250 );
    _shape_kolChannelBS.setFillColor( new Color( 10526975 ) );
    _shape_kolChannelBS.setStateVariable( true );
    _shape_kolChannelBS.setName( "kolChannelBS" );
    _shape_kolChannelBS.setNameOffset( 10, 0 );

    add( _shape_verBlok );
    _shape_verBlok.setShapeName( "_shape_verBlok" );
    _shape_verBlok.setPos( 120, 270 );
    _shape_verBlok.setFillColor( new Color( 10526975 ) );
    _shape_verBlok.setStateVariable( true );
    _shape_verBlok.setName( "verBlok" );
    _shape_verBlok.setNameOffset( 10, 0 );

    add( _shape_currentVer );
    _shape_currentVer.setShapeName( "_shape_currentVer" );
    _shape_currentVer.setPos( 120, 290 );
    _shape_currentVer.setFillColor( new Color( 10526975 ) );
    _shape_currentVer.setStateVariable( true );
    _shape_currentVer.setName( "currentVer" );
    _shape_currentVer.setNameOffset( 10, 0 );

    add( _shape_kolBlok );
    _shape_kolBlok.setShapeName( "_shape_kolBlok" );
    _shape_kolBlok.setPos( 260, 320 );
    _shape_kolBlok.setFillColor( new Color( 10526975 ) );
    _shape_kolBlok.setStateVariable( true );
    _shape_kolBlok.setName( "kolBlok" );
    _shape_kolBlok.setNameOffset( 10, 0 );

    add( _shape_kolSlotUP );
    _shape_kolSlotUP.setShapeName( "_shape_kolSlotUP" );
    _shape_kolSlotUP.setPos( 260, 150 );
    _shape_kolSlotUP.setFillColor( new Color( 10526975 ) );
    _shape_kolSlotUP.setStateVariable( true );
    _shape_kolSlotUP.setName( "kolSlotUP" );
    _shape_kolSlotUP.setNameOffset( 10, 0 );

    add( _shape_transferData );
    _shape_transferData.setShapeName( "_shape_transferData" );
    _shape_transferData.setPos( 260, 380 );
    _shape_transferData.setFillColor( new Color( 10526975 ) );
    _shape_transferData.setStateVariable( true );
    _shape_transferData.setName( "transferData" );
    _shape_transferData.setNameOffset( 10, 0 );

    add( _shape_bitrateForSlot );
    _shape_bitrateForSlot.setShapeName( "_shape_bitrateForSlot" );
    _shape_bitrateForSlot.setPos( 260, 210 );
    _shape_bitrateForSlot.setFillColor( new Color( 10526975 ) );
    _shape_bitrateForSlot.setStateVariable( true );
    _shape_bitrateForSlot.setName( "bitrateForSlot" );
    _shape_bitrateForSlot.setNameOffset( 10, 0 );

    add( _shape_kolRepeat );
    _shape_kolRepeat.setShapeName( "_shape_kolRepeat" );
    _shape_kolRepeat.setPos( 260, 340 );
    _shape_kolRepeat.setFillColor( new Color( 10526975 ) );
    _shape_kolRepeat.setStateVariable( true );
    _shape_kolRepeat.setName( "kolRepeat" );
    _shape_kolRepeat.setNameOffset( 10, 0 );

    add( _shape_kolData );
    _shape_kolData.setShapeName( "_shape_kolData" );
    _shape_kolData.setPos( 260, 360 );
    _shape_kolData.setFillColor( new Color( 10526975 ) );
    _shape_kolData.setStateVariable( true );
    _shape_kolData.setName( "kolData" );
    _shape_kolData.setNameOffset( 10, 0 );

    add( _shape_bitrate );
    _shape_bitrate.setShapeName( "_shape_bitrate" );
    _shape_bitrate.setPos( 260, 230 );
    _shape_bitrate.setFillColor( new Color( 10526975 ) );
    _shape_bitrate.setStateVariable( true );
    _shape_bitrate.setName( "bitrate" );
    _shape_bitrate.setNameOffset( 10, 0 );

    add( _shape_timeWait );
    _shape_timeWait.setShapeName( "_shape_timeWait" );
    _shape_timeWait.setPos( 260, 400 );
    _shape_timeWait.setFillColor( new Color( 10526975 ) );
    _shape_timeWait.setStateVariable( true );
    _shape_timeWait.setName( "timeWait" );
    _shape_timeWait.setNameOffset( 10, 0 );

    add( _shape_currentCounter );
    _shape_currentCounter.setShapeName( "_shape_currentCounter" );
    _shape_currentCounter.setPos( 30, 80 );
    _shape_currentCounter.setFillColor( new Color( 10526975 ) );
    _shape_currentCounter.setStateVariable( true );
    _shape_currentCounter.setName( "currentCounter" );
    _shape_currentCounter.setNameOffset( 10, 0 );

    add( _shape_currentTimeOpros );
    _shape_currentTimeOpros.setShapeName( "_shape_currentTimeOpros" );
    _shape_currentTimeOpros.setPos( 260, 420 );
    _shape_currentTimeOpros.setFillColor( new Color( 10526975 ) );
    _shape_currentTimeOpros.setStateVariable( true );
    _shape_currentTimeOpros.setName( "currentTimeOpros" );
    _shape_currentTimeOpros.setNameOffset( 10, 0 );

    add( _shape_transferCondition );
    _shape_transferCondition.setShapeName( "_shape_transferCondition" );
    _shape_transferCondition.setPos( 30, 120 );
    _shape_transferCondition.setFillColor( new Color( 10526975 ) );
    _shape_transferCondition.setStateVariable( true );
    _shape_transferCondition.setName( "transferCondition" );
    _shape_transferCondition.setNameOffset( 10, 0 );

    add( _shape_kolSlotDOWN );
    _shape_kolSlotDOWN.setShapeName( "_shape_kolSlotDOWN" );
    _shape_kolSlotDOWN.setPos( 260, 170 );
    _shape_kolSlotDOWN.setFillColor( new Color( 10526975 ) );
    _shape_kolSlotDOWN.setStateVariable( true );
    _shape_kolSlotDOWN.setName( "kolSlotDOWN" );
    _shape_kolSlotDOWN.setNameOffset( 10, 0 );

    add( _shape_verRepeat );
    _shape_verRepeat.setShapeName( "_shape_verRepeat" );
    _shape_verRepeat.setPos( 260, 190 );
    _shape_verRepeat.setFillColor( new Color( 10526975 ) );
    _shape_verRepeat.setStateVariable( true );
    _shape_verRepeat.setName( "verRepeat" );
    _shape_verRepeat.setNameOffset( 10, 0 );

    add( _shape_timeOutFromSET );
    _shape_timeOutFromSET.setShapeName( "_shape_timeOutFromSET" );
    _shape_timeOutFromSET.setPos( 30, 140 );
    _shape_timeOutFromSET.setFillColor( new Color( 10526975 ) );
    _shape_timeOutFromSET.setStateVariable( true );
    _shape_timeOutFromSET.setName( "timeOutFromSET" );
    _shape_timeOutFromSET.setNameOffset( 10, 0 );

    add( _shape_timeOutFromMIR );
    _shape_timeOutFromMIR.setShapeName( "_shape_timeOutFromMIR" );
    _shape_timeOutFromMIR.setPos( 30, 160 );
    _shape_timeOutFromMIR.setFillColor( new Color( 10526975 ) );
    _shape_timeOutFromMIR.setStateVariable( true );
    _shape_timeOutFromMIR.setName( "timeOutFromMIR" );
    _shape_timeOutFromMIR.setNameOffset( 10, 0 );

    add( _shape_timeScale );
    _shape_timeScale.setShapeName( "_shape_timeScale" );
    _shape_timeScale.setPos( 260, 110 );
    _shape_timeScale.setFillColor( new Color( 10526975 ) );
    _shape_timeScale.setStateVariable( true );
    _shape_timeScale.setName( "timeScale" );
    _shape_timeScale.setNameOffset( 10, 0 );

    add( _shape_timeTransferI );
    _shape_timeTransferI.setShapeName( "_shape_timeTransferI" );
    _shape_timeTransferI.setPos( 260, 440 );
    _shape_timeTransferI.setFillColor( new Color( 10526975 ) );
    _shape_timeTransferI.setStateVariable( true );
    _shape_timeTransferI.setName( "timeTransferI" );
    _shape_timeTransferI.setNameOffset( 10, 0 );

    add( _shape_SNR );
    _shape_SNR.setShapeName( "_shape_SNR" );
    _shape_SNR.setPos( 90, 480 );
    _shape_SNR.setFillColor( new Color( 10526975 ) );
    _shape_SNR.setStateVariable( true );
    _shape_SNR.setName( "SNR" );
    _shape_SNR.setNameOffset( 10, 0 );

    add( _shape_Ht );
    _shape_Ht.setShapeName( "_shape_Ht" );
    _shape_Ht.setPos( 30, 350 );
    _shape_Ht.setFillColor( new Color( 10526975 ) );
    _shape_Ht.setStateVariable( true );
    _shape_Ht.setName( "Ht" );
    _shape_Ht.setNameOffset( 10, 0 );

    add( _shape_Hr );
    _shape_Hr.setShapeName( "_shape_Hr" );
    _shape_Hr.setPos( 120, 350 );
    _shape_Hr.setFillColor( new Color( 10526975 ) );
    _shape_Hr.setStateVariable( true );
    _shape_Hr.setName( "Hr" );
    _shape_Hr.setNameOffset( 10, 0 );

    add( _shape_powerBS );
    _shape_powerBS.setShapeName( "_shape_powerBS" );
    _shape_powerBS.setPos( 30, 370 );
    _shape_powerBS.setFillColor( new Color( 10526975 ) );
    _shape_powerBS.setStateVariable( true );
    _shape_powerBS.setName( "powerBS" );
    _shape_powerBS.setNameOffset( 10, 0 );

    add( _shape_gainBS );
    _shape_gainBS.setShapeName( "_shape_gainBS" );
    _shape_gainBS.setPos( 30, 390 );
    _shape_gainBS.setFillColor( new Color( 10526975 ) );
    _shape_gainBS.setStateVariable( true );
    _shape_gainBS.setName( "gainBS" );
    _shape_gainBS.setNameOffset( 10, 0 );

    add( _shape_gainMS );
    _shape_gainMS.setShapeName( "_shape_gainMS" );
    _shape_gainMS.setPos( 30, 410 );
    _shape_gainMS.setFillColor( new Color( 10526975 ) );
    _shape_gainMS.setStateVariable( true );
    _shape_gainMS.setName( "gainMS" );
    _shape_gainMS.setNameOffset( 10, 0 );

    add( _shape_f );
    _shape_f.setShapeName( "_shape_f" );
    _shape_f.setPos( 120, 370 );
    _shape_f.setFillColor( new Color( 10526975 ) );
    _shape_f.setStateVariable( true );
    _shape_f.setName( "f" );
    _shape_f.setNameOffset( 10, 0 );

    add( _shape_distance );
    _shape_distance.setShapeName( "_shape_distance" );
    _shape_distance.setPos( 120, 390 );
    _shape_distance.setFillColor( new Color( 10526975 ) );
    _shape_distance.setStateVariable( true );
    _shape_distance.setName( "distance" );
    _shape_distance.setNameOffset( 10, 0 );

    add( _shape_Lg );
    _shape_Lg.setShapeName( "_shape_Lg" );
    _shape_Lg.setPos( 30, 440 );
    _shape_Lg.setFillColor( new Color( 10526975 ) );
    _shape_Lg.setStateVariable( true );
    _shape_Lg.setName( "Lg" );
    _shape_Lg.setNameOffset( 10, 0 );

    add( _shape_Lpr );
    _shape_Lpr.setShapeName( "_shape_Lpr" );
    _shape_Lpr.setPos( 30, 460 );
    _shape_Lpr.setFillColor( new Color( 10526975 ) );
    _shape_Lpr.setStateVariable( true );
    _shape_Lpr.setName( "Lpr" );
    _shape_Lpr.setNameOffset( 10, 0 );

    add( _shape_Pr );
    _shape_Pr.setShapeName( "_shape_Pr" );
    _shape_Pr.setPos( 90, 440 );
    _shape_Pr.setFillColor( new Color( 10526975 ) );
    _shape_Pr.setStateVariable( true );
    _shape_Pr.setName( "Pr" );
    _shape_Pr.setNameOffset( 10, 0 );

    add( _shape_noise );
    _shape_noise.setShapeName( "_shape_noise" );
    _shape_noise.setPos( 90, 460 );
    _shape_noise.setFillColor( new Color( 10526975 ) );
    _shape_noise.setStateVariable( true );
    _shape_noise.setName( "noise" );
    _shape_noise.setNameOffset( 10, 0 );

    add( _shape_Ls );
    _shape_Ls.setShapeName( "_shape_Ls" );
    _shape_Ls.setPos( 30, 480 );
    _shape_Ls.setFillColor( new Color( 10526975 ) );
    _shape_Ls.setStateVariable( true );
    _shape_Ls.setName( "Ls" );
    _shape_Ls.setNameOffset( 10, 0 );

    add( _shape_maxMS );
    _shape_maxMS.setShapeName( "_shape_maxMS" );
    _shape_maxMS.setPos( 50, 290 );
    _shape_maxMS.setFillColor( new Color( 10526975 ) );
    _shape_maxMS.setStateVariable( true );
    _shape_maxMS.setName( "maxMS" );
    _shape_maxMS.setNameOffset( 10, 0 );

    add( _shape_minMS );
    _shape_minMS.setShapeName( "_shape_minMS" );
    _shape_minMS.setPos( 120, 210 );
    _shape_minMS.setFillColor( new Color( 10526975 ) );
    _shape_minMS.setStateVariable( true );
    _shape_minMS.setName( "minMS" );
    _shape_minMS.setNameOffset( 10, 0 );
  }

  public void init() {
    super.init();
  }

  public void update() {
    super.update();
  }

    public ShapeVar _shape_minMS = new ShapeVar();
    public ShapeVar _shape_maxMS = new ShapeVar();
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
    public ShapeVar _shape_SNR = new ShapeVar();
    public ShapeVar _shape_timeTransferI = new ShapeVar();
    public ShapeVar _shape_timeScale = new ShapeVar();
    public ShapeVar _shape_timeOutFromMIR = new ShapeVar();
    public ShapeVar _shape_timeOutFromSET = new ShapeVar();
    public ShapeVar _shape_verRepeat = new ShapeVar();
    public ShapeVar _shape_kolSlotDOWN = new ShapeVar();
    public ShapeVar _shape_transferCondition = new ShapeVar();
    public ShapeVar _shape_currentTimeOpros = new ShapeVar();
    public ShapeVar _shape_currentCounter = new ShapeVar();
    public ShapeVar _shape_timeWait = new ShapeVar();
    public ShapeVar _shape_bitrate = new ShapeVar();
    public ShapeVar _shape_kolData = new ShapeVar();
    public ShapeVar _shape_kolRepeat = new ShapeVar();
    public ShapeVar _shape_bitrateForSlot = new ShapeVar();
    public ShapeVar _shape_transferData = new ShapeVar();
    public ShapeVar _shape_kolSlotUP = new ShapeVar();
    public ShapeVar _shape_kolBlok = new ShapeVar();
    public ShapeVar _shape_currentVer = new ShapeVar();
    public ShapeVar _shape_verBlok = new ShapeVar();
    public ShapeVar _shape_kolChannelBS = new ShapeVar();
    public ShapeVar _shape_kolMS = new ShapeVar();
    public ShapeVar _shape_A = new ShapeVar();
    public ShapeVar _shape_timeObs = new ShapeVar();
    public ShapeVar _shape_intZayavok = new ShapeVar();
    public ShapeVar _shape_statusFER = new ShapeVar();
    public ShapeVar _shape_ID = new ShapeVar();
    public ShapeStatechart _shape_GPRS = new ShapeStatechart();
    public ShapePort _shape_portOut = new ShapePort();
    public ShapePort _shape_portIn = new ShapePort();
    public ShapeBounds _object_GPRS = new ShapeBounds();
    public ShapeComment _shape_textBox6_64 = new ShapeComment();
    public ShapeComment _shape_textBox5_49 = new ShapeComment();
    public ShapeComment _shape_textBox4_48 = new ShapeComment();
    public ShapeComment _shape_textBox1_25 = new ShapeComment();
    public ShapeComment _shape_textBox_20 = new ShapeComment();
    public ShapeComment _shape_textBox2_10 = new ShapeComment();
}

  public _StructureGroup structure = null;
  public Group createStructure() {
    return structure != null ? structure : ( structure = new _StructureGroup() );
  }

// _XJ_SECTION_BEGIN( AO.Code )
Vector VrOprosaGPRS = new Vector();
Vector avTimeSET = new Vector();
Vector avTimeMIR = new Vector();

boolean AllCounter = false;
boolean transferOk,repeatFrame,estSlot,netSlot = false;
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
 double CI=Pr-noise;
 return CI;
 }

double modelErlang(double n)
{ 
  double res=0;
  double sum=0;
  long j=1;
  for (int i=1;i<=(n);i++)
    {
     j=j*i;
     sum=sum+Math.pow(A,i)/j;
    }
  res=(Math.pow(A,n)/j)/(sum);
  return res;   
}

int getKolSlotUP(double j){
int i=1;
if (maxKolSlotUP==1)
{
 i=1;
} 
else if (maxKolSlotUP==2)
{
  if ( j > 0.5 & j <=0.99)
      {i=1;}
   else if (j >=0 & j <= 0.5)
      {i=2;} 
}
else if (maxKolSlotUP==3)
{
  if ( j > 0.6 & j <=0.99)
      {i=1;}
  else if (j >=0.6 & j < 0.3)
      {i=2;} 
  else if (j >=0 & j <= 0.3)
      {i=3;} 
}
 
return i;
}

int getKolSlotDOWN(double j){
int i=1;
if (maxKolSlotDOWN==1)
{
 i=1;
} 
else if (maxKolSlotDOWN==2)
{
  if ( j > 0.5 & j <=0.99)
      {i=1;}
   else if (j >=0 & j <= 0.5)
      {i=2;} 
}
else if (maxKolSlotDOWN==3)
{
  if ( j > 0.6 & j <=0.99)
      {i=1;}
  else if (j >=0.6 & j < 0.3)
      {i=2;} 
  else if (j >=0 & j <= 0.3)
      {i=3;} 
}
 else if (maxKolSlotDOWN==4)
{
  if ( j > 0.75 & j <=0.99)
      {i=1;}
  else if (j >0.5 & j <= 0.75)
      {i=2;} 
  else if (j >0.25 & j <= 0.5)
      {i=3;} 
  else if (j >=0 & j <= 0.25)
      {i=4;} 
}
return i;
}










;
// _XJ_SECTION_END
// Class inner statecharts
// Statechart Type_GPRS
public Type_GPRS GPRS;
class Type_GPRS extends Statechart {

  public static final short transition14 = 3;
  public static final short transition13 = 4;
  public static final short transition12 = 5;
  public static final short transition10 = 6;
  public static final short transition9 = 7;
  public static final short transition6 = 8;
  public static final short transition5 = 9;
  public static final short transition1 = 10;
  public static final short transition = 11;
  public static final short transition8 = 12;
  public static final short transition7 = 13;
  public static final short transition3 = 14;
  public static final short transition2 = 15;
  public static final short transition11 = 16;
  public static final short transition4 = 17;
  public static final short С_______зад_р__и = 18;
  public static final short Зад_р__а____р_и_да____ = 19;
  public static final short __дир__а_и__да____ = 20;
  public static final short Ф_рмир__а_и__па_____ = 21;
  public static final short О_ида_и_ = 22;
  public static final short Н____л__а = 23;
  public static final short Е__ь__л___ = 24;
  public static final short О_ида_и__да______а_п_р_дачу = 25;
  public static final short __р_дача_да____ = 26;
  public static final short Вр_м__ра_пр___ра___и___иг_ала = 27;
  public static final short _____р_п_р_дачи__л__а = 28;

  protected Node[] getNodes() { return new Node[]{
    new Node( 4, eInitialMarker, "pointer", -1, -1, 25 ),
    new Node( 58, eDynamicChoice, "branch1", -1 ),
    new Node( 50, eDynamicChoice, "branch", -1 ),
    new Node( 77, eTransition, "transition14", -1, 18, 19 ),
    new Node( 75, eTransition, "transition13", -1, 19, 2 ),
    new Node( 71, eTransition, "transition12", -1, 20, 21 ),
    new Node( 69, eTransition, "transition10", -1, 21, 27 ),
    new Node( 68, eTransition, "transition9", -1, 24, 20 ),
    new Node( 66, eTransition, "transition6", -1, 22, 1 ),
    new Node( 65, eTransition, "transition5", -1, 23, 22 ),
    new Node( 62, eTransition, "transition1", -1, 1, 23 ),
    new Node( 61, eTransition, "transition", -1, 1, 24 ),
    new Node( 57, eTransition, "transition8", -1, 28, 25 ),
    new Node( 56, eTransition, "transition7", -1, 2, 28 ),
    new Node( 53, eTransition, "transition3", -1, 2, 25 ),
    new Node( 52, eTransition, "transition2", -1, 26, 18 ),
    new Node( 49, eTransition, "transition11", -1, 27, 26 ),
    new Node( 41, eTransition, "transition4", -1, 25, 1 ),
    new Node( 76, eState, "Сетевые задержки", -1 ),
    new Node( 74, eState, "Задержка сборки данных", -1 ),
    new Node( 73, eState, "Кодирование данных", -1 ),
    new Node( 72, eState, "Формирование пакетов", -1 ),
    new Node( 63, eState, "Ожидание", -1 ),
    new Node( 60, eState, "Нет слота", -1 ),
    new Node( 59, eState, "Есть слоты", -1 ),
    new Node( 30, eState, "Ожидание данных на передачу", -1 ),
    new Node( 42, eState, "Передача данных", -1 ),
    new Node( 48, eState, "Время распространения сигнала", -1 ),
    new Node( 55, eState, "Повтор передачи блока", -1 ),
  }; }
  protected void calculate( int node, int codeType ) {
    switch ( node ) {
// Branch State: branch1
      case 1: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.58.Action )
currentVer =Math.round(verBlok*100);
if (currentVer > 0)
{
 if (randomTrue(currentVer/100))
    { netSlot=true;}
 else
    {kolSlotUP=getKolSlotUP(currentVer/100);
     kolSlotDOWN=getKolSlotDOWN(currentVer/100);
     estSlot=true;}
}
else
{kolSlotUP=getKolSlotUP(currentVer/100);
kolSlotDOWN=getKolSlotDOWN(currentVer/100);
estSlot=true;}
;
// _XJ_SECTION_END
          } break;
      } break;
// Branch State: branch
      case 2: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.50.Action )
if (verRepeat<=0)
{statusFER=false;}
else if (verRepeat>=1)
{statusFER=true;}
else
{statusFER=randomTrue(verRepeat);}

if (statusFER)
{
repeatFrame=true;
}
else if (statusFER==false)
{
transferOk=true;
}
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition1
      case 10: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GPRS.62.Guard )
netSlot
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition
      case 11: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GPRS.61.Guard )
estSlot
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition8
      case 12: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.57.Action )
model m = (model)getOwner();
for(int i=0;i<(m.parKolMasGPRS.size()/2);i++)
{
 if (ID==i)
   {
    if (currentCounter==1)
    {
     
       if (timeTransferI>=20)
           {
           m.sETGPRS.item(i).openCloseChannel = false;
           m.sETGPRS.item(i).oprosAlgoritm.fireEvent("receiveData");
           m.sETGPRS.item(i).avTimeSETGPRS=m.sETGPRS.item(i).avTimeSETGPRS+timeTransferI;
           m.gPRS.item(i).timeTransferI=0;
           }
         else 
           {
           m.sETGPRS.item(i).oprosAlgoritm.fireEvent("receiveData");
          m.sETGPRS.item(i).avTimeSETGPRS=m.sETGPRS.item(i).avTimeSETGPRS+timeTransferI;
           m.gPRS.item(i).timeTransferI=0;
           }
     }
    else if (currentCounter==2)
    {
     m.mIRGPRS.item(i).avTimeMIRGPRS=m.mIRGPRS.item(i).avTimeMIRGPRS+timeTransferI;
     m.mIRGPRS.item(i).oprosAlgoritm.fireEvent("receiveData");
     m.gPRS.item(i).timeTransferI=0;
    }
   }
}
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition7
      case 13: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GPRS.56.Guard )
repeatFrame
// _XJ_SECTION_END
          ); break;
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.56.Action )
repeatFrame=false;
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition3
      case 14: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GPRS.53.Guard )
transferOk
// _XJ_SECTION_END
          ); break;
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.53.Action )
transferOk=false;
model m = (model)getOwner();
for(int i=0;i<(m.parKolMasGPRS.size()/2);i++)
{
 if (ID==i)
   {
    if (currentCounter==1)
    {
     
         if (timeTransferI>=20)
           {
           m.sETGPRS.item(i).openCloseChannel = false;
           m.sETGPRS.item(i).oprosAlgoritm.fireEvent("receiveData");
           m.sETGPRS.item(i).avTimeSETGPRS=m.sETGPRS.item(i).avTimeSETGPRS+timeTransferI;
           m.gPRS.item(i).timeTransferI=0;
           }
         else 
           {
           m.sETGPRS.item(i).oprosAlgoritm.fireEvent("receiveData");
           m.sETGPRS.item(i).avTimeSETGPRS=m.sETGPRS.item(i).avTimeSETGPRS+timeTransferI;
           m.gPRS.item(i).timeTransferI=0;
           }
    }
    else if (currentCounter==2)
    {
     m.mIRGPRS.item(i).avTimeMIRGPRS=m.mIRGPRS.item(i).avTimeMIRGPRS+timeTransferI;
     m.mIRGPRS.item(i).oprosAlgoritm.fireEvent("receiveData");
      m.gPRS.item(i).timeTransferI=0;
    }
   }
}
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition4
      case 17: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent( 
// _XJ_SECTION_BEGIN( SC.GPRS.41.Trigger )
"sendData"
// _XJ_SECTION_END
          ); break;
      } break;
// State: Сетевые задержки
      case 18: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.76.EntryAction )
double netDelay = DistrNormal.sample(0.3,0.7);

if (netDelay<0.1)
{netDelay=0.1;}

 
currentTimeOpros=currentTimeOpros+netDelay;
timeTransferI=timeTransferI+netDelay;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Задержка сборки данных
      case 19: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.74.EntryAction )
currentTimeOpros=currentTimeOpros+0.25;
timeTransferI=timeTransferI+0.25;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Кодирование данных
      case 20: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.73.EntryAction )
if (currentCounter==1)
    {
     currentTimeOpros=currentTimeOpros+timeOutFromSET;
     timeTransferI=timeTransferI+timeOutFromSET;
    }
else if (currentCounter==2)
    {
     currentTimeOpros=currentTimeOpros+timeOutFromMIR;
      timeTransferI=timeTransferI+timeOutFromMIR;
    }
 double timeCode;
timeCode=0.08;
currentTimeOpros=currentTimeOpros+timeCode;
timeTransferI=timeTransferI+timeCode;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Формирование пакетов
      case 21: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.72.EntryAction )
 double timePacket;
timePacket=0.025;
currentTimeOpros=currentTimeOpros+timePacket;
timeTransferI=timeTransferI+timePacket;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Ожидание
      case 22: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.63.EntryAction )
timeWait=timeWait+1;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Нет слота
      case 23: switch ( codeType ) {
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.60.ExitAction )
netSlot=false;
kolBlok++;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Есть слоты
      case 24: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.59.EntryAction )
SNR = HataModel();
if (typeCS==1)
{
 verRepeat=CS1(SNR);
 bitrateForSlot=CS1throughput(SNR);
}
else if (typeCS==2)
{
 verRepeat=CS2(SNR);
 bitrateForSlot=CS2throughput(SNR);
}
else if (typeCS==3)
{
 verRepeat=CS3(SNR);
 bitrateForSlot=CS3throughput(SNR);
}
else if (typeCS==4)
{
 verRepeat=CS4(SNR);
 bitrateForSlot=CS4throughput(SNR);
}
currentTimeOpros=currentTimeOpros+timeWait;
timeTransferI=timeTransferI+timeWait;
timeWait=0;
;
// _XJ_SECTION_END
          } break;
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.59.ExitAction )
estSlot=false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Ожидание данных на передачу
      case 25: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.30.EntryAction )
model m = (model)getOwner();
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Передача данных
      case 26: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.42.EntryAction )
if (transferCondition==1)
{
 bitrate=bitrateForSlot*kolSlotDOWN;
}
else if  (transferCondition==2)
{
 bitrate=bitrateForSlot*kolSlotUP;
}
currentTimeOpros=currentTimeOpros+(transferData/bitrate);
kolData=kolData+transferData;
timeTransferI=timeTransferI+(transferData/bitrate);
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Время распространения сигнала
      case 27: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.48.EntryAction )
currentTimeOpros=currentTimeOpros+timeWave;
timeTransferI=timeTransferI+timeWave;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Повтор передачи блока
      case 28: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.55.EntryAction )
kolData=kolData+transferData;
timeTransferI=timeTransferI+((transferData/bitrate)+(uniform(0.1,1))+timeWave+0.25+0.25);
currentTimeOpros=currentTimeOpros+((transferData/bitrate)+(uniform(0.1,1))+timeWave+0.25+0.25);
;
// _XJ_SECTION_END
          } break;
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.55.ExitAction )
kolRepeat++;
;
// _XJ_SECTION_END
          } break;
      } break;
    }
  }

} // end of the Type_GPRS statechart
}
