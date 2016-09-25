package exercises.methods.p10DateModifier;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class DateModifier {

    private Long dayDifference;

    public DateModifier(String dateFrom, String dateTo) {
        this.dayDifference=Math.abs(calculateDiffrenceBetweenDates(dateFrom,dateTo));
    }

    public Long getDayDifference() {
        return dayDifference;
    }



    private static Long calculateDiffrenceBetweenDates(String dateFrom, String dateTo){
        Integer[]dateFromParams= Arrays.asList(dateFrom.split("\\s+"))
                                .stream()
                                .map(s->Integer.parseInt(s))
                                .toArray(Integer[]::new);
        Integer[]dateToParams= Arrays.asList(dateTo.split("\\s+"))
                .stream()
                .map(s->Integer.parseInt(s))
                .toArray(Integer[]::new);
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();

        start.set(dateFromParams[0], dateFromParams[1], dateFromParams[2]);
        end.set(dateToParams[0], dateToParams[1], dateToParams[2]);
        Date startDate = start.getTime();
        Date endDate = end.getTime();
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long diffTime = endTime - startTime;
        long diffDays = diffTime / (1000 * 60 * 60 * 24);
        return diffDays;
    }

}
