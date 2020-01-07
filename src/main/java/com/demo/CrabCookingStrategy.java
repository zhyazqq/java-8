package main.java.com.demo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CrabCookingStrategy implements ItemListener
{
    private JFrame f;
    private JRadioButton qz,hs;
    private JPanel CenterJP,SouthJP;
    private Kitchen cf;    //����
    private CrabCooking qzx,hsx;    //��բз�ӹ���   
    CrabCookingStrategy()
    {
        f=new JFrame("����ģʽ�ڴ�բз�����е�Ӧ��");
        f.setBounds(100,100,500,400);
        f.setVisible(true);       
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SouthJP=new JPanel();
        CenterJP=new JPanel();
        f.add("South",SouthJP);
        f.add("Center",CenterJP);
        qz=new JRadioButton("������բз");
        hs=new JRadioButton("���մ�բз");
        qz.addItemListener(this);
        hs.addItemListener(this);
        ButtonGroup group=new ButtonGroup();
        group.add(qz);
        group.add(hs);
        SouthJP.add(qz);
        SouthJP.add(hs);
        //---------------------------------
        cf=new Kitchen();    //����
        qzx=new SteamedCrabs();    //������բз��
        hsx=new BraisedCrabs();    //���մ�բз��
    }
    public void itemStateChanged(ItemEvent e)
    {
        JRadioButton jc=(JRadioButton) e.getSource();
        if(jc==qz)
        {
            cf.setStrategy(qzx);
            cf.CookingMethod(); //����
        }
        else if(jc==hs)
        {
            cf.setStrategy(hsx);
            cf.CookingMethod(); //����
        }
        CenterJP.removeAll();
        CenterJP.repaint();
        CenterJP.add((Component)cf.getStrategy());       
        f.setVisible(true);
    }
    public static void main(String[] args)
    {       
        new CrabCookingStrategy();
    }
}
//��������ࣺ��բз�ӹ���
interface CrabCooking
{
    public void CookingMethod();    //���˷���
}
//��������ࣺ������բз
class SteamedCrabs extends JLabel implements CrabCooking
{
    private static final long serialVersionUID=1L;
    public void CookingMethod()
    {
          this.setIcon(new ImageIcon("src/strategy/SteamedCrabs.jpg"));
          this.setHorizontalAlignment(CENTER);
    }
}
//��������ࣺ���մ�բз
class BraisedCrabs extends JLabel implements CrabCooking
{
    private static final long serialVersionUID=1L;
    public void CookingMethod()
    {
        this.setIcon(new ImageIcon("src/strategy/BraisedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
//�����ࣺ����
class Kitchen
{
    private CrabCooking strategy;    //�������
    public void setStrategy(CrabCooking strategy)
    {
        this.strategy=strategy;
    }
    public CrabCooking getStrategy()
    {
        return strategy;
    }
    public void CookingMethod()
    {
        strategy.CookingMethod();    //����   
    }
}