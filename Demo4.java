public class Demo4 {
    public static void main(String[] args){

        int Date = 28;
        int Month = 12;
        int Year = 2023;

        int hour = 23;
        int minute = 59;
        int second = 59;

        System.out.printf("\033[32;1m%s\033[32;0m/\033[33;1m%s\033[30;0m/\033[35;1m%s\033[30;0m%s",Month,Date,Year," ");
        System.out.printf("\033[34;1m%s\033[32;0m:\033[36;1m%s\033[30;0m:\033[37;1m%s\033[30;0m\n",hour,minute,second);
        
    }
    
}
