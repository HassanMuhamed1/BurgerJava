
import java.util.ArrayList;

public class UserMain {
    ArrayList<Burger> selectionBurgers = new ArrayList<>();    
    ArrayList<Additions> selectionAdd =new ArrayList<>(); 
    AdminMain admin = new AdminMain();
    int totalPrice=0;

    void requestOrder(int burger){
        selectionBurgers.add(new Burger(admin.burgers.get(burger-1).Name,admin.burgers.get(burger-1).price));
        totalPrice+=admin.burgers.get(burger-1).price;
    }
    void requestOrder(String[]addons){
        for (int i = 0; i < addons.length; i++) {
            if(addons[i].equals(admin.add.get(i).Name)){
                totalPrice+=admin.add.get(i).price;
            }
            
        }
    }
    void gettingReceipt(){
        int j=0;
        System.out.println((selectionBurgers.get(j).Name +" "+selectionBurgers.get(j).price));
        for (int i = 0; i < selectionAdd.size(); i++) {
            System.out.println((i+1) +'-'+selectionAdd.get(i).Name +" "+selectionAdd.get(i).price);
        }
        System.out.println("Total: "+totalPrice);

    }

}
