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

public  class  graphGPRSTime  extends  JFrame  {

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

public  graphGPRSTime(String  title, Vector v, String charttitle, String axisY, String axisX)  {
super(title);

CategoryDataset  dataset  =  createDataset(v);
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

private  static  CategoryDataset  createDataset(Vector v)  {
DefaultCategoryDataset  dataset  =  new  DefaultCategoryDataset();
  for(int i =0;i<v.size();i++)
  {
   double a = ((Number)v.elementAt(i)).doubleValue();
   double b=Math.round(a*100);
   dataset.setValue(b/100,"1",""+(i+1));
  }
return  dataset;
}

private  static  JFreeChart  createChart(CategoryDataset  dataset, String charttitle, String axisY, String axisX)  {

JFreeChart  chart  =  ChartFactory.createBarChart3D(
//"Среднее значение времи опроса по каждому каналу",	//  chart  title
charttitle,
//"Канал GPRS",	//  domain  axis  label
axisX,
//"Время, минут",	//  range  axis  label
axisY,
dataset,	//  data
PlotOrientation.VERTICAL,
false,
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
  rendererBar.setSeriesPaint(0,new Color(103,177,187));
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
