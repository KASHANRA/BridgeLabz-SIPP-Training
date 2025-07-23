package level_1;
import java.util.ArrayList;
import java.util.List;
abstract class JobRole {
    private String candidateName;
    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }
    public String getCandidateName() {
        return candidateName;
    }
    public abstract void displayRoleDetails();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }
    public void displayRoleDetails() {
        System.out.println("Software Engineer: " + getCandidateName());
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName) {
        super(candidateName);
    }
    public void displayRoleDetails() {
        System.out.println("Data Scientist: " + getCandidateName());
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName) {
        super(candidateName);
    }
    public void displayRoleDetails() {
        System.out.println("Product Manager: " + getCandidateName());
    }
}

class Resume<T extends JobRole> {
    private T jobRole;
    private String resumeText;
    public Resume(T jobRole, String resumeText) {
        this.jobRole = jobRole;
        this.resumeText = resumeText;
    }
    public T getJobRole() {
        return jobRole;
    }
    public String getResumeText() {
        return resumeText;
    }
    public void processResume() {
        jobRole.displayRoleDetails();
        System.out.println("Resume Content: " + resumeText);
    }
}

public class AIDrivenResumeScreeningSystem {
    public static void screenResumes(List<? extends JobRole> candidates) {
    	for (int i = 0; i < candidates.size(); i++) {
    	    JobRole candidate = candidates.get(i);
    	    candidate.displayRoleDetails();
    	}
    }
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice"), "Experienced in Java and Spring Boot.");
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob"), "Skilled in Python, ML, and Data Analysis.");
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie"), "Expert in Agile and Product Lifecycle.");
        seResume.processResume();
        dsResume.processResume();
        pmResume.processResume();
        List<JobRole> candidateList = new ArrayList<>();
        candidateList.add(seResume.getJobRole());
        candidateList.add(dsResume.getJobRole());
        candidateList.add(pmResume.getJobRole());
        System.out.println("\nScreening all candidates:");
        screenResumes(candidateList);
    }
}
