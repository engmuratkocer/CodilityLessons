package lesson8_leaders;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class ParkingLot
{


    @Test
    public void test1()
    {
        assertEquals(5, solution("13:12", "13:12"));

    }

    @Test
    public void test2()
    {
        assertEquals(5, solution("13:12", "14:12"));

    }

    @Test
    public void test3()
    {
        assertEquals(9, solution("13:12", "14:15"));

    }

    @Test
    public void test4()
    {
        assertEquals(17, solution("13:12", "17:12"));

    }

    @Test
    public void test5()
    {
        assertEquals(21, solution("13:12", "17:13"));

    }

    public int solution(String E, String L)
    {

        int totalCost = 0;
        int entranceCost = 2;
        int upToFirstHourCost = 3;
        int followingHourCost = 4;
        int followingMinutes = 0;
        int followingHours = 0;

        totalCost = entranceCost + upToFirstHourCost;

        Calendar startCal = getTime(E);
        Calendar endCal = getTime(L);

        long totalMilliseconds = endCal.getTimeInMillis() - startCal.getTimeInMillis();
        int totalMinutes = (int) ((totalMilliseconds / 1000) / 60);

        if (totalMinutes > 60)
        {
            followingMinutes = totalMinutes - 60;
            if (followingMinutes % 60 == 0)
            {
                followingHours = followingMinutes / 60;
            } else
            {
                followingHours = (followingMinutes / 60) + 1;
            }

            totalCost += followingHours * followingHourCost;
        }

        return totalCost;
    }

    private Calendar getTime(String E)
    {
        String startTime[] = E.split(":");
        String startHour = startTime[0];
        String startMinute = startTime[1];

        Calendar startCal = GregorianCalendar.getInstance();
        startCal.set(Calendar.HOUR, Integer.valueOf(startHour));
        startCal.set(Calendar.MINUTE, Integer.valueOf(startMinute));
        return startCal;
    }
}
