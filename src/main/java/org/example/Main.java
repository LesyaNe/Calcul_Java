package org.example;


import Controller.DivController;
import Controller.MultiController;
import Controller.SubController;
import Controller.SumController;
import Model.Div;
import Model.Multi;
import Model.Sub;
import Model.Sum;
import View.Menu;
import View.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        View v = new View();
        Presenter p = new Presenter(new SumController(v, new Sum()), new SubController(v, new Sub()), new DivController(v, new Div()), new MultiController(v, new Multi()), scanner, new Menu(scanner));
        p.start();
    }
}
