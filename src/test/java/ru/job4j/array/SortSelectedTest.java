package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThreeNumbsArray() {
        int[] data = new int[]{3, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFourNumbsArray() {
        int[] data = new int[]{3, 2, 1, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4};
        assertThat(result).containsExactly(expected);
    }

}