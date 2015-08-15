package javablock.flowchart;

import config.Global;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;


public class Flowline implements FlowElement {
    public JBlock f=null, n=null;
    public String value="";

    public Flowline(JBlock from, JBlock to){
        f=from; n=to;
        needUpdate=true;
    }

    @Override
    public void delete(){
        f.connects.remove(this);
        n.connectsIn.remove(this);
        f=null;
        n=null;
    }

    public void setValue(String v){
        value=v;
        needUpdate=true;
    }

    Line2D lineS=new Line2D.Float();
    GeneralPath curve = new GeneralPath();;
    GeneralPath arrow = new GeneralPath();;
    Shape line;
    Shape s;
    public boolean needUpdate=true;
    Point2D from, to;

    public float angle, angle2;
    float angleL;
    TextLayout val;
    
    static double arrowLength=12;

    @Override
    public void shape(){

        needUpdate=true;
        if(n.needUpdate)
            n.shape();
        from=new Point2D.Float(f.posX, f.posY);
        to=new Point2D.Float(n.posX, n.posY);
        angle=(float) Math.atan2(to.getX()-from.getX(), to.getY()-from.getY());
        angle2=(float) Math.atan2(from.getX()-to.getX(), from.getY()-to.getY());
        from=f.connectPoint(angle2);
        to=n.connectPoint(angle);
        angleL=(float) Math.atan2(from.getX()-to.getX(), from.getY()-to.getY());

        //float ang=(float) Math.atan2(from.getX()-to.getX(), from.getY()-to.getY());

        if(Global.bezierCurves && Math.abs(angle)!=0 &&
                Math.abs(angle)!=Math.PI/2 && Math.abs(angle)!=Math.PI){
            curve.reset();
            curve.moveTo(from.getX(),from.getY());
            Point2D f1=f.connectPointBezier(angle2, to, 1.0f);
            Point2D f2=n.connectPointBezier(angle, from, 1.0f);
            Point2D f2a=new Point2D.Double(
                    to.getX()-Math.signum(to.getX()-f2.getX())*10,
                    to.getY()-Math.signum(to.getY()-f2.getY())*10
                    );
            f2.setLocation(
                    f2.getX()-Math.signum(to.getX()-f2.getX())*10,
                    f2.getY()-Math.signum(to.getY()-f2.getY())*10
                    );
            curve.curveTo(f1.getX(), f1.getY(), f2.getX(), f2.getY(), f2a.getX(), f2a.getY());
            curve.lineTo(to.getX(), to.getY());
            line=curve;
            GeneralPath g=new GeneralPath();
            double an=0;
                 if(angle >=-Math.PI*0.25 && angle<=Math.PI*0.25)
                an=Math.PI;
            else if(angle >= Math.PI * 0.75 || angle <= -Math.PI * 0.75)
                an=0;
            else if(angle >= Math.PI * 0.25 && angle <= Math.PI * 0.75)
                an=-Math.PI/2;
            else if(angle <= -Math.PI * 0.25 && angle >= -Math.PI * 0.75)
                an=Math.PI/2;
            g.moveTo(to.getX()+Math.sin(an+0.3)*arrowLength, to.getY()+Math.cos(an+0.3)*arrowLength);
            g.lineTo(to.getX(), to.getY());
            g.lineTo(to.getX()+Math.sin(an-0.3)*arrowLength, to.getY()+Math.cos(an-0.3)*arrowLength);
            s=g;
        }
        else{
            lineS.setLine(from, to);
            line=lineS;
            GeneralPath g=new GeneralPath();
            g.moveTo(to.getX()+Math.sin(angleL+0.3)*arrowLength, to.getY()+Math.cos(angleL+0.3)*arrowLength);
            g.lineTo(to.getX(), to.getY());
            g.lineTo(to.getX()+Math.sin(angleL-0.3)*arrowLength, to.getY()+Math.cos(angleL-0.3)*arrowLength);    
            s=g;
        }
        String value=this.value;
        if(value.length()==0)
            value=" ";
        if(config.translator.misc.containsKey(value))
            val=new TextLayout(config.translator.misc.getString(value), Global.monoFont, f.flow.frc);
        else
            val=new TextLayout(value, Global.monoFont, f.flow.frc);
        needUpdate=false;
    }
    
    @Override
    public void draw(Graphics2D g2d)
    {
        if(n==null || f==null) return ;
        if(needUpdate==true)
            shape();
        g2d.setColor(f.borderColor);
        if(Global.fullConnectorValue==false){
            if(value == null ? "false" == null : value.equals("false"))
                g2d.setStroke(Global.strokeSelection);
            else
                g2d.setStroke(Global.strokeNormal);
        }
        else{
            if(value.length()>1){
                AffineTransform transform = g2d.getTransform();
                    g2d.translate(from.getX(), from.getY());
                    if(angleL<0){
                        g2d.rotate(-angleL - Math.PI/2);
                        val.draw(g2d, 2, -3);
                    }
                    else{
                        g2d.rotate(-angleL - Math.PI/2);
                        g2d.scale(-1, -1);
                        val.draw(g2d, (float)-val.getBounds().getWidth()-2, -3);
                    }
                g2d.setTransform(transform);
            }
        }
        if(n.drawArrow(this))
            g2d.fill(s);
            //g2d.draw(s);
        g2d.draw(line);
        g2d.setStroke(Global.strokeNormal);
    }

    @Override
    public boolean isEditable() {
        return false;
    }

    @Override
    public BlockEditor getEditor() {
        return null;
    }

    @Override
    public boolean contains(double x, double y) {
        return line.intersects(new Rectangle2D.Double(x-2, y-2,4,4));
    }
    @Override
    public boolean intersects(Shape s) {
        return line.intersects(s.getBounds2D());
    }

    @Override
    public Rectangle2D bound2D() {
        return line.getBounds2D();
    }

    @Override
    public Rectangle bound() {
        return line.getBounds();
    }

    @Override
    public void draw(Graphics2D g2d, boolean drawFull) {
        draw(g2d);
    }

    @Override
    public void drawSelection(Graphics2D g2d) {
    }

    @Override
    public boolean highLight(Graphics2D g2d) {
        return false;
    }

    @Override
    public void drawShadow(Graphics2D g2d) {
    }
}
