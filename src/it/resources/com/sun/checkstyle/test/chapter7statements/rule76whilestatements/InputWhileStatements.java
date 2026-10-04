package com.sun.checkstyle.test.chapter7statements.rule76whilestatements;

// violation first line 'Header mismatch'

/**
 * Test input for formatting of while statements.
 */
public final class InputWhileStatements {

    /**
     * Dummy method with correct while statements followed by incorrect ones.
     *
     * @param limit dummy iteration limit.
     * @return accumulated value.
     */
    public int count(final int limit) {
        int total = 0;
        int index = 0;

        while (index < limit) {
            total += index;
            index++;
        }

        // violation below ''while' construct must use '{}'s.'
        while (index < limit)
            index++;

        while (index < limit)
        { // violation ''{' at column 9 should be on the previous line.'
            index++;
        }

        // 2 violations 3 lines below:
        //   ''while' construct must use '{}'s.'
        //   'Empty statement.'
        while (index++ < limit);

        // violation below 'Must have at least one statement.'
        while (index++ < limit) {
        }

        return total + index;
    }

}
