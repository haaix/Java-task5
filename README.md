# java-task5

## 一、作业要求
&emsp;&emsp;掌握对象传值的影响，并修改程序，实力化多个Lake对象，同一Fish对象均setFish 其中，通过调用输出方法，查看weight的变化情况。

## 二、解题思路
&emsp;&emsp;引用传递是指向真实内容的地址值，在方法调用时，实参地址被传递给形参，在方法体中实参和形参指向同一块内存地址，对形参操作会影响实参。

## 三、关键代码
1. 实例化一个Fish对象niqiu并输出。
```java
        Fish niqiu = new Fish();
        System.out.println("泥鳅：" +niqiu.weight+"\n");//输出1
```
2. 把泥鳅放在Lake的setFish方法中，并用eat方法给niqiu喂食，输出的taihu中niqiu重量就是niqiu本身的重量。
```java
        Lake taihu  = new Lake();
        taihu.setFish(niqiu);
        taihu.eat(15);
        System.out.print("泥鳅：" +niqiu.weight+"   ");//输出2
        System.out.println("太湖里的泥鳅：" +taihu.fish.weight+"\n");//输出3
```
3. 实例化一个Lake对象xihu，把niqiu放入其中，用eat方法喂食，输出的taihu和xihu中的niqiu就是niqiu本身的重量。
```java
        Lake xihu = new Lake();//实例化西湖
        xihu.setFish(niqiu);
        xihu.eat(20);//给泥鳅再喂20克

        System.out.print("泥鳅：" + niqiu.weight+"   ");
        System.out.print("西湖里的泥鳅：" +xihu.fish.weight+"   ");
        System.out.println("太湖里的泥鳅：" +taihu.fish.weight+"\n");
```
4.再实例化另一个Lake对象huanghe，把niqiu放入其中，同样用eat方法喂食，输出的taihu、xihu和huanghe中的niqiu还是niqiu本身的重量。
```java
        Lake huanghe = new Lake();//实例化黄河
        huanghe.setFish(niqiu);
        huanghe .eat(30);//给泥鳅再喂30克

        System.out.print("泥鳅：" + niqiu.weight+"   ");
        System.out.print("西湖里的泥鳅：" +xihu.fish.weight+"   ");
        System.out.print("太湖里的泥鳅：" +taihu.fish.weight+"   ");
        System.out.println("黄河里的泥鳅：" +huanghe.fish.weight);
```

## 运行结果
![](D:\Java\Java课程\作业5\作业4运行结果.png)


