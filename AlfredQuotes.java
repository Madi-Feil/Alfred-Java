import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, my name is Alfred and I am here to help you with all your needs!";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        return String.format ("Good %s %s! It is wonderful to see you on this lovely day!", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
        return String.format ("Today is %s", new Date());
    }
    
    public String respondBeforeAlexis(String phrase) {
        if(phrase.indexOf("Alexis") > -1) {
            return "I'm not quite sure how much he will be able to help, but I am a better fit";
        }
        if(phrase.indexOf("Alfred") > -1) {
            return "Here to please you ma'am, what can I do for you today?";
        }
            
            return "If you do not need further assitance, I will deactivate for now.";
    }
}

