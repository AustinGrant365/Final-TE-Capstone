package com.techelevator.finalcapstonespringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity(name = "app_user")
public class User {
    @Id
    @GeneratedValue(generator = "user_id_generator")
    @SequenceGenerator(
            name = "user_id_generator",
            sequenceName = "user_id_sequence",
            initialValue = 1000
    )
    @Column(name = "user_id", updatable = false, nullable = false)
    private Long id;

    @NotBlank
    @Size(min = 5, max = 32, message = "User name must be at least {min} characters and not more than {max}.")
    @Column(name = "user_name", updatable = true, nullable = false, unique = true)
    private String userName;

    @Size(min = 10, message = "Password too short, must be at least 10.")
    @Pattern.List({
            @Pattern(regexp = ".*[a-z].*", message = "Must have a lower case."),
            @Pattern(regexp = ".*[A-Z].*", message = "Must have a capital.")
    })
    @Column(name = "password", updatable = true, nullable = false)
    private String password;

    @Column(name = "role", updatable = true, nullable = false)
    private Long role;

    @Transient
    private String confirmPassword;

    @JsonIgnore
    private String salt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getRole() {
        return role;
    }

    public void setRole(Long role) {
        this.role = role;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId()) &&
                Objects.equals(getUserName(), user.getUserName()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getRole(), user.getRole()) &&
                Objects.equals(getConfirmPassword(), user.getConfirmPassword()) &&
                Objects.equals(getSalt(), user.getSalt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUserName(), getPassword(),
                            getRole(), getConfirmPassword(), getSalt());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", salt='" + salt + '\'' +
                '}';
    }
}
