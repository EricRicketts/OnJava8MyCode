package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestStage {
    private Stage stage;
    String[] expected, actual;

    @BeforeEach
    public void setUp() {
        stage = new Stage();
    }

    @Test
    public void testOneActorChange() {
        expected = new String[]{"Happy Actor", "Sad Actor"};
        actual = new String[2];
        actual[0] = stage.performPlay();
        stage.change();
        actual[1] = stage.performPlay();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoActorChanges() {
        expected = new String[]{"Happy Actor", "Sad Actor", "Happy Actor"};
        actual = new String[3];
        actual[0] = stage.performPlay();
        stage.change();
        actual[1] = stage.performPlay();
        stage.change();
        actual[2] = stage.performPlay();

        assertArrayEquals(expected, actual);
    }

}
