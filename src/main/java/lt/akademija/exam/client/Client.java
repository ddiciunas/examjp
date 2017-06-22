package lt.akademija.exam.client;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "findAllClients", query = "select client from Client client"),
        @NamedQuery(name = "findClient", query = "select client from Client client")

})
public class Client {

    private enum Type {
        NORMAL, LOYAL
    }

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private String birthDate;

    private String phoneNumber;

    private Type type;

    public Client(String firstName,
                  String lastName,
                  String birthDate,
                  String phoneNumber,
                  Type type
) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
