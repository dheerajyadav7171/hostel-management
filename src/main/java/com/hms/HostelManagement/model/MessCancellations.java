package com.hms.HostelManagement.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


//import java.util.Date;
@Data
public class MessCancellations {
    private Integer entryNo;
    private Integer hostelRegistrationId;
    private Integer rollNo;
   @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date date;
}
