public class ClassWork06 {
    public static void main(String[] args) {
    String[] names = {"Alex","Peter","Eugene","Antony"};
    int[] ages = {22,23,26,28};
    int[] salary = {500,900,700,800};
    maxSalaryName(names,salary);
    }

    static void maxSalaryName(String[] names, int[] salary){
        int testElement = salary[0];
        int count = 0;
        for (int i = 0; i < salary.length; i++) {
            if (testElement <= salary[i]){
                testElement = salary[i];
                count = i;
            }
        }
        System.out.println(names[count]);
    }

}
