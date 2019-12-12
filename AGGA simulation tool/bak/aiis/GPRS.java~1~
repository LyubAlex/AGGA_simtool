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

  public void create() {
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


  // Class parameters
  // Structure objects
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
    setActiveObject( GPRS.this );
    super.setup();
    setSize( 412, 202 );
    setOrigin( -6, -1 );

    add( _object_GPRS );
    _object_GPRS.setShapeName( "_object_GPRS" );
    _object_GPRS.setPos( 0, 0 );
    _object_GPRS.setSize( 400, 200 );
    _object_GPRS.setName( "GPRS" );
    _object_GPRS.setNameOffset( 10, 10 );

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

    add( _shape_GPRS );
    _shape_GPRS.setShapeName( "_shape_GPRS" );
    _shape_GPRS.setPos( 210, 70 );
    _shape_GPRS.setName( "GPRS" );
    _shape_GPRS.setNameOffset( 10, 0 );
  }

  public void init() {
    super.init();
  }

  public void update() {
    super.update();
  }

    public ShapeStatechart _shape_GPRS = new ShapeStatechart();
    public ShapePort _shape_portOut = new ShapePort();
    public ShapePort _shape_portIn = new ShapePort();
    public ShapeBounds _object_GPRS = new ShapeBounds();
}

  public _StructureGroup structure = null;
  public Group createStructure() {
    return structure != null ? structure : ( structure = new _StructureGroup() );
  }

// _XJ_SECTION_BEGIN( AO.Code )
boolean nextGPRSChannel,allGPRSChannel = false;
int indexGPRSChannel = 1;

boolean finishGPRS = false;;
// _XJ_SECTION_END
// Class inner statecharts
// Statechart Type_GPRS
public Type_GPRS GPRS;
class Type_GPRS extends Statechart {

  public static final short transition5 = 2;
  public static final short transition4 = 3;
  public static final short transition3 = 4;
  public static final short transition2 = 5;
  public static final short transition1 = 6;
  public static final short transition = 7;
  public static final short Сл_ду__и___а_ал_GSM = 8;
  public static final short Сл_ду__и___ип__а_ала = 9;
  public static final short _р___дура____ди___и_ = 10;
  public static final short Начал_ = 11;

  protected Node[] getNodes() { return new Node[]{
    new Node( 4, eInitialMarker, "pointer", -1, -1, 11 ),
    new Node( 8, eDynamicChoice, "branch", -1 ),
    new Node( 17, eTransition, "transition5", -1, 9, 11 ),
    new Node( 16, eTransition, "transition4", -1, 8, 1 ),
    new Node( 15, eTransition, "transition3", -1, 10, 8 ),
    new Node( 13, eTransition, "transition2", -1, 1, 9 ),
    new Node( 12, eTransition, "transition1", -1, 1, 10 ),
    new Node( 5, eTransition, "transition", -1, 11, 1 ),
    new Node( 14, eState, "Следующий канал GSM", -1 ),
    new Node( 9, eState, "Следующий тип канала", -1 ),
    new Node( 10, eState, "Процедура соединения", -1 ),
    new Node( 2, eState, "Начало", -1 ),
  }; }
  protected void calculate( int node, int codeType ) {
    switch ( node ) {
// Branch State: branch
      case 1: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.8.Action )
if (indexGPRSChannel <= (model.parKolMasGPRS.size())/2)
{nextGPRSChannel = true;}
else 
{allGPRSChannel = true;}
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition2
      case 5: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GPRS.13.Guard )
allGPRSChannel
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition1
      case 6: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GPRS.12.Guard )
nextGPRSChannel
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition
      case 7: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent( 
// _XJ_SECTION_BEGIN( SC.GPRS.5.Trigger )
"startGPRS"
// _XJ_SECTION_END
          ); break;
      } break;
// State: Следующий канал GSM
      case 8: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.14.EntryAction )
indexGPRSChannel++;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Следующий тип канала
      case 9: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.9.EntryAction )
//model.nextTypeChannel = true;


finishGPRS = true;




model.test.set(0,1,0);
//model.askCounter.fireEvent("nextChannel");
;
// _XJ_SECTION_END
          } break;
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.9.ExitAction )
allGPRSChannel = false;
indexGPRSChannel = 1;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Процедура соединения
      case 10: switch ( codeType ) {
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GPRS.10.ExitAction )
nextGPRSChannel = false;
;
// _XJ_SECTION_END
          } break;
      } break;
    }
  }

} // end of the Type_GPRS statechart
}
