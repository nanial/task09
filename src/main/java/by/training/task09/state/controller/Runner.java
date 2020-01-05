package by.training.task09.state.controller;

//Создать объект класса Государство, используя классы Область, Район, Город.
//Методы: вывести на консоль столицу, количество областей, площадь, областные центры

import by.training.task09.state.service.StateManager;

public class Runner {
    public static void main(String[] args) {

        StateManager belarus = new StateManager();
        System.out.println(belarus.toString());
        belarus.printCenterRegion();
    }
}
