public class Percentages {

    public static void main(String[] args){
        double a = 2.0;
        double b = 5.0;
        Percentages (a, b);
    }
    public static void Percentages (double a, double b){
        double percent =(a/b)*100;
        System.out.println(a + "is" + percent + "percent of"+ b);
    }
}
