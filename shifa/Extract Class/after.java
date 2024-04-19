public class Text{
    private String rst;
    private String html;

    public Text(String rst,String html)
    {
        this.rst=rst;
        this.html=html;
    }

    public String getRst()
    {
        return this.rst;
    }
    public String getHTML()
    {
        return this.html;
    }
} 

public class After{
    private Text previewText;
    private Text text;

    public void setPreviewText(String rst,String html)
    {
        previewText=new Text(rst,html);
    }

    public void setText(String rst,String html)
    {
        text=new Text(rst,html);
    }
}