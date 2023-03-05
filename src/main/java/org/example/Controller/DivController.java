package org.example.Controller;

import org.example.Model.Div;
import org.example.View.View;

public class DivController implements I_Controller {

    View view;

    Div divModel;

    public DivController(View view, Div divModel) {
        this.view = view;
        this.divModel = divModel;
    }

    public void doIt() {
        int a = view.getValue();
        int b = view.getValueDiv();
        divModel.setX(a);
        divModel.setY(b);
        int result = divModel.result();
        view.print(result, "Частное = ");

    }
}
