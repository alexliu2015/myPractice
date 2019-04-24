import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Solution {
    public int myAtoi(String str) {
        int res = 0;
        int pos = 1;
        int startIndex = 0;
        boolean overFlow = false;
        String temp = str.trim();
        if(temp == null || temp.length() == 0){
            return 0;
        }
        if(temp.charAt(0) == '-') {
            pos = -1;
            startIndex = 1;
        }else if(temp.charAt(0) == '+'){
            startIndex = 1;
        }

        for(int i = startIndex; i < temp.length(); i++){
            if(!Character.isDigit(temp.charAt(i))){
                break;
            }else if(Character.isDigit(temp.charAt(i))){
                try{
                    res = Math.multiplyExact(res, 10);
                    res = Math.addExact(res, Character.getNumericValue(temp.charAt(i)));
                }catch(ArithmeticException e){
                    overFlow = true;
                    break;
                }
            }
        }

        if(overFlow && pos == -1){
            return Integer.MIN_VALUE;
        }else if(overFlow){
            return Integer.MAX_VALUE;
        }
        return pos * res;
    }

    public static void main(String[] args){
        String s = new String("2019-03-10");
        int year = Integer.parseInt(s.substring(0,4));
        int month = Integer.parseInt(s.substring(5,7));
        int day = Integer.parseInt(s.substring(8,10));

//        System.out.println(year + " " + month + " " + day);

        LocalDateTime beforeDST = LocalDateTime.of(year, month, day, 0, 0);
        ZoneId est = ZoneId.of("America/New_York");
        ZonedDateTime zonedBeforeDST = beforeDST.atZone(est);
        System.out.println(zonedBeforeDST);
        Timestamp sqlTime = Timestamp.from(zonedBeforeDST.toInstant());
        System.out.println(sqlTime);
    }
}
