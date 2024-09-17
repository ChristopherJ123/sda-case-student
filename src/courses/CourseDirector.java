package courses;

public class CourseDirector {
    public static Course constructOnlineCourse(CourseBuilder builder, String ) {
        return builder.reset()
                .setOnline(true)
                .setLocation("Online Platform")
                .build();
    }

    public static Course constructOnsiteCourse(CourseBuilder builder) {
        return builder.reset()
                .setOnline(false)
                .build();
    }
}
