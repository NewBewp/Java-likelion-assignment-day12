package day12.lesson;

import java.util.ArrayList;
import java.util.List;

public class ManMain {
    public static void main(String[] args) {
//        ManService m = new ManService();
//        m.doSomeThing("Man working");
//        m.doSomeThing(12);

        ManEntity manEntity = new ManEntity();
        manEntity.setName("nameMan");
        manEntity.setAge(20);

        ManService manService = new ManService();
        manService.insert(manEntity);

        List <ManEntity> manEntityList = new ArrayList<>();
        manEntityList = manService.findAdll();
        for (ManEntity manEntity1 : manEntityList) {
            System.out.println(manEntity1.getName());
        }




    }
}
