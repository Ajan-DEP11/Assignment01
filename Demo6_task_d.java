public class Demo6_task_d {
    public static void main(String[] args){


        String item1 = "Apple";
        int Quantity1 = 5;
        String price1 = "\033[0;35m0.99\033[0;0m";

        String item2 ="Orange";
        int Quantity2= 10;
        String price2 = "\033[0;35m1.49\033[0;0m";

        final String start="\033[37;1m";
        final String over="\033[30;0m";

        System.out.printf("\033[0;33m+%15s+%12s+%15s+\n","-".repeat(15),"-".repeat(12),"-".repeat(15));
        System.out.printf("| %1$15sITEM%2$s  \033[0;33m|%1$10sQUANTITY%2$s \033[0;33m|%1$12sPRICE%2$s     \033[0;33m|\n",start,over);
        System.out.printf("\033[0;33m+%15s+%12s+%15s+\n","-".repeat(15),"-".repeat(12),"-".repeat(15));
        System.out.printf("|\033[37;1m%-15s\033[30;0m|\033[37;1m%-12s\033[30;0m|\033[32;1m%s\033[30;0m%-15s          \033[0;33m|\n",item1,Quantity1,"$",price1);
        System.out.printf("\033[0;33m+%15s+%12s+%15s+\n","-".repeat(15),"-".repeat(12),"-".repeat(15));
        System.out.printf("|\033[37;1m%-15s\033[30;0m|\033[37;1m%-12s\033[30;0m|\033[32;1m%s\033[30;0m%-15s          \033[0;33m|\n",item2,Quantity2,"$",price2);
        System.out.printf("\033[0;33m+%15s+%12s+%15s+\n","-".repeat(15),"-".repeat(12),"-".repeat(15));
    }
    
}
