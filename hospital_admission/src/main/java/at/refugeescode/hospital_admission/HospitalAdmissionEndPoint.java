package at.refugeescode.hospital_admission;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HospitalAdmissionEndPoint {

    private Patient patient ;
    private List<Patient> patients = new ArrayList<>();

    @GetMapping("/patients")
    String getPatient(){

        return  patients.toString();
    }

    @PostMapping("/patients")
    void receivePatient(@RequestBody List<Patient> patientFromOutside){

        patients = patientFromOutside ;
       // patients.add(patient);
       // patients.forEach(e-> System.out.println(e));
        RestTemplate restTemplate = new RestTemplate();
        //String url = "http://localhost:8081/morse";
        //for (Character charc: word.toCharArray()) {
          //  restTemplate.postForEntity(url,charc, String.class);
       // }

    }
}