// RADIO.java

package aiis;

import java.util.Vector;
import java.util.Hashtable;
import java.awt.Color;
import com.xj.jama.Matrix;
import com.xj.anylogic.*;
import com.xj.anylogic.animation.*;
import com.xj.random.*;


public class RADIO extends ActiveObject
 {

  public static void main( String[] args ) {
    System.out.println( "...started..." );
    try {
      Engine.setRoot( new RADIO() );
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
    return "aiis.RADIO";
  }

  public void create() {
    portOut = new Port();
    portOut.setup( "portOut", this );
    portIn = new Port();
    portIn.setup( "portIn", this );
  }

  public void destroy() {
    portOut = null;
    portIn = null;
    super.destroy();
  }

  protected void startup() {
  }


  // Class parameters
  // Structure objects
  public Port portOut;
  public Port portIn;

// Group class for group _IconGroup
public class _IconGroup extends Group {

  public void setup() {
    setActiveObject( RADIO.this );
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
    setActiveObject( RADIO.this );
    super.setup();
    setSize( 412, 202 );
    setOrigin( -6, -1 );

    add( _object_RADIO );
    _object_RADIO.setShapeName( "_object_RADIO" );
    _object_RADIO.setPos( 0, 0 );
    _object_RADIO.setSize( 400, 200 );
    _object_RADIO.setName( "RADIO" );
    _object_RADIO.setNameOffset( 10, 10 );

    add( _shape_portIn );
    _shape_portIn.setShapeName( "_shape_portIn" );
    _shape_portIn.setPos( 0, 100 );
    _shape_portIn.setFillColor( new Color( 16777215 ) );
    _shape_portIn.setName( "portIn" );
    _shape_portIn.setNameOffset( 10, 0 );

    add( _shape_portOut );
    _shape_portOut.setShapeName( "_shape_portOut" );
    _shape_portOut.setPos( 400, 100 );
    _shape_portOut.setFillColor( new Color( 16777215 ) );
    _shape_portOut.setName( "portOut" );
    _shape_portOut.setNameOffset( 10, 0 );
  }

  public void init() {
    super.init();
  }

  public void update() {
    super.update();
  }

    public ShapePort _shape_portOut = new ShapePort();
    public ShapePort _shape_portIn = new ShapePort();
    public ShapeBounds _object_RADIO = new ShapeBounds();
}

  public _StructureGroup structure = null;
  public Group createStructure() {
    return structure != null ? structure : ( structure = new _StructureGroup() );
  }

// _XJ_SECTION_BEGIN( AO.Code )
boolean finishRADIO = false;;
// _XJ_SECTION_END
// Class inner statecharts
}
