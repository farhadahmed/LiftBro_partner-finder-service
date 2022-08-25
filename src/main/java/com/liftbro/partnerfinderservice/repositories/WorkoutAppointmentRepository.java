package com.liftbro.partnerfinderservice.repositories;

import com.liftbro.partnerfinderservice.model.WorkoutAppointment;
import org.springframework.data.repository.CrudRepository;

public interface WorkoutAppointmentRepository extends CrudRepository<WorkoutAppointment, Long> {
}
