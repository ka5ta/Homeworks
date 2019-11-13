package ArraysTasks;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnitParamsRunner.class)
public class LargestNElementsArrayTest {

    @Test
    public void findLargestNumberTest() {
        int[] numbers = {1, 4, 17, 7, 25, 3, 100};
        int[] largestElements = {100, 25, 17};
        Assert.assertArrayEquals(largestElements, LargestNElementsArray.findLargestNumber(numbers, 3));
    }

    @Test
    @Parameters(method = "addParameters")

        public void KlargestNumbers ( int[] expected, int[] test, int k){
        int[] result = LargestNElementsArray.findLargestNumber(test,k);
        Arrays.sort(result);
        Arrays.sort(expected);
        Assert.assertArrayEquals(expected, LargestNElementsArray.findLargestNumber(result, k));
        }

    private Object[] addParameters() {
        return new Object[]{
                new Object[]{new int[]{200, 45, 30}, new int[]{5, 3, 45, 30, 200, 8}, 3},
                new Object[]{new int[]{9, 6, 5, 2, 1}, new int[]{0, 9, 5, 6, 2, 1}, 5},
        };
    }
}
