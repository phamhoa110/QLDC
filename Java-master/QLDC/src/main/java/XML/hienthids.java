/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XML;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author HC
 */
public class hienthids {
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        try {
            // TODO code application logic here
            //doan code trong nay de doc du lieu tu file ra thanh 1 list de co the lam viec void cac ptu cua list
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("E:\\QLDCJAVA\\java\\QLDC\\src\\main\\java\\XML\\taikhoan2.xml");
        
            Element taikhoans = doc.getDocumentElement();
            NodeList litaikhoan = taikhoans.getElementsByTagName("taikhoan");
            NodeList limatkhau = taikhoans.getElementsByTagName("matkhau");
            NodeList liquyen = taikhoans.getElementsByTagName("quyen");
            
            List<taikhoan> ds = new ArrayList<taikhoan>();
            NodeList lihodan = taikhoans.getElementsByTagName("hodan");
            for (int i = 0; i < liquyen.getLength(); i++) {
                taikhoan tk = new taikhoan();
                Node nidhodan = lihodan.item(i).getAttributes().getNamedItem("idhodan");
                tk.setIdhodan(Integer.parseInt(nidhodan.getTextContent()));
                tk.setTaikhoan(litaikhoan.item(i).getTextContent());
                tk.setMatkhau(limatkhau.item(i).getTextContent());
                tk.setQuyen(Integer.parseInt(liquyen.item(i).getTextContent()));
                ds.add(tk);
            }
            
            System.out.println("Danh sách tài khoản taikhoan2.xml: ");
            for(taikhoan tk : ds) {
                System.out.println(tk);
            }
            
            List<Number> idhd = new ArrayList<Number>();
            for (int i = 0; i < liquyen.getLength(); i++) {
                Node nidhodan = lihodan.item(i).getAttributes().getNamedItem("idhodan");
                idhd.add(Integer.parseInt(nidhodan.getTextContent()));
            }
            for(Number id : idhd) {
                System.out.println(id);
            }
            
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(hienthids.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(hienthids.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(hienthids.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
