package com.alfresco.acsbe.utils;

import com.alfresco.acsbe.model.Company;
import com.alfresco.acsbe.model.User;

/**
 * Build the JSON with specific details given in task
 */
public class BuildJsonResponse {
  private BuildJsonResponse() {}

  public static User createUserOne() {
    return User.builder()
        .avatarId("198500fc-1e99-4f5f-8926-248cea433366")
        .company(createCompanyOne())
        .description("Alice is a demo user for the sample Alfresco Team site.")
        .email("abeecher@example.com")
        .emailNotificationsEnabled(true)
        .enabled(false)
        .firstName("Alice")
        .id("abeecher")
        .jobTitle("Graphic Designer")
        .lastname("Beecher")
        .location("Tilbury, UK")
        .mobile("0112211001100")
        .skypeId("abeecher")
        .statusUpdatedAt("2011-02-15T20:20:13.432+0000")
        .telephone("0112211001100")
        .userStatus("Helping to design the look and feel of the new web site")
        .build();
  }

  public static User createUserTwo() {
    return User.builder()
        .company(new Company())
        .email("admin@alfresco.com")
        .emailNotificationsEnabled(true)
        .enabled(true)
        .firstName("Administrator")
        .id("admin")
        .build();
  }

  public static User createUserThree() {
    return User.builder()
        .company(new Company())
        .emailNotificationsEnabled(true)
        .enabled(false)
        .firstName("Guest")
        .id("guest")
        .build();
  }

  public static User createUserFour() {
    return User.builder()
        .avatarId("3fbde500-298b-4e80-ae50-e65a5cbc2c4d")
        .company(createCompanyTwo())
        .description("Mike is a demo user for the sample Alfresco Team site.")
        .email("mjackson@example.com")
        .emailNotificationsEnabled(true)
        .enabled(false)
        .firstName("Mike")
        .id("mjackson")
        .jobTitle("Web Site Manager")
        .lastname("Jackson")
        .location("Threepwood, UK")
        .mobile("012211331100")
        .skypeId("mjackson")
        .statusUpdatedAt("2011-02-15T20:13:09.649+0000")
        .telephone("012211331100")
        .userStatus("Working on a new web design for the corporate site")
        .build();
  }

  public static Company createCompanyOne() {
    return Company.builder()
        .address1("200 Butterwick Street")
        .address2("Tilbury")
        .address3("UK")
        .organization("Moresby, Garland and Wedge")
        .postcode("ALF1 SAM1")
        .build();
  }

  public static Company createCompanyTwo() {
    return Company.builder()
        .address1("100 Cavendish Street")
        .address2("Threepwood")
        .address3("UK")
        .organization("Green Energy")
        .postcode("ALF1 SAM1")
        .build();
  }
}
