// SET.java

package aiis;

import java.util.Vector;
import java.util.Hashtable;
import java.awt.Color;
import com.xj.jama.Matrix;
import com.xj.anylogic.*;
import com.xj.anylogic.animation.*;
import com.xj.random.*;


public class SET extends ActiveObject
 {

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

  public void create() {
    _ref_arrayEventJournal.setup( this, "arrayEventJournal", true );
    arrayEventJournal = matrixByRows( 1, 14, new double[]
// _XJ_SECTION_BEGIN( AO.Initial.0.arrayEventJournal )
{4,16,4,16,4,16,4,16,4,16,4,16,5,10}
// _XJ_SECTION_END
 );
    _ref_arrayParametrs.setup( this, "arrayParametrs", true );
    arrayParametrs = matrixByRows( 1, 20, new double[]
// _XJ_SECTION_BEGIN( AO.Initial.0.arrayParametrs )
{5,10,6,14,6,14,6,14,6,14,6,14,6,14,5,5,6,14,6,14}
// _XJ_SECTION_END
 );
    _ref_arrayEnergy.setup( this, "arrayEnergy", true );
    arrayEnergy = matrixByRows( 1, 2, new double[]
// _XJ_SECTION_BEGIN( AO.Initial.0.arrayEnergy )
{6,19}
// _XJ_SECTION_END
 );
    _ref_arrayPowerProfile.setup( this, "arrayPowerProfile", true );
    arrayPowerProfile = matrixByRows( 1, 2, new double[]
// _XJ_SECTION_BEGIN( AO.Initial.0.arrayPowerProfile )
{8,19}
// _XJ_SECTION_END
 );
    _ref_arrayCountCfg.setup( this, "arrayCountCfg", true );
    arrayCountCfg = matrixByRows( 1, 8, new double[]
// _XJ_SECTION_BEGIN( AO.Initial.0.arrayCountCfg )
{5,10,5,6,5,13,6,6}
// _XJ_SECTION_END
 );
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


  // Class parameters
  public static void set_speed( 
// _XJ_SECTION_BEGIN( AO.ParameterType.0 )
int
// _XJ_SECTION_END
      _value ) {
    speed = _value;
  }

  public static int get_speed() {
    return speed;
  }

  public static 
// _XJ_SECTION_BEGIN( AO.ParameterType.0 )
int
// _XJ_SECTION_END
 speed = 
// _XJ_SECTION_BEGIN( AO.ParameterValue.0 )
0
// _XJ_SECTION_END
;

  public void setParams( int speed ) {
    set_speed( speed );
  }

  // Structure objects
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
public Matrix arrayCountCfg;
  public VariableRefVector _ref_arrayCountCfg = new VariableRefVector() {
    public void   set( Object _value ) { arrayCountCfg = (Matrix)_value; }
    public Object get() { return arrayCountCfg; } };
  public Port port;

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
    setSize( 407, 202 );
    setOrigin( -6, -1 );

    add( _object_SET );
    _object_SET.setShapeName( "_object_SET" );
    _object_SET.setPos( 0, 0 );
    _object_SET.setSize( 400, 200 );
    _object_SET.setName( "SET" );
    _object_SET.setNameOffset( 10, 10 );

    add( _shape_port );
    _shape_port.setShapeName( "_shape_port" );
    _shape_port.setPos( 0, 100 );
    _shape_port.setFillColor( new Color( 16777215 ) );
    _shape_port.setName( "port" );
    _shape_port.setNameOffset( 10, 0 );

    add( _shape_oprosAlgoritm );
    _shape_oprosAlgoritm.setShapeName( "_shape_oprosAlgoritm" );
    _shape_oprosAlgoritm.setPos( 300, 20 );
    _shape_oprosAlgoritm.setName( "oprosAlgoritm" );
    _shape_oprosAlgoritm.setNameOffset( 10, 0 );

    add( _shape_arrayCountCfg );
    _shape_arrayCountCfg.setShapeName( "_shape_arrayCountCfg" );
    _shape_arrayCountCfg.setPos( 80, 20 );
    _shape_arrayCountCfg.setFillColor( new Color( 10526975 ) );
    _shape_arrayCountCfg.setStateVariable( true );
    _shape_arrayCountCfg.setName( "arrayCountCfg" );
    _shape_arrayCountCfg.setNameOffset( 10, 0 );

    add( _shape_arrayPowerProfile );
    _shape_arrayPowerProfile.setShapeName( "_shape_arrayPowerProfile" );
    _shape_arrayPowerProfile.setPos( 80, 50 );
    _shape_arrayPowerProfile.setFillColor( new Color( 10526975 ) );
    _shape_arrayPowerProfile.setStateVariable( true );
    _shape_arrayPowerProfile.setName( "arrayPowerProfile" );
    _shape_arrayPowerProfile.setNameOffset( 10, 0 );

    add( _shape_arrayEnergy );
    _shape_arrayEnergy.setShapeName( "_shape_arrayEnergy" );
    _shape_arrayEnergy.setPos( 80, 80 );
    _shape_arrayEnergy.setFillColor( new Color( 10526975 ) );
    _shape_arrayEnergy.setStateVariable( true );
    _shape_arrayEnergy.setName( "arrayEnergy" );
    _shape_arrayEnergy.setNameOffset( 10, 0 );

    add( _shape_arrayParametrs );
    _shape_arrayParametrs.setShapeName( "_shape_arrayParametrs" );
    _shape_arrayParametrs.setPos( 80, 110 );
    _shape_arrayParametrs.setFillColor( new Color( 10526975 ) );
    _shape_arrayParametrs.setStateVariable( true );
    _shape_arrayParametrs.setName( "arrayParametrs" );
    _shape_arrayParametrs.setNameOffset( 10, 0 );

    add( _shape_arrayEventJournal );
    _shape_arrayEventJournal.setShapeName( "_shape_arrayEventJournal" );
    _shape_arrayEventJournal.setPos( 80, 140 );
    _shape_arrayEventJournal.setFillColor( new Color( 10526975 ) );
    _shape_arrayEventJournal.setStateVariable( true );
    _shape_arrayEventJournal.setName( "arrayEventJournal" );
    _shape_arrayEventJournal.setNameOffset( 10, 0 );
  }

  public void init() {
    super.init();
  }

  public void update() {
    super.update();
  }

    public ShapeVar _shape_arrayEventJournal = new ShapeVar();
    public ShapeVar _shape_arrayParametrs = new ShapeVar();
    public ShapeVar _shape_arrayEnergy = new ShapeVar();
    public ShapeVar _shape_arrayPowerProfile = new ShapeVar();
    public ShapeVar _shape_arrayCountCfg = new ShapeVar();
    public ShapeStatechart _shape_oprosAlgoritm = new ShapeStatechart();
    public ShapePort _shape_port = new ShapePort();
    public ShapeBounds _object_SET = new ShapeBounds();
}

  public _StructureGroup structure = null;
  public Group createStructure() {
    return structure != null ? structure : ( structure = new _StructureGroup() );
  }

// _XJ_SECTION_BEGIN( AO.Code )


;
// _XJ_SECTION_END
// Class inner statecharts
// Statechart Type_oprosAlgoritm
public Type_oprosAlgoritm oprosAlgoritm;
class Type_oprosAlgoritm extends Statechart {

  public static final short transition = 1;
  public static final short Опр___парам__р__ = 2;
  public static final short Та_мау__2 = 3;
  public static final short О__р__и____а__а = 4;
  public static final short Та_мау__1 = 5;
  public static final short Т_____а_ала = 6;
  public static final short Начал_ = 7;

  protected Node[] getNodes() { return new Node[]{
    new Node( 4, eInitialMarker, "pointer", -1, -1, 7 ),
    new Node( 8, eTransition, "transition", -1, 7, 6 ),
    new Node( 14, eState, "Опрос параметров", -1 ),
    new Node( 12, eState, "Таймаут_2", -1 ),
    new Node( 11, eState, "Открытие сеанса", -1 ),
    new Node( 9, eState, "Таймаут_1", -1 ),
    new Node( 7, eState, "Тест канала", -1 ),
    new Node( 2, eState, "Начало", -1 ),
  }; }
  protected void calculate( int node, int codeType ) {
    switch ( node ) {
    }
  }

} // end of the Type_oprosAlgoritm statechart
}
