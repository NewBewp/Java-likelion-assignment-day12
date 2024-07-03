package day13.lambda;

public class BaseImp implements BaseInterface {
    @Override
    public void Say(String name) {
        System.out.println("BaseImp.Say"+name);
    }
}
