package com.perfanalytics.api.service;

import com.perfanalytics.api.model.Metrics;
import com.perfanalytics.api.repository.MetricsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Service
public class MetricsService {

    @Autowired
    MetricsRepository metricsRepository;


    private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    public Metrics saveMetrics(Metrics metrics){
        return metricsRepository.save(metrics);
    }

    public List<Metrics> getMetrics(String sDate, String eDate) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date parsed = format.parse(sDate);
        java.sql.Date date1 = new java.sql.Date(parsed.getTime());

        Date parsed2 = format.parse(eDate);
        java.sql.Date date2 = new java.sql.Date(parsed2.getTime());

        return metricsRepository.getMetricsByDate(date1,date2);
    }
}
