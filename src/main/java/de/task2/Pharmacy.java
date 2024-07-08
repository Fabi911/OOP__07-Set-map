package de.task2;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map<String,Medication> medications;

    public Pharmacy() {
        this.medications = new HashMap<>();
    }

    public void addMedication(String name, Medication information) {
        this.medications.put(name, information);
    }
    public int getCount() {
        return this.medications.size();
    }
    public void save(Medication medication) {
        this.medications.put(medication.getName(), medication);
    }
    public Medication findMedication(String name) {
        return this.medications.getOrDefault(name, null);

    }
    public void delete(String medication) {
        this.medications.remove(medication);
    }
    public void printMedications() {
        for (Map.Entry<String, Medication> entry : medications.entrySet()) {
            System.out.println("--> "+entry);
        }
    }
}

