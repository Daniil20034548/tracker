package ru.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringCompareTest {
    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenRightEmptyThenShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                ""
        );
        assertThat(rst).isGreaterThan(0);
    }

    @Test
    public void whenLeftEmptyThenShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "",
                "Petrov"
        );
        assertThat(rst).isLessThan(0);
    }

    @Test
    public void whenEqualAndLeftEndsWithSpacesThenShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov  ",
                "Ivanov"
        );
        assertThat(rst).isGreaterThan(0);
    }

    @Test
    public void whenEqualAndLeftStartsWithSpacesAndRirhtEndsWithSpacesThenShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "  Ivanov",
                "Ivanov  "
        );
        assertThat(rst).isLessThan(0);
    }
}
