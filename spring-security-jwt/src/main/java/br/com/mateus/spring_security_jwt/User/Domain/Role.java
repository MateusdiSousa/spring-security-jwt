package br.com.mateus.spring_security_jwt.User.Domain;

public enum Role {
    ADMIN("admin"),
    USER("user");

    private String role;

    Role(String role){
        this.role = role;
    }

    public String getRole(){
        return this.role;
    }
}
