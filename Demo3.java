public class Demo3 {
    public static void main(String[] args){

        int AreaCode = 123;
        int MiddleNum = 456;
        int LastNum = 7809;

        final String COLOR = "\033[32;1m";
        final String RESET = "\033[30;0m";

        System.out.printf("Phone Number - (%s%s%s)%s-%s\n",COLOR,AreaCode,RESET,MiddleNum,LastNum);

    }
    
}
