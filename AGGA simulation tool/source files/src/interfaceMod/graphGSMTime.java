package interfaceMod;

import javax.swing.JFrame;
import org.jfree.chart.labels.AbstractCategoryItemLabelGenerator;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import java.text.NumberFormat;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartPanel;
import java.awt.Dimension;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import java.awt.Color;
import java.awt.Font;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.plot.PlotOrientation;
import java.util.Vector;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.labels.ItemLabelPosition;

public  class  graphGSMTime  extends  JFrame  {

static  class  LabelGenerator  extends  AbstractCategoryItemLabelGenerator implements  CategoryItemLabelGenerator  {
private  double  threshold;
public  LabelGenerator(double  threshold)
{
  super("",  NumberFormat.getInstance()); this.threshold  =  threshold;
}

public  String  generateLabel(CategoryDataset  dataset, int  series, int  category)
{
String  result  =  null;
Number  value  =  dataset.getValue(series,  category);
result  =  value.toString();

return  result;
}
}

public  graphGSMTime(String  title,Vector v,Vector v1,Vector v2, String charttitle, String axisY, String axisX, String Ust, String trans, String discon)  {
super(title);

CategoryDataset  dataset  =  createDataset(v,v1,v2, Ust, trans, discon);
JFreeChart  chart  =  createChart(dataset, charttitle, axisY, axisX);
ChartPanel  chartPanel  =  new  ChartPanel(chart);
if (v.size()==1)
{
  chartPanel.setPreferredSize(new  Dimension(300,400));
}
else if (v.size()==2)
{
  chartPanel.setPreferredSize(new  Dimension(300,400));
}
else{
chartPanel.setPreferredSize(new  Dimension((v.size()*100),400));
}
setContentPane(chartPanel);
}

private  static  CategoryDataset  createDataset(Vector v, Vector v1, Vector v2, String Ust, String trans, String discon)  {
DefaultCategoryDataset  dataset  =  new  DefaultCategoryDataset();

  for(int i =0;i<v1.size();i++)
{
 double a = ((Number)v1.elementAt(i)).doubleValue();
 double b=Math.round(a*100);
 dataset.setValue(b/100, Ust, ""+(i+1));
}
    for(int i =0;i<v.size();i++)
    {
     double a = ((Number)v.elementAt(i)).doubleValue();
     double b=Math.round(a*100);
     dataset.setValue(b/100,trans,""+(i+1));
    }
    for(int i =0;i<v2.size();i++)
{
 double a = ((Number)v2.elementAt(i)).doubleValue();
 double b=Math.round(a*100);
 dataset.setValue(b/100,discon,""+(i+1));
}
return  dataset;
}

private  static  JFreeChart  createChart(CategoryDataset  dataset, String charttitle, String axisY, String axisX)  {
JFreeChart  chart  =  ChartFactory.createBarChart3D(
//"Среднее значение времи опроса по каждому каналу",	//  chart  title
charttitle,
//"Канал GSM CSD",	//  domain  axis  label
axisX,
//"Время, минут",	//  range  axis  label
axisY,
dataset,	//  data
PlotOrientation.VERTICAL,
true,
true,
false	//  URLs?
);
  chart.setBackgroundPaint(Color.white);
  chart.getTitle().setFont(new Font("Arial",  Font.PLAIN,  12));
  CategoryPlot  plot  =  chart.getCategoryPlot();
  plot.setBackgroundPaint(Color.lightGray);
  plot.setDomainGridlinePaint(Color.white);
  plot.setRangeGridlinePaint(Color.white);
  BarRenderer  rendererBar  = (BarRenderer)  plot.getRenderer();
  rendererBar.setSeriesPaint(0,new Color(52,237,242));
  rendererBar.setSeriesPaint(1,new Color(44,250,73));
  rendererBar.setSeriesPaint(2,new Color(234,243,51));
  rendererBar.setItemLabelFont(new Font("Arial",  Font.BOLD,  12));
  rendererBar.setPositiveItemLabelPosition(new ItemLabelPosition());
  NumberAxis  rangeAxis  =  (NumberAxis)  plot.getRangeAxis();
  rangeAxis.setUpperMargin(0.15);
  CategoryItemRenderer  renderer  =  plot.getRenderer();
  renderer.setItemLabelGenerator(new  LabelGenerator(30));
  renderer.setItemLabelsVisible(true);
  return  chart;
}
}
