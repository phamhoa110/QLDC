/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class PhanHoi {
    private int idPH;
    private String noiDungPH;
    private String thoiGianTaoPH;
    private int soNhaGuiPH;

    public PhanHoi() {
    }

    public PhanHoi(int idPH, String noiDungPH, String thoiGianTaoPH, int soNhaGuiPH) {
        this.idPH = idPH;
        this.noiDungPH = noiDungPH;
        this.thoiGianTaoPH = thoiGianTaoPH;
        this.soNhaGuiPH = soNhaGuiPH;
    }

    public int getIdPH() {
        return idPH;
    }

    public void setIdPH(int idPH) {
        this.idPH = idPH;
    }

    
    
    public String getNoiDungPH() {
        return noiDungPH;
    }

    public void setNoiDungPH(String noiDungPH) {
        this.noiDungPH = noiDungPH;
    }

    public String getThoiGianTaoPH() {
        return thoiGianTaoPH;
    }

    public void setThoiGianTaoPH(String thoiGianTaoPH) {
        this.thoiGianTaoPH = thoiGianTaoPH;
    }

    public int getSoNhaGuiPH() {
        return soNhaGuiPH;
    }

    public void setSoNhaGuiPH(int soNhaGuiPH) {
        this.soNhaGuiPH = soNhaGuiPH;
    }
    
}
