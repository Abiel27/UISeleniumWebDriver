package LabraryCTproje.test;

public class xxcvcvcv {
     /*
     A function is a block of code,
     This is creating a function that will acomplish the task we want,
    write a program that can find the first duplicated element from the array
     */

    public int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }

        }

        return firstDuplicated;

    }


}

