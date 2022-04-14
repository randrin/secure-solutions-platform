package com.bear.secure.solutions.platform.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
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

    @NotNull(message = "")
    private String sbUserId;

    @NotNull(message = "")
    private String sbName;

    @NotNull(message = "")
    private String sbSurname;

    @Email(message = "")
    private String sbEmail;

    @NotNull(message = "")
    private String sbUserType;
    private List<SecureSolution> sbNumberSolution;
    private List<SecureProfile> sbNumberProfile;

    private boolean sbUserStatus;
    private Date sbCreatedDate;
    private Date sbModifiedDate;
}
