/**
 * Создаем класс клиента, имеющий конструктор с параметрами:
 * 1. Имя
 * 2. Фамилия
 * 3. Количество кредитов
 * 4. Сумма кредитов
 * 5. Дней задолженности
 * 6. Открытая текущая задолженность (true - открытая, false - закрытая)
 *
 * Переопределим toString()
 */

public class Client {

    private String name;
    private String surname;
    private int amtCredits;
    private int sumCredits;
    private int dayArrear;
    private boolean openCurrentArrear;

    public Client(boolean openCurrentArrear) {
        this.openCurrentArrear = openCurrentArrear;
    }

    public Client(String name, String surname, int amtCredits, int sumCredits, int dayArrear, boolean openCurrentArrear) {
        this.name = name;
        this.surname = surname;
        this.amtCredits = amtCredits;
        this.sumCredits = sumCredits;
        this.dayArrear = dayArrear;
        this.openCurrentArrear = openCurrentArrear;
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

    public int getAmtCredits() {
        return amtCredits;
    }

    public void setAmtCredits(int amtCredits) {
        this.amtCredits = amtCredits;
    }

    public int getSumCredits() {
        return sumCredits;
    }

    public void setSumCredits(int sumCredits) {
        this.sumCredits = sumCredits;
    }

    public int getDayArrear() {
        return dayArrear;
    }

    public void setDayArrear(int dayArrear) {
        this.dayArrear = dayArrear;
    }

    public boolean isCurrentArrear() {
        return openCurrentArrear;
    }

    public void setCurrentArrear(boolean currentArrear) {
        this.openCurrentArrear = currentArrear;
    }

    @Override
    public String toString() {
        return  "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", количество кредитов=" + amtCredits +
                ", на сумму=" + sumCredits +
                ", дней задолженности=" + dayArrear +
                ", Открытая текущая задолженность=" + openCurrentArrear +
                '}';
    }
}
