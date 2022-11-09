public class Client {
    String name;
    double amount;
    String code;

    public Client(String name, double amount, String code) {
        this.name = name;
        this.amount = amount;
        this.code = code;
    }

    public String word(){
        return "Tere";
    }

    public double difference(Client client){
        return this.amount - client.amount;
    }

    public double difference(Client client, Client secondClient){
        return this.amount - client.amount + secondClient.amount;
    }
}

