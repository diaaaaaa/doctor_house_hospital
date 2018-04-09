package at.refugeescode.accountancy.controller;

import at.refugeescode.hospital_admission.Patient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class AccountancyEndpoint {

    private Patient patientFile;

    @GetMapping
    Patient getPatientFile() {
        return patientFile;
    }

    @PostMapping
    Patient showPatientFile(@RequestBody Patient patient) {

        patientFile = patient;
        return patientFile;
    }
}
