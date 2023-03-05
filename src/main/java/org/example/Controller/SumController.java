package org.example.Controller;

import org.example.Model.Sum;
import org.example.View.View;

public class SumController implements I_Controller{

    View view;

    Sum model;

    public SumController(View view, Sum model) {
        this.view = view;
        this.model = model;
    }


    @Override
    public void doIt() {
        int a = view.getValue();
        int b = view.getValue();
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Сумма: ");
    }
}
