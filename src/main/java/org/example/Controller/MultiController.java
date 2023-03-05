package org.example.Controller;

import org.example.Model.Multi;
import org.example.View.View;

public class MultiController implements I_Controller {

    View view;

    Multi multiModel;

    public MultiController(View view, Multi multModel) {
        this.view = view;
        this.multiModel = multModel;
    }


    @Override
    public void doIt() {
        int a = view.getValue();
        int b = view.getValue();
        multiModel.setX(a);
        multiModel.setY(b);
        int result = multiModel.result();
        view.print(result, "Произведение = ");
    }
}
