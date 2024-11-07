import java.util.ArrayList;
import java.util.List;

public class Pharmacy implements Searchable {
    private List<Medication> medications;

    public Pharmacy() {
        medications = new ArrayList<>();
    }

    public void addMedication(Medication medication) {
        medications.add(medication);
        System.out.println(medication.getName() + " added to the pharmacy.");
    }

    @Override
    public void search(String keyword) {
        boolean found = false;
        for (Medication medication : medications) {
            if (medication.getName().toLowerCase().contains(keyword.toLowerCase()) || 
                medication.getManufacturer().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(medication);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No medications found matching keyword: " + keyword);
        }
    }

    // Sort medications by name
    public void sortMedications() {
        medications.sort((med1, med2) -> med1.getName().compareTo(med2.getName()));
        System.out.println("Medications sorted by name.");
    }

    public List<Medication> getMedications() {
        return medications;
    }
}
