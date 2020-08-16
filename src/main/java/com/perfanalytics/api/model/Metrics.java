package com.perfanalytics.api.model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Metrics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    private long domComplete;
    private long fcp;
    private long ttfb;
    private long windowLoadEvent;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getDomComplete() {
        return domComplete;
    }

    public void setDomComplete(long domComplete) {
        this.domComplete = domComplete;
    }

    public long getFcp() {
        return fcp;
    }

    public void setFcp(long fcp) {
        this.fcp = fcp;
    }

    public long getTtfb() {
        return ttfb;
    }

    public void setTtfb(long ttfb) {
        this.ttfb = ttfb;
    }

    public long getWindowLoadEvent() {
        return windowLoadEvent;
    }

    public void setWindowLoadEvent(long windowLoadEvent) {
        this.windowLoadEvent = windowLoadEvent;
    }
}
