import types.my_person;

public class my_calc {
    private my_person[] list;

    public my_calc(my_person[] list) {
        this.list = list;
    }

    public double calc_ave_age() {
        double sum = 0;
        for(int i = 0; i < list.length; i++) {
            sum += list[i].getAge();
        }
        return sum / (double)(list.length);
    }
}
