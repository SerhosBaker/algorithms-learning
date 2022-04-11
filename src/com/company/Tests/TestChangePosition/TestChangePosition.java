package com.company.Tests.TestChangePosition;

import com.company.Tests.TestChangePosition.domain.Course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestChangePosition
{
    private ArrayList<Course> courses = new ArrayList<>();

    public void Init()
    {
        courses.add(new Course(1, "a"));
        courses.add(new Course(2, "b"));
        courses.add(new Course(3, "c"));
        courses.add(new Course(4, "d"));
        courses.add(new Course(5, "e"));
        courses.add(new Course(6, "f"));
    }

    public void ChangePosition2(String name, int newPosition)
    {
        Course changingCourse=null;
        for(Course course : courses) {
            if (course.Name == name) {
                changingCourse = course;
                continue;
            }
        }

        if(changingCourse.Position>newPosition) // передвинуть к началу
        {
            for(int i = newPosition; i< changingCourse.Position; i++)
            {
                courses.get(i-1).Position++;
            }
            courses.get(changingCourse.Position-1).Position = newPosition;
        }
        else // передвинуть к концу
        {
            for(int i = newPosition; i> changingCourse.Position; i--)
            {
                courses.get(i-1).Position--;
            }
            courses.get(changingCourse.Position-1).Position = newPosition;
        }

        Collections.sort(courses, new Comparator<Course>() {
            @Override
            public int compare(Course lhs, Course rhs) {
                // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                return lhs.Position > rhs.Position ? 1 : (lhs.Position < rhs.Position) ? -1 : 0;
            }
        });
    }

    public void ChangePosition(String name, int newPosition)
    {
        Course changingCourse=null;
        for(Course course : courses) {
            if (course.Name == name) {
                changingCourse = course;
                continue;
            }
        }

        int changingCourseOldPosition;
        changingCourseOldPosition = changingCourse.Position;

        for(Course course : courses) {
            if(course.Position<newPosition)
                course.Position--;
        }


        if(changingCourse!=null) {
            changingCourse.Position = newPosition;

            for(Course course : courses) {
                if (course.Position < changingCourseOldPosition)
                    course.Position++;
            }
        }

        Collections.sort(courses, new Comparator<Course>() {
            @Override
            public int compare(Course lhs, Course rhs) {
                // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                return lhs.Position > rhs.Position ? 1 : (lhs.Position < rhs.Position) ? -1 : 0;
            }
        });

        return;
    }

    public void WriteArray()
    {
        System.out.println("Name - position");

        for(Course course : courses) {
            System.out.println(course.Name + " - " + course.Position);
        }
    }
}