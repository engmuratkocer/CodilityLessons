package lesson3_tımecomplexity;

public class FrogJmp
{


    public static void main(String[] args)
    {
        FrogJmp frogJmp = new FrogJmp();

        int X = 10;
        int Y = 85;
        int D = 30;

        System.out.println(frogJmp.solution(X, Y, D));
    }


    public int solution(int X, int Y, int D)
    {

        if (Y < X) return 0;

        int diff = Y - X;
        int totalJumps = diff / D;

        if (diff % D > 0)
            totalJumps++;

        return totalJumps;
    }


}
