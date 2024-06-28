import java.util.ArrayList;
public class AdminMain {
    ArrayList<Burger> burgers = new ArrayList<>();    
    ArrayList<Additions> add =new ArrayList<>(); 
    AdminMain(){
        burgers.add(0,new Burger("Beef Burger" , 80));
        burgers.add(1,new Burger("Chicken Burger" , 70));
        burgers.add(2,new Burger("Cheese Burger" , 60));

        add.add(0,new Additions("Ketchup" , 5));
        add.add(1,new Additions("Mayonniese" , 7));
        add.add(2,new Additions("Tomatoes" , 10));
        add.add(3,new Additions("Cheese" , 10));

    }
    void addSandwich(String name , int price){
        burgers.add(new Burger(name,price));
    }
    void newAddition(String name , int price){
        add.add(new Additions(name,price));
    }
    void ViewMenu(){
        for(int i=0 ; i<burgers.size();i++){
            System.out.println((i+1)+"-"+burgers.get(i).Name);
        }
    }
    void ViewAdditions(){
        for(int i=0 ; i<add.size();i++){
            System.out.println((i+1)+"-"+add.get(i).Name);
        }
    }
}
