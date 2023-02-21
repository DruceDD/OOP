import java.io.Serializable;

public class Communication implements Serializable {

    private Human human;
    private TypeCommunication typeCommunication;


    public Communication(Human human, TypeCommunication typeCommunication) {
        this.human = human;
        this.typeCommunication = typeCommunication;
    }

    @Override
    public String toString() {
        return human + ", родственная связь: " + typeCommunication;
    }
}
