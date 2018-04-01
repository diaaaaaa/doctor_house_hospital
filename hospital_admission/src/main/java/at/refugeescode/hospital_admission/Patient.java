package at.refugeescode.hospital_admission;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Patient {
    private Integer id;
    private String name;
    private String symptom;
    private String illness;



    public Patient() {

    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", symptom='" + symptom + '\'' +
                ", illness='" + illness + '\'' +
                '}';
    }
}
