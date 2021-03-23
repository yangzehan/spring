package org.example;

import org.example.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Component("S")
public class Student {
    String name;
    String age;

    School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", school=" + school +
                '}';
    }

    public String getName() {
        return name;
    }
@Value("张飞")
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }
@Value("100")
    public void setAge(String age) {
        this.age = age;
    }
}
