package com.liftbro.partnerfinderservice.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class WorkoutAppointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date appointmentDate;

    @ManyToOne
    private UserAccount organizingUserAccount;
    private int attendingUserAccountId;
    private int workoutLocationId;

    public WorkoutAppointment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public UserAccount getOrganizingUserAccount() {
        return organizingUserAccount;
    }

    public void setOrganizingUserAccount(UserAccount organizingUserAccount) {
        this.organizingUserAccount = organizingUserAccount;
    }

    public int getAttendingUserAccountId() {
        return attendingUserAccountId;
    }

    public void setAttendingUserAccountId(int attendingUserAccountId) {
        this.attendingUserAccountId = attendingUserAccountId;
    }

    public int getWorkoutLocationId() {
        return workoutLocationId;
    }

    public void setWorkoutLocationId(int workoutLocationId) {
        this.workoutLocationId = workoutLocationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkoutAppointment that = (WorkoutAppointment) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "WorkoutAppointment{" +
                "id=" + id +
                ", appointmentDate=" + appointmentDate +
                ", workoutLocationId=" + workoutLocationId +
                '}';
    }
}
