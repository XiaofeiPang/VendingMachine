package vendingmachine;

public class VindingMaching {
    int balance;
    int price=fun();
    int fun(){
        return 20;
    }
    int totol;
    VindingMaching(){
       totol=10;

    }
    VindingMaching(int price){
        this();
        this.price=price;
    }
    void showPrompt(){
        System.out.println("Welcome");
    }
    void showinsert(int price){

        balance=balance+price;
        showbalance();
    }
    void showbalance()
    {    int a;
        System.out.println(balance);
    }
    void getgood(){
        if(balance>=price)
            System.out.println("Give you");
        balance=balance-price;
        totol=totol+price;
        showtotol();
    }
   void showtotol(){
       System.out.println(totol);
   }
    public static void main(String[] args) {
        VindingMaching vm= new VindingMaching();
        vm.showPrompt();
        vm.showinsert(180);
        vm.showbalance();
        vm.getgood();
        vm.showbalance();
        VindingMaching VM1=new VindingMaching(1000);
        VM1.showinsert(200);
        VM1.showbalance();
        VM1.getgood();
        VM1.showbalance();
    }
}

