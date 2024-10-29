/*
 * Modify license settings in nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Adjust this template in nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package com.mycompany.st10439739_prog_part1;
import java.util.regex.Pattern;

/**
 * Class for managing user registration and login
 * Author: st10439739
 */
public class Login {
   private String firstName;
   private String lastName;
   private String username;
   private String password;

   // Constructor and Accessor Methods
   public Login() {
   }

   public String getFirstName() {
      return this.firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getUsername() {
      return this.username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return this.password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   // Validates password based on specific rules
   public boolean isValidPassword() {
       if(password == null) return false;
       if(password.length() < 8) return false;
       if(!Pattern.compile("[A-Z]").matcher(password).find()) return false; 
       if(!Pattern.compile("[0-9]").matcher(password).find()) return false; 
       if(!Pattern.compile("[^a-zA-Z0-9]").matcher(password).find()) return false;
       return true;
   }

   // Checks username format and length criteria
   public boolean isValidUsername() {
       return username != null 
              && username.contains("_") 
              && username.length() <= 5;
   }

   // Method to create a new user account with the provided details
   public void Account(String username, String password, String firstName, String lastName) {
       this.username = username;
       this.password = password;
       this.firstName = firstName;
       this.lastName = lastName;
       System.out.println("Account created successfully!");
   }

   // Validates user login based on stored credentials
   public boolean login(String username, String password) {
       if (this.username == null || this.password == null) {
           System.out.println("No user found, please create an account first.");
           return false;
       }
       if (this.username.equals(username) && this.password.equals(password)) {
           System.out.println("Login successful! Welcome " + this.firstName + " " + this.lastName);
           return true;
       } else {
           System.out.println("Login failed! Invalid username or password.");
           return false;
       }
   }

   // Method to register a user, validating username and password formats
   public String registerUser() {
       if (!isValidUsername()) {
           return "Username format incorrect. Ensure it contains an underscore and is no more than 5 characters.";
       }
       if (!isValidPassword()) {
           return "Password format incorrect. Ensure it has at least 8 characters, a capital letter, a number, and a special character.";
       }
       return "Username and Password successfully captured";
   }

   // Confirms login credentials
   public boolean loginUser(String inputUsername, String inputPassword) {
       return this.username.equals(inputUsername) && this.password.equals(inputPassword);
   }
}
