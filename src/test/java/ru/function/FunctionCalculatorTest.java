package ru.function;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

 public class FunctionCalculatorTest  {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionCalculator  function = new FunctionCalculator ();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        FunctionCalculator  function = new FunctionCalculator ();
        List<Double> result = function.diapason(1, 6, x -> 3 * x * x + 2 * x + 1);
        List<Double> expected = Arrays.asList(6D, 17D, 34D, 57D, 86D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenIndicativeFunctionThenIndicativeResults() {
        FunctionCalculator  function = new FunctionCalculator ();
        List<Double> result = function.diapason(3, 6, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(8D, 16D, 32D);
        assertThat(result, is(expected));
    }
}