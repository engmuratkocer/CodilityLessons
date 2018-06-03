package lesson5_prefixsum;

public class PassingCars {

    public static void main(String[] args) {

        int A[]= {0,1,0,1,1};
        System.out.println(solution(A));

    }

        public static int solution(int[] A) {

            if(A.length > 1000000000)
            {
                return -1;
            }

            int numberOfZeros = 0;
            for(int elm:A)
            {
                if(elm == 0)
                {
                    numberOfZeros++;
                }
            }
            int sumPerm = 0;
            int numberOfOnes = A.length - numberOfZeros;

            for(int elm:A)
            {
                if(elm == 0)
                {
                    sumPerm += numberOfOnes;
                }else{
                    numberOfOnes--;
                }
            }

            return sumPerm;

        }


}
