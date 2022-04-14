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
@Document(collection = "sb-profiles")
public class SecureProfile {

    @Id
    private String profileId;
    private String profileCode;
    private String profileDescription;
    private String profileNote;
    private SecureUser profileCreatedBy;
    private Date profileCreatedDate;
    private Date profileModifiedDate;
}
