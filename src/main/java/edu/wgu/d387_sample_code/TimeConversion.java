package edu.wgu.d387_sample_code;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {

    public String convertTime() {

        LocalTime timeET = LocalTime.parse("08:00:00", DateTimeFormatter.ISO_LOCAL_TIME);

        LocalDateTime currentDateTime = LocalDateTime.now();

        LocalDateTime dateTimeET = LocalDateTime.of(currentDateTime.toLocalDate(), timeET);

        ZonedDateTime zonedDateTimeET = ZonedDateTime.of(dateTimeET, ZoneId.of("America/New_York"));
        ZonedDateTime zonedDateTimeMT = zonedDateTimeET.withZoneSameInstant(ZoneId.of("America/Denver"));
        LocalTime timeMT = zonedDateTimeMT.toLocalTime();

        ZonedDateTime zonedDateTimeUTC = zonedDateTimeET.withZoneSameInstant(ZoneId.of("UTC"));
        LocalTime timeUTC = zonedDateTimeUTC.toLocalTime();

        return timeET + "ET | " + timeMT.toString() + "MT | " + timeUTC.toString() + "UTC";
    }

}
