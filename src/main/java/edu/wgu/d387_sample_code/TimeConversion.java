package edu.wgu.d387_sample_code;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {

    public String convertTime() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
//        LocalTime timeET = LocalTime.parse("10:00:00", DateTimeFormatter.ISO_LOCAL_TIME);
//        System.out.println(timeET);
//
//        // Convert from Eastern Time (ET) to Mountain Time (MT)
//        ZonedDateTime zonedDateTimeET = ZonedDateTime.of(LocalDateTime.from(timeET), ZoneId.of("America/New_York"));
//        ZonedDateTime zonedDateTimeMT = zonedDateTimeET.withZoneSameInstant(ZoneId.of("America/Denver"));
//        LocalTime timeMT = zonedDateTimeMT.toLocalTime();
//
//        // Convert from Eastern Time (ET) to Coordinated Universal Time (UTC)
//        ZonedDateTime zonedDateTimeUTC = zonedDateTimeET.withZoneSameInstant(ZoneId.of("UTC"));
//        LocalTime timeUTC = zonedDateTimeUTC.toLocalTime();

        LocalTime timeET = LocalTime.parse("08:00:00", DateTimeFormatter.ISO_LOCAL_TIME);

        // Get the current date
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Create a LocalDateTime object with the same date and the parsed time
        LocalDateTime dateTimeET = LocalDateTime.of(currentDateTime.toLocalDate(), timeET);

        // Convert from Eastern Time (ET) to Mountain Time (MT)
        ZonedDateTime zonedDateTimeET = ZonedDateTime.of(dateTimeET, ZoneId.of("America/New_York"));
        ZonedDateTime zonedDateTimeMT = zonedDateTimeET.withZoneSameInstant(ZoneId.of("America/Denver"));
        LocalTime timeMT = zonedDateTimeMT.toLocalTime();

        // Convert from Eastern Time (ET) to Coordinated Universal Time (UTC)
        ZonedDateTime zonedDateTimeUTC = zonedDateTimeET.withZoneSameInstant(ZoneId.of("UTC"));
        LocalTime timeUTC = zonedDateTimeUTC.toLocalTime();

        System.out.println(timeET + "ET | " + timeMT.toString() + "MT | " + timeUTC.toString() + "UTC");
        return timeET + "ET | " + timeMT.toString() + "MT | " + timeUTC.toString() + "UTC";
    }

}
