public class Demo6_task_c {
    public static void main(String[] args){
        
        String city1 = "Los Angeles";
        String state1 = "California";
        int population1 = 3966936;

        String city2 ="\033[0;32mNew\033[0;0m york";
        String state2= "\033[0;32mNew\033[0;0m york";
        int population2 = 8336817;

        final String start="\033[37;1m";
        final String over="\033[30;0m";

        System.out.printf("+%15s+%12s+%15s+\n","-".repeat(15),"-".repeat(12),"-".repeat(15));
        System.out.printf("| %1$15sCITY%2$s  |%1$12sSTATUS%2$s |%1$12sPOPULATION%2$s|\n",start,over);
        System.out.printf("+%15s+%12s+%15s+\n","-".repeat(15),"-".repeat(12),"-".repeat(15));
        System.out.printf("|%-15s|%-12s|%,-15d|\n",city1,state1,population1);
        System.out.printf("+%15s+%12s+%15s+\n","-".repeat(15),"-".repeat(12),"-".repeat(15));
        System.out.printf("|%15s       |%12s    |%,-15d|\n",city2,state2,population2);
        System.out.printf("+%15s+%12s+%15s+\n","-".repeat(15),"-".repeat(12),"-".repeat(15));
        

        
    }
    
}