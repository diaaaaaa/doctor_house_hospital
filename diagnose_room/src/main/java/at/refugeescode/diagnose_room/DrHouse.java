package at.refugeescode.diagnose_room;

import at.refugeescode.hospital_admission.Patient;
import java.util.HashMap;
import java.util.Map;

public class DrHouse {

    HashMap<String,String> hmap = new HashMap<String,String>();
    Patient patientAfterDiagnose;

    public Patient findOutIllness(Patient patient){

        hmap.put("headache", "cough");
        hmap.put("heart attack", "pressure");
        hmap.put("Inverted nipples", "breast cancer");
        hmap.put("Difficulty breathing", "asthma");
        for(Map.Entry m:hmap.entrySet()){
            if (m.getKey().equals(patient.getSymptom()))
                patient.setIllness((String) m.getValue());
        }
        patientAfterDiagnose.setId(patient.getId());
        patientAfterDiagnose.setName(patient.getName());
        patientAfterDiagnose.setSymptom(patient.getSymptom());
//        String ill = hmap.entrySet().stream()
//                .filter(i-> i.getValue().equalsIgnoreCase(patient.getSymptom()))
//                .map(i-> i.getKey()+"")
//                .findFirst().orElse("lupus");
//        patient.setIllness(ill);
        patientAfterDiagnose.setIllness(patient.getIllness());

        return patientAfterDiagnose;
    }





    public DrHouse() {
    }

}
