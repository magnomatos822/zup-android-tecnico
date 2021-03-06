package com.lfdb.zuptecnico.entities.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lfdb.zuptecnico.entities.ReportItem;

/**
 * Created by Renan on 06/01/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PublishReportResponse {
    public String message;
    public ReportItem item;
    public Object error;
}
