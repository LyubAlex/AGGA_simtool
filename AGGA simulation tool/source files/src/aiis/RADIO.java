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
    _ref_ID.setup( this, "ID", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.ID )
    ID = 0
;
// _XJ_SECTION_END
    RADIO = new Type_RADIO();
    portOut = new Port();
    portOut.setup( "portOut", this );
    portIn = new Port();
    portIn.setup( "portIn", this );
  }

  public void destroy() {
    RADIO = null;
    portOut = null;
    portIn = null;
    super.destroy();
  }

  protected void startup() {
    startThread( RADIO, "RADIO" );
  }


  // Class parameters
  // Structure objects
public int ID;
  public VariableRefDouble _ref_ID = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { ID = (int)_value; }
    public double getDoubleValue() { return (double)ID; } };
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
    setSize( 465, 202 );
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

    add( _shape_RADIO );
    _shape_RADIO.setShapeName( "_shape_RADIO" );
    _shape_RADIO.setPos( 260, 70 );
    _shape_RADIO.setName( "RADIO" );
    _shape_RADIO.setNameOffset( 10, 0 );

    add( _shape_ID );
    _shape_ID.setShapeName( "_shape_ID" );
    _shape_ID.setPos( 80, 20 );
    _shape_ID.setFillColor( new Color( 10526975 ) );
    _shape_ID.setStateVariable( true );
    _shape_ID.setName( "ID" );
    _shape_ID.setNameOffset( 10, 0 );
  }

  public void init() {
    super.init();
  }

  public void update() {
    super.update();
  }

    public ShapeVar _shape_ID = new ShapeVar();
    public ShapeStatechart _shape_RADIO = new ShapeStatechart();
    public ShapePort _shape_portOut = new ShapePort();
    public ShapePort _shape_portIn = new ShapePort();
    public ShapeBounds _object_RADIO = new ShapeBounds();
}

  public _StructureGroup structure = null;
  public Group createStructure() {
    return structure != null ? structure : ( structure = new _StructureGroup() );
  }

// _XJ_SECTION_BEGIN( AO.Code )
boolean nextRADIOChannel,allRADIOChannel = false;
int indexRADIOChannel = 1;

boolean finishRADIO = false;;
// _XJ_SECTION_END
// Class inner statecharts
// Statechart Type_RADIO
public Type_RADIO RADIO;
class Type_RADIO extends Statechart {

  public static final short transition4 = 2;
  public static final short transition5 = 3;
  public static final short transition3 = 4;
  public static final short transition2 = 5;
  public static final short transition1 = 6;
  public static final short transition = 7;
  public static final short Сл_ду__и___а_ал_GSM = 8;
  public static final short Сл_ду__и___ип__а_ала = 9;
  public static final short _р___дура____ди___и_ = 10;
  public static final short Начал_ = 11;

  protected Node[] getNodes() { return new Node[]{
    new Node( 5, eInitialMarker, "pointer1", -1, -1, 11 ),
    new Node( 6, eDynamicChoice, "branch", -1 ),
    new Node( 17, eTransition, "transition4", -1, 8, 9 ),
    new Node( 7, eTransition, "transition5", -1, 9, 11 ),
    new Node( 9, eTransition, "transition3", -1, 10, 8 ),
    new Node( 10, eTransition, "transition2", -1, 1, 9 ),
    new Node( 11, eTransition, "transition1", -1, 1, 10 ),
    new Node( 12, eTransition, "transition", -1, 11, 1 ),
    new Node( 13, eState, "Следующий канал GSM", -1 ),
    new Node( 14, eState, "Следующий тип канала", -1 ),
    new Node( 15, eState, "Процедура соединения", -1 ),
    new Node( 16, eState, "Начало", -1 ),
  }; }
  protected void calculate( int node, int codeType ) {
    switch ( node ) {
// Branch State: branch
      case 1: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.RADIO.6.Action )
if (indexRADIOChannel <= (model.parKolMasRADIO.size())/2)
{nextRADIOChannel = true;}
else 
{allRADIOChannel = true;}
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition3
      case 4: switch ( codeType ) {
        case eTrigger: nodeTriggerDelay( 
// _XJ_SECTION_BEGIN( SC.RADIO.9.Trigger )
uniform(1,3)
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition2
      case 5: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.RADIO.10.Guard )
allRADIOChannel
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition1
      case 6: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.RADIO.11.Guard )
nextRADIOChannel
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition
      case 7: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent( 
// _XJ_SECTION_BEGIN( SC.RADIO.12.Trigger )
"startRADIO"
// _XJ_SECTION_END
          ); break;
      } break;
// State: Следующий канал GSM
      case 8: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.RADIO.13.EntryAction )
indexRADIOChannel++;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Следующий тип канала
      case 9: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.RADIO.14.EntryAction )
model.kolFinishRADIO++;
if (model.kolFinishRADIO==(model.parKolMasRADIO.size())/2)
{model.finishAllRADIO=true;}
;
// _XJ_SECTION_END
          } break;
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.RADIO.14.ExitAction )
allRADIOChannel = false;
indexRADIOChannel = 1;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Процедура соединения
      case 10: switch ( codeType ) {
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.RADIO.15.ExitAction )
nextRADIOChannel = false;
;
// _XJ_SECTION_END
          } break;
      } break;
    }
  }

} // end of the Type_RADIO statechart
}
