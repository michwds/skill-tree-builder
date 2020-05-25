public class Link {
    private SkillNode starts;
    private SkillNode ends;
    private boolean isHard;
    private double[] startPoint = new double[2];
    private double[] endPoint;

    public Link(SkillNode starts) {
        this.starts = starts;
        this.setStartPoint(starts.getXY());
    }

    public Link(SkillNode starts, SkillNode ends) {
        this.starts = starts;
        this.setStartPoint(starts.getXY());
        this.ends = ends;
        this.setEndPoint(ends.getXY());
    }

    public void flip() {
        SkillNode temp = starts;
        double[] tempCoord = startPoint;
        starts = ends;
        this.setStartPoint(endPoint);
        ends = temp;
        this.setEndPoint(tempCoord);
        temp = null;
        tempCoord = null;
    }

    public SkillNode getStarts() {
        return starts;
    }

    public SkillNode getEnds() {
        return ends;
    }

    public boolean isHard() {
        return isHard;
    }

    public double[] getStartPoint() {
        return startPoint;
    }

    public double[] getEndPoint() {
        return endPoint;
    }

    public void setStartPoint(double[] in) {
        this.startPoint[0] = in[0];
        this.startPoint[1] = in[1];
    }

    public void setEndPoint(double[] in) {
        this.endPoint[0] = in[0];
        this.endPoint[1] = in[1];
    }


    public void setStarts(SkillNode starts) {
        this.starts = starts;
        this.setStartPoint(starts.getXY());
    }

    public void setEnds(SkillNode ends) {
        this.ends = ends;
        this.setEndPoint(ends.getXY());
    }

    public void setHard(boolean hard) {
        isHard = hard;
    }

    public boolean isFloating() {
        return (this.starts == null && this.ends == null);
    }
}
