package Sorting;

public class Player {
        //int[] data = {10, 23, 144, 55, 999, 7, 3, 11, 37, 37};
        String name;
        public Player[] Player;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(Integer age) {
                this.age = age;
        }

        int age;

        public Player(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public static Player[] sort(Player[] data) {
            int len = data.length;
            for (int i = 0; i < data.length-1; i++) {
                for (int j = 0; j < data.length-1; j++) {
                    if (data[j].age > data[j+1].age) {
                        //System.out.println(data[j].name);
                        Player temp = data[j+1];
                        data[j+1] = data[j];
                        data[j] = temp;
                    }
                }
            }
            return data;
        }



    public static Player[] nameSort(Player[] data) {
        int len = data.length;
        for (int i = 1; i < len; i++) {
            //System.out.println("Pass = " + pass);
            for (int j = 0; j < len - 1; j++) {
                //System.out.println(j);
                if (data[j].name.compareTo(data[j + 1].name) < 0) {
                    // swap
                    Player temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }

        public static void printData(Player[] data) {
            for (int i = 0; i < data.length; i++)
                System.out.println(data[i].name + " " + data[i].age);
        }

        public static void main(String[] args) {
            Player[] player = new Player[10];
            String[] names = {"Joe","Steve","Stacie","Angelica","Jack","Ryan","Grace","Justin","Rob","Brian"};
            int[] ages = {30,28,25,27,27,26,23,22,19,21};
            for (int i = 0; i < player.length; i++) {
                player[i] = new Player(names[i], ages[i]);
            }

            System.out.println("The unsorted order:");

            Sorting.Player.printData(player);



            System.out.println("The sorted order:");
            System.out.println();
            System.out.println("Age Sort");
            Sorting.Player.sort(player);
            Sorting.Player.printData(player);
            System.out.println();
            System.out.println("Name Sort");
            Sorting.Player.nameSort(player);
            Sorting.Player.printData(player);
        }
    }
