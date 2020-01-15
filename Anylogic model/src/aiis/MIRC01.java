// MIRC01.java

package aiis;

import java.util.Vector;
import java.util.Hashtable;
import java.awt.Color;
import com.xj.jama.Matrix;
import com.xj.anylogic.*;
import com.xj.anylogic.animation.*;
import com.xj.random.*;


public class MIRC01 extends ActiveObject
 {

  public static void main( String[] args ) {
    System.out.println( "...started..." );
    try {
      Engine.setRoot( new MIRC01() );
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
    return "aiis.MIRC01";
  }

  public void create() {
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
  // Structure objects
  public Port port;

// Group class for group _IconGroup
public class _IconGroup extends Group {

  public void setup() {
    setActiveObject( MIRC01.this );
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
    setActiveObject( MIRC01.this );
    super.setup();
    setSize( 407, 312 );
    setOrigin( -6, -81 );

    add( _object_MIRC01 );
    _object_MIRC01.setShapeName( "_object_MIRC01" );
    _object_MIRC01.setPos( 0, -80 );
    _object_MIRC01.setSize( 400, 310 );
    _object_MIRC01.setName( "MIRC01" );
    _object_MIRC01.setNameOffset( 10, 10 );

    add( _shape_port );
    _shape_port.setShapeName( "_shape_port" );
    _shape_port.setPos( 0, 75 );
    _shape_port.setFillColor( new Color( 16777215 ) );
    _shape_port.setName( "port" );
    _shape_port.setNameOffset( 10, 0 );

    add( _shape_oprosAlgoritm );
    _shape_oprosAlgoritm.setShapeName( "_shape_oprosAlgoritm" );
    _shape_oprosAlgoritm.setPos( 110, -20 );
    _shape_oprosAlgoritm.setName( "oprosAlgoritm" );
    _shape_oprosAlgoritm.setNameOffset( 10, 0 );
  }

  public void init() {
    super.init();
  }

  public void update() {
    super.update();
  }

    public ShapeStatechart _shape_oprosAlgoritm = new ShapeStatechart();
    public ShapePort _shape_port = new ShapePort();
    public ShapeBounds _object_MIRC01 = new ShapeBounds();
}

  public _StructureGroup structure = null;
  public Group createStructure() {
    return structure != null ? structure : ( structure = new _StructureGroup() );
  }

// _XJ_SECTION_BEGIN( AO.Code )
public static boolean startMIR = false;;
// _XJ_SECTION_END
// Class inner statecharts
// Statechart Type_oprosAlgoritm
public Type_oprosAlgoritm oprosAlgoritm;
class Type_oprosAlgoritm extends Statechart {

  public static final short state = 1;

  protected Node[] getNodes() { return new Node[]{
    new Node( 4, eInitialMarker, "pointer", -1, -1, 1 ),
    new Node( 2, eState, "state", -1 ),
  }; }
  protected void calculate( int node, int codeType ) {
    switch ( node ) {
    }
  }

} // end of the Type_oprosAlgoritm statechart
}
