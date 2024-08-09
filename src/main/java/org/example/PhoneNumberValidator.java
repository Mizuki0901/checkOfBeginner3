package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

  public String phoneNumberPattern = "^(090|080|070)-\\d{4}-\\d{4}$";

  public boolean isValidPhoneNumber(String phoneNumber) {
    Pattern pattern = Pattern.compile(phoneNumberPattern);
    Matcher matcher = pattern.matcher(phoneNumber);

    return matcher.matches();
  }
}
