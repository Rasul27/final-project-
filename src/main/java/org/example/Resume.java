package org.example;// Resume.java - модель резюме
import java.io.Serializable;
import java.util.UUID;

public class Resume implements Serializable {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String education;
    private String experience;
    private String skills;

    public Resume(String name, String email, String phone, String education, String experience, String skills) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.education = education;
        this.experience = experience;
        this.skills = skills;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getEducation() { return education; }
    public String getExperience() { return experience; }
    public String getSkills() { return skills; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEducation(String education) { this.education = education; }
    public void setExperience(String experience) { this.experience = experience; }
    public void setSkills(String skills) { this.skills = skills; }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nName: " + name +
                "\nEmail: " + email +
                "\nPhone: " + phone +
                "\nEducation: " + education +
                "\nExperience: " + experience +
                "\nSkills: " + skills + "\n";
    }
}
