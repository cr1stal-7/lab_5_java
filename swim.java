import java.util.Scanner;
import static java.lang.Math.abs;

public class swim {
    public static int counter_one = 0;
    public static int counter_double = 0;
    private glasses _glasses;
    private cap _cap;
    private shorts _shorts;
    private slippers _slippers;

    public swim(glasses _glasses, cap _cap, shorts _shorts, slippers _slippers) {
        this._glasses = _glasses;
        this._cap = _cap;
        this._shorts = _shorts;
        this._slippers = _slippers;
    }

    public void input() {
        _glasses.input();
        _cap.input();
        _shorts.input();
        _slippers.input();
    }

    public void output() {
        _glasses.output();
        _cap.output();
        _shorts.output();
        _slippers.output();
    }

    public void res(func res) {
        res.sum = _glasses.glasses_price + _cap.cap_price + _shorts.shorts_price + _slippers.slippers_price;
        System.out.println("Итог: " + res.sum);
    }

    public void color() {
        if ((_glasses.glasses_color.equalsIgnoreCase(_cap.cap_color)) && (_glasses.glasses_color.equalsIgnoreCase(_shorts.shorts_color)))
            System.out.println("У вас стильный total look");
        else
            System.out.println("У вас разноцветный комплект");
    }
}
