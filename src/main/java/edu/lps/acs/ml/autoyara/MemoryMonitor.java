package edu.lps.acs.ml.autoyara;

public class MemoryMonitor {

    public static long getUsedMemory() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static long getFreeMemory() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.freeMemory();
    }

    public static long getTotalMemory() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory();
    }

    public static long getMaxMemory() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.maxMemory();
    }
}