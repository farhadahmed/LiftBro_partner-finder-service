package com.liftbro.partnerfinderservice.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;
    private String email;
    private String[] fitnessGoals;
    private int[] workoutLocations;

    @OneToMany
    @JoinColumn(name = "workoutAppointments_id")
    private Set<WorkoutAppointment> workoutAppointments;

    public UserAccount() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getFitnessGoals() {
        return fitnessGoals;
    }

    public void setFitnessGoals(String[] fitnessGoals) {
        this.fitnessGoals = fitnessGoals;
    }

    public int[] getWorkoutLocations() {
        return workoutLocations;
    }

    public void setWorkoutLocations(int[] workoutLocations) {
        this.workoutLocations = workoutLocations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAccount that = (UserAccount) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
