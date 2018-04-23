package com.ashok.lang.utils;

import java.util.Random;

/**
 * @author Ashok Rajpurohit (ashok1113@gmail.com).
 */
public class ArrayUtils {
    public static int[] toArray(Iterable<Integer> list) {
        int size = 0;
        for (Integer e : list)
            size++;

        int[] ar = new int[size];
        int index = 0;

        for (Integer e : list)
            ar[index++] = e;

        return ar;
    }

    public static void reverse(Object[] ar) {
        for (int i = 0, j = ar.length - 1; i < j; i++, j--) {
            swap(ar, i, j);
        }
    }

    public static void reverse(char[] ar) {
        for (int i = 0, j = ar.length - 1; i < j; i++, j--) {
            char temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
    }

    public static void reverse(int[] ar) {
        for (int i = 0, j = ar.length - 1; i < j; i++, j--) {
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
    }

    public static void reverse(long[] ar) {
        for (int i = 0, j = ar.length - 1; i < j; i++, j--) {
            long temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
    }

    public static void reverse(double[] ar) {
        for (int i = 0, j = ar.length - 1; i < j; i++, j--) {
            double temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
    }

    public static void reverse(short[] ar) {
        for (int i = 0, j = ar.length - 1; i < j; i++, j--) {
            short temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
    }

    public static int count(int[] ar, int value) {
        int count = 0;

        for (int e : ar)
            if (e == value)
                count++;

        return count;
    }

    public static int count(long[] ar, long value) {
        int count = 0;

        for (long e : ar)
            if (e == value)
                count++;

        return count;
    }

    public static int count(boolean[] ar, boolean value) {
        int count = 0;

        for (boolean e : ar)
            if (e == value)
                count++;

        return count;
    }

    public static int count(char[] ar, char value) {
        int count = 0;

        for (char e : ar)
            if (e == value)
                count++;

        return count;
    }

    public static int count(double[] ar, double value) {
        int count = 0;

        for (double e : ar)
            if (e == value)
                count++;

        return count;
    }

    public static <T> int count(Iterable<T> list, T value) {
        int count = 0;

        for (T t : list)
            if (value.equals(t))
                count++;

        return count;
    }

    /**
     * Counts number of elements between {@code min} and {@code max} both exclusive.
     *
     * @param ar
     * @param min
     * @param max
     * @return number of elements in range.
     */
    public static int count(int[] ar, int min, int max) {
        int count = 0;
        for (int e : ar)
            if (e > min && e < max) count++;

        return count;
    }

    public static int max(int[] ar) {
        int max = ar[0];

        for (int e : ar)
            max = Math.max(e, max);

        return max;
    }

    public static long max(long[] ar) {
        long max = ar[0];

        for (long e : ar)
            max = Math.max(e, max);

        return max;
    }

    public static double max(double[] ar) {
        double max = ar[0];

        for (double e : ar)
            max = Math.max(e, max);

        return max;
    }

    public static Comparable max(Comparable[] ar) {
        Comparable max = ar[0];

        for (Comparable t : ar)
            if (max.compareTo(t) > 0)
                max = t;

        return max;
    }

    public static Comparable max(Iterable<Comparable> list) {
        Comparable max = null;

        for (Comparable e : list) {
            if (max == null || max.compareTo(e) > 0)
                max = e;
        }

        return max;
    }

    public static int min(int[] ar) {
        int min = ar[0];

        for (int e : ar)
            min = Math.min(e, min);

        return min;
    }

    public static long min(long[] ar) {
        long min = ar[0];

        for (long e : ar)
            min = Math.min(e, min);

        return min;
    }

    public static double min(double[] ar) {
        double min = ar[0];

        for (double e : ar)
            min = Math.min(e, min);

        return min;
    }

    public static Comparable min(Comparable[] ar) {
        Comparable min = ar[0];

        for (Comparable t : ar)
            if (min.compareTo(t) < 0)
                min = t;

        return min;
    }

    public static Comparable min(Iterable<Comparable> list) {
        Comparable min = null;

        for (Comparable e : list) {
            if (min == null || min.compareTo(e) < 0)
                min = e;
        }

        return min;
    }

    public static int minElementIndex(int[] ar) {
        int index = 0, i = 0;
        int min = ar[0];

        for (int e : ar) {
            if (e < min) {
                index = i;
                min = e;
            }
            i++;
        }

        return index;
    }

    public static int minElementIndex(long[] ar) {
        int index = 0, i = 0;
        long min = ar[0];

        for (long e : ar) {
            if (e < min) {
                index = i;
                min = e;
            }
            i++;
        }

        return index;
    }

    public static int maxElementIndex(int[] ar) {
        int index = 0, i = 0;
        int max = ar[0];

        for (int e : ar) {
            if (e > max) {
                index = i;
                max = e;
            }
            i++;
        }

        return index;
    }

    public static int maxElementIndex(long[] ar) {
        int index = 0, i = 0;
        long max = ar[0];

        for (long e : ar) {
            if (e > max) {
                index = i;
                max = e;
            }
            i++;
        }

        return index;
    }

    public static void randomizeArray(int[] ar) {
        if (ar.length == 1)
            return;

        Random random = new Random();
        for (int i = 0; i < ar.length; i++) {
            int j = random.nextInt(ar.length);
            while (j == i)
                j = random.nextInt(ar.length);

            swap(ar, i, j);
        }
    }

    public static void randomizeArray(int[] ar, int from, int to) {
        if (from == to)
            return;

        Random random = new Random();
        int len = to + 1 - from;
        for (int i = from; i <= to; i++) {
            int j = from + random.nextInt(len);
            while (j == i)
                j = from + random.nextInt(len);

            swap(ar, i, j);
        }
    }

    public static void randomizeArray(Object[] objects) {
        Random random = new Random();
        for (int i = 0; i < objects.length; i++) {
            int j = random.nextInt(objects.length);
            while (j == i)
                j = random.nextInt(objects.length);

            swap(objects, i, j);
        }
    }

    public static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static void swap(Object[] objects, int i, int j) {
        Object temp = objects[i];
        objects[i] = objects[j];
        objects[j] = temp;
    }
}
