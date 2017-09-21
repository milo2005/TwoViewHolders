package codemakers.twoviewholders.model;

/**
 * Created by darfe on 21/09/2017.
 */

public class Item1 implements Item{

    private String msg;
    private String title;

    public Item1(String msg, String title) {
        this.msg = msg;
        this.title = title;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int getTipo() {
        return TIPO_UNO;
    }
}
