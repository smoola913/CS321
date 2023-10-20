package src;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReviewTest {

    @Test
    public void review() {
        Review review = new Review();

        review.setName("Bob");
        review.setId(6679362);

        assertEquals("Bob", review.getName());
        assertEquals(6679362, review.getID());
    }
}
