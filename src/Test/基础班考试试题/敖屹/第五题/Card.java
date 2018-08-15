package Test.基础班考试试题.敖屹.第五题;

public abstract class Card {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card(String name) {

        this.name = name;
    }

    public Card() {

    }

    public abstract void cardholder(Person p);
}
