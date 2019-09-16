import java.time.Duration;

public class Playlist {

    public static int countLength(Song... songs){ //vararg- przyjmie tu tyle argumentów ile dostanie z klasy start i zrobi z nich tablice.
        int totalTime=0;
        for (Song song : songs) {  //tą tablice
            totalTime+=song.getLengthInSeconds();
        }
        return totalTime;
    }

    public static String getFormatedLength(int seconds) {
    Duration duration = Duration.ofSeconds(seconds);
    int hours = duration.toHoursPart();
    int minutes = duration.toMinutesPart();
        seconds = duration.toSecondsPart();
    String hoursPart = timeToString(hours);
    String minutesPart = timeToString(minutes);
    String secondsPart = timeToString(seconds);

    return hoursPart+":"+minutesPart+":"+secondsPart;
    }

    public static String timeToString(int hours){
        String time;
        if(hours ==0)
            time ="00";
        else if(hours<10)
            time = "0"+hours;
        else
            time = Integer.toString(hours);
        return time;
    }
}



