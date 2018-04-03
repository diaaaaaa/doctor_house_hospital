package at.refugeescode.diagnose_room;

import at.refugeescode.hospital_admission.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import java.util.List;

@RestController
public class DiagnoseRoomEndPoint {

    private Patient patient ;
    private List<Patient> patients = new ArrayList<>();
    private DrHouse drHouse = new DrHouse();



    @PostMapping("/diagnose_room")
    Patient getPatientFromHospitalAdmission(@RequestBody Patient patientFromHospitalAdmission){
        //patient = drHouse.findOutIllness(patientFromHospitalAdmission);
          patient = drHouse.findOutIill(patientFromHospitalAdmission);
        return  patient;
    }



    @GetMapping("/diagnose_room")
    Patient getPatient(){
        return  patient;
    }
}
