package Kata4Model.model;

public class Mail {
    private String mail;

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain(){
        return this.mail.substring(this.mail.indexOf("@") + 1);
    }
    
    public static boolean isMail(String line){
        return line.matches("^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$");
    }
    
    
}
