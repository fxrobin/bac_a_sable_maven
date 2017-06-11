package demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Builder
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@ToString(of={"name", "firstName"})
public class DummyEntity {
	
	@Getter @Setter
	String name;
	
	@Getter @Setter
	String firstName;

}
