public class NodeDefault {
    private String DEFAULT_NAME = new String("New Skill");
    private String DEFAULT_DESCRIPT = null;
    private String DEFAULT_NOTES = null;
    private boolean DEFAULT_HARD_PREREQUISITES;

    public void setDEFAULT_NAME(String DEFAULT_NAME) {
        this.DEFAULT_NAME = DEFAULT_NAME;
    }

    public void setDEFAULT_DESCRIPT(String DEFAULT_DESCRIPT) {
        this.DEFAULT_DESCRIPT = DEFAULT_DESCRIPT;
    }

    public void setDEFAULT_NOTES(String DEFAULT_NOTES) {
        this.DEFAULT_NOTES = DEFAULT_NOTES;
    }

    public void setDEFAULT_HARD_PREREQUISITES(boolean DEFAULT_HARD_PREREQUISITES) {
        this.DEFAULT_HARD_PREREQUISITES = DEFAULT_HARD_PREREQUISITES;
    }

    public String getDEFAULT_DESCRIPT() {
        return DEFAULT_DESCRIPT;
    }

    public String getDEFAULT_NAME() {
        return DEFAULT_NAME;
    }

    public String getDEFAULT_NOTES() {
        return DEFAULT_NOTES;
    }

    public boolean getDEFAULT_HARD_PREREQUISITES() {
        return DEFAULT_HARD_PREREQUISITES;
    }
}
