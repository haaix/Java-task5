package oo;

class Fish{
    int weight;
}
class Lake{
    Fish fish;
    void setFish(Fish s){
        fish = s;
    }
    void eat(int n){
        fish.weight = fish.weight + n;
    }
}
public class FishandLake{
    public static void main(String[] args) {
        Fish niqiu = new Fish();
        System.out.println("泥鳅：" +niqiu.weight+"\n");//输出1
        Lake taihu  = new Lake();
        taihu.setFish(niqiu);
        taihu.eat(15);
        System.out.print("泥鳅：" +niqiu.weight+"   ");//输出2
        System.out.println("太湖里的泥鳅：" +taihu.fish.weight+"\n");//输出3

        Lake xihu = new Lake();//实例化西湖
        xihu.setFish(niqiu);
        xihu.eat(20);//给泥鳅再喂20克

        System.out.print("泥鳅：" + niqiu.weight+"   ");
        System.out.print("西湖里的泥鳅：" +xihu.fish.weight+"   ");
        System.out.println("太湖里的泥鳅：" +taihu.fish.weight+"\n");

        Lake huanghe = new Lake();//实例化黄河
        huanghe.setFish(niqiu);
        huanghe .eat(30);//给泥鳅再喂30克

        System.out.print("泥鳅：" + niqiu.weight+"   ");
        System.out.print("西湖里的泥鳅：" +xihu.fish.weight+"   ");
        System.out.print("太湖里的泥鳅：" +taihu.fish.weight+"   ");
        System.out.println("黄河里的泥鳅：" +huanghe.fish.weight);
    }
}


