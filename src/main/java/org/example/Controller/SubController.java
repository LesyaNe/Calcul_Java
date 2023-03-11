package org.example.Controller;

import org.example.Model.Sub;
import org.example.View.View;

public class SubController implements Controller {
    View view;
    Sub subModel;

    public SubController(View view, Sub subModel) {
        this.view = view;
        this.subModel = subModel;
    }

    public void doIt() {
        int a = view.getValue();
        int b = view.getValue();
        subModel.setX(a);
        subModel.setY(b);
        int result = subModel.result();
        view.print(result, "Разность = ");
    }
}
