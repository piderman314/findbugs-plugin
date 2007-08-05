package hudson.plugins.findbugs;


// CHECKSTYLE:OFF
public class Pattern {
    private String type;
    private String description;

    /**
     * Sets the type to the specified value.
     *
     * @param type the value to set
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * Returns the type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the description to the specified value.
     *
     * @param description the value to set
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Returns the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }
}
