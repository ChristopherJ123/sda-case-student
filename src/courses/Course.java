package courses;

import java.util.ArrayList;

public class Course {
    private String courseId;
    private String courseName;
    private boolean isOnline;
    private String location;
    private ArrayList<Course> prerequisites;


    public Course(String courseId, String courseName, boolean isOnline, String location, ArrayList<Course> prerequisites) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.isOnline = isOnline;
        this.location = location;
        this.prerequisites = prerequisites;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrerequisites(ArrayList<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }
}
