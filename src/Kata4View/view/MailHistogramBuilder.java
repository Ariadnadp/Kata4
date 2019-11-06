package Kata4View.view;

import Kata4Model.model.Histogram;
import Kata4Model.model.Mail;
import java.util.List;

public class MailHistogramBuilder {

    public static Histogram build(List<Mail> listMail) {
        Histogram<String> histogram = new Histogram();
        
        for (Mail mail : listMail) 
            histogram.increment(mail.getDomain());
        
        
        return histogram;
    }
    
}
