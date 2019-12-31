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
// _XJ_SECTION_END
public class model extends ActiveObject
 {

  public static void main( String[] args ) {
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
    addFE( _ref_varTest, new VectorFunction() {
      public Matrix value() { return toMatrix( 
// _XJ_SECTION_BEGIN( AO.Equation.0.varTest )
test
// _XJ_SECTION_END
      ); }
      public String toString() { return "varTest = test"; }
    }, false, null );
    addFE( _ref_help, new DoubleFunction() {
      public double value() { return todouble( 
// _XJ_SECTION_BEGIN( AO.Equation.16.help )
0
// _XJ_SECTION_END
      ); }
      public String toString() { return "help = 0"; }
    }, false, null );
    addIE( _ref_time_mod, new DoubleFunction() {
      public double value() { return todouble( 
// _XJ_SECTION_BEGIN( AO.Initial.0.time_mod )
time_modD*24
// _XJ_SECTION_END
      ); }
      public String toString() { return "time_mod(0) = time_modD*24"; }
    }, new VariableRef[]{ _ref_time_modD } );
  }

  public void create() {
    timerStartAsk = new Timer_timerStartAsk();
    timerStartAsk.setName( "timerStartAsk" );
    _ref_c.setup( this, "c", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.c )
    c = 0
;
// _XJ_SECTION_END
    _ref_b.setup( this, "b", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.b )
    b = 0
;
// _XJ_SECTION_END
    _ref_a.setup( this, "a", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.a )
    a = 0
;
// _XJ_SECTION_END
    _ref_varTest.setup( this, "varTest", true );
    _ref_help.setup( this, "help", true );
    _ref_time_ask.setup( this, "time_ask", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.time_ask )
    time_ask = 24
;
// _XJ_SECTION_END
    _ref_time_modD.setup( this, "time_modD", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.time_modD )
    time_modD = 30
;
// _XJ_SECTION_END
    _ref_time_mod.setup( this, "time_mod", true );
    statechart = new Type_statechart();
    askCounter = new Type_askCounter();
    {
    aiis.GSM _obj = new aiis.GSM();
    setup_gSM( _obj, false );
    }
    {
    aiis.SET _obj = new aiis.SET();
    setup_sET( _obj, false );
    }
    {
    aiis.GPRS _obj = new aiis.GPRS();
    setup_gPRS( _obj, false );
    }
    {
    aiis.RADIO _obj = new aiis.RADIO();
    setup_rADIO( _obj, false );
    }
  }

  public void destroy() {
    dispose_gSM( gSM );
    dispose_sET( sET );
    dispose_gPRS( gPRS );
    dispose_rADIO( rADIO );
    statechart = null;
    askCounter = null;
    super.destroy();
  }

  protected void startup() {
    timerStartAsk.restart( 
// _XJ_SECTION_BEGIN( ST.Timeout.timerStartAsk )
time_ask
// _XJ_SECTION_END
);
    startThread( statechart, "statechart" );
    startThread( askCounter, "askCounter" );
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
  public static void set_parKolMasGPRS( 
// _XJ_SECTION_BEGIN( AO.ParameterType.1 )
Vector
// _XJ_SECTION_END
      _value ) {
    parKolMasGPRS = _value;
  }

  public static Vector get_parKolMasGPRS() {
    return parKolMasGPRS;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.1 )
Vector
// _XJ_SECTION_END
 parKolMasGPRS = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.1 )
null
// _XJ_SECTION_END
;
  public static void set_parVerUstGSM( 
// _XJ_SECTION_BEGIN( AO.ParameterType.2 )
double
// _XJ_SECTION_END
      _value ) {
    parVerUstGSM = _value;
  }

  public static double get_parVerUstGSM() {
    return parVerUstGSM;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.2 )
double
// _XJ_SECTION_END
 parVerUstGSM = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.2 )
0
// _XJ_SECTION_END
;
  public static void set_parVerEndGSM( 
// _XJ_SECTION_BEGIN( AO.ParameterType.3 )
double
// _XJ_SECTION_END
      _value ) {
    parVerEndGSM = _value;
  }

  public static double get_parVerEndGSM() {
    return parVerEndGSM;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.3 )
double
// _XJ_SECTION_END
 parVerEndGSM = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.3 )
0
// _XJ_SECTION_END
;
  public static void set_parVrUstGSM( 
// _XJ_SECTION_BEGIN( AO.ParameterType.4 )
double
// _XJ_SECTION_END
      _value ) {
    parVrUstGSM = _value;
  }

  public static double get_parVrUstGSM() {
    return parVrUstGSM;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.4 )
double
// _XJ_SECTION_END
 parVrUstGSM = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.4 )
0
// _XJ_SECTION_END
;
  public static void set_parVrEndGSM( 
// _XJ_SECTION_BEGIN( AO.ParameterType.5 )
double
// _XJ_SECTION_END
      _value ) {
    parVrEndGSM = _value;
  }

  public static double get_parVrEndGSM() {
    return parVrEndGSM;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.5 )
double
// _XJ_SECTION_END
 parVrEndGSM = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.5 )
0
// _XJ_SECTION_END
;
  public static void set_parKolMasRADIO( 
// _XJ_SECTION_BEGIN( AO.ParameterType.6 )
Vector
// _XJ_SECTION_END
      _value ) {
    parKolMasRADIO = _value;
  }

  public static Vector get_parKolMasRADIO() {
    return parKolMasRADIO;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.6 )
Vector
// _XJ_SECTION_END
 parKolMasRADIO = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.6 )
null
// _XJ_SECTION_END
;

  public void setParams( Vector parKolMasGSM, Vector parKolMasGPRS, double parVerUstGSM, double parVerEndGSM, double parVrUstGSM, double parVrEndGSM, Vector parKolMasRADIO ) {
    set_parKolMasGSM( parKolMasGSM );
    set_parKolMasGPRS( parKolMasGPRS );
    set_parVerUstGSM( parVerUstGSM );
    set_parVerEndGSM( parVerEndGSM );
    set_parVrUstGSM( parVrUstGSM );
    set_parVrEndGSM( parVrEndGSM );
    set_parKolMasRADIO( parKolMasRADIO );
  }

  // Structure objects
public double c;
  public VariableRefDouble _ref_c = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { c = (double)_value; }
    public double getDoubleValue() { return (double)c; } };
public double b;
  public VariableRefDouble _ref_b = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { b = (double)_value; }
    public double getDoubleValue() { return (double)b; } };
public double a;
  public VariableRefDouble _ref_a = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { a = (double)_value; }
    public double getDoubleValue() { return (double)a; } };
public Matrix varTest;
  public VariableRefVector _ref_varTest = new VariableRefVector() {
    public void   set( Object _value ) { varTest = (Matrix)_value; }
    public Object get() { return varTest; } };
public double help;
  public VariableRefDouble _ref_help = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { help = (double)_value; }
    public double getDoubleValue() { return (double)help; } };
public int time_ask;
  public VariableRefDouble _ref_time_ask = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { time_ask = (int)_value; }
    public double getDoubleValue() { return (double)time_ask; } };
public double time_modD;
  public VariableRefDouble _ref_time_modD = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { time_modD = (double)_value; }
    public double getDoubleValue() { return (double)time_modD; } };
public double time_mod;
  public VariableRefDouble _ref_time_mod = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { time_mod = (double)_value; }
    public double getDoubleValue() { return (double)time_mod; } };
  public aiis.GSM gSM = null;
  public aiis.SET sET = null;
  public aiis.GPRS gPRS = null;
  public aiis.RADIO rADIO = null;
  Timer_timerStartAsk timerStartAsk = null;
  class Timer_timerStartAsk extends StaticTimer {
    Timer_timerStartAsk() {
      super( model.this );
    }
    public void action() {
      timerStartAsk.restart( 
// _XJ_SECTION_BEGIN( ST.Timeout.timerStartAsk )
time_ask
// _XJ_SECTION_END
);
// _XJ_SECTION_BEGIN( ST.Action.timerStartAsk )
askCounter.fireEvent("Start");
// _XJ_SECTION_END
    }
  }

  protected synchronized aiis.GSM create_gSM() {
    aiis.GSM _obj = new aiis.GSM();
    setup_gSM( _obj, false );
    return _obj;
  }
  protected synchronized aiis.GSM setup_gSM( aiis.GSM obj, boolean autoRun ) {
    register( obj, "gSM" );
    gSM = obj;
    if ( autoRun )
      obj.run();
    return obj;
  }
  protected aiis.GSM setup_gSM( aiis.GSM obj ) {
    return setup_gSM( obj, true );
  }
  protected synchronized void dispose_gSM( aiis.GSM obj ) {
    gSM = null;
    unregister( obj );
  }

  protected synchronized aiis.SET create_sET() {
    aiis.SET _obj = new aiis.SET();
    setup_sET( _obj, false );
    return _obj;
  }
  protected synchronized aiis.SET setup_sET( aiis.SET obj, boolean autoRun ) {
    register( obj, "sET" );
    sET = obj;
    if ( autoRun )
      obj.run();
    return obj;
  }
  protected aiis.SET setup_sET( aiis.SET obj ) {
    return setup_sET( obj, true );
  }
  protected synchronized void dispose_sET( aiis.SET obj ) {
    sET = null;
    unregister( obj );
  }

  protected synchronized aiis.GPRS create_gPRS() {
    aiis.GPRS _obj = new aiis.GPRS();
    setup_gPRS( _obj, false );
    return _obj;
  }
  protected synchronized aiis.GPRS setup_gPRS( aiis.GPRS obj, boolean autoRun ) {
    register( obj, "gPRS" );
    gPRS = obj;
    if ( autoRun )
      obj.run();
    return obj;
  }
  protected aiis.GPRS setup_gPRS( aiis.GPRS obj ) {
    return setup_gPRS( obj, true );
  }
  protected synchronized void dispose_gPRS( aiis.GPRS obj ) {
    gPRS = null;
    unregister( obj );
  }

  protected synchronized aiis.RADIO create_rADIO() {
    aiis.RADIO _obj = new aiis.RADIO();
    setup_rADIO( _obj, false );
    return _obj;
  }
  protected synchronized aiis.RADIO setup_rADIO( aiis.RADIO obj, boolean autoRun ) {
    register( obj, "rADIO" );
    rADIO = obj;
    if ( autoRun )
      obj.run();
    return obj;
  }
  protected aiis.RADIO setup_rADIO( aiis.RADIO obj ) {
    return setup_rADIO( obj, true );
  }
  protected synchronized void dispose_rADIO( aiis.RADIO obj ) {
    rADIO = null;
    unregister( obj );
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
    setSize( 532, 741 );
    setOrigin( -81, -340 );

    add( _shape_textBox_157 );
    _shape_textBox_157.setShapeName( "_shape_textBox_157" );
    _shape_textBox_157.setPos( -70, 140 );
    _shape_textBox_157.setFillColor( new Color( 16777152 ) );
    _shape_textBox_157.setSize( 100, 100 );
    _shape_textBox_157.setFontColor( new Color( 0 ) );
    _shape_textBox_157.setText( "Канал GSM" );

    add( _shape_textBox1_160 );
    _shape_textBox1_160.setShapeName( "_shape_textBox1_160" );
    _shape_textBox1_160.setPos( 60, 140 );
    _shape_textBox1_160.setFillColor( new Color( 16777152 ) );
    _shape_textBox1_160.setSize( 100, 100 );
    _shape_textBox1_160.setFontColor( new Color( 0 ) );
    _shape_textBox1_160.setText( "Канал GPRS" );

    add( _shape_textBox2_897 );
    _shape_textBox2_897.setShapeName( "_shape_textBox2_897" );
    _shape_textBox2_897.setPos( 200, 140 );
    _shape_textBox2_897.setFillColor( new Color( 16777152 ) );
    _shape_textBox2_897.setSize( 100, 100 );
    _shape_textBox2_897.setFontColor( new Color( 0 ) );
    _shape_textBox2_897.setText( "Радиоканал\n" );

    add( _shape_textBox3_904 );
    _shape_textBox3_904.setShapeName( "_shape_textBox3_904" );
    _shape_textBox3_904.setPos( -80, -340 );
    _shape_textBox3_904.setFillColor( new Color( 16777152 ) );
    _shape_textBox3_904.setSize( 520, 100 );
    _shape_textBox3_904.setFontColor( new Color( 0 ) );
    _shape_textBox3_904.setText( "channel:\n1 - GSM;\n2 - GPRS;\n3 - RADIO." );

    add( _object_model );
    _object_model.setShapeName( "_object_model" );
    _object_model.setPos( -80, -200 );
    _object_model.setSize( 530, 600 );
    _object_model.setName( "model" );
    _object_model.setNameOffset( 10, 10 );

    add( _shape_rADIO );
    _shape_rADIO.setShapeName( "_shape_rADIO" );
    _shape_rADIO.setPos( 100, 50 );
    _shape_rADIO.setName( "rADIO" );
    _shape_rADIO.setNameOffset( -31, -31 );
    _shape_rADIO.setActiveObject( model.this.rADIO );
    _shape_rADIO.setup();

    add( _shape_gPRS );
    _shape_gPRS.setShapeName( "_shape_gPRS" );
    _shape_gPRS.setPos( 160, 0 );
    _shape_gPRS.setName( "gPRS" );
    _shape_gPRS.setNameOffset( -31, -31 );
    _shape_gPRS.setActiveObject( model.this.gPRS );
    _shape_gPRS.setup();

    add( _shape_sET );
    _shape_sET.setShapeName( "_shape_sET" );
    _shape_sET.setPos( 230, -80 );
    _shape_sET.setName( "sET" );
    _shape_sET.setNameOffset( -31, -31 );
    _shape_sET.setActiveObject( model.this.sET );
    _shape_sET.setup();

    add( _shape_gSM );
    _shape_gSM.setShapeName( "_shape_gSM" );
    _shape_gSM.setPos( 90, -80 );
    _shape_gSM.setName( "gSM" );
    _shape_gSM.setNameOffset( -31, -31 );
    _shape_gSM.setActiveObject( model.this.gSM );
    _shape_gSM.setup();

    add( _shape_askCounter );
    _shape_askCounter.setShapeName( "_shape_askCounter" );
    _shape_askCounter.setPos( 360, -180 );
    _shape_askCounter.setName( "askCounter" );
    _shape_askCounter.setNameOffset( 10, 0 );

    add( _shape_statechart );
    _shape_statechart.setShapeName( "_shape_statechart" );
    _shape_statechart.setPos( 340, -40 );
    _shape_statechart.setName( "statechart" );
    _shape_statechart.setNameOffset( 10, 0 );

    add( _shape_time_mod );
    _shape_time_mod.setShapeName( "_shape_time_mod" );
    _shape_time_mod.setPos( 360, 360 );
    _shape_time_mod.setFillColor( new Color( 10526975 ) );
    _shape_time_mod.setStateVariable( true );
    _shape_time_mod.setName( "time_mod" );
    _shape_time_mod.setNameOffset( 10, 0 );

    add( _shape_time_modD );
    _shape_time_modD.setShapeName( "_shape_time_modD" );
    _shape_time_modD.setPos( 360, 380 );
    _shape_time_modD.setFillColor( new Color( 10526975 ) );
    _shape_time_modD.setStateVariable( true );
    _shape_time_modD.setName( "time_modD" );
    _shape_time_modD.setNameOffset( 10, 0 );

    add( _shape_time_ask );
    _shape_time_ask.setShapeName( "_shape_time_ask" );
    _shape_time_ask.setPos( 270, 380 );
    _shape_time_ask.setFillColor( new Color( 10526975 ) );
    _shape_time_ask.setStateVariable( true );
    _shape_time_ask.setName( "time_ask" );
    _shape_time_ask.setNameOffset( 10, 0 );

    add( _shape_help );
    _shape_help.setShapeName( "_shape_help" );
    _shape_help.setPos( -20, -180 );
    _shape_help.setFillColor( new Color( 10526975 ) );
    _shape_help.setStateVariable( true );
    _shape_help.setName( "help" );
    _shape_help.setNameOffset( 10, 0 );

    add( _shape_varTest );
    _shape_varTest.setShapeName( "_shape_varTest" );
    _shape_varTest.setPos( 300, 310 );
    _shape_varTest.setFillColor( new Color( 10526975 ) );
    _shape_varTest.setStateVariable( true );
    _shape_varTest.setName( "varTest" );
    _shape_varTest.setNameOffset( 10, 0 );

    add( _shape_a );
    _shape_a.setShapeName( "_shape_a" );
    _shape_a.setPos( -60, 350 );
    _shape_a.setFillColor( new Color( 10526975 ) );
    _shape_a.setStateVariable( true );
    _shape_a.setName( "a" );
    _shape_a.setNameOffset( 10, 0 );

    add( _shape_b );
    _shape_b.setShapeName( "_shape_b" );
    _shape_b.setPos( -60, 370 );
    _shape_b.setFillColor( new Color( 10526975 ) );
    _shape_b.setStateVariable( true );
    _shape_b.setName( "b" );
    _shape_b.setNameOffset( 10, 0 );

    add( _shape_c );
    _shape_c.setShapeName( "_shape_c" );
    _shape_c.setPos( -60, 390 );
    _shape_c.setFillColor( new Color( 10526975 ) );
    _shape_c.setStateVariable( true );
    _shape_c.setName( "c" );
    _shape_c.setNameOffset( 10, 0 );

    add( _shape_timerStartAsk );
    _shape_timerStartAsk.setShapeName( "_shape_timerStartAsk" );
    _shape_timerStartAsk.setPos( 160, -180 );
    _shape_timerStartAsk.setName( "timerStartAsk" );
    _shape_timerStartAsk.setNameOffset( 10, 0 );
  }

  public void init() {
    super.init();
    _shape_gSM.init();
    _shape_sET.init();
    _shape_gPRS.init();
    _shape_rADIO.init();
  }

  public void update() {
    super.update();
    _shape_gSM.update();
    _shape_sET.update();
    _shape_gPRS.update();
    _shape_rADIO.update();
  }

    public ShapeTimer _shape_timerStartAsk = new ShapeTimer();
    public ShapeVar _shape_c = new ShapeVar();
    public ShapeVar _shape_b = new ShapeVar();
    public ShapeVar _shape_a = new ShapeVar();
    public ShapeVar _shape_varTest = new ShapeVar();
    public ShapeVar _shape_help = new ShapeVar();
    public ShapeVar _shape_time_ask = new ShapeVar();
    public ShapeVar _shape_time_modD = new ShapeVar();
    public ShapeVar _shape_time_mod = new ShapeVar();
    public ShapeStatechart _shape_statechart = new ShapeStatechart();
    public ShapeStatechart _shape_askCounter = new ShapeStatechart();
    public ShapeIcon _shape_gSM = new ShapeIcon();
    public ShapeIcon _shape_sET = new ShapeIcon();
    public ShapeIcon _shape_gPRS = new ShapeIcon();
    public ShapeIcon _shape_rADIO = new ShapeIcon();
    public ShapeBounds _object_model = new ShapeBounds();
    public ShapeComment _shape_textBox3_904 = new ShapeComment();
    public ShapeComment _shape_textBox2_897 = new ShapeComment();
    public ShapeComment _shape_textBox1_160 = new ShapeComment();
    public ShapeComment _shape_textBox_157 = new ShapeComment();
}

  public _StructureGroup structure = null;
  public Group createStructure() {
    return structure != null ? structure : ( structure = new _StructureGroup() );
  }

// _XJ_SECTION_BEGIN( AO.Code )


boolean GSMtrue = false;
boolean GPRStrue = false;
boolean RADIOtrue,stopChannel,nextChannel,otherChannel = false;
boolean statusOprosa = false;
public static boolean nextTypeChannel = false;
public static int scale = 3600;

public static Matrix test = new Matrix(1,3);


//функция, определяющая все ли элементы в массиве равны нулю т.е 
//о всем ли каналам был произведён опрос (askCounter, branch2) 
static boolean checkArray(Matrix a){
boolean s = false;
int j = 0;
for (int i = 0;i<=a.getColumnDimension()-1;i++){
if (a.get(0,i) != 0)
   j++;
}
if (j==0)
   s=true;
return s;
}










public static double  ddd = 56;




public static void getBlin(double varValue){
ddd = varValue;

}






/*VariableRefDouble _ref_outVar = new VariableRefDouble() {
       public double outVar;
        public void   setDoubleValue( double _value ) { outVar = (double)_value; }
        public double getDoubleValue() { return (double)outVar; } };   */;
// _XJ_SECTION_END
// Class inner statecharts
// Statechart Type_statechart
public Type_statechart statechart;
class Type_statechart extends Statechart {

  public static final short transition = 1;
  public static final short state1 = 2;
  public static final short state = 3;

  protected Node[] getNodes() { return new Node[]{
    new Node( 4, eInitialMarker, "pointer", -1, -1, 3 ),
    new Node( 6, eTransition, "transition", -1, 3, 2 ),
    new Node( 5, eState, "state1", -1 ),
    new Node( 2, eState, "state", -1 ),
  }; }
  protected void calculate( int node, int codeType ) {
    switch ( node ) {
// Transition: transition
      case 1: switch ( codeType ) {
        case eTrigger: nodeTriggerDelay( 
// _XJ_SECTION_BEGIN( SC.statechart.6.Trigger )
1
// _XJ_SECTION_END
          ); break;
      } break;
// State: state1
      case 2: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.statechart.5.EntryAction )

 if (parKolMasGSM == null &  parKolMasGPRS == null & parKolMasRADIO == null)
Engine.restart();
;
// _XJ_SECTION_END
          } break;
      } break;
    }
  }

} // end of the Type_statechart statechart
// Statechart Type_askCounter
public Type_askCounter askCounter;
class Type_askCounter extends Statechart {

  public static final short transition12 = 4;
  public static final short transition11 = 5;
  public static final short transition10 = 6;
  public static final short transition8 = 7;
  public static final short transition7 = 8;
  public static final short transition6 = 9;
  public static final short transition9 = 10;
  public static final short transition5 = 11;
  public static final short transition3 = 12;
  public static final short transition4 = 13;
  public static final short transition2 = 14;
  public static final short transition1 = 15;
  public static final short transition = 16;
  public static final short GSM = 17;
  public static final short Сл_ду__и___ип__а_ала = 18;
  public static final short Опр___п_____м__а_алам_за___ч__ = 19;
  public static final short RADIO = 20;
  public static final short GPRS = 21;
  public static final short Начал___пр__а = 22;
  public static final short Начал_ = 23;

  protected Node[] getNodes() { return new Node[]{
    new Node( 4, eInitialMarker, "pointer", -1, -1, 23 ),
    new Node( 40, eDynamicChoice, "branch2", -1 ),
    new Node( 15, eDynamicChoice, "branch1", -1 ),
    new Node( 12, eDynamicChoice, "branch", -1 ),
    new Node( 49, eTransition, "transition12", -1, 19, 23 ),
    new Node( 47, eTransition, "transition11", -1, 1, 18 ),
    new Node( 46, eTransition, "transition10", -1, 1, 19 ),
    new Node( 44, eTransition, "transition8", -1, 20, 1 ),
    new Node( 43, eTransition, "transition7", -1, 17, 1 ),
    new Node( 42, eTransition, "transition6", -1, 21, 1 ),
    new Node( 39, eTransition, "transition9", -1, 18, 3 ),
    new Node( 23, eTransition, "transition5", -1, 2, 20 ),
    new Node( 22, eTransition, "transition3", -1, 2, 21 ),
    new Node( 19, eTransition, "transition4", -1, 3, 2 ),
    new Node( 17, eTransition, "transition2", -1, 3, 17 ),
    new Node( 14, eTransition, "transition1", -1, 22, 3 ),
    new Node( 5, eTransition, "transition", -1, 23, 22 ),
    new Node( 50, eState, "GSM", -1 ),
    new Node( 30, eState, "Следующий тип канала", -1 ),
    new Node( 24, eState, "Опрос по всем каналам закончен", -1 ),
    new Node( 11, eState, "RADIO", -1 ),
    new Node( 10, eState, "GPRS", -1 ),
    new Node( 6, eState, "Начало опроса", -1 ),
    new Node( 2, eState, "Начало", -1 ),
  }; }
  protected void calculate( int node, int codeType ) {
    switch ( node ) {
// Branch State: branch2
      case 1: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.askCounter.40.Action )
if(model.checkArray(test) == true)
{stopChannel=true;}
else
{nextChannel =true;}  

/*if((gSM.finishGSM == true & test.get(0,0) == 1) | 
 (gPRS.finishGPRS == true & test.get(0,1) == 1) |
 (rADIO.finishRADIO == true & test.get(0,2) == 1))
{stopChannel=true;}
else
{nextChannel =true;}      */
;
// _XJ_SECTION_END
          } break;
      } break;
// Branch State: branch1
      case 2: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.askCounter.15.Action )
if(test.get(0,1) ==1 && parKolMasGPRS.size()!=0)
{GPRStrue =true;
otherChannel =false;
}
else if(test.get(0,2) ==1 && parKolMasRADIO.size()!=0)
{RADIOtrue =true;
otherChannel =false;
}

/*if(gPRS.finishGPRS == false & test.get(0,1) ==1)
{GPRStrue =true;
otherChannel =false;
}
else if(rADIO.finishRADIO == false & test.get(0,2) ==1)
{RADIOtrue =true;
otherChannel =false;
}*/
;
// _XJ_SECTION_END
          } break;
      } break;
// Branch State: branch
      case 3: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.askCounter.12.Action )
if (test.get(0,0) == 1 && parKolMasGSM.size() !=0)
{GSMtrue = true;}
else if((test.get(0,1) ==1 && parKolMasGPRS.size()!=0)||(test.get(0,2) ==1 && parKolMasRADIO.size()!=0)) 
{otherChannel =true;}

/*if (gSM.finishGSM == false & test.get(0,0) == 1 )
{GSMtrue = true;}
else if((gPRS.finishGPRS == false & test.get(0,1) ==1)|

(rADIO.finishRADIO == false & test.get(0,2) ==1)) 
{otherChannel =true;}*/
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition11
      case 5: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.askCounter.47.Guard )
nextChannel
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition10
      case 6: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.askCounter.46.Guard )
stopChannel
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition8
      case 7: switch ( codeType ) {
        case eTrigger: nodeTriggerChangeEvent( 
// _XJ_SECTION_BEGIN( SC.askCounter.44.Trigger )
rADIO.finishRADIO == true
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition7
      case 8: switch ( codeType ) {
        case eTrigger: nodeTriggerChangeEvent( 
// _XJ_SECTION_BEGIN( SC.askCounter.43.Trigger )
gSM.finishGSM == true
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition6
      case 9: switch ( codeType ) {
        case eTrigger: nodeTriggerChangeEvent( 
// _XJ_SECTION_BEGIN( SC.askCounter.42.Trigger )
gPRS.finishGPRS == true
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition5
      case 11: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.askCounter.23.Guard )
RADIOtrue
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition3
      case 12: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.askCounter.22.Guard )
GPRStrue
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition4
      case 13: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.askCounter.19.Guard )
otherChannel
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition2
      case 14: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.askCounter.17.Guard )
GSMtrue
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition
      case 16: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent( 
// _XJ_SECTION_BEGIN( SC.askCounter.5.Trigger )
"Start"
// _XJ_SECTION_END
          ); break;
      } break;
// State: GSM
      case 17: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.askCounter.50.EntryAction )
if (parKolMasGSM.size() != 0){
gSM.set_parVerUstGSM(parVerUstGSM);
gSM.set_parVerEndGSM(parVerEndGSM);
gSM.set_parVrUstGSM(parVrUstGSM);
gSM.set_parVrEndGSM(parVrEndGSM);

gSM.GSM.fireEvent("startGSM");


}
;
// _XJ_SECTION_END
          } break;
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.askCounter.50.ExitAction )
GSMtrue=false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Следующий тип канала
      case 18: switch ( codeType ) {
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.askCounter.30.ExitAction )
//iChannel++;
nextChannel = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Опрос по всем каналам закончен
      case 19: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.askCounter.24.EntryAction )
gSM.finishGSM = false;
gPRS.finishGPRS = false;
rADIO.finishRADIO = false;

test.set(0,0,a);
test.set(0,1,b);
test.set(0,2,c);
;
// _XJ_SECTION_END
          } break;
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.askCounter.24.ExitAction )
stopChannel = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: RADIO
      case 20: switch ( codeType ) {
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.askCounter.11.ExitAction )
RADIOtrue = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: GPRS
      case 21: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.askCounter.10.EntryAction )
if (parKolMasGPRS.size() != 0){
gPRS.GPRS.fireEvent("startGPRS");

}
;
// _XJ_SECTION_END
          } break;
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.askCounter.10.ExitAction )
GPRStrue = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Начало опроса
      case 22: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.askCounter.6.EntryAction )
if (parKolMasGSM == null & parKolMasGPRS == null)

Engine.error("Нет каналов связи");
//Engine.stop();
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Начало
      case 23: switch ( codeType ) {
        case eEquations: {
    addFE( _ref_a, new DoubleFunction() {
      public double value() { return todouble( 
// _XJ_SECTION_BEGIN( SC.askCounter.2.Equation.0 )
test.get(0,0)
// _XJ_SECTION_END
      ); }
      public String toString() { return "a = test.get(0,0)"; }
    }, false, null );
    addFE( _ref_b, new DoubleFunction() {
      public double value() { return todouble( 
// _XJ_SECTION_BEGIN( SC.askCounter.2.Equation.96 )
test.get(0,1)
// _XJ_SECTION_END
      ); }
      public String toString() { return "b = test.get(0,1)"; }
    }, false, null );
    addFE( _ref_c, new DoubleFunction() {
      public double value() { return todouble( 
// _XJ_SECTION_BEGIN( SC.askCounter.2.Equation.116 )
test.get(0,2)
// _XJ_SECTION_END
      ); }
      public String toString() { return "c = test.get(0,2)"; }
    }, false, null );
          } break;
      } break;
    }
  }

} // end of the Type_askCounter statechart
 // Stop conditions for experiment Simulation
      Engine.StopCondition _stopcond_Simulation_item_0 = new Engine.StopCondition() {
        public boolean isActive() {
          return time_mod == 0;
        }
      };

  // class for the experiment Simulation
  public static class Simulation extends SimulationExperiment {

    public void runModel( aiis.model _root2 ) {
      final aiis.model _root = _root2;
      Engine.addStopCondition( _root._stopcond_Simulation_item_0 );
      super.runModel( (ActiveObject)_root );
    }

    public void runExperiment() {
      Engine.setSysVar( "HTOL", "0.01" );
      Engine.setRealTimeScale( 1 );
      Engine.setRealTimeMode( false );
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
