/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XML;

/**
 *
 * @author HC
 */
public class taikhoan {
    private String taikhoan;
    private String matkhau;
    private int quyen;
    private int idhodan;

    public taikhoan() {
    }

    public taikhoan(String taikhoan, String matkhau, int quyen, int idhodan) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.quyen = quyen;
        this.idhodan = idhodan;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    public int getIdhodan() {
        return idhodan;
    }

    public void setIdhodan(int idhodan) {
        this.idhodan = idhodan;
    }

    @Override
    public String toString() {
        return "taikhoan{" + "taikhoan=" + taikhoan + ", matkhau=" + matkhau + ", quyen=" + quyen + ", idhodan=" + idhodan + '}';
    }
    
}
