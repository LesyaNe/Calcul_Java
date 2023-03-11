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
        View view = new View();
        Presenter presenter = new Presenter(new SumController(view, new Sum()), new SubController(view, new Sub()), new DivController(view, new Div()), new MultiController(view, new Multi()), scanner, new Menu(scanner));
        presenter.start();
    }
}
