public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean authenticate(String providedUsername, String providedPassword) {
        return username.equals(providedUsername) && password.equals(providedPassword);
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public boolean isPasswordStrong(String password) {
        // Implement your password strength validation logic here
        // For example, check length, presence of uppercase and lowercase letters,
        // digits, and special characters
        return password.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}");
    }
}
