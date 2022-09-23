public class Quiz_03 {
    public static void main(String[] args) {
        int var1, var2, var3;

        while(true) {
            var1 = (int)(Math.random()*10 + 1);
            var2 = (int)(Math.random()*10 + 1);
            if(var1 > 6 || var2 > 6) {
                continue;
            }
            System.out.println("(" + var1 + "," + var2 + ")");

            var3 = var1 + var2;
            if(var3 == 5) {
                break;
            }
        }
    }
}
