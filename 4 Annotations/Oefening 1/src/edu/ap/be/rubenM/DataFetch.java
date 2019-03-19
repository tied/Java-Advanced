package edu.ap.be.rubenM;

import jdk.jfr.Event;
import jdk.jfr.Timespan;

@Timespan("2987200000")
public class DataFetch extends Event {

    private String bigData;

    public void setBigData(String bigData) {
        this.bigData = bigData;
    }

    public String getBigData() {
        return bigData;
    }

}