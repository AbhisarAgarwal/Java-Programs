package BasicPrograms;

interface customerRaj{
    int amt = 5; //public static final
    void purchase(); //public abstract
}

class sellerSan implements customerRaj {

    @Override
    public void purchase() {
        System.out.println("raj needs "+amt+" kg rice");
    }
}

public class InterfaceVariables {
    public static void main(String[] args) {
         customerRaj c = new sellerSan();
         c.purchase();
        System.out.println(customerRaj.amt);
    }
}
