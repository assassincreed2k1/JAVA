package video_30;

public class Students {
    private String name;
    private double mark;

    Students(String name_, double mark_)
    {
        this.name = name_;
        this.mark = mark_;
    }

    public void get_name()
    {
        System.out.print("Mark: " + name);
    }

    public void get_mark()
    {
        System.out.print("Mark: " + mark);
    }
}
