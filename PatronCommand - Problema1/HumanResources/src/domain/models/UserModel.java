package domain.models;

public class UserModel {
    private String name;
    private String role;

    public UserModel(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }
}
