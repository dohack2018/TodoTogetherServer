package de.todotogether.bean;

import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User{

			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			private Long id;
			
			private String name;
			private String teamname;
			private int activeProject;
			
			public User() {
			}
			
			public User(Long id, String name, String teamname, int activeProject)
			{
					this.id = id;
					this.name = name;
					this.teamname = teamname;
					this.activeProject = activeProject;
			}
			
			public Long getId()
			{
					return id;			
			}
			
			public void setId(Long id)
			{
					this.id = id;
			}
			
			public String getName()
			{
					return name;			
			}
			
			public void setName(String name)
			{
					this.name = name;		
			}
			
			public String getTeamname()
			{
					return teamname;
			}
			
			public void setTeamname(String teamname)
			{
					this.teamname = teamname;			
			}
			
			public int getActiveProject()
			{
					return activeProject;
			}
			
			public void setActiveProject(int activeProject)
			{
					this.activeProject = activeProject;
			}
}
