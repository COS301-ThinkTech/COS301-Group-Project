package javablock;

import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import config.*;
import javablock.gui.*;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;


public class Main extends JApplet implements ActionListener, Runnable {
    public Main()
    {
        Global.Classes=this.getClass().getClassLoader();
        Global.setSystemLaF(true);
        Global.setApplet(true);
        Global.init();
        MainWindow w=new MainWindow();
        w.remove(w.menu);
        this.setLayout(new BorderLayout());
        this.add(w.menu, BorderLayout.PAGE_START);
        add(w.getContentPane(), BorderLayout.CENTER);
        repaint();
    }

    @Override
    public void init()
    {
        Global.setSystemLaF(true);
        if(getParameter("url")!=null)
        if(!(getParameter("url").equals("none")))
        {
            String in;
            try 
            {
                URL url = new URL(getParameter("url"));
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
                in="";
                String str;
                while ((str = reader.readLine()) != null)
                {
                    in+=str;
                } reader.close();
                Global.getManager().loadXml(in.toString());
            } 
            catch (IOException ex) 
            {
            }
        }
        if(getParameter("editable")!=null)
        super.init();
    }

    
    public static boolean judgeInited=false;
    public static void judgeInit()
    {
        Global.GUI=false;
        Global.init();
        judgeInited=true;
    }
    public static void judgeStart(JTextArea console, String argv[]){
        if(!judgeInited)
            judgeInit();
        boolean saveScripts=false;
        boolean saveImages=false;
        String list[]=new String[100];
        int i=0;
        for(String ar:argv){
            System.out.println(ar);
            if(ar.equals("-saveScripts"))
                saveScripts=true;
            if(ar.equals("-saveImages"))
                saveImages=true;
            else
            {
                if(ar.endsWith(".flow"))
                {
                    Global.lastFlow=ar;
                    list[i]=ar;
                    i++;
                }
            }
        }
        i--;
        if(i>=0 && (saveScripts || saveImages))
        {
            Global.GUI=false;
            while(i>=0){
                MainWindow w=new MainWindow();
                console.append("File: "+new File(list[i]).getName()+"\n");
                console.append("\tLoading document\n");
                Global.getManager().loadFile(list[i]);
                Global.getManager().fc=new JFileChooser();
                File f=new File(list[i]);
                Global.getManager().fc.setSelectedFile(f);
                if(saveImages)
                {
                    console.append("\tSaving image\n");
                    Global.prerender=true;
                    System.out.println("Drawing");
                    Global.getManager().saveAsImages(f.getParent(),
                            f.getName().substring(0, f.getName().length()-4));
                }
                if(saveScripts)
                {
                    console.append("\tSaving temporary script\n");
                }
                i--;
            }
        }
    }
    
    public static void main(String argv[]) 
    {
        Global.setApplet(false);
        Global.init();
        Global.setSystemLaF(true);
        boolean saveScripts=false;
        boolean saveImages=false;
        String list[]=new String[100];
        int i=0;
        for(String ar:argv)
        {
            System.out.println(ar);
            if(ar.equals("-saveScripts"))
                saveScripts=true;
            if(ar.equals("-saveImages"))
                saveImages=true;
            else if(ar.equals("-uneditable"))
                Global.editable=false;
            else{
                if(ar.endsWith(".flow")){
                    Global.lastFlow=ar;
                    list[i]=ar;
                    i++;
                }
            }
        }
        i--;
        if(i>=0 && (saveScripts || saveImages))
        {
            Global.GUI=false;
            while(i>=0){
                MainWindow w=new MainWindow();
                Global.getManager().loadFile(list[i]);
                Global.getManager().fc=new JFileChooser();
                File f=new File(list[i]);
                Global.getManager().fc.setSelectedFile(f);
                if(saveImages){
                    Global.prerender=true;
                    System.out.println("Drawing");
                    Global.getManager().saveAsImages(f.getParent(),
                            f.getName().substring(0, f.getName().length()-4));
                }
                
                i--;
            }
            System.exit(0);
        }
        else
        {
            if (Global.showSplash) 
            {
                Splash spl = new Splash(4000);
                spl.showSplash();
            }
            MainWindow w=new MainWindow();
            misc.center(w);
            w.setTitle("Flow 0.1");
            w.setResizable(true);
            w.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
    }
    MainWindow w;
    @Override
    public void run()
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run()
            {
                w=new MainWindow();
                w.remove(w.menu);
                setLayout(new BorderLayout());
                add(w.menu, BorderLayout.PAGE_START);
                add(w.getContentPane(), BorderLayout.CENTER);
                repaint();
            }
        });
    }
    @Override
    public void destroy()
    {
        try 
        {
            for (ScriptRunner run : Global.runners) 
            {
                run.close();
            }
            if(Global.getManager()!=null)
                Global.getManager().saveExit();
            Global.conf.saveConfig();
            super.finalize();
            System.exit(0);
        } 
        catch (Throwable ex) 
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     
}



