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
@Document(collection = "sb-profiles")
public class SecureProfile {

    @Id
    private String profileId;

    @NotNull(message = SecureEntityConstants.SB_CODE_REQUIRED)
    private String profileCode;

    @NotNull(message = SecureEntityConstants.SB_DESCRIPTION_REQUIRED)
    private String profileDescription;

    @NotNull(message = SecureEntityConstants.SB_NOTE_REQUIRED)
    private String profileNote;
    private SecureUser profileCreatedBy;
    private Date profileCreatedDate;
    private Date profileModifiedDate;
}
