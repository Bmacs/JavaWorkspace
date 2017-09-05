package Week7PhoneModels;

public class PhoneTest {
    public static void main(String[] args) {
        PhoneModel phone1 = new iPhone7Plus();
        phone1 = new CarbonFiberCase(phone1);
        phone1.setColor(PhoneModel.Color.Gold);
        System.out.println(phone1.getColor() + " " + phone1.getModel() + " " + phone1.Cost() + "\n  comes with " + phone1.getOS() + " installed");

        PhoneModel phone2 = new iPhoneSE();
        phone2.setColor(PhoneModel.Color.White);
        System.out.println(phone2.getColor() + " " + phone2.getModel() +  " " + phone2.Cost() + "\n  comes with " + phone2.getOS() + " installed");

        PhoneModel phone3 = new GalaxyNote8();
        System.out.println(phone3.getColor() + " " + phone3.getModel() + " " + phone3.Cost() + "\n  comes with " + phone3.getOS() + " installed");

        PhoneModel phone4 = new GalaxyS8();
        System.out.println(phone4.getColor() + " " + phone4.getModel() + " " + phone4.Cost() + "\n  comes with " + phone4.getOS() + " installed");

        PhoneModel phone5 = new Pixel();
        phone5.setColor(PhoneModel.Color.White);
        System.out.println(phone5.getColor() + " " + phone5.getModel() + " " + phone5.Cost() + "\n  comes with " + phone5.getOS() + " installed");

        PhoneModel phone6 = new PixelXL();
        phone6 = new SiliconCase(phone6);
        phone6.setColor(PhoneModel.Color.Gold);
        System.out.println(phone6.getColor() + " " + phone6.getModel() + " " + phone6.Cost() + "\n  comes with " + phone6.getOS() + " installed");
    }
}
