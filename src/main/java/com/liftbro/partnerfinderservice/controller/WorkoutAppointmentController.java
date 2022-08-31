package com.liftbro.partnerfinderservice.controller;

import com.liftbro.partnerfinderservice.repositories.WorkoutAppointmentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorkoutAppointmentController {
    private final WorkoutAppointmentRepository workoutAppointmentRepository;

    public WorkoutAppointmentController(WorkoutAppointmentRepository workoutAppointmentRepository) {
        this.workoutAppointmentRepository = workoutAppointmentRepository;
    }

    @RequestMapping("/appointments")
    public String getWorkoutAppointments(Model model) {
        model.addAttribute("appointments", workoutAppointmentRepository.findAll());
        return "appointments/list";
    }
}
