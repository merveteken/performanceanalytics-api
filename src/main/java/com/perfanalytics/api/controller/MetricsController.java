package com.perfanalytics.api.controller;

import com.perfanalytics.api.model.Metrics;
import com.perfanalytics.api.service.MetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;


@RestController
@RequestMapping("/perfanalytics")
public class MetricsController {

    @Autowired
    MetricsService metricsService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/saveMetrics")
    public ResponseEntity<Metrics> saveMetrics(@RequestBody Metrics metrics) {
        Metrics metric = metricsService.saveMetrics(metrics);
        return new ResponseEntity<>(metric, HttpStatus.OK);

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/getMetrics")
    public ResponseEntity<List<Metrics>> getMetrics(@RequestParam String startDate, @RequestParam String endDate) {
        List<Metrics> metricsList = null;
        try {
            metricsList = metricsService.getMetrics(startDate,endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(metricsList, HttpStatus.OK);

    }

}
