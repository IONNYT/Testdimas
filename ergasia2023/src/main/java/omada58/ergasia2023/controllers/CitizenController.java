package omada58.ergasia2023.controllers;

import omada58.ergasia2023.entities.Citizen;
import omada58.ergasia2023.entities.Family;
import omada58.ergasia2023.service.CitizenService;
import omada58.ergasia2023.service.DoctorService;
import omada58.ergasia2023.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/citizen")
public class CitizenController {

    @Autowired
    private CitizenService citizenService;

    @Autowired
    private FamilyService familyService;

    @Autowired
    private DoctorService doctorService;


    //@GetMapping("/familyInfo")
    //public void
    @PostMapping("/register")
    public ResponseEntity<String> registerCitizen(@RequestBody Citizen citizen) {
        // You may want to add validation logic here
        citizenService.saveCitizen(citizen);
        return ResponseEntity.ok("Citizen registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginCitizen(@RequestParam String username, @RequestParam String password) {
        // Add logic for authentication, e.g., check credentials in the database
        // Return appropriate response based on authentication result
        // For simplicity, let's assume successful authentication for now
        return ResponseEntity.ok("Citizen logged in successfully");
    }

}
