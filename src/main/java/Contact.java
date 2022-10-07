import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString

public class Contact {
    private String firstName;
    private  String lastName;
    private String phone;
    private ContactType contactType;
}

