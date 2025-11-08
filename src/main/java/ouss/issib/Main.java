package ouss.issib;

import ouss.issib.templates.MoroccoImpl;
import ouss.issib.templates.SpainImpl;
import ouss.issib.templates.Template;

public class Main {
    public static void main(String[] args) {
        Template t = new MoroccoImpl();
        System.out.println(t.perform(2, 5));
        t = new SpainImpl();
        System.out.println(t.perform(2, 5));
    }
}