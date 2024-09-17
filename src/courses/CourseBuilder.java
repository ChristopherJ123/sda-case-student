package courses;

import java.util.ArrayList;

public class CourseBuilder implements Builder { // Builder
    private Course course;

    public CourseBuilder() {
        this.reset();
    }

    @Override
    public CourseBuilder reset() {
        return null;
    }

    @Override
    public CourseBuilder setCourseId(String courseId) {
        this.setCourseId(courseId);
        return this;
    }

    @Override
    public CourseBuilder setCourseName(String courseName) {
        this.setCourseName(courseName);
        return this;
    }

    @Override
    public CourseBuilder setOnline(boolean isOnline) {
        this.setOnline(isOnline);
        return this;
    }

    @Override
    public CourseBuilder setLocation(String location) {
        this.setLocation(location);
        return this;
    }

    @Override
    public CourseBuilder setPrerequisites(ArrayList<Course> prerequisites) {
        this.setPrerequisites(prerequisites);
        return this;
    }

    public Course build() {
        return this.course;
    }
}
