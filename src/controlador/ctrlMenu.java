package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Menu;
import vista.frmMenu;

public class ctrlMenu implements MouseListener, KeyListener{
    
    private Menu modeloMenu;
    private frmMenu vistaMenu;
    
    //constructor
    
    public ctrlMenu(Menu ModeloMenu, frmMenu frmMenu){
        this.modeloMenu = ModeloMenu;
        this.vistaMenu = frmMenu;
        
        frmMenu.btnGuardar.addMouseListener(this);
        
        modeloMenu.Mostrar(vistaMenu.jtbMenu);
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
      
        if(e.getSource() == vistaMenu.btnGuardar){
        
                modeloMenu.setNombre(vistaMenu.txtNombre.getText());
                modeloMenu.setPrecio(Double.parseDouble(vistaMenu.txtPrecio.getText()));
                modeloMenu.setIngredientes(vistaMenu.txtIngredientes.getText());
                
                modeloMenu.Guardar();
                modeloMenu.Mostrar(vistaMenu.jtbMenu);
                
        }
       
     
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
