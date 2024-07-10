import java.util.*;
class Cart
{
    private List<Item>items;
    public Cart(){
        items=new ArrayList<>();
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public double calculateTotalPrice(){
        double totalprice=0;
        for(Item item:items){
            totalprice+=item.getPrice();
        }
        return totalprice;
    }
    public List<Item> getItems(){
        return items;
    }
}
class Item
{
    String name;
    double price;
    public Item(String name,double price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
class Shoppingcart
{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Cart c=new Cart();
        int n=in.nextInt();
        in.nextLine();
        for(int i=1;i<=n;i++){
            String itemname=in.nextLine();
            double itemprice=in.nextDouble();
            in.nextLine();
            Item item=new Item(itemname,itemprice);
            c.addItem(item);
        }
        int noofrem=in.nextInt();
        in.nextLine();
        for(int i=0;i<noofrem;i++){
            String ittorem=in.nextLine();
            for(Item item:c.getItems()){
                if(item.getName().equals(ittorem)){
                    c.removeItem(item);
                    break;
                }
            }
        }
        double tot=c.calculateTotalPrice();
        System.out.print("Total Price after removing items: $"+tot);
    }
}