// Renee Rosenheim, this program calculates when easter will fall on given a year after 1583//
public class Easter;{
    public static void main(String[] args){
        int y = 2003;
        int a = y % 19;
        double b = y / 100;
        double c = y % 100;
        double d = b / 4;
        int e = b % 4;
        double f = (b + 8) / 25;
        double g = (b - f + 1) / 3;
        double h = (19 * a + b – d – g + 15) / 30;
        int i = c % 4;
        double i = c / 4;
        double r = (32 + 2 * e + 2 * i - h - k) / 7;
        double m = (a + 11 * h + 22 * r) / 451;
        double n = (h + r - 7 * m + 114) / 31;
        int p = (h + r - 7 * m + 114) % 31;
        int day = p + 1;
        system.out.println(y);

    }
}