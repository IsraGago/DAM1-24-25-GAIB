package ud3.ejerciciospropuestos;

import java.time.LocalDateTime;

public class User {
    private String username,password,email;
    private LocalDateTime createdAt,lastLogin;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.email = null;
        this.createdAt = LocalDateTime.now();
        this.lastLogin = null;
    }
    public User(String username) {
        this(username, null);
    }
    
    public String toString(){
        return username;
    }

    public String getPassword() {
        return password;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public String getEmail() {
        return email;
    }
    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    
}
