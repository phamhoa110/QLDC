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
public class Person {
    private int id, tuoi, sonha;
    private String hoten, namsinh, nghenghiep;

    public Person() {
    }

    public Person(int id, int tuoi, int sonha, String hoten, String namsinh, String nghenghiep) {
        this.id = id;
        this.tuoi = tuoi;
        this.sonha = sonha;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.nghenghiep = nghenghiep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSonha() {
        return sonha;
    }

    public void setSonha(int sonha) {
        this.sonha = sonha;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getNghenghiep() {
        return nghenghiep;
    }

    public void setNghenghiep(String nghenghiep) {
        this.nghenghiep = nghenghiep;
    }

   
    
    
}
