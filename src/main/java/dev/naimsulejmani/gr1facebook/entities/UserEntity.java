package dev.naimsulejmani.gr1facebook.entities;


import jakarta.persistence.*;

import java.util.List;



@Entity(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(nullable = false, length = 50)
    private String name;
    private String surname;
    private String email;
    private String password;
    private String profilePicture;
    private String coverPicture;
    private String bio;
    private String location;
    private String website;
    private String birthday;
    private String gender;

    @OneToMany(mappedBy = "userEntity")
    private List<PostEntity> postEntities;

    public UserEntity() {
    }

    public UserEntity(String id, String name, String surname, String email, String password, String profilePicture, String coverPicture, String bio, String location, String website, String birthday, String gender, List<PostEntity> postEntities) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.profilePicture = profilePicture;
        this.coverPicture = coverPicture;
        this.bio = bio;
        this.location = location;
        this.website = website;
        this.birthday = birthday;
        this.gender = gender;
        this.postEntities = postEntities;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getCoverPicture() {
        return coverPicture;
    }

    public void setCoverPicture(String coverPicture) {
        this.coverPicture = coverPicture;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<PostEntity> getPostEntities() {
        return postEntities;
    }

    public void setPostEntities(List<PostEntity> postEntities) {
        this.postEntities = postEntities;
    }
}













