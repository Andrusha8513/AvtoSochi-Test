package com.example.AvtoSochi_Test2;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String  confirmationCode;
    private boolean enable = false;
    private String pendEmail;
    private String emailChangeCode;

    private LocalDateTime registrationDate;

    private String passwordResetCode;
    private LocalDateTime passwordResetCodeExpiryDate;


    @ElementCollection(targetClass = Role.class , fetch = FetchType.LAZY)
    @CollectionTable(name = "users_role" , joinColumns = @JoinColumn(name = "users_id"))
    @Enumerated(EnumType.STRING)

    private Set<Role> roles;

    public Set<Role>  getRole(){
        return roles;
    }
   public void setRoles(Set<Role> roles){
        this.roles = roles;
   }

    public Users(Long id,
                 String email,
                 String password){
        this.id  = id;
        this.email  = email;
        this.password = password;
    }
    public  Users(){}


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordResetCode() {
        return passwordResetCode;
    }

    public void setPasswordResetCode(String passwordResetCode) {
        this.passwordResetCode = passwordResetCode;
    }

    public LocalDateTime getPasswordResetCodeExpiryDate() {
        return passwordResetCodeExpiryDate;
    }

    public void setPasswordResetCodeExpiryDate(LocalDateTime passwordResetCodeExpiryDate) {
        this.passwordResetCodeExpiryDate = passwordResetCodeExpiryDate;
    }

    public String getPendEmail() {
        return pendEmail;
    }

    public void setPendEmail(String pendEmail) {
        this.pendEmail = pendEmail;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }

    public String getEmailChangeCode() {
        return emailChangeCode;
    }

    public void setEmailChangeCode(String emailChangeCode) {
        this.emailChangeCode = emailChangeCode;
    }
}
