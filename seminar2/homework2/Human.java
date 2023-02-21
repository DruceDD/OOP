import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human implements Serializable {

    private String name;
    private LocalDate date;
    private String sex;
    private Human father;
    private Human mother;
    private List<Human> kids;
    private List<Communication> communicationList;


    public Human(String name, int year, int month, int day, String sex) {
        this.name = name;
        this.date = LocalDate.of(year, month, day);
        this.sex = sex;
        this.communicationList = new ArrayList<>();
        this.kids = new ArrayList<>();
    }

    public Human() {
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public List<Human> getKids() {
        return kids;
    }

    public List<Communication> getCommunicationList() {
        return communicationList;
    }


    // методы для добавления родственных связей
    public void addCommunication(Human human, TypeCommunication typeCommunication) {
        communicationList.add(new Communication(human, typeCommunication));
        if (typeCommunication == TypeCommunication.FATHER) {
            this.father = human;
        }
        if (typeCommunication == TypeCommunication.MOTHER) {
            this.mother = human;
        }
        if (typeCommunication == TypeCommunication.SON || typeCommunication == TypeCommunication.DAUGHTER) {
            addKid(human);
        }
    }

    public void addKid(Human human) {
        kids.add(human);
    }


    // методы для отображения родственных связей
    public void showKids() {
        if (kids.size() != 0) {
            System.out.println("\nДети:");
            for (Human h : kids) {
                if (h.getSex().equals("Ж")) {
                    System.out.println("Дочь - " + h);
                } else System.out.println("Сын  - " + h);
            }
        } else System.out.println("\nНет данных о детях");
    }

    public void showParents() {
        if (father != null || mother != null) {
//            System.out.println("\nРодители:");
            if (father != null) {
                System.out.println(father);
            }
            if (mother != null) {
                System.out.println(mother);
            }
        } else System.out.println("Нет данных");
    }

    public void showSiblings() {
        try {
            List<Human> children = mother.getKids();
            if (children.size() > 1) {
                System.out.println("\nБратья/сестры:");
                for (Human h : children) {
                    if (h != this) {
                        System.out.println(h);
                    }
                }
            } else System.out.println("\nНет братьев/сестер или нет данных");
        } catch (NullPointerException e) {
            System.out.println("\nНет данных о братьях/сестрах");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


    @Override
    public String toString() {
        return "Имя: " + name +
                ", дата рождения: " + date +
                ", пол: " + sex;
    }
}

