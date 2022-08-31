package com.liftbro.partnerfinderservice.bootstrap;

import com.liftbro.partnerfinderservice.model.UserAccount;
import com.liftbro.partnerfinderservice.model.WorkoutAppointment;
import com.liftbro.partnerfinderservice.repositories.UserAccountRepository;
import com.liftbro.partnerfinderservice.repositories.WorkoutAppointmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Component
public class BootstrapData implements CommandLineRunner {
    private final UserAccountRepository userAccountRepository;
    private final WorkoutAppointmentRepository workoutAppointmentRepository;

    public BootstrapData(UserAccountRepository userAccountRepository, WorkoutAppointmentRepository workoutAppointmentRepository) {
        this.userAccountRepository = userAccountRepository;
        this.workoutAppointmentRepository = workoutAppointmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        UserAccount leor = new UserAccount();
        leor.setFirstName("Leor");
        leor.setLastName("Slutsky");
        leor.setBirthDate(LocalDate.now());
        leor.setGender("m");
        leor.setEmail("leor@results.com");
        userAccountRepository.save(leor);

        WorkoutAppointment appointment = new WorkoutAppointment();
        appointment.setAppointmentDate(new Date());
        appointment.setOrganizingUserAccount(leor);
        appointment.setAttendingUserAccountId(123);
        appointment.setWorkoutLocationId(123);
        workoutAppointmentRepository.save(appointment);

        System.out.println("TESTING BOOTSTRAP DATA:");
        System.out.println(userAccountRepository.count());
        System.out.println(workoutAppointmentRepository.count());

        System.out.println(appointment.getAppointmentDate());


    }
}
