
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Una mini-demo de un applet.
 * Un applet es una aplicacion GUI programada utilizando Swing -un framework para aplicaciones GUI 
 * incluido en JavaSE, pero que se ejecuta en una zona rectangular de una página web. 
 * 
 * No lo ejecuta el intérprete de Java, sino el "plugin" de java, que es un intérprete que se integra en el 
 * navegador (y que viene con el JRE). El plugin impone restricciones de seguridad a los applets que las
 * aplicaciones de escritorio (las que se descargan y ejecutan) no tienen.
 * 
 * Un applet programa derivando de la clase JApplet
 * Todo applet tiene un panel en que se puede dibujar con primitivas gráficas, y también añadir controles.
 * 
 * La clase JApplet define algunos métodos de los cuales se puede hacer overriding, y que determinan el comportamiento del applet.
 * 
 * Éste applet no tiene una construcción especialmente correcta. Sólo es una demo.
 * 
 * @author Victor 
 * @version 20130601
 */

public class AppletAnswer extends JApplet
{ 
    JRootPane rootPane; //una referencia al panel del applet
    JLabel label; //una etiqueta de texto
    JButton btn; //un botón

     /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void init()
    {
        rootPane = this.getRootPane();    //obtenemos una referencia al panel del applet
        rootPane.setLayout(new BorderLayout()); //establecemos un BorderLayout para el panel
        label = new JLabel(  //Creamos una etiqueta
                       "<html><body style=\"padding:5px;margin:10px;border:1px solid gray;\"><h1>Esto es una demo de un applet.</h1>Se trata de una aplicación <em>Java</em> que se ejecuta en el contexto "+
                       "de una región rectangular de una página web. Es una aplicación GUI, pero "+
                       "con restricciones de seguridad adicionales.<br>Son vistosas, pero no merece la pena aprender a hacerlas en primer lugar.<br>"+
                       "Además, están perdiendo bastante popularidad, frente a <em>HTML5+CSS3+Javascript</em> en aplicaciones de internet y <em>Microsoft Silverlight</em> "+
                       "en entorno empresarial<br><br>"+
                       "Esta demo calcula <span style=\"color:red;\">la respuesta definitiva a la cuestión de la vida, el universo y todo lo demás</span><br>"+
                       "</body></html>");
        rootPane.add(label, BorderLayout.NORTH); //añadimos la etiqueta en la parte superior del panel.
        btn = new JButton("Calcular!!!"); //Creamos un botón 
        //añadimos al botón, un "escuchador de eventos", indicando que si se pulsa el botón, ejecutamos btnClick()
        
        btn.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){btnClick();}});                          
        rootPane.add(btn, BorderLayout.SOUTH);
    }


    /**
     * Returns information about this applet. 
     * An applet should override this method to return a String containing 
     * information about the author, version, and copyright of the JApplet.
     *
     * @return a String representation of information about this JApplet
     */
    public String getAppletInfo()
    {
        // provide information about the applet
        return "Titulo: Demo Applet   \nAuthor: Víctor   \nUn applet simple, con un par de controles swing. ";
    }

    //Métodos propios de mis controles ----------------------------------------------------
    void btnClick()
    {
        //Cuando se pulsa el botón, cambia el texto del label, y desactiva el botón
        label.setText("<html><body style=\"padding:5px;margin:10px;\">...La respuesta definitiva a la cuestión de la vida, el universo y todo lo demás es..."+
                      "<br><span style=\"font-size:100px;color:blue;\">42</span></body></html>");
        btn.setEnabled(false);
    }


}
