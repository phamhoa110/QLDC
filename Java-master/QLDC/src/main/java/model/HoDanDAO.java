/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoDanDAO {
    List<HoDan> hoDan = new ArrayList<>();
    
    public int addHoDan(HoDan hd){
        hoDan.add(hd);
        return 1;
    }
    
    public List<HoDan> getAllHoDan(){
        return hoDan;
}
}
