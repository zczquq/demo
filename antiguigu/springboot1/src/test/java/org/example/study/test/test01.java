package org.example.study.test;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test01 {
    @Test
    public void test() {
        BigDecimal dividend = new BigDecimal(10);
        BigDecimal divisor = new BigDecimal(3);
        BigDecimal divide = dividend.divide(divisor, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(divide);
    }

    @Test
    public void test2() throws ParseException {
        String date1 = "2020-01-01 17:20:00";
        String date2 = "2020-01-01 17:05:00";

        Date dateFirstTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date1);
        Date dateSecondTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date2);

        Long millis = dateFirstTime.getTime() - dateSecondTime.getTime();
        System.out.println(millis);

        BigDecimal fz = new BigDecimal(millis);
        BigDecimal fm = new BigDecimal(10 * 60 * 1000);
        BigDecimal bwtHours = fz.divide(fm, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("fz/fm=" + bwtHours);

        new BigDecimal(-2).compareTo(bwtHours);


    }

    @Test
    public void test3() throws ParseException {
        BigDecimal bigDecimal = new BigDecimal(-1.2);
        System.out.println(new BigDecimal(-2).compareTo(bigDecimal));
    }
}
