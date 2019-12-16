package com.techelevator.finalcapstonespringboot.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity(name = "UserProfile")
@Table(name = "user_profile")
public class UserProfile {
    
    @Id
    private Long userId;
    
    @Email(message = "Must be a valid email address.")
    @Column(name = "email", updatable = true, nullable = false)
    private String email;
    
    @Column(name = "first_name", updatable = true, nullable = false)
    private String firstName;
    
    @Column(name = "last_name", updatable = true, nullable = false)
    private String lastName;
    
    @Column(name = "phone_number", updatable = true, nullable = true)
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Phone number must be 10 digits.")
    private String phoneNumber;
    
    @Column(name = "summary", updatable = true, nullable = true)
    private String summary;
    
    @Column(name = "cohort", updatable = true, nullable = false)
    private String cohort;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "birthday", updatable = true, nullable = false)
    private Date birthday;
    
    @OneToOne
    @MapsId
    private User user;
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getSummary() {
        return summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }
    
    public String getCohort() {
        return cohort;
    }
    
    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
    
    public Date getBirthday() {
        return birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    
}
