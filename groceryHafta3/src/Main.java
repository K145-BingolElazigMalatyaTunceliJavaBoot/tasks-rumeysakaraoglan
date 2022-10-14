public class Main {
    public static void main(String[] args) throws Exception {
        groceryManager grocermanager = new groceryManager();

        Cherry cherry = new Cherry();
        Apple apple = new Apple();
        Pear pear = new Pear();

        groceryManager.add(pear,30);
        groceryManager.add(apple,20);
        groceryManager.add(cherry,40);
}}
