package com.alfresco.acsbe.model;

import lombok.*;


@Setter
@Getter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Company {
  private String organization;
  private String address1;
  private String address2;
  private String address3;
  private String postcode;
}