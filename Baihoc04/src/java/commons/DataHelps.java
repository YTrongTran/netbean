/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Tran Y
 */
public class DataHelps {

    static final SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");

    public static String toString(Date date, String... pa) {
        if (pa.length > 0) {
            date_format.applyPattern(pa[0]);
        }
        if (date == null) {
            date = DataHelps.now();
        }
        return date_format.format(date);
    }

    public static Date todate(String date, String... pa) throws ParseException {
        if (pa.length > 0) {
            date_format.applyPattern(pa[0]);
        }
        if (date == null) {
            return DataHelps.now();
        }
        return date_format.parse(date);
    }

    public static Date now() {
        return new Date();
    }

}
