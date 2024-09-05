package telran.java53.person.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@EqualsAndHashCode
@Embeddable
public class Address implements Serializable {
	private static final long serialVersionUID = -5233402939990658059L;
	
	String city;
    String street;
    Integer building;
    
}
