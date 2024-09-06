package telran.java53.person.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "Citizen")
@Table(name = "persons")
public class Person implements Serializable {
	private static final long serialVersionUID = -5244699720272720956L;
	
	@Id
	Integer id; 
	@Setter
    String name;
    LocalDate birthDate;
    @Setter
    //@Embedded
    Address address;
}
