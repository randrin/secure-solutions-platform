package com.bear.secure.solutions.platform.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sb-activities")
public class SecureActivity {

    @Id
    private String activityId;
    private String activityCode;
    private String activityDescription;
    private String activityNote;
    private SecureUser activityCreatedBy;
    private Date activityCreatedDate;
    private Date activityModifiedDate;
}
