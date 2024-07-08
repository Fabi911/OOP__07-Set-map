package de.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello in my Pharmacy");
        Pharmacy myPharmacy = new Pharmacy();
        myPharmacy.addMedication("Asperin", new Medication("Asperin","13,45€", "on Stock"));
        myPharmacy.addMedication("Ibuprofen", new Medication("Ibuprofen", "8,99€", "in Stock"));
        myPharmacy.addMedication("Paracetamol", new Medication("Paracetamol", "5,50€", "on Stock"));
        myPharmacy.addMedication("Antibiotic", new Medication("Antibiotic", "12,30€", "low Stock"));
        myPharmacy.addMedication("Cough Syrup", new Medication("Cough Syrup", "7,25€", "in Stock"));
        myPharmacy.save( new Medication("Vitamins", "15,00€", "out of Stock"));
        myPharmacy.printMedications();
        Medication foundMedication = myPharmacy.findMedication("Ibuprofen");
        if (foundMedication != null) {
            System.out.println("\nFound Medication: " + foundMedication);
        } else {
            System.out.println("\nMedication not found.");
        }
        myPharmacy.delete("Asperin");
        int count = myPharmacy.getCount();
        System.out.println("\nTotal Medications: " + count);
    }
}

