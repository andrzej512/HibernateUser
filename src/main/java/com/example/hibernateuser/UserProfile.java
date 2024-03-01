package com.example.hibernateuser;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "user_profile")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private Long id;
    private String country;
    private String language;
    private LocalDate dateOfBirth;
    @OneToOne
    @JsonIgnore
    @JoinColumn(name="user_id")
    private User user;

    public UserProfile() {}

    public UserProfile(Long id, String country, String language, LocalDate dateOfBirth) {
        this.id = id;
        this.country = country;
        this.language = language;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public User getUser() {
        return user;
    }

}

