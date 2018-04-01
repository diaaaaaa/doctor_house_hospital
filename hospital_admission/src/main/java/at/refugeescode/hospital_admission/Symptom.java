package at.refugeescode.hospital_admission;

public class Symptom {
    private String nameOfSymptom;

    public String getNameOfSymptom() {
        return nameOfSymptom;
    }

    public void setNameOfSymptom(String nameOfSymptom) {
        this.nameOfSymptom = nameOfSymptom;
    }

    @Override
    public String toString() {
        return "Symptom{" +
                "nameOfSymptom='" + nameOfSymptom + '\'' +
                '}';
    }
}
