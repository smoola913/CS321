package src;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReviewTest {

    @Test
    public void review() {

        Review review = new Review();

        review.setName("Bob");

        assertEquals("Bob", review.getName());
        // assertEquals("Boeb", review.getName());
    }
}
