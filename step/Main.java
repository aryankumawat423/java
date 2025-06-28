class Patient {
    private String name;
    private int age;
    private String gender;
    private String patientId;
    private String diagnosis;

    private static int idCounter = 1000;
    private static String hospitalName = "City Care Hospital";

    public Patient() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
        this.diagnosis = "Not Diagnosed";
        this.patientId = "PAT" + (idCounter++);
    }

    public Patient(String name, int age, String gender, String diagnosis) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.diagnosis = diagnosis;
        this.patientId = "PAT" + (idCounter++);
    }

    public Patient(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.diagnosis = "Not Diagnosed";
        this.patientId = "PAT" + (idCounter++);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getPatientId() { return patientId; }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public void displayInfo() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("---------------------------------");
    }

    public void displayInfo(String format) {
        if (format.equalsIgnoreCase("json")) {
            System.out.println("{");
            System.out.println("  \"hospitalName\": \"" + hospitalName + "\",");
            System.out.println("  \"patientId\": \"" + patientId + "\",");
            System.out.println("  \"name\": \"" + name + "\",");
            System.out.println("  \"age\": " + age + ",");
            System.out.println("  \"gender\": \"" + gender + "\",");
            System.out.println("  \"diagnosis\": \"" + diagnosis + "\"");
            System.out.println("}");
        } else {
            displayInfo();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        Patient p2 = new Patient("Arun Kumar", 22, "Male", "Fever and Cough");
        Patient p3 = new Patient("Meera Sharma", 30, "Female");
        p3.setDiagnosis("Headache");

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo("json");
    }
}