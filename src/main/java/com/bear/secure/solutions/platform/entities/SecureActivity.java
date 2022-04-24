package com.bear.secure.solutions.platform.entities;

import com.bear.secure.solutions.platform.constants.SecureEntityConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sb-activities")
public class SecureActivity {

    @Id
    private String activityId;

    @NotNull(message = SecureEntityConstants.SB_CODE_REQUIRED)
    private String activityCode;

    @NotNull(message = SecureEntityConstants.SB_DESCRIPTION_REQUIRED)
    private String activityDescription;

    @NotNull(message = SecureEntityConstants.SB_NOTE_REQUIRED)
    private String activityNote;

    private SecureUser activityCreatedBy;
    private Date activityCreatedDate;
    private Date activityModifiedDate;
}
