package com.dandy.main.collections;

import com.dandy.main.reflect.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("abd");
        set.add("abd1");
        set.add("abd2");
        set.add("abd3");

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (String s:set
             ) {
            System.out.println(s);
        }

        set.add("1");
        set.add("1");
        set.add("1");
        set.add("2");
        System.out.println(set.size());//set无序不可重复

        Set<student> students = new HashSet<>();
        student s1 = new student(11,"11");
        student s2 = new student(12,"12");
        student s3 = new student(11,"11");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students.size());

        for (student s:students
             ) {
            System.out.println(s);
        }
    }
}

class student{
    int no;
    String name;

    public student() {
    }

    public student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return no == student.no &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }
}
