public class EP1 {

    public static void main(String arg[]){
        int sum = 0;

        for(int i = 0; i < 1000; i++){

            if(i%3 == 0){
                sum+= i;
                continue;
            }
            else if(i%5 == 0){
                sum+= i;
                continue;
            }

            else;
        }

        System.out.print(sum);

    }
}
