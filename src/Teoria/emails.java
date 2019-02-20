package Teoria;

import java.util.Objects;

public class emails {


    public emails(String emails) {
        this.emails = emails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        emails emails = (emails) o;
        return Objects.equals(this.emails, emails.emails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emails);
    }

    @Override
    public String toString() {
        return "" +
                "'" + emails + '\'';
    }

    private String emails;


}
