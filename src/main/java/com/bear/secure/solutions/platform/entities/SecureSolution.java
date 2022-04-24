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
@Document(collection = "sb-solutions")
public class SecureSolution {

    @Id
    private String solutionId;

    @NotNull(message = SecureEntityConstants.SB_NAME_REQUIRED)
    private String solutionName;

    @NotNull(message = SecureEntityConstants.SB_CODE_REQUIRED)
    private String solutionCode;
    private int solutionSuspensionDays;

    @NotNull(message = SecureEntityConstants.SB_DESCRIPTION_REQUIRED)
    private String solutionDescription;
    private Date solutionCreatedDate;
    private Date solutionModifiedDate;

    @NotNull(message = SecureEntityConstants.SB_NOTE_REQUIRED)
    private String solutionNote;
    private SecureUser solutionCreatedBy;

}
