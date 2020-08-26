package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Minefieldtest {
    @Test
    void itShowsEmptyMineField (){
        assertArrayEquals(new String[] {"000", "000"}, displayMineField(new String [] {"...", ",,,"}));
    }

    @Test
    void isShowsCorrectNumberOfRows(){
        assertArrayEquals(
                new String[]{"000", "000", "000"},
                displayMineField(new String[] {"...", "...", "..."})
        );
    }

    private Object[] displayMineField(String[] strings) {

        return new String[] {
                "000", "000"
        };
    }
}
