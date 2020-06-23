package com.dami.convert;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TimeConvert implements Converter<String, Date> {
    @Override
    public Date convert(String value) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
        Date date = null;
        try {
            date = simpleDateFormat.parse(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
