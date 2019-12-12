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
    _ref_statusOprosa.setup( this, "statusOprosa", true );
// _XJ_SECTION_BEGIN( AO.Initial.0.statusOprosa )
    statusOprosa = false
;
// _XJ_SECTION_END
    _ref_help.setup( this, "help", true );
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
0
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
0
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
0
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
0
// _XJ_SECTION_END
;

  public void setParams( double parVerUstGSM, double parVerEndGSM, double parVrEndGSM, double parVrUstGSM ) {
    set_parVerUstGSM( parVerUstGSM );
    set_parVerEndGSM( parVerEndGSM );
    set_parVrEndGSM( parVrEndGSM );
    set_parVrUstGSM( parVrUstGSM );
  }

  // Structure objects
public boolean statusOprosa;
  public VariableRefDouble _ref_statusOprosa = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { statusOprosa = _value != 0 ? true : false; }
    public double getDoubleValue() { return statusOprosa ? 1.0 : 0.0; } };
public double help;
  public VariableRefDouble _ref_help = new VariableRefDouble() {
    public void   setDoubleValue( double _value ) { help = (double)_value; }
    public double getDoubleValue() { return (double)help; } };
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
    setActiveObject( GSM.this );
    super.setup();
    setSize( 412, 202 );
    setOrigin( -6, -1 );

    add( _object_GSM );
    _object_GSM.setShapeName( "_object_GSM" );
    _object_GSM.setPos( 0, 0 );
    _object_GSM.setSize( 400, 200 );
    _object_GSM.setName( "GSM" );
    _object_GSM.setNameOffset( 10, 10 );

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

    add( _shape_GSM );
    _shape_GSM.setShapeName( "_shape_GSM" );
    _shape_GSM.setPos( 350, 20 );
    _shape_GSM.setName( "GSM" );
    _shape_GSM.setNameOffset( 10, 0 );

    add( _shape_help );
    _shape_help.setShapeName( "_shape_help" );
    _shape_help.setPos( 20, 180 );
    _shape_help.setFillColor( new Color( 10526975 ) );
    _shape_help.setStateVariable( true );
    _shape_help.setName( "help" );
    _shape_help.setNameOffset( 10, 0 );

    add( _shape_statusOprosa );
    _shape_statusOprosa.setShapeName( "_shape_statusOprosa" );
    _shape_statusOprosa.setPos( 320, 50 );
    _shape_statusOprosa.setFillColor( new Color( 10526975 ) );
    _shape_statusOprosa.setStateVariable( true );
    _shape_statusOprosa.setName( "statusOprosa" );
    _shape_statusOprosa.setNameOffset( 10, 0 );
  }

  public void init() {
    super.init();
  }

  public void update() {
    super.update();
  }

    public ShapeVar _shape_statusOprosa = new ShapeVar();
    public ShapeVar _shape_help = new ShapeVar();
    public ShapeStatechart _shape_GSM = new ShapeStatechart();
    public ShapePort _shape_portOut = new ShapePort();
    public ShapePort _shape_portIn = new ShapePort();
    public ShapeBounds _object_GSM = new ShapeBounds();
}

  public _StructureGroup structure = null;
  public Group createStructure() {
    return structure != null ? structure : ( structure = new _StructureGroup() );
  }

// _XJ_SECTION_BEGIN( AO.Code )
boolean triCall,triCallfalse,dvaCall,odinCall = false;
boolean nextGsmChannel,allGsmChannel,nowSET,nowMIR = false;
int indexChannel = 1;

boolean finishGSM = false;

;
// _XJ_SECTION_END
// Class inner statecharts
// Statechart Type_GSM
public Type_GSM GSM;
class Type_GSM extends Statechart {

  public static final short transition18 = 5;
  public static final short transition17 = 6;
  public static final short transition16 = 7;
  public static final short transition15 = 8;
  public static final short transition14 = 9;
  public static final short transition13 = 10;
  public static final short transition12 = 11;
  public static final short transition8 = 12;
  public static final short transition7 = 13;
  public static final short transition6 = 14;
  public static final short transition5 = 15;
  public static final short transition4 = 16;
  public static final short transition2 = 17;
  public static final short transition1 = 18;
  public static final short transition11 = 19;
  public static final short transition10 = 20;
  public static final short transition9 = 21;
  public static final short transition3 = 22;
  public static final short transition = 23;
  public static final short Сл_ду__и___ип__а_ала = 24;
  public static final short Сл_ду__и___а_ал_GSM = 25;
  public static final short Опр____чё_чи_а_МИР = 26;
  public static final short Опр____чё_чи_а_С_Т = 27;
  public static final short Разр______ди___и_ = 28;
  public static final short У__а___л__и_____ди___и_ = 29;
  public static final short Д_а_д_з___а = 30;
  public static final short Три_д_з___а = 31;
  public static final short Оди__д_з___ = 32;
  public static final short _р___дура_д_з___а = 33;
  public static final short Начал_ = 34;

  protected Node[] getNodes() { return new Node[]{
    new Node( 4, eInitialMarker, "pointer", -1, -1, 34 ),
    new Node( 50, eDynamicChoice, "branch3", -1 ),
    new Node( 40, eDynamicChoice, "branch", -1 ),
    new Node( 8, eDynamicChoice, "branch2", -1 ),
    new Node( 9, eDynamicChoice, "branch1", -1 ),
    new Node( 58, eTransition, "transition18", -1, 24, 34 ),
    new Node( 57, eTransition, "transition17", -1, 1, 24 ),
    new Node( 55, eTransition, "transition16", -1, 1, 33 ),
    new Node( 49, eTransition, "transition15", -1, 25, 1 ),
    new Node( 48, eTransition, "transition14", -1, 28, 25 ),
    new Node( 45, eTransition, "transition13", -1, 26, 28 ),
    new Node( 44, eTransition, "transition12", -1, 27, 28 ),
    new Node( 43, eTransition, "transition8", -1, 2, 26 ),
    new Node( 41, eTransition, "transition7", -1, 2, 27 ),
    new Node( 27, eTransition, "transition6", -1, 29, 2 ),
    new Node( 25, eTransition, "transition5", -1, 32, 29 ),
    new Node( 24, eTransition, "transition4", -1, 30, 29 ),
    new Node( 23, eTransition, "transition2", -1, 31, 29 ),
    new Node( 21, eTransition, "transition1", -1, 33, 4 ),
    new Node( 13, eTransition, "transition11", -1, 3, 32 ),
    new Node( 14, eTransition, "transition10", -1, 3, 30 ),
    new Node( 15, eTransition, "transition9", -1, 4, 3 ),
    new Node( 16, eTransition, "transition3", -1, 4, 31 ),
    new Node( 6, eTransition, "transition", -1, 34, 1 ),
    new Node( 56, eState, "Следующий тип канала", -1 ),
    new Node( 47, eState, "Следующий канал GSM", -1 ),
    new Node( 38, eState, "Опрос счётчика МИР", -1 ),
    new Node( 34, eState, "Опрос счётчика СЭТ", -1 ),
    new Node( 28, eState, "Разрыв соединения", -1 ),
    new Node( 22, eState, "Установление соединения", -1 ),
    new Node( 18, eState, "Два дозвона", -1 ),
    new Node( 19, eState, "Три дозвона", -1 ),
    new Node( 20, eState, "Один дозвон", -1 ),
    new Node( 7, eState, "Процедура дозвона", -1 ),
    new Node( 2, eState, "Начало", -1 ),
  }; }
  protected void calculate( int node, int codeType ) {
    switch ( node ) {
// Branch State: branch3
      case 1: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.50.Action )
if (indexChannel <= (model.parKolMasGSM.size())/2)
{nextGsmChannel = true;}
else 
{allGsmChannel = true;}
;
// _XJ_SECTION_END
          } break;
      } break;
// Branch State: branch
      case 2: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.40.Action )
if (statusOprosa == false)
{nowSET=true;}
else if (statusOprosa == true)
{nowMIR=true;}
;
// _XJ_SECTION_END
          } break;
      } break;
// Branch State: branch2
      case 3: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.8.Action )
triCallfalse = false;
if (parVerUstGSM > 80 && parVerUstGSM <= 90){
dvaCall = true;}
else if (parVerUstGSM > 90 && parVerUstGSM <= 100){
odinCall = true;}
;
// _XJ_SECTION_END
          } break;
      } break;
// Branch State: branch1
      case 4: switch ( codeType ) {
        case eAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.9.Action )
if (parVerUstGSM <= 80 ){
triCall = true;
}  else
{triCallfalse = true;}
;
// _XJ_SECTION_END
          } break;
      } break;
// Transition: transition17
      case 6: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GSM.57.Guard )
allGsmChannel
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition16
      case 7: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GSM.55.Guard )
nextGsmChannel
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition14
      case 9: switch ( codeType ) {
        case eTrigger: nodeTriggerDelay( 
// _XJ_SECTION_BEGIN( SC.GSM.48.Trigger )
parVrEndGSM/model.scale
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition8
      case 12: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GSM.43.Guard )
nowMIR
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition7
      case 13: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GSM.41.Guard )
nowSET
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition5
      case 15: switch ( codeType ) {
        case eTrigger: nodeTriggerDelay( 
// _XJ_SECTION_BEGIN( SC.GSM.25.Trigger )
1*parVrUstGSM/model.scale
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition4
      case 16: switch ( codeType ) {
        case eTrigger: nodeTriggerDelay( 
// _XJ_SECTION_BEGIN( SC.GSM.24.Trigger )
2*parVrUstGSM/model.scale
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition2
      case 17: switch ( codeType ) {
        case eTrigger: nodeTriggerDelay( 
// _XJ_SECTION_BEGIN( SC.GSM.23.Trigger )
3*parVrUstGSM/model.scale
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition11
      case 19: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GSM.13.Guard )
odinCall
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition10
      case 20: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GSM.14.Guard )
dvaCall
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition9
      case 21: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GSM.15.Guard )
triCallfalse
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition3
      case 22: switch ( codeType ) {
        case eGuard: nodeGuard(
// _XJ_SECTION_BEGIN( SC.GSM.16.Guard )
triCall
// _XJ_SECTION_END
          ); break;
      } break;
// Transition: transition
      case 23: switch ( codeType ) {
        case eTrigger: nodeTriggerSignalEvent( 
// _XJ_SECTION_BEGIN( SC.GSM.6.Trigger )
"startGSM"
// _XJ_SECTION_END
          ); break;
      } break;
// State: Следующий тип канала
      case 24: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.56.EntryAction )
//model.nextTypeChannel = true;
model.test.set(0,0,0);

finishGSM = true;

//model.askCounter.fireEvent("nextChannel");
;
// _XJ_SECTION_END
          } break;
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.56.ExitAction )
allGsmChannel = false;
indexChannel =1;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Следующий канал GSM
      case 25: switch ( codeType ) {
        case eEntryAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.47.EntryAction )
indexChannel++;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Опрос счётчика МИР
      case 26: switch ( codeType ) {
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.38.ExitAction )
nowMIR = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Опрос счётчика СЭТ
      case 27: switch ( codeType ) {
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.34.ExitAction )
nowSET = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Два дозвона
      case 30: switch ( codeType ) {
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.18.ExitAction )
dvaCall = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Три дозвона
      case 31: switch ( codeType ) {
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.19.ExitAction )
triCall = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Один дозвон
      case 32: switch ( codeType ) {
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.20.ExitAction )
odinCall = false;
;
// _XJ_SECTION_END
          } break;
      } break;
// State: Процедура дозвона
      case 33: switch ( codeType ) {
        case eExitAction: { 
// _XJ_SECTION_BEGIN( SC.GSM.7.ExitAction )
nextGsmChannel = false;
;
// _XJ_SECTION_END
          } break;
      } break;
    }
  }

} // end of the Type_GSM statechart
}
