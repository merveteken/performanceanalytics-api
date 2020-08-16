package com.perfanalytics.api.repository;

import com.perfanalytics.api.model.Metrics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MetricsRepository extends JpaRepository<Metrics,Long> {

    @Query(" from Metrics m where m.date between ?1 and ?2")
    List<Metrics> getMetricsByDate(Date sdate, Date edate );



}
