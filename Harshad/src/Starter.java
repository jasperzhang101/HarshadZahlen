public class Starter {
    public void start (){
        Input input = new Input();
        Finder finder = new Finder();
        int zahl = input.getZahl();
        if (input.getList(zahl)){
            System.out.println(finder.getHarshad(zahl));
            return;
        }
        System.out.println(finder.isHarshad(zahl));
    }
}
