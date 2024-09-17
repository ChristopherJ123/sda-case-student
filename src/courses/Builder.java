package courses;

import java.util.ArrayList;

public interface Builder {
    CourseBuilder reset();
    CourseBuilder setCourseId(String courseId);
    CourseBuilder setCourseName(String courseName);
    CourseBuilder setOnline(boolean isOnline);
    CourseBuilder setLocation(String location);
    CourseBuilder setPrerequisites(ArrayList<Course> prerequisites);
}
