package com.alfresco.acsbe.model;

import lombok.*;

@Setter
@Getter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String lastname;
    private String userStatus;
    private String jobTitle;
    private String statusUpdatedAt;

    private String mobile;
    private boolean emailNotificationsEnabled;
    private String description;
    private String telephone;

    private boolean enabled;
    private String firstName;
    private String skypeId;
    private String avatarId;

    private String location;
    private Company company;
    private String id;
    private String email;
}
