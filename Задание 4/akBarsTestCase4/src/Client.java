
public class Client {
    private String name;
    private String surname;
    private String clientHistory;

    public Client(String name, String surname, String clientHistory) {
        this.name = name;
        this.surname = surname;
        this.clientHistory = clientHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getClientHistory() {
        return clientHistory;
    }

    public void setClientHistory(String clientHistory) {
        this.clientHistory = clientHistory;
    }

    @Override
    public String toString() {
        return "Имя='" + name + '\'' +
                ", Фамилия='" + surname + "'";
    }
}
