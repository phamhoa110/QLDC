/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XML;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author HC
 */
public class taofileXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            
            Element taikhoans = doc.createElement("taikhoans");
            taikhoan tk1 = new taikhoan("kien", "0204", 0, 1);
            taikhoan tk2 = new taikhoan("huy", "9999", 0, 2);
            taikhoan tk3 = new taikhoan("huong", "25346", 0, 3);

            
            themTaiKhoan(doc, taikhoans, tk1);
            themTaiKhoan(doc, taikhoans, tk2);
            themTaiKhoan(doc, taikhoans, tk3);

            doc.appendChild(taikhoans);

            
            //ghi file
            TransformerFactory tff = TransformerFactory.newInstance();
            Transformer tr = tff.newTransformer();
            tr.setOutputProperty(OutputKeys.INDENT, "yes");
            tr.setOutputProperty("{https:xml.apache.org/xslt}indent-amount", "2");
            DOMSource nguon = new DOMSource(doc);
            StreamResult dich = new StreamResult("E:\\QLDCJAVA\\java\\QLDC\\src\\main\\java\\XML\\taikhoan2.xml");
            tr.transform(nguon, dich);
            System.out.println("Da ghi xong");
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(taofileXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(taofileXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(taofileXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void themTaiKhoan(Document doc, Element taikhoans, taikhoan tk) {
        
        Element hodan = doc.createElement("hodan");
        hodan.setAttribute("idhodan", String.valueOf(tk.getIdhodan()));
        Element taikhoan = doc.createElement("taikhoan");
        taikhoan.setTextContent(tk.getTaikhoan());
        Element matkhau = doc.createElement("matkhau");
        matkhau.setTextContent(tk.getMatkhau());
        Element quyen = doc.createElement("quyen");
        quyen.setTextContent(String.valueOf(tk.getQuyen()));
            
        hodan.appendChild(taikhoan);
        hodan.appendChild(matkhau);
        hodan.appendChild(quyen);
            
        taikhoans.appendChild(hodan);
            
    }
    
}
