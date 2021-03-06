package com.fasterxml.jackson.core;

/**
 * Marker interface that is to be implemented by data format - specific features.
 * Interface used since Java Enums can not extend classes or other Enums, but
 * they can implement interfaces; and as such we may be able to use limited
 * amount of generic functionality.
 */
public interface FormatFeature
{
    /**
     * Accessor for checking whether this feature is enabled by default.
     */
    public boolean enabledByDefault();
    
    /**
     * Returns bit mask for this feature instance; must be a single bit,
     * that is of form <code>(1 &lt;&lt; N)</code>
     */
    public int getMask();

    /**
     * Convenience method for checking whether feature is enabled in given bitmask
     */
    public boolean enabledIn(int flags);
}
