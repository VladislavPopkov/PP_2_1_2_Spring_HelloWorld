import java.io.Serializable;

public class Cat implements Serializable {
    private String message;

    public Cat() {};
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
