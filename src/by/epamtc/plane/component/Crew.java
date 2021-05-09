package by.epamtc.plane.component;

import by.epamtc.exception.NullCrewException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Crew implements Serializable {
    private List<Person> crewList = new ArrayList<>();

    public Crew(){

    }

    public Crew(Person... personList){
        crewList.addAll(Arrays.asList(personList));
    }

    public Crew(List<Person> crewList) {
        this.crewList = new ArrayList(crewList);
    }

    public void addPerson(Person p) throws NullCrewException {
        if(p == null){
            throw new NullCrewException("Added person must not be null");
        }
        crewList.add(p);
    }

    public void removePerson(Person p) throws NullCrewException {
        if(p == null){
            throw new NullCrewException("Added person must not be null");
        }
        crewList.remove(p);
    }

    private int size(){
        return crewList.size();
    }

    public List<Person> getCrewList() {
        return crewList;
    }

    public void setCrewList(List<Person> crewList) {
        this.crewList = crewList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Crew{");
        sb.append("crewList=").append(crewList);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crew crew = (Crew) o;
        return Objects.equals(getCrewList(), crew.getCrewList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCrewList());
    }
}
