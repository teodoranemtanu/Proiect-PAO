package person;

public interface IAuth {
    public boolean login(String username, String password);

    public String register(String username, String password);
}
