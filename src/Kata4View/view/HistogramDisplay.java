/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kata4View.view;

import java.awt.Dimension;
import javax.swing.JPanel;
import Kata4Model.model.Histogram;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Ariadna
 */
public class HistogramDisplay extends ApplicationFrame {
        private Histogram histogram;
    
    public HistogramDisplay(Histogram histogram) {
        super("HISTOGRAMA");
        this.histogram = histogram;
        this.setContentPane(createPanel());
        this.pack();
    }



    private JPanel createPanel() {
        ChartPanel chartpanel = new ChartPanel(createChart(createDataSet()));
        chartpanel.setPreferredSize(new Dimension(500,400));
        return chartpanel;
    }

    public void execute(){
        setVisible(true);
    }
    
    private JFreeChart createChart (DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histogram JFreeChart",
                                                        "Dominios email", 
                                                        "Nº de emails", 
                                                        dataSet, 
                                                        PlotOrientation.VERTICAL, 
                                                        false, 
                                                        false, 
                                                        rootPaneCheckingEnabled);
        return chart;
    }
     
    private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for (Object key : histogram.keySet()) {
            dataset.addValue(histogram.get(key),"", key.toString());
        }
        
        //dataset.addValue(300,"","ulpgc.es");
        //dataset.addValue(200,"","dis.ulpgc.es");
        //dataset.addValue(800,"","gmail.com");
        //dataset.addValue(400,"","hotmail.com");
        //dataset.addValue(16, "","16");
        
        return dataset;
    }
}
