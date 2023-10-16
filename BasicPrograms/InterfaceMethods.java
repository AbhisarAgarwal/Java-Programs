package BasicPrograms;

interface Client{
    void webDesign();
    void webdev();
}
class Developer implements Client {
    @Override
    public void webDesign() {
        System.out.println("Your Web Design is ready");
    }

    @Override
    public void webdev() {
        System.out.println("Your website is ready");
    }
}

public class InterfaceMethods {
    public static void main(String[] args) {
        Client client = new Developer();
        client.webDesign();
        client.webdev();
    }
}
