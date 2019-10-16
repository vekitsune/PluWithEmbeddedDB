/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pluembeddeddata;

import javax.swing.ImageIcon;

/**
 *
 * @author Verosffy
 */
public class POJOplu {
    private String termeknev;
    private String termekKod;
    private String termekKategoria;
    private ImageIcon imageicon;
    
    public POJOplu(){
        
    }
    public POJOplu(String termeknev, String termekKod, String termekKategori){
        this.termeknev=termeknev;
        this.termekKod=termekKod;
        this.termekKategoria=termekKategori;
        
    }
    public POJOplu(String tNev, String tKod, String tKategori, ImageIcon kep ){
        this.termeknev=tNev;
        this.termekKod=tKod;
        this.termekKategoria=tKategori;
        this.imageicon=kep;
    }

    public String getTermeknev() {
        return termeknev;
    }

    public void setTermeknev(String termeknev) {
        this.termeknev = termeknev;
    }

    public String getTermekKod() {
        return termekKod;
    }

    public void setTermekKod(String termekKod) {
        this.termekKod = termekKod;
    }

    public String getTermekKategoria() {
        return termekKategoria;
    }

    public void setTermekKategoria(String termekKategoria) {
        this.termekKategoria = termekKategoria;
    }

    public ImageIcon getImageicon() {
        return imageicon;
    }

    public void setImageicon(ImageIcon imageicon) {
        this.imageicon = imageicon;
    }
    
}
