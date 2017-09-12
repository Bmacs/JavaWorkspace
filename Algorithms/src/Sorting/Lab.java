package Sorting;

public class Players {

    //int[] data = {10, 23, 144, 55, 999, 7, 3, 11, 37, 37};
    public Players(){};

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    int age;

    public Players(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Players[] sort(Players[] data) {

        int len = data.length;

        for (int pass = 1; pass<len; pass++) {
            System.out.println("Pass = " + pass);
            for (int compares = 0; compares<len-pass; compares++) {
                System.out.println(compares);
                if (data[compares].age < data[compares + 1].age) {
                    int temp = data[compares].age;
                    data[compares] = data[compares + 1];
                    data[compares+1].age = temp;
                }
            }
        }
        for (int pass = 1; pass < len; pass++) {
            System.out.println("Pass = " + pass);
            for (int compares = 0; compares < len-pass; compares++) {
                System.out.println(compares);
                if (data[compares].name.compareTo(data[compares+1].name) < 0) {
                    // swap
                    String temp = data[compares].name;
                    data[compares].name = data[compares + 1].name;
                    data[compares + 1].name = temp;
                }
            }
        }
        return data;
    }

    public void printData() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("The unsorted order:");
        Players player = new Players();
        player.printData();

        player.sort(player.data);

        System.out.println("The sorted order:");
        player.printData();
    }
}
