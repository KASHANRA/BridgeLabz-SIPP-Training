package level_1;
import java.util.ArrayList;
import java.util.List;
abstract class CourseType {
    private String title;
    public CourseType(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse(String title) {
        super(title);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title) {
        super(title);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String title) {
        super(title);
    }
}

class Course<T extends CourseType> {
    private T courseType;
    private String department;
    public Course(String department, T courseType) {
        this.department = department;
        this.courseType = courseType;
    }
    public T getCourseType() {
        return courseType;
    }
    public String getDepartment() {
        return department;
    }
}

public class MultiLevelUniversityCourseManagementSystem {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (int i = 0; i < courses.size(); i++) {
            CourseType course = courses.get(i);
            System.out.println(course.getTitle());
        }
    }
    public static void main(String[] args) {
        List<ExamCourse> examCourses = new ArrayList<>();
        examCourses.add(new ExamCourse("Mathematics"));
        examCourses.add(new ExamCourse("Physics"));
        List<AssignmentCourse> assignmentCourses = new ArrayList<>();
        assignmentCourses.add(new AssignmentCourse("Creative Writing"));
        assignmentCourses.add(new AssignmentCourse("Marketing Strategies"));
        List<ResearchCourse> researchCourses = new ArrayList<>();
        researchCourses.add(new ResearchCourse("AI in Education"));
        researchCourses.add(new ResearchCourse("Quantum Computing"));
        displayCourses(examCourses);
        displayCourses(assignmentCourses);
        displayCourses(researchCourses);
    }
}
