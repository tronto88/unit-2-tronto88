package arrayGenerator;

import java.util.Random;
public class CleverRandomListingGenerator extends RandomListingGenerator {
    /**
     * Generate an array containing elements in a random order
     *
     * @param size the size of the array to be generated
     */
    public CleverRandomListingGenerator(int size) {
        super(size);
    }

    @Override
    protected void randomise() {
        // A stub.
        // Implement randomise here.
        Random random = new Random();
        for (int i = getArray().length -1; i>0;i--) {
            int j = random.nextInt(i + 1);
            int temp = getArray()[i];
            getArray()[i] = getArray()[j];
            getArray()[j] = temp;

        }
        


    }
}
