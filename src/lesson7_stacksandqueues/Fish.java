package lesson7_stacksandqueues;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class Fish
{

    @Test
    public void testFisth()
    {

        int A[] = new int[]{4, 3, 2, 1, 5};
        int B[] = new int[]{0, 1, 0, 0, 0};

        int bigFish = solution(A, B);

        assertEquals(2, bigFish);

    }

    @Test
    public void testFisth_2()
    {

        int A[] = new int[]{4, 3, 2, 1, 5};
        int B[] = new int[]{0, 1, 0, 0, 1};

        int bigFish = solution(A, B);

        assertEquals(3, bigFish);

    }


    public int solution(int[] A, int[] B)
    {

        Stack fishStack = new Stack();
        int numberOfAliveFishes = 0;

        for (int i = 0; i < A.length; i++)
        {
            if (B[i] == 1)
            {
                numberOfAliveFishes++;
                fishStack.add(A[i]);
            }

            if (B[i] == 0)
            {
                if (fishStack.isEmpty())
                {
                    numberOfAliveFishes++;
                    continue;
                } else
                {
                    int downFish = A[i];
                    while (fishStack.isEmpty() == false && fishStack.peek() != null && downFish > (int) fishStack.peek())
                    {
                        numberOfAliveFishes--;
                        fishStack.pop();
                    }

                    if (fishStack.isEmpty())
                    {
                        numberOfAliveFishes++;
                    }
                }
            }
        }

        return numberOfAliveFishes;
    }

}
