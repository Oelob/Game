package Game;
public class program{
    public static void main(String[] args) {

        Toys toy = new Toys(1, "tiger", 5, 80, "fluffy");
        Toys toy2 = new Toys(2, "lion", 4, 60, "fluffy");
       

        LoteryBox box = new LoteryBox<>();
        box.add(toy);
        box.add(toy2);
        box.printBox(box);

        
        
        

        
               

    }
}
