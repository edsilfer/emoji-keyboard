package br.com.instachat.emojilibrary.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class that provides methods for dealing with timestamp objects
 */
public class TimestampUtil {

    /**
     * Formats the given timestamp object in the format HH:mm
     *
     * @param timestamp a timestamp object
     * @return the given timestamp as a String object with format HH:mm - return empty if timestamp is null
     */
    public static String formatTimestamp(Timestamp timestamp, String format) {
        if (null != timestamp) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.format(timestamp);
        } else {
            return "";
        }
    }

    /**
     * Provides the current timestamp in the format "yyyy-MM-dd hh:mm:ss.SSS"
     *
     * @return current timestamp in the format "yyyy-MM-dd hh:mm:ss.SSS"
     */
    public static String getCurrentTimestampStringFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        return sdf.format(TimestampUtil.getCurrentTimestamp());
    }

    /**
     * Returns the current timestamp
     *
     * @return current timestamp
     */
    public static Timestamp getCurrentTimestamp() {
        Date date = new Date();
        return new Timestamp(date.getTime());
    }

    /**
     * Given a String object with the format "yyyy-MM-dd hh:mm:ss.SSS", returns a timestamp object
     *
     * @param timestamp a String object representing a timestamp in the format "yyyy-MM-dd hh:mm:ss.SSS"
     * @return a timestamp object
     */
    public static Timestamp getTimestampFromString(String timestamp) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(timestamp);
            return new Timestamp(parsedDate.getTime());
        } catch (ParseException e) {
            return null;
        }
    }

}
