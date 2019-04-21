package services;

public interface ClientService {
    public boolean login(String username, String password);

    public String register(String username, String password);
}
