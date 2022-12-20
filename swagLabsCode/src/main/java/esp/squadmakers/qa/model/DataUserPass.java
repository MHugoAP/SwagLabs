package esp.squadmakers.qa.model;

public class DataUserPass {
    private String username;
    private String password;

    public DataUserPass(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
