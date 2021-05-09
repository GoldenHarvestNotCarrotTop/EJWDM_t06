package by.epamtc.plane.component;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private String name;
    private int age;
    private int flightHours;
    private Post post;

    public Person(){

    }

    public Person(String name, int age, int flightHours, Post post) {
        this.name = name;
        this.age = age;
        this.flightHours = flightHours;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(int flightHours) {
        this.flightHours = flightHours;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", flightHours=").append(flightHours);
        sb.append(", post=").append(post);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getFlightHours() == person.getFlightHours() && Objects.equals(getName(), person.getName()) && getPost() == person.getPost();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getFlightHours(), getPost());
    }
}
