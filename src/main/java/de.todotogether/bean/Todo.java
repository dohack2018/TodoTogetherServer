package de.todotogether.bean;

import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "USER")
public class Todo{

			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			private Long id;
			
			private String name;

			private String activeTeamId;
			
			public Todo() {
			}
			
			public Todo(Long id, String name, String activeTeamId)
			{
					this.id = id;
					this.name = name;
					this.activeTeamId = activeTeamId;
			}
			
			public Long getId()
			{
					return id;			
			}
			
			public String getName()
			{
					return name;			
			}
			
			public void setName(String name)
			{
					this.name = name;
			}

			public String getActiveTeamId() { return activeTeamId; }

			public void setActiveTeamId(String activeTeamId) { this.activeTeamId = activeteamid; }
			
}