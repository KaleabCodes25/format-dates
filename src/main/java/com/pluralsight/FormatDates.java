package com.pluralsight;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = now.format(formatter1);
        System.out.println(formattedDate1);
        System.out.println();

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = now.format(formatter2);
        System.out.println(formattedDate2);
        System.out.println();

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        String formattedDate3 = now.format(formatter3);
        System.out.println(formattedDate3);
        System.out.println();

        Date date = new Date();
        SimpleDateFormat requiredFormat = new SimpleDateFormat("EEEE, MMM d, yyyy HH:mm ' in GMT'");
        requiredFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String gmtTime = requiredFormat.format(date);
        System.out.println(gmtTime);


        // Another Way: ZonedDateTime is the Java 8 date type that carries a time zone.
        // To try it, remove the comment markers (and comment out the four lines above).

        ZonedDateTime nowGmt = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm", Locale.ENGLISH);
        String formatted = nowGmt.format(formatter);
        System.out.println(formatted + " in GMT");



        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("HH:mm 'on' dd-MMM-yyyy 'in your local time zone'");
        String formattedDate5 = now.format(formatter5);
        System.out.println(formattedDate5);
        System.out.println();










    }
}
