import java.awt.*;
public class FrameTest
{
FrameTest()
{
Frame fm= new Frame();
FlowLayout fl=new FlowLayout();
Label lb= new Label("new label");
fm.add(lb);
Button b=new Button("click here");
b.setBounds(30,100,80,30);
fm.add(b);
List l=new List(3,false);
l.add("item1");
l.add("item2");
l.add("item3");
l.add("item4");
Checkbox c= new Checkbox("label",false);
Choice ch= new Choice();
ch.add("aditya");
ch.add("sahil");
fm.setLayout(fl);
fm.setSize(500,600);
fm.setVisible(true);
fm.add(l);
fm.add(c);
fm.add(ch);

}
public static void main(String[] args)
{
FrameTest fm= new FrameTest();

}
}