package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
    Scanner scanner = new Scanner(System.in);

    System.out.println("携帯電話番号を入力してください:");
    String phoneNumber = scanner.nextLine();

    if (phoneNumberValidator.isValidPhoneNumber(phoneNumber)) {
      System.out.println(phoneNumber + " は有効な携帯電話番号です。");
    } else {
      System.out.println(phoneNumber + " は無効な携帯電話番号です。");
    }
    scanner.close();
  }
}