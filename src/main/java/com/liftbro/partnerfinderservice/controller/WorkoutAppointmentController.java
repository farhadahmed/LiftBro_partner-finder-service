package com.liftbro.partnerfinderservice.controller;

import com.liftbro.partnerfinderservice.repositories.WorkoutAppointmentRepository;
import org.springframework.ui.Model;

public class WorkoutAppointmentController {
    private final WorkoutAppointmentRepository workoutAppointmentRepository;

    public WorkoutAppointmentController(WorkoutAppointmentRepository workoutAppointmentRepository) {
        this.workoutAppointmentRepository = workoutAppointmentRepository;
    }

    public String getWorkoutAppointments(Model model) {
        model.addAttribute("appointments", workoutAppointmentRepository.findAll());
        return "appointments/list";
    }
}
