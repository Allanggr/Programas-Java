import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 59))
        {

            return INVALID_VALUE_MESSAGE;

        }else {
            int hours = minutes / 60;
            int restHours = minutes % 60;

            String hoursString = hours + "h";
            if(hours < 10){
                hoursString = "0" + hoursString;
            }

            String minutesSrting = restHours + "m";
            if(restHours < 10){
                minutesSrting = "0" + minutesSrting;
            }

            String secondsString = seconds + "s";
            if(seconds < 10){
                secondsString = "0" + seconds;
            }

            return hoursString + " " + minutesSrting + " " + secondsString;
        }

    }

    private static String getDurationString(int seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }else {
            int minutes = seconds / 60;
            int remainingSec = seconds % 60;
            return getDurationString(minutes,remainingSec);
        }


    }
}
