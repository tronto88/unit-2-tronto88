package arrayGenerator;

import java.util.Random; // provides random numbers

/**
 * An array generator that generates an array containing the values 0..n in
 * random order. This abstract class does not specify how the contents of the
 * array are randomised - this must be implemented in concrete extensions of
 * this class.
 *
 * @author Hugh Osborne
 * @version September 2020
 */

public abstract class RandomListingGenerator extends SortedListingGenerator {
    /**
     * Generate an array containing elements in a random order
     *
     * @param size
     *            the size of the array to be generated
     */
    public RandomListingGenerator(int size) {
        super(size);
        randomise();
    }

    private Random random = new Random();

    /**
     * Randomise the order of the elements in the array
     */
    protected abstract void randomise();

    /**
     * The timed method for RandomListingGenerators is the randomise method.
     */
    public void timedMethod() {
        randomise();
    }

    /**
     * A utility to provide a random index within the range of indices of the
     * array generated by this array generator.
     *
     * @return an integer index between 0 and <tt>size</tt>-1 inclusive, where
     *         <tt>size</tt> is the size of the array generated by this array
     *         generator.
     */
    protected int getRandomIndex() {
        return random.nextInt(getArray().length);
    }
}