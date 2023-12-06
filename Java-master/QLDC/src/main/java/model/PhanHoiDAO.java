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
public class PhanHoiDAO {
    List<PhanHoi> listPH = new ArrayList<>();
    
     public int addPerson(PhanHoi phanHoi){
        listPH.add(phanHoi);
        return 1;
    }
    
    public List<PhanHoi> getAllPH(){
        return listPH;
}
}
