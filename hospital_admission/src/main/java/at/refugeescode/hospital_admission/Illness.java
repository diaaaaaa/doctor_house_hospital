package at.refugeescode.hospital_admission;

public class Illness {
    private String nameOfIllness;

    public String getNameOfIllness() {
        return nameOfIllness;
    }

    public void setNameOfIllness(String nameOfIllness) {
        this.nameOfIllness = nameOfIllness;
    }

    @Override
    public String toString() {
        return "Illness{" +
                "nameOfIllness='" + nameOfIllness + '\'' +
                '}';
    }
}
