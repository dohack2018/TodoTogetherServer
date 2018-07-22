package de.todotogether.bean;


import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.*;


@Entity
@Table(name= "Group")
public class Group{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String name;

    private ArrayList<User> members = new ArrayList<>();
    public Group()
    {}

    public Group(Long id, String name, ArrayList<User> members)
    {
        this.id = id;
        this.name = name;
        this.members = members;
    }

    public Long getId() {   return id; }

    public String getName() {   return name; }

    public void setName(String name) {  this.name = name;   }

    public ArrayList <User> getMembers() {   return members; }

    public void setMembers(ArrayList<User> members) {    this.members = members;}
}
