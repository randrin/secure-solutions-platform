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
@Document(collection = "sb-solutions")
public class SecureSolution {

    @Id
    private String solutionId;
    private String solutionName;
    private String solutionCode;
    private int solutionSuspensionDays;
    private String solutionDescription;
    private Date solutionCreatedDate;
    private Date solutionModifiedDate;
    private String solutionNote;
    private SecureUser solutionCreatedBy;

}
