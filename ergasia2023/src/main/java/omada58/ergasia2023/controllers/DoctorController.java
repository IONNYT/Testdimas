package omada58.ergasia2023.controllers;

import omada58.ergasia2023.entities.Doctor;
import omada58.ergasia2023.service.CitizenService;
import omada58.ergasia2023.service.DoctorService;
import omada58.ergasia2023.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @Autowired
    private CitizenService citizenService;

    @Autowired
    private FamilyService familyService;

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/register")
    public ResponseEntity<String> registerDoctor(@RequestBody Doctor doctor) {
        // You may want to add validation logic here
        doctorService.saveDoctor(doctor);
        return ResponseEntity.ok("Doctor registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginDoctor(@RequestParam String username, @RequestParam String password) {
        // Add logic for authentication, e.g., check credentials in the database
        // Return appropriate response based on authentication result
        // For simplicity, let's assume successful authentication for now
        return ResponseEntity.ok("Doctor logged in successfully");
    }
}

