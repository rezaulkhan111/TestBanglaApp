package inc.machine_code.testbanglaapp;


import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.util.AttributeSet;

public class BanglaFontClass extends AppCompatCheckedTextView {

    public BanglaFontClass(Context context) {
        super(context);
        iniTypeInterface(context);
    }

    public BanglaFontClass(Context context, AttributeSet attrs) {
        super(context, attrs);
        iniTypeInterface(context);
    }

    public BanglaFontClass(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        iniTypeInterface(context);
    }

    private void iniTypeInterface(Context context) {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "Bangla.ttf");
        this.setTypeface(typeface);
    }
}
