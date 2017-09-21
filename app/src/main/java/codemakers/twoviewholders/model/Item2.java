package codemakers.twoviewholders.model;

public class Item2 implements Item{

    private String content;

    public Item2(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int getTipo() {
        return TIPO_DOS;
    }
}
