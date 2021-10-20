package misc.patterns.factory_method;

import misc.patterns.factory_method.Button;
import misc.patterns.factory_method.HtmlDialog;

/**
 *
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }

}
