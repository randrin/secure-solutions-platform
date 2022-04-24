package com.bear.secure.solutions.platform.entities;

import com.bear.secure.solutions.platform.constants.SecureEntityConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sb-users")
public class SecureUser {

    @Id
    private String sbId;

    @NotNull(message = SecureEntityConstants.SB_USER_ID_REQUIRED)
    private String sbUserId;

    @NotNull(message = SecureEntityConstants.SB_NAME_REQUIRED)
    private String sbName;

    @NotNull(message = SecureEntityConstants.SB_SURNAME_REQUIRED)
    private String sbSurname;

    @Email(message = SecureEntityConstants.SB_EMAIL_REQUIRED)
    private String sbEmail;

    @Email(message = SecureEntityConstants.SB_PASSWORD_REQUIRED)
    private String sbPassword;

    @NotNull(message = SecureEntityConstants.SB_USER_TYPE_REQUIRED)
    private String sbUserType;

    private List<SecureSolution> sbNumberSolutions;

    private List<SecureProfile> sbNumberProfiles;

    private boolean sbUserStatus;
    private Date sbCreatedDate;
    private Date sbModifiedDate;
}
