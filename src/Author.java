import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return  this.firstName;
    }
    public String getLastName() {
        return this.lastName;

    }

    @Override
    public String toString() {
        return
                firstName +
                " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o==null) {
            return false;
        }
        if (!(o instanceof Author)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Author that = (Author) o;
        return this.firstName.equals(that.firstName) && this.lastName.equals(that.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

