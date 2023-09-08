/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author User
 */
public class DateParser {
    public static String convertDateToString(Date date) {
        String pattern = "dd/mm/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
    
    public static Date convertStringToDate(String date) {
        Date res = new Date();
        try {
            SimpleDateFormat parser = new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH);
            res = parser.parse(date);
        } catch (ParseException e) {
            System.out.println("Invalid input. Please use format dd/mm/yyyy\n");
        }
        return res;  
  }
}
