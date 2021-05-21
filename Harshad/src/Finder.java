import java.util.ArrayList;

public class Finder {
    public boolean isHarshad(int num){
        int quersumme=0;
        if(num%10 == 0) return true;
        for (int potenz = 10; (num%potenz)/(potenz/10) != 0; potenz *= 10){
            quersumme += (num%potenz)/(potenz/10);
        }
        if (num % quersumme == 0){
            return true;
        }
        return false;
    }

    public ArrayList getHarshad (int num){
        ArrayList <Integer> list = new ArrayList();
        for (int i = 1; i<=num; i++){
            if (isHarshad(i)){
                list.add(i);
            }
        }
        return list;
    }
}
