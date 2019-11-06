package Kata4Control.crontol;

import Kata4Model.model.Histogram;
import Kata4Model.model.Mail;
import Kata4View.view.HistogramDisplay;
import Kata4View.view.MailHistogramBuilder;
import Kata4View.view.MailListReader;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        /**Histogram histogram = new Histogram();
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("google.com");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");**/
        
        String fileName = new String("email.txt");
        /* I */List<Mail> listMail = MailListReader.read(fileName);
        /* P */Histogram histogram = MailHistogramBuilder.build(listMail);
        /* O */HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        /* O */histogramDisplay.execute(); // Esto lo que hace es ponerlo visible
        
    }
    
}
