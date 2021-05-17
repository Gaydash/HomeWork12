package com.gaydash;

/*
1) Есть игра в которой клетчастое поле (например размером 10x10 клеток) и юниты, в одной клетке один юнит.
Есть 4 типа юнитов: Башня, забор, содат и танк.
Забор ничего не делает и может быть разрушен
Башня ничего не делает и безсмертна
Солдат стреляет и двигается - у него можно вызвать методы move() и fire()
Танк умеет то же что и солдат, плюс еще у него есть метод reload()
Создать список в котором есть обьекты всех типов юнитов.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Fence fence = new Fence(1, 1);
        fence.destroy();

        Tower tower = new Tower(2, 2);
        tower.immortal();

        Solder solder = new Solder(1, 4);
        solder.shoot();
        solder.move();

        Tank tank = new Tank(5, 6);
        tank.reload();
        tank.shoot();
        tank.move();

        List<Unit> millitaryUnits = new ArrayList<>();
        millitaryUnits.add(fence);
        millitaryUnits.add(tower);
        millitaryUnits.add(solder);
        millitaryUnits.add(tank);

        System.out.println(millitaryUnits.toString());

    }

}
