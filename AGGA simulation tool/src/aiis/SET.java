// SET.java

package aiis;

import java.util.Vector;
import java.util.Hashtable;
import java.awt.Color;
import com.xj.jama.Matrix;
import com.xj.anylogic.*;
import com.xj.anylogic.animation.*;
import com.xj.random.*;


// _XJ_SECTION_BEGIN( AO.Import )
import javax.swing.*;
// _XJ_SECTION_END
public class SET extends ActiveObject
 {

   public static boolean langSET = false;

   String msgRus1 = "������� ������ ������������ ����������";
   String alertRus1  = "��������!";

   String msgEng1 = "Please, set the list of the requested parameters";
   String alertEng1  = "Attention!";


  public static void main( String[] args ) {
    System.out.println( "...started..." );
    try {
      Engine.setRoot( new SET() );
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
    return "aiis.SET";
  }

  protected void getEquations() {
    addFE( _ref_closeChannel, new VectorFunction() {
      public Matrix value() { return toMatrix(
// _XJ_SECTION_BEGIN( AO.Equation.0.closeChannel )
mul(8,matrixByRows( 1, 2, new double[]{ 4,4 } ))
// _XJ_SECTION_END
      ); }
      public String toString() { return "closeChannel = 8*[4,4]"; }
    }, false, null );
    addFE( _ref_openChannel, new VectorFunction() {
      public Matrix value() { return toMatrix(
// _XJ_SECTION_BEGIN( AO.Equation.24.openChannel )
mul(8,matrixByRows( 1, 2, new double[]{ 10,4 } ))
// _XJ_SECTION_END
      ); }
      public String toString() { return "openChannel = 8*[10,4]"; }
    }, false, null );
    addFE( _ref_testChannel, new VectorFunction() {
      public Matrix value() { return toMatrix(
// _XJ_SECTION_BEGIN( AO.Equation.48.testChannel )
mul(8,matrixByRows( 1, 2, new double[]{ 4,4 } ))
// _XJ_SECTION_END
      ); }
      public String toString() { return "testChannel = 8*[4,4]"; }
    }, false, null );
    addFE( _ref_arrayEventJournal, new VectorFunction() {
      public Matrix value() { return toMatrix(
// _XJ_SECTION_BEGIN( AO.Equation.71.arrayEventJournal )
mul(8,matrixByRows( 1, 14, new double[]{ 4,16,4,16,4,16,4,16,4,16,4,16,5,10 } ))
// _XJ_SECTION_END
      ); }
      public String toString() { return "arrayEventJournal = 8*[4,16,4,16,4,16,4,16,4,16,4,16,5,10]"; }
    }, false, null );
    addFE( _ref_arrayParametrs, new VectorFunction() {
      public Matrix value() { return toMatrix(
// _XJ_SECTION_BEGIN( AO.Equation.131.arrayParametrs )
mul(8,matrixByRows( 1, 28, new double[]{ 5,10,6,14,6,14,6,14,6,14,6,14,6,14,5,5,6,14,6,14,5,10,5,6,5,13,6,6 } ))
// _XJ_SECTION_END
      ); }
      public String toString() { return "arrayParametrs = 8*[5,10,6,14,6,14,6,14,6,14,6,14,6,14,5,5,6,14,6,14,5,10,5,6,5,13,6,6]"; }
    }, false, null );
    addFE( _ref_arrayEnergy, new VectorFunction() {
      public Matrix value() { return toMatrix(
// _XJ_SECTION_BEGIN( AO.Equation.220.arrayEnergy )
mul(8,matrixByRows( 1, 2, new double[]{ 6,19 } ))
// _XJ_SECTION_END
      ); }
      public String toString() { return "arrayEnergy = 8*[6,19]"; }
    }, false, null );
    addFE( _ref_arrayPowerProfile, new VectorFunction() {
      public Matrix value() { return toMatrix(
// _XJ_SECTION_BEGIN( AO.Equation.244.arrayPowerProfile )
mul(8,matrixByRows( 1, 2, new double[]{ 8,19 } ))
// _XJ_SECTION_END
      ); }
      public String toString() { return "arrayPowerProfile = 8*[8,19]"; }
    }, false, null );
  }

  public void create() {
    timerTimeOut = new Timer_timerTimeOut();
    timerTimeOut.setName( "timerTimeOut" );
    _ref_iArray.setup( this, "iArray", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.iArray )
    iArray = 0
;
// _XJ_SECTION_END
    _ref_avTimeSETGSM.setup( this, "avTimeSETGSM", true );
    _ref_avTimeSETGPRS.setup( this, "avTimeSETGPRS", true );
    _ref_closeChannelSET.setup( this, "closeChannelSET", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.closeChannelSET )
    closeChannelSET = 0
;
// _XJ_SECTION_END
    _ref_timeScale.setup( this, "timeScale", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeScale )
    timeScale = 60
;
// _XJ_SECTION_END
    _ref_timeOutAnswer.setup( this, "timeOutAnswer", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.timeOutAnswer )
    timeOutAnswer = 0
;
// _XJ_SECTION_END
    _ref_ID.setup( this, "ID", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.ID )
    ID = 0
;
// _XJ_SECTION_END
    _ref_currentChannel.setup( this, "currentChannel", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.currentChannel )
    currentChannel = 0
;
// _XJ_SECTION_END
    _ref_SETdontAnswer.setup( this, "SETdontAnswer", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.SETdontAnswer )
    SETdontAnswer = 0
;
// _XJ_SECTION_END
    _ref_closeChannel.setup( this, "closeChannel", true );
    _ref_openChannel.setup( this, "openChannel", true );
    _ref_testChannel.setup( this, "testChannel", true );
    _ref_openCloseChannel.setup( this, "openCloseChannel", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.openCloseChannel )
    openCloseChannel = false
;
// _XJ_SECTION_END
    _ref_indexSET.setup( this, "indexSET", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.indexSET )
    indexSET = 1
;
// _XJ_SECTION_END
    _ref_arrayEventJournal.setup( this, "arrayEventJournal", true );
    _ref_arrayParametrs.setup( this, "arrayParametrs", true );
    _ref_arrayEnergy.setup( this, "arrayEnergy", true );
    _ref_arrayPowerProfile.setup( this, "arrayPowerProfile", true );
    oprosAlgoritm = new Type_oprosAlgoritm();
    port = new Port();
    port.setup( "port", this );
  }

  public void destroy() {
    oprosAlgoritm = null;
    port = null;
    super.destroy();
  }

  protected void startup() {
    startThread( oprosAlgoritm, "oprosAlgoritm" );
  }

  public static class _Type_lookupTable_timeOutOfSpeed extends LookupTable {
    public _Type_lookupTable_timeOutOfSpeed() {
      super(
    "timeOutOfSpeed",    LookupTable.SPLINE,
    LookupTable.EXTRAPOLATE, 0.0,
    new double[]{ 1200, 2400, 4800, 9600 },
    new double[]{ 0.049, 0.025, 0.013, 0.007 } );
    }
  }
  public static _Type_lookupTable_timeOutOfSpeed timeOutOfSpeed = new _Type_lookupTable_timeOutOfSpeed();
  public static double timeOutOfSpeed( double x ) {
    return timeOutOfSpeed.lookup( x );
  }
  public static Matrix timeOutOfSpeed( Matrix x ) {
    return timeOutOfSpeed.lookup( x );
  }
  public static HyperArray timeOutOfSpeed( HyperArray x ) {
    return timeOutOfSpeed.lookup( x );
  }

  // Class parameters
  public static void set_bitrate(
// _XJ_SECTION_BEGIN( AO.ParameterType.0 )
double
// _XJ_SECTION_END
      _value ) {
    bitrate = _value;
  }

  public static double get_bitrate() {
    return bitrate;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.0 )
double
// _XJ_SECTION_END
 bitrate =
// _XJ_SECTION_BEGIN( AO.ParameterValue.0 )
9600
// _XJ_SECTION_END
;
  public static void set_parReqData(
// _XJ_SECTION_BEGIN( AO.ParameterType.1 )
Vector
// _XJ_SECTION_END
      _value ) {
    parReqData = _value;
  }

  public static Vector get_parReqData() {
    return parReqData;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.1 )
Vector
// _XJ_SECTION_END
 parReqData;
  public static void set_maxTimeoutAnswer(
// _XJ_SECTION_BEGIN( AO.ParameterType.2 )
double
// _XJ_SECTION_END
      _value ) {
    maxTimeoutAnswer = _value;
  }

  public static double get_maxTimeoutAnswer() {
    return maxTimeoutAnswer;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.2 )
double
// _XJ_SECTION_END
 maxTimeoutAnswer =
// _XJ_SECTION_BEGIN( AO.ParameterValue.2 )
0.1
// _XJ_SECTION_END
;
  public static void set_verNoAnswer(
// _XJ_SECTION_BEGIN( AO.ParameterType.3 )
double
// _XJ_SECTION_END
      _value ) {
    verNoAnswer = _value;
  }

  public static double get_verNoAnswer() {
    return verNoAnswer;
  }

  public static
// _XJ_SECTION_BEGIN( AO.ParameterType.3 )
double
// _XJ_SECTION_END
 verNoAnswer =
// _XJ_SECTION_BEGIN( AO.ParameterValue.3 )
5
// _XJ_SECTION_END
;

  public void setParams( double bitrate, Vector parReqData, double maxTimeoutAnswer, double verNoAnswer ) {
    set_bitrate( bitrate );
    set_parReqData( parReqData );
    set_maxTimeoutAnswer( maxTimeoutAnswer );
    set_verNoAnswer( verNoAnswer );
  }

  // Structure objects
public int iArray;
  public VariableRefDouble _ref_iArray = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { iArray = (int)_value; }
    public double getDoubleValue() { return (double)iArray; } };
public double avTimeSETGSM;
  public VariableRefDouble _ref_avTimeSETGSM = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { avTimeSETGSM = (double)_value; }
    public double getDoubleValue() { return (double)avTimeSETGSM; } };
public double avTimeSETGPRS;
  public VariableRefDouble _ref_avTimeSETGPRS = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { avTimeSETGPRS = (double)_value; }
    public double getDoubleValue() { return (double)avTimeSETGPRS; } };
public double closeChannelSET;
  public VariableRefDouble _ref_closeChannelSET = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { closeChannelSET = (double)_value; }
    public double getDoubleValue() { return (double)closeChannelSET; } };
public double timeScale;
  public VariableRefDouble _ref_timeScale = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeScale = (double)_value; }
    public double getDoubleValue() { return (double)timeScale; } };
public double timeOutAnswer;
  public VariableRefDouble _ref_timeOutAnswer = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { timeOutAnswer = (double)_value; }
    public double getDoubleValue() { return (double)timeOutAnswer; } };
public int ID;
  public VariableRefDouble _ref_ID = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { ID = (int)_value; }
    public double getDoubleValue() { return (double)ID; } };
public int currentChannel;
  public VariableRefDouble _ref_currentChannel = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { currentChannel = (int)_value; }
    public double getDoubleValue() { return (double)currentChannel; } };
public int SETdontAnswer;
  public VariableRefDouble _ref_SETdontAnswer = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { SETdontAnswer = (int)_value; }
    public double getDoubleValue() { return (double)SETdontAnswer; } };
public Matrix closeChannel;
  public VariableRefVector _ref_closeChannel = new VariableRefVector() {
    public void   set( Object _value ) { closeChannel = (Matrix)_value; }
    public Object get() { return closeChannel; } };
public Matrix openChannel;
  public VariableRefVector _ref_openChannel = new VariableRefVector() {
    public void   set( Object _value ) { openChannel = (Matrix)_value; }
    public Object get() { return openChannel; } };
public Matrix testChannel;
  public VariableRefVector _ref_testChannel = new VariableRefVector() {
    public void   set( Object _value ) { testChannel = (Matrix)_value; }
    public Object get() { return testChannel; } };
public boolean openCloseChannel;
  public VariableRefDouble _ref_openCloseChannel = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { openCloseChannel = _value != 0 ? true : false; }
    public double getDoubleValue() { return openCloseChannel ? 1.0 : 0.0; } };
public double indexSET;
  public VariableRefDouble _ref_indexSET = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { indexSET = (double)_value; }
    public double getDoubleValue() { return (double)indexSET; } };
public Matrix arrayEventJournal;
  public VariableRefVector _ref_arrayEventJournal = new VariableRefVector() {
    public void   set( Object _value ) { arrayEventJournal = (Matrix)_value; }
    public Object get() { return arrayEventJournal; } };
public Matrix arrayParametrs;
  public VariableRefVector _ref_arrayParametrs = new VariableRefVector() {
    public void   set( Object _value ) { arrayParametrs = (Matrix)_value; }
    public Object get() { return arrayParametrs; } };
public Matrix arrayEnergy;
  public VariableRefVector _ref_arrayEnergy = new VariableRefVector() {
    public void   set( Object _value ) { arrayEnergy = (Matrix)_value; }
    public Object get() { return arrayEnergy; } };
public Matrix arrayPowerProfile;
  public VariableRefVector _ref_arrayPowerProfile = new VariableRefVector() {
    public void   set( Object _value ) { arrayPowerProfile = (Matrix)_value; }
    public Object get() { return arrayPowerProfile; } };
  public Port port;
  Timer_timerTimeOut timerTimeOut = null;
  class Timer_timerTimeOut extends StaticTimer {
    Timer_timerTimeOut() {
      super( SET.this );
    }
    public void action() {
// _XJ_SECTION_BEGIN( ST.Action.timerTimeOut )
oprosAlgoritm.fireEvent("nextStep");
// _XJ_SECTION_END
    }
  }

// Group class for group _IconGroup
public class _IconGroup extends Group {

  public void setup() {
    setActiveObject( SET.this );
    super.setup();
    setSize( 67, 42 );
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

    add( _shape_port );
    _shape_port.setShapeName( "_shape_port" );
    _shape_port.setPos( -30, 0 );
    _shape_port.setFillColor( new Color( 16777215 ) );
  }

  public void init() {
    super.init();
  }

  public void update() {
    super.update();
  }

    public ShapePort _shape_port = new ShapePort();
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
    setActiveObject( SET.this );
    super.setup();
    setSize( 377, 322 );
    setOrigin( -16, 9 );

    add( _shape_textBox1_23 );
    _shape_textBox1_23.setShapeName( "_shape_textBox1_23" );
    _shape_textBox1_23.setPos( 20, 50 );
    _shape_textBox1_23.setFillColor( new Color( 16777152 ) );
    _shape_textBox1_23.setSize( 150, 120 );
    _shape_textBox1_23.setFontColor( new Color( 0 ) );
    _shape_textBox1_23.setText( "����������" );

    add( _shape_textBox2_36 );
    _shape_textBox2_36.setShapeName( "_shape_textBox2_36" );
    _shape_textBox2_36.setPos( 20, 190 );
    _shape_textBox2_36.setFillColor( new Color( 16777152 ) );
    _shape_textBox2_36.setSize( 150, 120 );
    _shape_textBox2_36.setFontColor( new Color( 0 ) );
    _shape_textBox2_36.setText( "��������������� ����������" );

    add( _shape_textBox3_37 );
    _shape_textBox3_37.setShapeName( "_shape_textBox3_37" );
    _shape_textBox3_37.setPos( 190, 50 );
    _shape_textBox3_37.setFillColor( new Color( 16777152 ) );
    _shape_textBox3_37.setSize( 150, 260 );
    _shape_textBox3_37.setFontColor( new Color( 0 ) );
    _shape_textBox3_37.setText( "��������� ����������" );

    add( _object_SET );
    _object_SET.setShapeName( "_object_SET" );
    _object_SET.setPos( -10, 10 );
    _object_SET.setSize( 370, 320 );
    _object_SET.setName( "SET" );
    _object_SET.setNameOffset( 10, 10 );

    add( _shape_port );
    _shape_port.setShapeName( "_shape_port" );
    _shape_port.setPos( -10, 170 );
    _shape_port.setFillColor( new Color( 16777215 ) );
    _shape_port.setName( "port" );
    _shape_port.setNameOffset( 10, 0 );

    add( _shape_oprosAlgoritm );
    _shape_oprosAlgoritm.setShapeName( "_shape_oprosAlgoritm" );
    _shape_oprosAlgoritm.setPos( 90, 30 );
    _shape_oprosAlgoritm.setName( "oprosAlgoritm" );
    _shape_oprosAlgoritm.setNameOffset( 10, 0 );

    add( _shape_arrayPowerProfile );
    _shape_arrayPowerProfile.setShapeName( "_shape_arrayPowerProfile" );
    _shape_arrayPowerProfile.setPos( 210, 190 );
    _shape_arrayPowerProfile.setFillColor( new Color( 10526975 ) );
    _shape_arrayPowerProfile.setStateVariable( true );
    _shape_arrayPowerProfile.setName( "arrayPowerProfile" );
    _shape_arrayPowerProfile.setNameOffset( 10, 0 );

    add( _shape_arrayEnergy );
    _shape_arrayEnergy.setShapeName( "_shape_arrayEnergy" );
    _shape_arrayEnergy.setPos( 210, 210 );
    _shape_arrayEnergy.setFillColor( new Color( 10526975 ) );
    _shape_arrayEnergy.setStateVariable( true );
    _shape_arrayEnergy.setName( "arrayEnergy" );
    _shape_arrayEnergy.setNameOffset( 10, 0 );

    add( _shape_arrayParametrs );
    _shape_arrayParametrs.setShapeName( "_shape_arrayParametrs" );
    _shape_arrayParametrs.setPos( 210, 230 );
    _shape_arrayParametrs.setFillColor( new Color( 10526975 ) );
    _shape_arrayParametrs.setStateVariable( true );
    _shape_arrayParametrs.setName( "arrayParametrs" );
    _shape_arrayParametrs.setNameOffset( 10, 0 );

    add( _shape_arrayEventJournal );
    _shape_arrayEventJournal.setShapeName( "_shape_arrayEventJournal" );
    _shape_arrayEventJournal.setPos( 210, 250 );
    _shape_arrayEventJournal.setFillColor( new Color( 10526975 ) );
    _shape_arrayEventJournal.setStateVariable( true );
    _shape_arrayEventJournal.setName( "arrayEventJournal" );
    _shape_arrayEventJournal.setNameOffset( 10, 0 );

    add( _shape_indexSET );
    _shape_indexSET.setShapeName( "_shape_indexSET" );
    _shape_indexSET.setPos( 40, 250 );
    _shape_indexSET.setFillColor( new Color( 10526975 ) );
    _shape_indexSET.setStateVariable( true );
    _shape_indexSET.setName( "indexSET" );
    _shape_indexSET.setNameOffset( 10, 0 );

    add( _shape_openCloseChannel );
    _shape_openCloseChannel.setShapeName( "_shape_openCloseChannel" );
    _shape_openCloseChannel.setPos( 40, 270 );
    _shape_openCloseChannel.setFillColor( new Color( 10526975 ) );
    _shape_openCloseChannel.setStateVariable( true );
    _shape_openCloseChannel.setName( "openCloseChannel" );
    _shape_openCloseChannel.setNameOffset( 10, 0 );

    add( _shape_testChannel );
    _shape_testChannel.setShapeName( "_shape_testChannel" );
    _shape_testChannel.setPos( 210, 130 );
    _shape_testChannel.setFillColor( new Color( 10526975 ) );
    _shape_testChannel.setStateVariable( true );
    _shape_testChannel.setName( "testChannel" );
    _shape_testChannel.setNameOffset( 10, 0 );

    add( _shape_openChannel );
    _shape_openChannel.setShapeName( "_shape_openChannel" );
    _shape_openChannel.setPos( 210, 150 );
    _shape_openChannel.setFillColor( new Color( 10526975 ) );
    _shape_openChannel.setStateVariable( true );
    _shape_openChannel.setName( "openChannel" );
    _shape_openChannel.setNameOffset( 10, 0 );

    add( _shape_closeChannel );
    _shape_closeChannel.setShapeName( "_shape_closeChannel" );
    _shape_closeChannel.setPos( 210, 170 );
    _shape_closeChannel.setFillColor( new Color( 10526975 ) );
    _shape_closeChannel.setStateVariable( true );
    _shape_closeChannel.setName( "closeChannel" );
    _shape_closeChannel.setNameOffset( 10, 0 );

    add( _shape_SETdontAnswer );
    _shape_SETdontAnswer.setShapeName( "_shape_SETdontAnswer" );
    _shape_SETdontAnswer.setPos( 40, 160 );
    _shape_SETdontAnswer.setFillColor( new Color( 10526975 ) );
    _shape_SETdontAnswer.setStateVariable( true );
    _shape_SETdontAnswer.setName( "SETdontAnswer" );
    _shape_SETdontAnswer.setNameOffset( 10, 0 );

    add( _shape_currentChannel );
    _shape_currentChannel.setShapeName( "_shape_currentChannel" );
    _shape_currentChannel.setPos( 40, 290 );
    _shape_currentChannel.setFillColor( new Color( 10526975 ) );
    _shape_currentChannel.setStateVariable( true );
    _shape_currentChannel.setName( "currentChannel" );
    _shape_currentChannel.setNameOffset( 10, 0 );

    add( _shape_ID );
    _shape_ID.setShapeName( "_shape_ID" );
    _shape_ID.setPos( 290, 110 );
    _shape_ID.setFillColor( new Color( 10526975 ) );
    _shape_ID.setStateVariable( true );
    _shape_ID.setName( "ID" );
    _shape_ID.setNameOffset( 10, 0 );

    add( _shape_timeOutAnswer );
    _shape_timeOutAnswer.setShapeName( "_shape_timeOutAnswer" );
    _shape_timeOutAnswer.setPos( 210, 270 );
    _shape_timeOutAnswer.setFillColor( new Color( 10526975 ) );
    _shape_timeOutAnswer.setStateVariable( true );
    _shape_timeOutAnswer.setName( "timeOutAnswer" );
    _shape_timeOutAnswer.setNameOffset( 10, 0 );

    add( _shape_timeScale );
    _shape_timeScale.setShapeName( "_shape_timeScale" );
    _shape_timeScale.setPos( 210, 110 );
    _shape_timeScale.setFillColor( new Color( 10526975 ) );
    _shape_timeScale.setStateVariable( true );
    _shape_timeScale.setName( "timeScale" );
    _shape_timeScale.setNameOffset( 10, 0 );

    add( _shape_closeChannelSET );
    _shape_closeChannelSET.setShapeName( "_shape_closeChannelSET" );
    _shape_closeChannelSET.setPos( 40, 130 );
    _shape_closeChannelSET.setFillColor( new Color( 10526975 ) );
    _shape_closeChannelSET.setStateVariable( true );
    _shape_closeChannelSET.setName( "closeChannelSET" );
    _shape_closeChannelSET.setNameOffset( 10, 0 );

    add( _shape_avTimeSETGPRS );
    _shape_avTimeSETGPRS.setShapeName( "_shape_avTimeSETGPRS" );
    _shape_avTimeSETGPRS.setPos( 40, 90 );
    _shape_avTimeSETGPRS.setFillColor( new Color( 10526975 ) );
    _shape_avTimeSETGPRS.setStateVariable( true );
    _shape_avTimeSETGPRS.setName( "avTimeSETGPRS" );
    _shape_avTimeSETGPRS.setNameOffset( 10, 0 );

    add( _shape_avTimeSETGSM );
    _shape_avTimeSETGSM.setShapeName( "_shape_avTimeSETGSM" );
    _shape_avTimeSETGSM.setPos( 40, 110 );
    _shape_avTimeSETGSM.setFillColor( new Color( 10526975 ) );
    _shape_avTimeSETGSM.setStateVariable( true );
    _shape_avTimeSETGSM.setName( "avTimeSETGSM" );
    _shape_avTimeSETGSM.setNameOffset( 10, 0 );

    add( _shape_iArray );
    _shape_iArray.setShapeName( "_shape_iArray" );
    _shape_iArray.setPos( 250, 300 );
    _shape_iArray.setFillColor( new Color( 10526975 ) );
    _shape_iArray.setStateVariable( true );
    _shape_iArray.setName( "iArray" );
    _shape_iArray.setNameOffset( 10, 0 );

    add( _shape_timerTimeOut );
    _shape_timerTimeOut.setShapeName( "_shape_timerTimeOut" );
    _shape_timerTimeOut.setPos( 210, 30 );
    _shape_timerTimeOut.setName( "timerTimeOut" );
    _shape_timerTimeOut.setNameOffset( 10, 0 );
  }

  public void init() {
    super.init();
  }

  public void update() {
    super.update();
  }

    public ShapeTimer _shape_timerTimeOut = new ShapeTimer();
    public ShapeVar _shape_iArray = new ShapeVar();
    public ShapeVar _shape_avTimeSETGSM = new ShapeVar();
    public ShapeVar _shape_avTimeSETGPRS = new ShapeVar();
    public ShapeVar _shape_closeChannelSET = new ShapeVar();
    public ShapeVar _shape_timeScale = new ShapeVar();
    public ShapeVar _shape_timeOutAnswer = new ShapeVar();
    public ShapeVar _shape_ID = new ShapeVar();
    public ShapeVar _shape_currentChannel = new ShapeVar();
    public ShapeVar _shape_SETdontAnswer = new ShapeVar();
    public ShapeVar _shape_closeChannel = new ShapeVar();
    public ShapeVar _shape_openChannel = new ShapeVar();
    public ShapeVar _shape_testChannel = new ShapeVar();
    public ShapeVar _shape_openCloseChannel = new ShapeVar();
    public ShapeVar _shape_indexSET = new ShapeVar();
    public ShapeVar _shape_arrayEventJournal = new ShapeVar();
    public ShapeVar _shape_arrayParametrs = new ShapeVar();
    public ShapeVar _shape_arrayEnergy = new ShapeVar();
    public ShapeVar _shape_arrayPowerProfile = new ShapeVar();
    public ShapeStatechart _shape_oprosAlgoritm = new ShapeStatechart();
    public ShapePort _shape_port = new ShapePort();
    public ShapeBounds _object_SET = new ShapeBounds();
    public ShapeComment _shape_textBox3_37 = new ShapeComment();
    public ShapeComment _shape_textBox2_36 = new ShapeComment();
    public ShapeComment _shape_textBox1_23 = new ShapeComment();
}

  public _StructureGroup structure = null;
  public Group createStructure() {
    return structure != null ? structure : ( structure = new _StructureGroup() );
  }

// _XJ_SECTION_BEGIN( AO.Code )
boolean netSET,estSET,nextSET,allSET,openIs,closeIs,nextData,allData,SETwork,SETdontwork = false;
boolean estEvent,estEnergy,estPower, estDopPar, nextIArray,allIArray,someNo,oprosManyArray = false;
int indexArray = 1;
//int iArray = 0;
int indexEventJournal  = 1;
boolean noManyArray,estManyArray = false;

model exModel = (model)getOwner();
double getTimeOut(){
double i;
double meanDistr = (timeOutOfSpeed(bitrate) + (maxTimeoutAnswer - timeOutOfSpeed(bitrate))/2);
double sigmaDistr = maxTimeoutAnswer - meanDistr;
//timeOutAnswer = DistrNormal.sample(sigmaDistr,meanDistr);
i = DistrUniform.sample(timeOutOfSpeed(bitrate),maxTimeoutAnswer);
return i;
}

static boolean checkVector(Vector a){
boolean s = false;
int j = 0;
for (int i = 0;i<=a.size()-1;i++){
if (((Double)a.get(i)).doubleValue() != 0)
   j++;
}
if (j==0)
   s=true;
return s;
}
;
// _XJ_SECTION_END
// Class inner statecharts
// Statechart Type_oprosAlgoritm
public Type_oprosAlgoritm oprosAlgoritm;
class Type_oprosAlgoritm extends Statechart {

  public static final short transition33 = 8;
  public static final short transition32 = 9;
  public static final short transition30 = 10;
  public static final short transition31 = 11;
  public static final short transition27 = 12;
  public static final short transition26 = 13;
  public static final short transition25 = 14;
  public static final short transition24 = 15;
  public static final short transition16 = 16;
  public static final short transition13 = 17;
  public static final short transition12 = 18;
  public static final short transition46 = 19;
  public static final short transition10 = 20;
  public static final short transition53 = 21;
  public static final short transition52 = 22;
  public static final short transition4 = 23;
  public static final short transition49 = 24;
  public static final short transition50 = 25;
  public static final short transition51 = 26;
  public static final short transition36 = 27;
  public static final short transition21 = 28;
  public static final short transition9 = 29;
  public static final short transition48 = 30;
  public static final short transition29 = 31;
  public static final short transition44 = 32;
  public static final short transition43 = 33;
  public static final short transition42 = 34;
  public static final short transition41 = 35;
  public static final short transition40 = 36;
  public static final short transition39 = 37;
  public static final short transition37 = 38;
  public static final short transition23 = 39;
  public static final short transition20 = 40;
  public static final short transition28 = 41;
  public static final short transition19 = 42;
  public static final short transition18 = 43;
  public static final short transition17 = 44;
  public static final short transition22 = 45;
  public static final short transition15 = 46;
  public static final short transition14 = 47;
  public static final short transition11 = 48;
  public static final short transition8 = 49;
  public static final short transition7 = 50;
  public static final short transition6 = 51;
  public static final short transition5 = 52;
  public static final short transition3 = 53;
  public static final short transition2 = 54;
  public static final short transition1 = 55;
  public static final short transition = 56;
  public static final short ��_�_��_______�3 = 57;
  public static final short ��_�_��_______�2 = 58;
  public static final short ��_�_��_______�1 = 59;
  public static final short ��_�_��_______� = 60;
  public static final short ��_�__�____�__�_����___ = 61;
  public static final short ��_�__�____�__�_______ = 62;
  public static final short �__GPRS = 63;
  public static final short �__GSM = 64;
  public static final short ���_��_________��__ = 65;
  public static final short �_�_��__�_ = 66;
  public static final short ��_�__�����__� = 67;
  public static final short ��_�__��__�_ = 68;
  public static final short �_���__�______� = 69;
  public static final short __���__�__����__� = 70;
  public static final short _�_��_��_�__ = 71;
  public static final short �__�__�____�__�_______ = 72;
  public static final short �_____�_���_______ = 73;
  public static final short ��___�____��___�_�__ = 74;
  public static final short �____�__�_��__�_�______ = 75;
  public static final short �_���_�_ = 76;
  public static final short �_�__�����__�_ = 77;
  public static final short ���_��______�_ = 78;
  public static final short ___���__��__�__� = 79;
  public static final short ��_�__�______� = 80;
  public static final short ���___�����__�__ = 81;
  public static final short �__�__�____�__�_����___ = 82;
  public static final short _______��__�_i_�__C_� = 83;
  public static final short �_____�_���_����___ = 84;
  public static final short �����_ = 85;

  protected Node[] getNodes() { return new Node[]{
    new Node( 4, eInitialMarker, "pointer", -1, -1, 85 ),
    new Node( 155, eDynamicChoice, "branch6", -1 ),
    new Node( 125, eDynamicChoice, "branch5", -1 ),
    new Node( 123, eDynamicChoice, "branch4", -1 ),
    new Node( 86, eDynamicChoice, "branch2", -1 ),
    new Node( 67, eDynamicChoice, "branch3", -1 ),
    new Node( 29, eDynamicChoice, "branch1", -1 ),
    new Node( 19, eDynamicChoice, "branch", -1 ),
    new Node( 209, eTransition, "transition33", -1, 80, 5 ),
    new Node( 208, eTransition, "transition32", -1, 79, 5 ),
    new Node( 207, eTransition, "transition30", -1, 2, 78 ),
    new Node( 206, eTransition, "transition31", -1, 2, 79 ),
    new Node( 205, eTransition, "transition27", -1, 2, 80 ),
    new Node( 202, eTransition, "transition26", -1, 2, 77 ),
    new Node( 201, eTransition, "transition25", -1, 71, 84 ),
    new Node( 199, eTransition, "transition24", -1, 57, 62 ),
    new Node( 197, eTransition, "transition16", -1, 58, 69 ),
    new Node( 195, eTransition, "transition13", -1, 59, 72 ),
    new Node( 194, eTransition, "transition12", -1, 60, 73 ),
    new Node( 189, eTransition, "transition46", -1, 61, 57 ),
    new Node( 190, eTransition, "transition10", -1, 62, 83 ),
    new Node( 188, eTransition, "transition53", -1, 69, 67 ),
    new Node( 186, eTransition, "transition52", -1, 70, 1 ),
    new Node( 179, eTransition, "transition4", -1, 76, 64 ),
    new Node( 180, eTransition, "transition49", -1, 76, 63 ),
    new Node( 181, eTransition, "transition50", -1, 64, 7 ),
    new Node( 182, eTransition, "transition51", -1, 63, 7 ),
    new Node( 178, eTransition, "transition36", -1, 77, 5 ),
    new Node( 174, eTransition, "transition21", -1, 78, 5 ),
    new Node( 173, eTransition, "transition9", -1, 83, 6 ),
    new Node( 172, eTransition, "transition48", -1, 65, 83 ),
    new Node( 170, eTransition, "transition29", -1, 3, 61 ),
    new Node( 161, eTransition, "transition44", -1, 1, 65 ),
    new Node( 156, eTransition, "transition43", -1, 1, 58 ),
    new Node( 149, eTransition, "transition42", -1, 66, 70 ),
    new Node( 147, eTransition, "transition41", -1, 67, 5 ),
    new Node( 145, eTransition, "transition40", -1, 4, 66 ),
    new Node( 143, eTransition, "transition39", -1, 2, 3 ),
    new Node( 138, eTransition, "transition37", -1, 68, 3 ),
    new Node( 127, eTransition, "transition23", -1, 3, 2 ),
    new Node( 124, eTransition, "transition20", -1, 81, 3 ),
    new Node( 99, eTransition, "transition28", -1, 67, 5 ),
    new Node( 90, eTransition, "transition19", -1, 4, 70 ),
    new Node( 89, eTransition, "transition18", -1, 4, 68 ),
    new Node( 73, eTransition, "transition17", -1, 5, 71 ),
    new Node( 72, eTransition, "transition22", -1, 5, 4 ),
    new Node( 55, eTransition, "transition15", -1, 72, 81 ),
    new Node( 53, eTransition, "transition14", -1, 82, 59 ),
    new Node( 46, eTransition, "transition11", -1, 73, 82 ),
    new Node( 43, eTransition, "transition8", -1, 84, 60 ),
    new Node( 37, eTransition, "transition7", -1, 74, 76 ),
    new Node( 32, eTransition, "transition6", -1, 6, 74 ),
    new Node( 30, eTransition, "transition5", -1, 6, 84 ),
    new Node( 26, eTransition, "transition3", -1, 75, 76 ),
    new Node( 21, eTransition, "transition2", -1, 7, 75 ),
    new Node( 20, eTransition, "transition1", -1, 7, 6 ),
    new Node( 8, eTransition, "transition", -1, 85, 76 ),
    new Node( 200, eState, "����-��� ������3", -1 ),
    new Node( 198, eState, "����-��� ������2", -1 ),
    new Node( 196, eState, "����-��� ������1", -1 ),
    new Node( 193, eState, "����-��� ������", -1 ),
    new Node( 191, eState, "�������� ������(������)", -1 ),
    new Node( 192, eState, "�������� ������(�����)", -1 ),
    new Node( 183, eState, "�� GPRS", -1 ),
    new Node( 184, eState, "�� GSM", -1 ),
    new Node( 154, eState, "������� �� ��������", -1 ),
    new Node( 148, eState, "��� ������", -1 ),
    new Node( 96, eState, "����. ��������", -1 ),
    new Node( 88, eState, "����. ������", -1 ),
    new Node( 70, eState, "�������� ������", -1 ),
    new Node( 69, eState, "��������� �������", -1 ),
    new Node( 60, eState, "����� ������", -1 ),
    new Node( 48, eState, "�������� ������(�����)", -1 ),
    new Node( 40, eState, "���� ������(�����)", -1 ),
    new Node( 31, eState, "�������� ����� �����", -1 ),
    new Node( 24, eState, "� ���� ������ ����� ���", -1 ),
    new Node( 22, eState, "��������", -1 ),
    new Node( 18, eState, "���. ���������", -1 ),
    new Node( 17, eState, "������ �������", -1 ),
    new Node( 16, eState, "������� �� �����", -1 ),
    new Node( 15, eState, "����� ��������", -1 ),
    new Node( 14, eState, "����� ����������", -1 ),
    new Node( 11, eState, "�������� ������(������)", -1 ),
    new Node( 9, eState, "����� ������ i-�� C��", -1 ),
    new Node( 7, eState, "���� ������(������)", -1 ),
    new Node( 2, eState, "������", -1 ),
  }; }
  protected void calculate( int node, int codeType ) {
    switch ( node ) {
// Branch State: branch6
      case 1: switch ( codeType ) {
        case eAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.155.Action )
if(randomTrue(verNoAnswer/100))
{SETdontwork=true;}
else
{SETwork=true;}
;
// _XJ_SECTION_END
          } break;
      } break;
// Branch State: branch5
      case 2: switch ( codeType ) {
        case eAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.125.Action )
if ( ((Double)parReqData.get(iArray)).doubleValue()==1 & iArray ==0 )
{estEvent = true;}
else if (((Double)parReqData.get(iArray)).doubleValue()==1 & iArray ==1)
{estEnergy = true;}
else if (((Double)parReqData.get(iArray)).doubleValue()==1 & iArray ==2)
{estPower = true;}
else if (((Double)parReqData.get(iArray)).doubleValue()==1 & iArray ==3)
{estDopPar = true;}
else
{someNo = true;}
;
// _XJ_SECTION_END
          } break;
      } break;
// Branch State: branch4
      case 3: switch ( codeType ) {
        case eAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.123.Action )

if (iArray<=3)
{nextIArray=true;}
else
{allIArray=true;}
;
// _XJ_SECTION_END
          } break;
      } break;
// Branch State: branch2
      case 4: switch ( codeType ) {
        case eAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.86.Action )
if (iArray == 0)
{
   if (indexArray < arrayEventJournal.getColumnDimension()/2)
      {

      if (indexEventJournal< 10)
         {
          noManyArray = false;
          oprosManyArray=true;
          estManyArray = true;
         }
      else if(indexEventJournal == 10)
         {
           oprosManyArray=true;

           noManyArray = true;
           estManyArray = false;
         }
      }


   else if (indexArray == arrayEventJournal.getColumnDimension()/2)
      {
       nextData = true;
        noManyArray = true;
      }
   else
      {allData = true;}
}




else if (iArray==1)
{
 if (indexArray <= arrayEnergy.getColumnDimension()/2)
      {nextData = true;
       noManyArray = true;
      }
   else
      {allData = true;}
}
else if (iArray==2)
{
 if (indexArray <= arrayPowerProfile.getColumnDimension()/2)
      {//nextData = true;
           if (indexEventJournal< 12)
          {
           noManyArray = false;
           oprosManyArray=true;
           estManyArray = true;
          }
       else if(indexEventJournal == 12)
         {
           oprosManyArray=true;
           noManyArray = true;
           estManyArray = false;
         }

      }
   else
      {allData = true;}
}
else if (iArray==3)
{
 if (indexArray <= arrayParametrs.getColumnDimension()/2)
      {nextData = true;
   noManyArray = true;
      }
   else
      {allData = true;}
}
;
// _XJ_SECTION_END
          } break;
      } break;
// Branch State: branch3
      case 5: switch ( codeType ) {
        case eAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.67.Action )
if (openCloseChannel){
openIs = true;
}else
{closeIs = true;}
;
// _XJ_SECTION_END
          } break;
      } break;
// Branch State: branch1
      case 6: switch ( codeType ) {
        case eAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.29.Action )
model m = (model)getOwner();
 estSET = false;
if (currentChannel==1)
   {
    if (indexSET <= ((Double)m.parKolMasGSM.get(2*ID)).doubleValue() )
       {nextSET =true;}
    else
       {allSET = true;}
   }
else if (currentChannel==2)
   {
    if (indexSET <= ((Double)m.parKolMasGPRS.get(2*ID)).doubleValue() )
       {nextSET =true;}
    else
       {allSET = true;}

   }
;
// _XJ_SECTION_END
          } break;
      } break;
// Branch State: branch
      case 7: switch ( codeType ) {
        case eAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.19.Action )
model m = (model)getOwner();

if (currentChannel==1)
   {
    if (((Double)m.parKolMasGSM.get(2*ID)).doubleValue()== 0)
       {netSET=true;}
    else
       {estSET=true;}
   }
else if (currentChannel==2)
   {
    if (((Double)m.parKolMasGPRS.get(2*ID)).doubleValue()== 0)
       {netSET=true;}
    else
       {estSET=true;}
   }





//((Double)m.parKolMasGSM.get(2*(m.gSM.indexChannel-1)+1)).doubleValue()!=0
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition30
      case 10: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.207.Guard )
estEvent
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition31
      case 11: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.206.Guard )
estEnergy
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition27
      case 12: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.205.Guard )
estPower
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition26
      case 13: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.202.Guard )
estDopPar
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition24
      case 15: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.199.Trigger )
"nextStep"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition16
      case 16: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.197.Trigger )
"nextStep"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition13
      case 17: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.195.Trigger )
"nextStep"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition12
      case 18: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.194.Trigger )
"nextStep"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition46
      case 19: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.189.Trigger )
"receiveData"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition10
      case 20: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.190.Trigger )
"receiveData"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition53
      case 21: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.188.Trigger )
"receiveData"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition52
      case 22: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.186.Trigger )
"receiveData"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition4
      case 23: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.179.Trigger )
"startSETGSM"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition49
      case 24: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.180.Trigger )
"startSETGPRS"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition50
      case 25: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.181.Trigger )
"callOK"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition29
      case 31: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.170.Guard )
allIArray
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition44
      case 32: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.161.Guard )
SETdontwork
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition43
      case 33: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.156.Guard )
SETwork
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition41
      case 35: switch ( codeType ) {
        case eTrigger: nodeTriggerChangeEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.147.Trigger )
estManyArray == true
// _XJ_SECTION_END
          ); break;
        case eAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.147.Action )
indexEventJournal++;
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition40
      case 36: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.145.Guard )
oprosManyArray
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition39
      case 37: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.143.Guard )
someNo
// _XJ_SECTION_END
          ); break;
        case eAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.143.Action )
iArray++;
someNo = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition23
      case 39: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.127.Guard )
nextIArray
// _XJ_SECTION_END
          ); break;
        case eAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.127.Action )
nextIArray = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition28
      case 41: switch ( codeType ) {
        case eTrigger: nodeTriggerChangeEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.99.Trigger )
noManyArray == true
// _XJ_SECTION_END
          ); break;
        case eAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.99.Action )
indexArray++;
indexEventJournal = 1;
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition19
      case 42: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.90.Guard )
nextData
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition18
      case 43: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.89.Guard )
allData
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition17
      case 44: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.73.Guard )
closeIs
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition22
      case 45: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.72.Guard )
openIs
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition15
      case 46: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.55.Trigger )
"receiveData"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition14
      case 47: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.53.Trigger )
"receiveData"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition11
      case 48: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.46.Trigger )
"receiveData"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition8
      case 49: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.43.Trigger )
"receiveData"
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition7
      case 50: switch ( codeType ) {
        case eAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.37.Action )
model m = (model)getOwner();
if (currentChannel==1)
{
 for(int i=0;i<m.parKolMasGSM.size()/2;i++)
    {
     if (ID==i)
       {
        if (m.mIRGSM.item(i).allMIR & m.sETGSM.item(i).allSET)
        {
          m.mIRGSM.item(i).allMIR=false;
          m.sETGSM.item(i).allSET=false;
          m.gSM.item(i).GSM.fireEvent("callEND");
       /*   model.kolFinishGSM++;
         if (model.kolFinishGSM==(model.parKolMasGSM.size())/2)
         {
         m.gSM.item(i).GSM.fireEvent("callEND");
         //model.finishAllGSM=true;
         }*/
        }
        else if (m.mIRGSM.item(i).allMIR==false & m.sETGSM.item(i).allSET==true)
        {
        m.mIRGSM.item(i).oprosAlgoritm.fireEvent("startMIRGSM");
        }
       }
    }
}
else if (currentChannel==2)
{


for(int i=0;i<m.parKolMasGPRS.size()/2;i++)
    {
     if (ID==i)
       {
        if (m.mIRGPRS.item(i).allMIR & m.sETGPRS.item(i).allSET)
        {
          m.mIRGPRS.item(i).allMIR=false;
          m.sETGPRS.item(i).allSET=false;
          model.kolFinishGPRS++;
          if (model.kolFinishGPRS==(model.parKolMasGPRS.size())/2)
             {model.finishAllGPRS=true;}
        }
        else if (m.mIRGPRS.item(i).allMIR==false & m.sETGPRS.item(i).allSET==true)
        {
        m.mIRGPRS.item(i).oprosAlgoritm.fireEvent("startMIRGPRS");
        }
       }
    }
}
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition6
      case 51: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.32.Guard )
allSET
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition5
      case 52: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.30.Guard )
nextSET
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition2
      case 54: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.21.Guard )
netSET
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition1
      case 55: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.20.Guard )
estSET
// _XJ_SECTION_END
          ); break;
      } break;
// State: ����-��� ������3
      case 57: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.200.EntryAction )
timeOutAnswer=getTimeOut();
//timerTimeOut.restart(timeOutAnswer/timeScale);
//timerTimeOut.restart(timeOutAnswer);
timerTimeOut.restart(0);
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ����-��� ������2
      case 58: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.198.EntryAction )
timeOutAnswer=getTimeOut();
timerTimeOut.restart(0);
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ����-��� ������1
      case 59: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.196.EntryAction )
timeOutAnswer=getTimeOut();
  //timerTimeOut.restart(timeOutAnswer/timeScale);
//timerTimeOut.restart(timeOutAnswer);
timerTimeOut.restart(0);
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ����-��� ������
      case 60: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.193.EntryAction )
timeOutAnswer=getTimeOut();
//timerTimeOut.restart(timeOutAnswer/timeScale);
//timerTimeOut.restart(timeOutAnswer);
timerTimeOut.restart(0);
;
// _XJ_SECTION_END
          } break;
      } break;
// State: �������� ������(������)
      case 61: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.191.EntryAction )
model m = (model)getOwner();
if (currentChannel==1)
{
  for(int i=0;i<(m.parKolMasGSM.size()/2);i++)
    {
     if (ID==i)
       {
        m.gSM.item(i).transferData=closeChannel.get(0,0);
        m.gSM.item(i).GSM.fireEvent("sendData");
       }
    }
}
else if (currentChannel==2)
{
 for(int i=0;i<(m.parKolMasGPRS.size()/2);i++)
    {
     if (ID==i)
       {
        m.gPRS.item(i).currentCounter=1;
        m.gPRS.item(i).transferCondition=1;
        m.gPRS.item(i).transferData=closeChannel.get(0,0);
        m.gPRS.item(i).GPRS.fireEvent("sendData");
       }
    }
}
;
// _XJ_SECTION_END
          } break;
      } break;
// State: �������� ������(�����)
      case 62: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.192.EntryAction )
model m = (model)getOwner();
if (currentChannel==1)
{
  for(int i=0;i<(m.parKolMasGSM.size()/2);i++)
    {
     if (ID==i)
       {
        m.gSM.item(i).timeOutFromSET=timeOutAnswer;
        m.gSM.item(i).transferData=closeChannel.get(0,1);
        m.gSM.item(i).GSM.fireEvent("sendData");
       }
    }
}
else if (currentChannel==2)
{
 for(int i=0;i<(m.parKolMasGPRS.size()/2);i++)
    {
     if (ID==i)
       {
        m.gPRS.item(i).timeOutFromSET=timeOutAnswer;
        m.gPRS.item(i).currentCounter=1;
        m.gPRS.item(i).transferCondition=2;
        m.gPRS.item(i).transferData=closeChannel.get(0,1);
        m.gPRS.item(i).GPRS.fireEvent("sendData");
       }
    }
}
openCloseChannel=false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: �� GPRS
      case 63: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.183.EntryAction )
currentChannel=2;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: �� GSM
      case 64: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.184.EntryAction )
currentChannel=1;
model m = (model)getOwner();
for(int i=0;i<(m.parKolMasGSM.size()/2);i++)
{
     if (ID==i)
       {
        m.gSM.item(i).currentCounter=1;
        if (m.gSM.item(i).statusCalling==false)
           {m.gSM.item(i).GSM.fireEvent("startGSM");}
        else if (m.gSM.item(i).statusCalling)
           {this.fireEvent("callOK");}


       }
}
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ������� �� ��������
      case 65: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.154.EntryAction )
SETdontwork = false;
SETdontAnswer++;
;
// _XJ_SECTION_END
          } break;
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.154.ExitAction )
indexArray = 1;
indexEventJournal = 1;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ��� ������
      case 66: switch ( codeType ) {
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.148.ExitAction )
oprosManyArray = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ����. ������
      case 68: switch ( codeType ) {
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.88.ExitAction )
allData = false;
indexArray = 1;
iArray++;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: �������� ������
      case 69: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.70.EntryAction )
model m = (model)getOwner();
if (currentChannel==1)
{
for(int i=0;i<(m.parKolMasGSM.size()/2);i++)
    {
     if (ID==i)
       {
        if (iArray == 0)
        {
          m.gSM.item(i).transferData=arrayEventJournal.get(0,2*(indexArray-1)+1);
        }
        else if (iArray==1)
        {
          m.gSM.item(i).transferData=arrayEnergy.get(0,2*(indexArray-1)+1);
        }
        else if (iArray==2)
        {
          m.gSM.item(i).transferData=arrayPowerProfile.get(0,2*(indexArray-1)+1);
        }
        else if (iArray==3)
        {
          m.gSM.item(i).transferData=arrayParametrs.get(0,2*(indexArray-1)+1);
        }
        m.gSM.item(i).timeOutFromSET=timeOutAnswer;
        m.gSM.item(i).GSM.fireEvent("sendData");
       }
    }
}
else if (currentChannel==2)
{
 for(int i=0;i<(m.parKolMasGPRS.size()/2);i++)
    {
     if (ID==i)
       {
        if (iArray == 0)
        {
          m.gPRS.item(i).transferData=arrayEventJournal.get(0,2*(indexArray-1)+1);
        }
        else if (iArray==1)
        {
          m.gPRS.item(i).transferData=arrayEnergy.get(0,2*(indexArray-1)+1);
        }
        else if (iArray==2)
        {
          m.gPRS.item(i).transferData=arrayPowerProfile.get(0,2*(indexArray-1)+1);
        }
        else if (iArray==3)
        {
          m.gPRS.item(i).transferData=arrayParametrs.get(0,2*(indexArray-1)+1);
        }
        m.gPRS.item(i).timeOutFromSET=timeOutAnswer;
        m.gPRS.item(i).currentCounter=1;
        m.gPRS.item(i).transferCondition=2;
        m.gPRS.item(i).GPRS.fireEvent("sendData");
       }
    }
}
;
// _XJ_SECTION_END
          } break;
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.70.ExitAction )
SETwork = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ��������� �������
      case 70: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.69.EntryAction )
model m = (model)getOwner();
if (currentChannel==1)
{
 for(int i=0;i<(m.parKolMasGSM.size()/2);i++)
    {
     if (ID==i)
       {
        if (iArray == 0)
        {
          m.gSM.item(i).transferData=arrayEventJournal.get(0,2*(indexArray-1));
        }
        else if (iArray==1)
        {
          m.gSM.item(i).transferData=arrayEnergy.get(0,2*(indexArray-1));
        }
        else if (iArray==2)
        {
          m.gSM.item(i).transferData=arrayPowerProfile.get(0,2*(indexArray-1));
        }
        else if (iArray==3)
        {
          m.gSM.item(i).transferData=arrayParametrs.get(0,2*(indexArray-1));
        }
        m.gSM.item(i).GSM.fireEvent("sendData");
       }
    }
}
else if (currentChannel==2)
{
 for(int i=0;i<(m.parKolMasGPRS.size()/2);i++)
    {
     if (ID==i)
       {
        if (iArray == 0)
        {
          m.gPRS.item(i).transferData=arrayEventJournal.get(0,2*(indexArray-1));
        }
        else if (iArray==1)
        {
          m.gPRS.item(i).transferData=arrayEnergy.get(0,2*(indexArray-1));
        }
        else if (iArray==2)
        {
          m.gPRS.item(i).transferData=arrayPowerProfile.get(0,2*(indexArray-1));
        }
        else if (iArray==3)
        {
          m.gPRS.item(i).transferData=arrayParametrs.get(0,2*(indexArray-1));
        }
        m.gPRS.item(i).currentCounter=1;
        m.gPRS.item(i).transferCondition=1;
        m.gPRS.item(i).GPRS.fireEvent("sendData");
       }
    }
}
openCloseChannel = true;
;
// _XJ_SECTION_END
          } break;
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.69.ExitAction )

 nextData = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ����� ������
      case 71: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.60.EntryAction )
closeChannelSET++;
;
// _XJ_SECTION_END
          } break;
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.60.ExitAction )
closeIs = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: �������� ������(�����)
      case 72: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.48.EntryAction )
openCloseChannel = true;
model m = (model)getOwner();
if (currentChannel==1)
{
 for(int i=0;i<(m.parKolMasGSM.size()/2);i++)
    {
     if (ID==i)
       {
        m.gSM.item(i).timeOutFromSET=timeOutAnswer;
        m.gSM.item(i).transferData=openChannel.get(0,1);
        m.gSM.item(i).GSM.fireEvent("sendData");
       }
    }
}
else if (currentChannel==2)
{
 for(int i=0;i<(m.parKolMasGPRS.size()/2);i++)
    {
     if (ID==i)
       {
        m.gPRS.item(i).timeOutFromSET=timeOutAnswer;
        m.gPRS.item(i).currentCounter=1;
        m.gPRS.item(i).transferCondition=2;
        m.gPRS.item(i).transferData=openChannel.get(0,1);
        m.gPRS.item(i).GPRS.fireEvent("sendData");
       }
    }
}
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ���� ������(�����)
      case 73: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.40.EntryAction )
model m = (model)getOwner();
if (currentChannel==1)
{
  for(int i=0;i<(m.parKolMasGSM.size()/2);i++)
    {
     if (ID==i)
       {
        m.gSM.item(i).timeOutFromSET=timeOutAnswer;
        m.gSM.item(i).transferData=testChannel.get(0,1);
        m.gSM.item(i).GSM.fireEvent("sendData");
       }
    }
}
else if (currentChannel==2)
{
 for(int i=0;i<(m.parKolMasGPRS.size()/2);i++)
    {
     if (ID==i)
       {
        m.gPRS.item(i).timeOutFromSET=timeOutAnswer;
        m.gPRS.item(i).currentCounter=1;
        m.gPRS.item(i).transferCondition=2;
        m.gPRS.item(i).transferData=testChannel.get(0,1);
        m.gPRS.item(i).GPRS.fireEvent("sendData");
       }
    }
}
;
// _XJ_SECTION_END
          } break;
      } break;
// State: �������� ����� �����
      case 74: switch ( codeType ) {
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.31.ExitAction )


 indexSET = 1;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: � ���� ������ ����� ���
      case 75: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.24.EntryAction )
allSET = true;
 model m = (model)getOwner();
if (currentChannel==1)
{
 for(int i=0;i<(m.parKolMasGSM.size()/2);i++)
    {
     if (ID==i)
       {
        if (m.mIRGSM.item(i).allMIR & m.sETGSM.item(i).allSET)
       {
         m.mIRGSM.item(i).allMIR=false;
         m.sETGSM.item(i).allSET=false;
         m.gSM.item(i).GSM.fireEvent("callEND");
       }
       else
       {
        m.mIRGSM.item(i).oprosAlgoritm.fireEvent("startMIRGSM");
       }
       }
    }
}
else if (currentChannel==2)
{
 for(int i=0;i<(m.parKolMasGPRS.size()/2);i++)
    {
     if (ID==i)
       {
        if (m.mIRGPRS.item(i).allMIR & m.sETGPRS.item(i).allSET)
       {
              m.mIRGPRS.item(i).allMIR=false;
                  m.sETGPRS.item(i).allSET=false;
         model.kolFinishGPRS++;
         if (model.kolFinishGPRS==(model.parKolMasGPRS.size())/2)
        {model.finishAllGPRS=true;
      }
       }
       else
       {
        m.mIRGPRS.item(i).oprosAlgoritm.fireEvent("startMIRGPRS");
       }
       }
    }
}
;
// _XJ_SECTION_END
          } break;
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.24.ExitAction )
netSET = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ���. ���������
      case 77: switch ( codeType ) {
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.18.ExitAction )
estDopPar = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ������ �������
      case 78: switch ( codeType ) {
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.17.ExitAction )
estEvent = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ������� �� �����
      case 79: switch ( codeType ) {
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.16.ExitAction )
estEnergy = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ����� ��������
      case 80: switch ( codeType ) {
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.15.ExitAction )
estPower = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ����� ����������
      case 81: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.14.EntryAction )


if (parReqData == null)
{

Engine.stop();
              if(langSET == false){
              JOptionPane.showMessageDialog(Engine.getAnimation(),msgRus1,alertRus1,JOptionPane.WARNING_MESSAGE);

            }
            else {
              JOptionPane.showMessageDialog(Engine.getAnimation(),msgEng1,alertEng1,JOptionPane.WARNING_MESSAGE);
            }

}
else if (checkVector(parReqData))

{

  Engine.stop();
          }

  if(langSET == false){
  JOptionPane.showMessageDialog(Engine.getAnimation(),msgRus1,alertRus1,JOptionPane.WARNING_MESSAGE);

}
else {
  JOptionPane.showMessageDialog(Engine.getAnimation(),msgEng1,alertEng1,JOptionPane.WARNING_MESSAGE);
}

//JOptionPane.showMessageDialog(Engine.getAnimation(),"������� ������ ������������ ����������","��������!!!",JOptionPane.WARNING_MESSAGE);}
;
// _XJ_SECTION_END
          } break;
      } break;
// State: �������� ������(������)
      case 82: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.11.EntryAction )
model m = (model)getOwner();
if (currentChannel==1)
{
 for(int i=0;i<(m.parKolMasGSM.size()/2);i++)
    {
     if (ID==i)
       {
        m.gSM.item(i).transferData=openChannel.get(0,0);
        m.gSM.item(i).GSM.fireEvent("sendData");
       }
    }
}
else if (currentChannel==2)
{
 for(int i=0;i<(m.parKolMasGPRS.size()/2);i++)
    {
     if (ID==i)
       {
        m.gPRS.item(i).currentCounter=1;
        m.gPRS.item(i).transferCondition=1;
        m.gPRS.item(i).transferData=openChannel.get(0,0);
        m.gPRS.item(i).GPRS.fireEvent("sendData");
       }
    }
}
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ����� ������ i-�� C��
      case 83: switch ( codeType ) {
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.9.ExitAction )
indexSET++;
iArray = 0;
 allIArray = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: ���� ������(������)
      case 84: switch ( codeType ) {
        case eEntryAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.7.EntryAction )
model m = (model)getOwner();
if (currentChannel==1)
{
 for(int i=0;i<(m.parKolMasGSM.size()/2);i++)
    {
     if (ID==i)
       {
        m.gSM.item(i).transferData=testChannel.get(0,0);
        m.gSM.item(i).GSM.fireEvent("sendData");
       }
    }

}
else if (currentChannel==2)
{
 for(int i=0;i<(m.parKolMasGPRS.size()/2);i++)
    {
     if (ID==i)
       {
        m.gPRS.item(i).currentCounter=1;
        m.gPRS.item(i).transferCondition=1;
        m.gPRS.item(i).transferData=testChannel.get(0,0);
        m.gPRS.item(i).GPRS.fireEvent("sendData");
       }
    }
}
;
// _XJ_SECTION_END
          } break;
        case eExitAction: {
// _XJ_SECTION_BEGIN( SC.oprosAlgoritm.7.ExitAction )
nextSET=false;
;
// _XJ_SECTION_END
          } break;
      } break;
    }
  }

} // end of the Type_oprosAlgoritm statechart
}
