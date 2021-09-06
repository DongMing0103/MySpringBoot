package com.example.demo.oomAbnormal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/** @Author dongm @Description: Oom内存溢出demo @Date 2021/8/3 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OomDemo {

  @Test
  public void test() {
    Student student = new Student("张三", 18);
    List<Student> students = new ArrayList<>();

    while (true) {
      students.add(student);
    }
  }

  private static class Student {

    private String name;
    private Integer age;

    public Student(String name, Integer age) {
      this.name = name;
      this.age = age;
    }
  }
}
