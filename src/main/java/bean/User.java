import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User{

			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			private Long id;
			
			private String name;
			private String teamname;
			private List<int> activeProjects = new ArrayList<int>(); 
			
			public User() {
			}
			
			public User(Long id, String name, String teamname, int[] activeProjects)
			{
					this.id = id;
					this.name = name;
					this.teamname = teamname;
					this.activeProjects = ;
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
					this.name = name			
			}
			
			public String getTeamname()
			{
					return teamname;
			}
			
			public void setTeamname(String teamname)
			{
					this.teamname = teamname;			
			}
			
			public int[] getActiveProjects()
			{
					return activeProjects;
			}
			
			public void setActiveProjects(int[] activeProjects)
			{
					this.activeProjects.add(activeProjects[-1]);			
			}
}