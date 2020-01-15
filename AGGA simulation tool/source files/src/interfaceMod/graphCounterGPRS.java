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
import org.jfree.chart.title.LegendTitle;
import org.jfree.ui.HorizontalAlignment;
import org.jfree.ui.RectangleEdge;

public  class graphCounterGPRS     extends  JFrame  {

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

public graphCounterGPRS(String  title,Vector v,Vector v1, String charttitle, String axisY, String axisX, String nameSET, String nameMIR)  {
super(title);
CategoryDataset  dataset  =  createDataset(v, v1, nameSET, nameMIR);
JFreeChart  chart  =  createChart(dataset, charttitle, axisY, axisX);
ChartPanel  chartPanel  =  new  ChartPanel(chart);
if (v.size()==1)
{
  chartPanel.setPreferredSize(new  Dimension(400,400));
}
else if (v.size()==2)
{
  chartPanel.setPreferredSize(new  Dimension(400,400));
}
else{
chartPanel.setPreferredSize(new  Dimension((v.size()*150),400));
}
setContentPane(chartPanel);
}

private  static  CategoryDataset  createDataset(Vector v, Vector v1, String nameSET, String nameMIR)  {

DefaultCategoryDataset  dataset  =  new  DefaultCategoryDataset();
    for(int i =0;i<v.size();i++)
    {
      double a = ((Number)v.elementAt(i)).doubleValue();
 double b=Math.round(a*1000);
      dataset.setValue((b/1000),nameSET,""+(i+1));

    }
    for(int i =0;i<v1.size();i++)
    {
      double a = ((Number)v1.elementAt(i)).doubleValue();
 double b=Math.round(a*1000);
      dataset.setValue((b/1000),nameMIR,""+(i+1));

    }
  return  dataset;
  }

private  static  JFreeChart  createChart(CategoryDataset  dataset, String charttitle, String axisY, String axisX)  {
JFreeChart  chart  =  ChartFactory.createBarChart3D(
//"������� �������� ������� ������ ������ �������� � ������",	//  chart  title
charttitle,
//"����� GPRS",	//  domain  axis  label
axisX,
//"�����, �����",	//  range  axis  label
axisY,
dataset,	//  data
PlotOrientation.VERTICAL,
true,
true,
false
);
  chart.setBackgroundPaint(Color.white);
  chart.getTitle().setFont(new Font("Arial",  Font.PLAIN,  12));
  CategoryPlot  plot  =  chart.getCategoryPlot();
  plot.setBackgroundPaint(Color.lightGray);
  plot.setDomainGridlinePaint(Color.white);
  plot.setRangeGridlinePaint(Color.white);
  LegendTitle legend=chart.getLegend();
  legend.setHorizontalAlignment(HorizontalAlignment.LEFT);
  legend.setPosition(RectangleEdge.RIGHT);

  BarRenderer  rendererBar  = (BarRenderer)  plot.getRenderer();
  rendererBar.setSeriesPaint(0,new Color(43,223,223));
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

