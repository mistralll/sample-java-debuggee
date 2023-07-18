import types.my_person;

public class main {
    public static void main(String args[]) {
        my_person[] list = new my_person[3];
        for(int i = 0; i < list.length; i++) {list[i] = new my_person();}
        list[0].setAge(10);
        list[1].setAge(20);
        list[2].setAge(25);
        my_calc cl = new my_calc(list);
        System.out.println(cl.calc_ave_age());
    }
}