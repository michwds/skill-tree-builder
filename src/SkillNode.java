import java.util.LinkedList;

public class SkillNode extends NodeDefault {
    private LinkedList<SkillNode> descendents;
    private LinkedList<Link> prerequisites;
    private String name;
    private String description;
    private String notes;
    private Boolean hasHardPrerequisites;
    double[] xy;

    public SkillNode() {
        this.name = getDEFAULT_NAME();
        this.description = getDEFAULT_DESCRIPT();
        this.hasHardPrerequisites = getDEFAULT_HARD_PREREQUISITES();
        this.notes = getDEFAULT_NOTES();
    }
    public SkillNode(SkillNode initialPrereq){
        this.name = getDEFAULT_NAME();
        this.description = getDEFAULT_DESCRIPT();
        this.hasHardPrerequisites = getDEFAULT_HARD_PREREQUISITES();
        this.notes = getDEFAULT_NOTES();
        this.prerequisites.add(new Link(initialPrereq, this));
    }

    public Boolean getHasHardPrerequisites() {
        return hasHardPrerequisites;
    }

    public LinkedList<Link> getPrerequisites() {
        return prerequisites;
    }

    public LinkedList<SkillNode> getDescendents() {
        return descendents;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getNotes() {
        return notes;
    }

    public double[] getXY() {
        return this.xy;
    }

    public void setDescendents(LinkedList<SkillNode> descendents) {
        this.descendents = descendents;
    }

    public void setPrerequisites(LinkedList<Link> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setHasHardPrerequisites(Boolean hasHardPrerequisites) {
        this.hasHardPrerequisites = hasHardPrerequisites;
    }

    public void setXY(double[] xy) {
        this.xy = xy;
    }
}
