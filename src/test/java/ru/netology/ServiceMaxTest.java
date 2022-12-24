package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceMaxTest {

        @Test
        void findMax() {
            ServiceMax service = new ServiceMax();

            long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
            long expected = 12;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }

        @Test
        void findMaxMiddle() {
            ServiceMax service = new ServiceMax();
            long[] incomesInBillions = {12, 5, 8, 4, 5, 33, 8, 6, 11, 11, 12};
            long expected = 33;
            long actual = service.findMax(incomesInBillions);
            assertEquals(expected, actual);
        }
    }

